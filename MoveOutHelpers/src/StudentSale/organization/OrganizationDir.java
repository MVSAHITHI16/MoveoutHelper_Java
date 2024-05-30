/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentSale.organization;

import StudentSale.ModificationInfo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author harshila
 */
public class OrganizationDir extends ModificationInfo{
    
    private List<Organization> orgList = new ArrayList<>();

    public OrganizationDir(List<Organization> org, Date dateCreated, Date dateLastUpdated, String createdBy, String modifiedBy) {
        super(dateCreated, dateLastUpdated, createdBy, modifiedBy);
        this.orgList = orgList;
    }

    public OrganizationDir(Date dateCreated, Date dateLastUpdated, String createdBy, String modifiedBy) {
        super(dateCreated, dateLastUpdated, createdBy, modifiedBy);
    }
    
    public OrganizationDir() {
        super(new Date(), new Date(), "SysAdmin", "SysAdmin");
    }

    public List<Organization> getOrganizations() {
        return orgList;
    }

    public void setOrganizations(List<Organization> org) {
        this.orgList = org;
    }
    
}
