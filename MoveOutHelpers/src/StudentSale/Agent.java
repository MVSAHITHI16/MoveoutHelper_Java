package StudentSale;

import StudentSale.enums.StudentRole;
import java.util.Date;

/**
 *
 * @author harshila
 */
public class Agent extends ModificationInfo{
    
    private String name;

    private String phoneNo;
    
    private String email;
    
    private String address;
    
    
    private StudentRole userRole;
    
    private String profilePic;

    public Agent(String name, String phoneNo, String email, String address, StudentRole userRole, String profilePic, Date createdDate, Date lastUpdatedDate, String createdBy, String modifiedBy) {
        super(createdDate, lastUpdatedDate, createdBy, modifiedBy);
        this.name = name;
        this.phoneNo = phoneNo;
        this.email = email;
        this.address = address;
        this.userRole = userRole;
        this.profilePic = profilePic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public StudentRole getUserRole() {
        return userRole;
    }

    public void setUserRole(StudentRole userRole) {
        this.userRole = userRole;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
