/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentSale;

import StudentSale.std.Student;
import StudentSale.enums.StudentRole;
import StudentSale.sysAdmin.SysAdmin;
import java.util.Date;

/**
 *
 * @author sishwathoka
 */
public class ConfigAdminSystem {
    
    public static EcoSystem configure() {
        
        EcoSystem ecoSystem = EcoSystem.getInstance();
        ecoSystem.getSysAdminsDirectory().getSysAdmins().add(new SysAdmin("Sishwa", "8572302377", "sishwa@sysadmin.com",
            "50 Evergreen St", "sysadmin", "password", StudentRole.SystemAdmin, "", new Date(), new Date(), "root", "root"));
        
//        System.out.println(ecoSystem.getCityNetworkDirectory().getCityNetworks().get(0));
//        FoodBank f1 = new FoodBank("FeedThePoor-Bank1", "Mission Hill", new Date(), new Date(), "InConfigureASystem", "InConfigureASystem");
//        FoodBank f2 = new FoodBank("FeedThePoor-Bank2", "Forest Hills", new Date(), new Date(), "InConfigureASystem", "InConfigureASystem");
//        ecoSystem.getCityNetworkDirectory().getCityNetworks().get(0).getFoodBankDirectory().getFoodBanks().add(f1);
//        ecoSystem.getCityNetworkDirectory().getCityNetworks().get(0).getFoodBankDirectory().getFoodBanks().add(f2);


//        ecoSystem.getDonorsDirectory().getDonors().add(new Student(name, phoneNum, emailAddress, address, userName, password, StudentRole.Student, photo, dateCreated, dateLastUpdated, createdBy, modifiedBy))
        
        return ecoSystem;
    }
    
}
