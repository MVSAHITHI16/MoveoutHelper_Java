/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentSale.std;

import StudentSale.User;
import StudentSale.enums.StudentRole;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author harshila
 */
public class Student extends User{
    
    private List<Donation> items = new ArrayList<>();
    
    public Student(String name, String phoneNum, String emailAddress, String address, String userName, String password, StudentRole userRole, String photo, Date dateCreated, Date dateLastUpdated, String createdBy, String modifiedBy) {
        super(name, phoneNum, emailAddress, address, userName, password, userRole, photo, dateCreated, dateLastUpdated, createdBy, modifiedBy);
    }

    public List<Donation> getDonations() {
        return items;
    }

    public void setDonations(List<Donation> items) {
        this.items = items;
    }
    
}
