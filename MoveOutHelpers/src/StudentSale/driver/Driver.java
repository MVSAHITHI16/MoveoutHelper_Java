package StudentSale.driver;

import StudentSale.Agent;
import StudentSale.enums.StudentRole;
import java.util.Date;

/**
 *
 * @author harshila
 */
public class Driver extends Agent{
    
   
    public Driver(String name, String phoneNo, String email, String address, StudentRole userRole, String profilePic, Date createdDate, Date lastUpdatedDate, String createdBy, String modifiedBy) {
        super(name, phoneNo, email, address, userRole, profilePic, createdDate, lastUpdatedDate, createdBy, modifiedBy);
    }
    
}
