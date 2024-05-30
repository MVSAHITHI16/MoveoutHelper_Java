package StudentSale.driver;

import StudentSale.ModificationInfo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author harshila
 */
public class DriversDirectory extends ModificationInfo {

    private List<Driver> drivers = new ArrayList<>();

    public DriversDirectory(List<Driver> packingAgents, Date createdDate, Date lastUpdatedDate, String createdBy, String modifiedBy) {
        super(createdDate, lastUpdatedDate, createdBy, modifiedBy);
        this.drivers = drivers;
    }

    public DriversDirectory(Date createdDate, Date lastUpdatedDate, String createdBy, String modifiedBy) {
        super(createdDate, lastUpdatedDate, createdBy, modifiedBy);
    }
    
    public DriversDirectory() {
        super(new Date(), new Date(), "SystemAdmin", "SystemAdmin");
    }
    
    public List<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<Driver> packingAgents) {
        this.drivers = drivers;
    }
}
