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
public class CollectionCenter extends ModificationInfo{
    
    private String name;
    
    private String location;
    
    public CollectionCenter(String name, String location, Date dateCreated, Date dateLastUpdated, String createdBy, String modifiedBy) {
        super(dateCreated, dateLastUpdated, createdBy, modifiedBy);
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
    
}
