/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentSale.std;

import StudentSale.ModificationInfo;
import StudentSale.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author harshila
 */
public class StudentsDir extends ModificationInfo{
    
    private List<Student> donors = new ArrayList<>();

    public StudentsDir(List<Student> donors, Date dateCreated, Date dateLastUpdated, String createdBy, String modifiedBy) {
        super(dateCreated, dateLastUpdated, createdBy, modifiedBy);
        this.donors = donors;
    }

    public StudentsDir(Date dateCreated, Date dateLastUpdated, String createdBy, String modifiedBy) {
        super(dateCreated, dateLastUpdated, createdBy, modifiedBy);
    }
    
    public StudentsDir() {
        super(new Date(), new Date(), "SysAdmin", "SysAdmin");
    }
    
    public List<Student> getDonors() {
        return donors;
    }

    public void setDonors(List<Student> donors) {
        this.donors = donors;
    }

    public User isUserDonor(String userName, String password) {
        
        if(!getDonors().isEmpty()) {
            
            for(User std:getDonors()) {
                if(std.getUserName().equals(userName) && std.getPassword().equals(password)) {
                    return std;
                }
            }
        }
        
        return null;
    }
    
}

