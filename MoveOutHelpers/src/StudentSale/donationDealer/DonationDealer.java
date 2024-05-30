/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentSale.donationDealer;

import StudentSale.User;
import StudentSale.enums.StudentRole;
import java.util.Date;

/**
 *
 * @author sahithireddy
 */
public class DonationDealer extends User{
    
    public DonationDealer(String name, String phoneNum, String emailAddress, String address, String userName, String password, StudentRole userRole, String photo, Date dateCreated, Date dateLastUpdated, String createdBy, String modifiedBy) {
        super(name, phoneNum, emailAddress, address, userName, password, userRole, photo, dateCreated, dateLastUpdated, createdBy, modifiedBy);
    }
    
}
