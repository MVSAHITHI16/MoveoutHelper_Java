/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentSale;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author sishwathoka
 */
public class CollectionCenterDir extends ModificationInfo{
    
    private List<CollectionCenter> collectionCenter = new ArrayList<>();

    public CollectionCenterDir(Date dateCreated, Date dateLastUpdated, String createdBy, String modifiedBy) {
        super(dateCreated, dateLastUpdated, createdBy, modifiedBy);
    }
    
    public CollectionCenterDir(List<CollectionCenter> collectionCenter, Date dateCreated, Date dateLastUpdated, String createdBy, String modifiedBy) {
        super(dateCreated, dateLastUpdated, createdBy, modifiedBy);
        this.collectionCenter = collectionCenter;
    }

    public CollectionCenterDir() {
        super(new Date(), new Date(), "SysAdmin", "SysAdmin");
    }
    
    public List<CollectionCenter> getFoodBanks() {
        return collectionCenter;
    }

    public void setFoodBanks(List<CollectionCenter> collectionCenter) {
        this.collectionCenter = collectionCenter;
    }
    
}
