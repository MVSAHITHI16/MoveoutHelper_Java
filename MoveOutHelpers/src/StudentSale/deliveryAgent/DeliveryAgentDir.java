/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentSale.deliveryAgent;

import StudentSale.ModificationInfo;
import StudentSale.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author sishwathoka
 */
public class DeliveryAgentDir extends ModificationInfo{
    
    private List<DeliveryAgent> deliveryAgents = new ArrayList<>();

    public DeliveryAgentDir(Date dateCreated, Date dateLastUpdated, String createdBy, String modifiedBy) {
        super(dateCreated, dateLastUpdated, createdBy, modifiedBy);
    }

    public DeliveryAgentDir(List<DeliveryAgent> deliveryAgents, Date dateCreated, Date dateLastUpdated, String createdBy, String modifiedBy) {
        super(dateCreated, dateLastUpdated, createdBy, modifiedBy);
        this.deliveryAgents = deliveryAgents;
    }

    public DeliveryAgentDir() {
        super(new Date(), new Date(), "SysAdmin", "SysAdmin");
    }
    
    public List<DeliveryAgent> getDeliveryVolunteers() {
        return deliveryAgents;
    }

    public void setDeliveryVolunteers(List<DeliveryAgent> deliveryAgents) {
        this.deliveryAgents = deliveryAgents;
    }

    public User isUserDeliveryVolunteer(String userName, String password) {
        
        if(!getDeliveryVolunteers().isEmpty()) {
            
            for(DeliveryAgent deliveryAgent:getDeliveryVolunteers()) {
                if(deliveryAgent.getUserName().equals(userName) && deliveryAgent.getPassword().equals(password)) {
                    return deliveryAgent;
                }
            }
        }
        
        return null;
    }
    
}
