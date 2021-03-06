/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.DeliveryMan.DeliveryMan;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author raunak
 */
public class WorkQueue {
    
    private List<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList();
    }

    public List<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    
    public List<WorkRequest> getWorkRequestListCustomer(UserAccount account){
        List<WorkRequest> workRequestListCustomer = new ArrayList();
        for(WorkRequest workRequest : workRequestList){
            if(workRequest.getCustomer() != null){
                UserAccount customerAccount = workRequest.getCustomer();
                if(customerAccount.getUsername().equals(account.getUsername())){
                    workRequestListCustomer.add(workRequest);
                }
            }
        }
        return workRequestListCustomer;
    }
    
    public List<WorkRequest> getWorkRequestListRestaurant(UserAccount account){
        List<WorkRequest> workRequestListRestaurant = new ArrayList();
        for(WorkRequest workRequest : workRequestList){
            if(workRequest.getRestaurant() != null){
                UserAccount restuarantAccount = workRequest.getRestaurant();
                if(restuarantAccount.getUsername().equals(account.getUsername())){
                    workRequestListRestaurant.add(workRequest);
                }
            }
        }
        return workRequestListRestaurant;
    }
    
    public List<WorkRequest> getWorkRequestListDeliveryMan(UserAccount account){
        List<WorkRequest> workRequestListDelivery = new ArrayList();
        for(WorkRequest workRequest : workRequestList){
           //System.out.print("workRequestList"+workRequestList.size());
            if(workRequest.getDeliverMan()!= null){
                //System.out.print("after assigning work request==>"+workRequest.getDeliverMan());
                DeliveryMan deliveryManAccount = workRequest.getDeliverMan();
                /*System.out.println("qorkqueue"+deliveryManAccount.getUsername()+"name:"+
                        deliveryManAccount.getDeliveryManName()+"status:"+workRequest.getStatus());
                 System.out.print("user account "+account.getUsername());*/
                 workRequestListDelivery.add(workRequest);
               /* if(deliveryManAccount.getUsername().equals(account.getUsername())){
                    workRequestListDelivery.add(workRequest);
                }*/
            }
        }
        return workRequestListDelivery;
    }
    
    public void addWorkRequest(WorkRequest workRequest){
       workRequestList.add(workRequest); 
    }
}