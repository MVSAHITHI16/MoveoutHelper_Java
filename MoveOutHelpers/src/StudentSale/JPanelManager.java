/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentSale;

import StudentSale.organization.Organization;
import javax.swing.JPanel;
import userinterface.donationDealerWorkArea.DonationDealerHomeJPanel;
import userinterface.serviceAgentWorkArea.ServiceAgentHomeJPanel;
import userinterface.deliveryAgentWorkArea.DeliveryAgentHomeJPanel;
import userinterface.studentWorkArea.StudentHomeJPanel;
import userinterface.orgManagersWorkArea.OrgManagerHomeJPanel;
import userinterface.systemAdminWorkArea.SysAdminHomeJPanel;

/**
 *
 * @author sishwathoka
 */
public class JPanelManager {
    
    public static JPanel getSysAdminHomePanel(JPanel userProcessJpanel, EcoSystem ecoSystem, User userLogged) {
        
        return new SysAdminHomeJPanel(userProcessJpanel, ecoSystem, userLogged);
    }
    
    public static JPanel getCityOfficialHomePanel(JPanel userProcessContainer, EcoSystem ecoSystem, User userLogged,CityNetwork cityNetwork) {
        
        return new DonationDealerHomeJPanel(userProcessContainer, ecoSystem, userLogged,cityNetwork);
    }
        
    public static JPanel getOrgManagerHomePanel(JPanel userProcessJPanel, EcoSystem ecoSystem, CityNetwork cityNetwork,
            Organization org, User userLogged) {
        
        return new OrgManagerHomeJPanel(userProcessJPanel, ecoSystem, cityNetwork, org, userLogged);
    }
    
    public static JPanel getDonorHomePanel(JPanel userProcessJpanel, EcoSystem ecoSystem, User userLogged) {
        
        return new StudentHomeJPanel(userProcessJpanel, ecoSystem, userLogged);
    }
    
    public static JPanel getDeliveryVolunteerHomePanel(JPanel userProcessJPanel, EcoSystem ecoSystem, CityNetwork cityNetwork, Organization org, User userLogged) {
        
        return new DeliveryAgentHomeJPanel(userProcessJPanel, ecoSystem, cityNetwork, org, userLogged);
    }
    
    public static JPanel getCleanerHomePanel(JPanel userProcessJPanel, EcoSystem ecoSystem, CityNetwork cityNetwork,
            User userLogged) {
        
        return new ServiceAgentHomeJPanel(userProcessJPanel, ecoSystem, cityNetwork, userLogged);
    }
    
}
