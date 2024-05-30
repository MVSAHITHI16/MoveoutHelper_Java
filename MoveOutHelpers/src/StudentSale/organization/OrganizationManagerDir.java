/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentSale.organization;

import StudentSale.ModificationInfo;
import StudentSale.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author harshila
 */
public class OrganizationManagerDir extends ModificationInfo{
    
    private List<OrganizationManager> organizationManagers = new ArrayList<>();

    public OrganizationManagerDir(Date dateCreated, Date dateLastUpdated, String createdBy, String modifiedBy) {
        super(dateCreated, dateLastUpdated, createdBy, modifiedBy);
    }
    
    public OrganizationManagerDir(List<OrganizationManager> organizationManagers, Date dateCreated, Date dateLastUpdated, String createdBy, String modifiedBy) {
        super(dateCreated, dateLastUpdated, createdBy, modifiedBy);
        this.organizationManagers = organizationManagers;
    }
    
    public OrganizationManagerDir() {
        super(new Date(), new Date(), "SystemAdmin", "SystemAdmin");
    }

    public List<OrganizationManager> getOrgManagers() {
        return organizationManagers;
    }

    public void setOrgManagers(List<OrganizationManager> organizationManagers) {
        this.organizationManagers = organizationManagers;
    }

    public User isUserOrgManager(String userName, String password) {
        
        if(!getOrgManagers().isEmpty()) {
            
            for(OrganizationManager orgManager:getOrgManagers()) {
                if(orgManager.getUserName().equals(userName) && orgManager.getPassword().equals(password)) {
                    return orgManager;
                }
            }
        }
        
        return null;
    }
    
}
