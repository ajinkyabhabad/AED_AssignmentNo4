/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.swing.JLabel;

/**
 *
 * @author Ajinkya
 */
public class LabTestWorkRequest extends WorkRequest{
    
    private String id;
    
    private List<ItemQuantity> itemsWithQuatityList = new ArrayList<ItemQuantity>();
    
    private String customerFeedback;
    
    private String testResult;

    public LabTestWorkRequest() {
        UUID uuid = UUID.randomUUID();
        id = uuid.toString();
    }
    
    public String getId() {
        return id;
    }
    
     public ItemQuantity addItem(ItemQuantity itemWithQuantity){
        itemsWithQuatityList.add(itemWithQuantity);
        return itemWithQuantity;
    }

    public List<ItemQuantity> getItemsWithQuatityList() {
        return itemsWithQuatityList;
    }

    public void setItemsWithQuatityList(List<ItemQuantity> itemsWithQuatityList) {
        this.itemsWithQuatityList = itemsWithQuatityList;
    }

    public String getCustomerFeedback() {
        return customerFeedback;
    }

    public void setCustomerFeedback(String customerFeedback) {
        this.customerFeedback = customerFeedback;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
    

    
         
}
