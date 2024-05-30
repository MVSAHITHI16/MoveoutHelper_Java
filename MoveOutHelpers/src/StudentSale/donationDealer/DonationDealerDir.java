/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentSale.donationDealer;

import StudentSale.ModificationInfo;
import StudentSale.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author sahithireddy
 */
public class DonationDealerDir extends ModificationInfo{
    
    private List<DonationDealer> donationDealer = new ArrayList<>();

    public DonationDealerDir(Date dateCreated, Date dateLastUpdated, String createdBy, String modifiedBy) {
        super(dateCreated, dateLastUpdated, createdBy, modifiedBy);
    }

    public DonationDealerDir() {
        super(new Date(), new Date(), "SysAdmin", "SysAdmin");
    }
    
    public List<DonationDealer> getCityOfficials() {
        return donationDealer;
    }

    public void setCityOfficials(List<DonationDealer> donationDealer) {
        this.donationDealer = donationDealer;
    }

    public User isUserCityOfficial(String userName, String password) {
        
        if(!getCityOfficials().isEmpty()) {
            for(DonationDealer cityOfficial:getCityOfficials()) {
                if(cityOfficial.getUserName().equals(userName) && cityOfficial.getPassword().equals(password)) {
                    return cityOfficial;
                }
            }
        }
        
        return null;
    }
    
}
