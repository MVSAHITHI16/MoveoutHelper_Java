/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentSale;

import java.util.Date;

/**
 *
 * @author sishwathoka
 */
public class ModificationInfo {
    
    private Date dateCreated;
    
    private Date dateLastUpdated;
    
    private String createdBy;
    
    private String modifiedBy;

    public ModificationInfo(Date dateCreated, Date dateLastUpdated, String createdBy, String modifiedBy) {
        this.dateCreated = dateCreated;
        this.dateLastUpdated = dateLastUpdated;
        this.createdBy = createdBy;
        this.modifiedBy = modifiedBy;
    }
    
    public Date getCreatedDate() {
        return dateCreated;
    }

    public void setCreatedDate(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getLastUpdatedDate() {
        return dateLastUpdated;
    }

    public void setLastUpdatedDate(Date dateLastUpdated) {
        this.dateLastUpdated = dateLastUpdated;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }
}
