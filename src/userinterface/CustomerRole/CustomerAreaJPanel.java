/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vishakha
 */
public class CustomerAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerAreaJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private UserAccount account;
    private List<WorkRequest> workRequestList;

    public CustomerAreaJPanel(JPanel userProcessContainer, EcoSystem ecosystem, UserAccount account) {
        initComponents();
        initListners();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.account = account;
        populateRequestTable();
    }

    public void populateRequestTable() {
        //Menu itemList = ecosystem.getItemList();
        DefaultTableModel model = (DefaultTableModel) tblCustomerOrderStatus.getModel();
        model.setRowCount(0);
        workRequestList = ecosystem.getWorkQueue().getWorkRequestListCustomer(account);
        for (WorkRequest request : workRequestList) {
            Object[] row = new Object[tblCustomerOrderStatus.getColumnCount()];
            row[0] = request;
            row[1] = request.getRestaurant();
            row[2] = request.getStatus();
            String result = ((LabTestWorkRequest) request).getTestResult();
            row[3] = result == null ? "Waiting" : result;
            model.addRow(row);
        }

    }

    private void initListners() {
        tblCustomerOrderStatus.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                int selectedRow = tblCustomerOrderStatus.getSelectedRow();
                if (selectedRow >= 0) {
                    WorkRequest request = (WorkRequest) tblCustomerOrderStatus.getValueAt(selectedRow, 0);
                    if (request instanceof LabTestWorkRequest) {
                        LabTestWorkRequest orderWorkRequest = (LabTestWorkRequest) tblCustomerOrderStatus.getValueAt(selectedRow, 0);
                        if (orderWorkRequest != null) {
                           OrderDetailsJPanel orderDetailsJPanel = new OrderDetailsJPanel(userProcessContainer,ecosystem,account,orderWorkRequest);
                           userProcessContainer.add("OrderDetailsJPanel", orderDetailsJPanel);
                           CardLayout layout = (CardLayout)userProcessContainer.getLayout();
                           layout.next(userProcessContainer);
                        }
                    }

                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomerOrderStatus = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ORDER STATUS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 29, 791, -1));

        tblCustomerOrderStatus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Restaurant name", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCustomerOrderStatus);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 790, 350));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCustomerOrderStatus;
    // End of variables declaration//GEN-END:variables
}
