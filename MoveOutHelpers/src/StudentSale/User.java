/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentSale;

import StudentSale.enums.StudentRole;
import java.util.Date;

/**
 *
 * @author sishwathoka
 */
public class User extends ModificationInfo{
    
    private String name;

    private String phoneNum;
    
    private String emailAddress;
    
    private String address;
    
    private String userName;
    
    private String password;
    
    private StudentRole userRole;
    
    private String photo;

    public User(String name, String phoneNum, String emailAddress, String address, String userName, String password, StudentRole userRole, String photo, Date dateCreated, Date dateLastUpdated, String createdBy, String modifiedBy) {
        super(dateCreated, dateLastUpdated, createdBy, modifiedBy);
        this.name = name;
        this.phoneNum = phoneNum;
        this.emailAddress = emailAddress;
        this.address = address;
        this.userName = userName;
        this.password = password;
        this.userRole = userRole;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNum;
    }

    public void setPhoneNo(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return emailAddress;
    }

    public void setEmail(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public StudentRole getUserRole() {
        return userRole;
    }

    public void setUserRole(StudentRole userRole) {
        this.userRole = userRole;
    }

    public String getProfilePic() {
        return photo;
    }

    public void setProfilePic(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
