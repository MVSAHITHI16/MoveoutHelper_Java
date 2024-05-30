/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentSale.serviceAgent;

import StudentSale.ModificationInfo;
import StudentSale.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author harshila
 */
public class ServiceAgentDir extends ModificationInfo{
    
    private List<ServiceAgent> serviceAgent = new ArrayList<>();

    public ServiceAgentDir(Date dateCreated, Date dateLastUpdated, String createdBy, String modifiedBy) {
        super(dateCreated, dateLastUpdated, createdBy, modifiedBy);
    }

    public ServiceAgentDir() {
        super(new Date(), new Date(), "SysAdmin", "SysAdmin");
    }
    
    public List<ServiceAgent> getCleaners() {
        return serviceAgent;
    }

    public void setCleaners(List<ServiceAgent> serviceAgent) {
        this.serviceAgent = serviceAgent;
    }

    public User isUserCleaner(String userName, String password) {
        
        if(!getCleaners().isEmpty()) {
            
            for(ServiceAgent serviceAgent:getCleaners()) {
                if(serviceAgent.getUserName().equals(userName) && serviceAgent.getPassword().equals(password)) {
                    return serviceAgent;
                }
            }
        }
        
        return null;
    }
    
}
