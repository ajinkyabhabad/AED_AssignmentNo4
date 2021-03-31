package userinterface.CustomerRole;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Business.EcoSystem;

import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author MyPC1
 */
public class CustomerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAccount;

    public CustomerWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, EcoSystem ecosystem) {
        //this.set

        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAccount = userAccount;
        placeOrder();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        systemAdminPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        placeOrderButtonPanel = new javax.swing.JPanel();
        orderStatusButtonPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        rightSystemAdminPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(31, 50, 97));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        placeOrderButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                placeOrderButtonPanelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout placeOrderButtonPanelLayout = new javax.swing.GroupLayout(placeOrderButtonPanel);
        placeOrderButtonPanel.setLayout(placeOrderButtonPanelLayout);
        placeOrderButtonPanelLayout.setHorizontalGroup(
            placeOrderButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        placeOrderButtonPanelLayout.setVerticalGroup(
            placeOrderButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        jPanel1.add(placeOrderButtonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, -1));

        orderStatusButtonPanel.setPreferredSize(new java.awt.Dimension(264, 48));
        orderStatusButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                orderStatusButtonPanelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout orderStatusButtonPanelLayout = new javax.swing.GroupLayout(orderStatusButtonPanel);
        orderStatusButtonPanel.setLayout(orderStatusButtonPanelLayout);
        orderStatusButtonPanelLayout.setHorizontalGroup(
            orderStatusButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        orderStatusButtonPanelLayout.setVerticalGroup(
            orderStatusButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(orderStatusButtonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 48, 280, 50));

        jButton1.setText("Order Staus");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        jButton2.setText("Place Order");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        rightSystemAdminPanel.setPreferredSize(new java.awt.Dimension(940, 808));
        rightSystemAdminPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout systemAdminPanelLayout = new javax.swing.GroupLayout(systemAdminPanel);
        systemAdminPanel.setLayout(systemAdminPanelLayout);
        systemAdminPanelLayout.setHorizontalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(systemAdminPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        systemAdminPanelLayout.setVerticalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );

        add(systemAdminPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void placeOrder() {
        // TODO add your handling code here:
        

        PlaceOrderJPanel placeOrderJPanel = new PlaceOrderJPanel(rightSystemAdminPanel, userAccount, ecosystem);
        rightSystemAdminPanel.add("PlaceOrderJPanel", placeOrderJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);

    }

    private void placeOrderButtonPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_placeOrderButtonPanelMousePressed
        placeOrder();
    }//GEN-LAST:event_placeOrderButtonPanelMousePressed

    private void orderStatusButtonPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderStatusButtonPanelMousePressed
        // TODO add your handling code here:
        orderStatus();
    }//GEN-LAST:event_orderStatusButtonPanelMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        orderStatus();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        placeOrder();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void orderStatus() {
        // TODO add your handling code here:
       
        
        CustomerAreaJPanel orderStatusJPanel = new CustomerAreaJPanel(rightSystemAdminPanel, ecosystem, userAccount);
        rightSystemAdminPanel.add("OrderStatusJPanel", orderStatusJPanel);
        CardLayout layout = (CardLayout)rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel orderStatusButtonPanel;
    private javax.swing.JPanel placeOrderButtonPanel;
    private javax.swing.JPanel rightSystemAdminPanel;
    private javax.swing.JPanel systemAdminPanel;
    // End of variables declaration//GEN-END:variables
}
