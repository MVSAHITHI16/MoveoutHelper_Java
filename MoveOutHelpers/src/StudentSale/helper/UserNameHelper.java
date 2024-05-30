/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentSale.helper;

import StudentSale.CityNetwork;
import StudentSale.EcoSystem;
import StudentSale.donationDealer.DonationDealer;
import StudentSale.serviceAgent.ServiceAgent;
import StudentSale.deliveryAgent.DeliveryAgent;
import StudentSale.std.Student;
import StudentSale.organization.OrganizationManager;
import StudentSale.organization.Organization;
import StudentSale.sysAdmin.SysAdmin;

/**
 *
 * @author sahithreddy
 */
public class UserNameHelper {
    
    public static boolean isUserNameAlreadyExisted(EcoSystem ecoSystem, String userName) {
        //Checking donors directory
        if(!ecoSystem.getDonorsDirectory().getDonors().isEmpty()) {
            for(Student std:ecoSystem.getDonorsDirectory().getDonors()) {
                if(std.getUserName().equals(userName)) {
                    return true;
                }
            }
        }
        
        //Checkng syadmins directory
        if(!ecoSystem.getSysAdminsDirectory().getSysAdmins().isEmpty()) {
            for(SysAdmin sysAdmin:ecoSystem.getSysAdminsDirectory().getSysAdmins()) {
                if(sysAdmin.getUserName().equals(userName)) {
                    return true;
                }
            }
        }
        
        //Checking cityNetwork
        if(!ecoSystem.getCityNetworkDirectory().getCityNetworks().isEmpty()) {
            for(CityNetwork cityNetwork:ecoSystem.getCityNetworkDirectory().getCityNetworks()) {
                
                //Checking donationDealer directory
                if(!cityNetwork.getCityOfficialsDirectory().getCityOfficials().isEmpty()) {
                    for(DonationDealer cityOfficial:cityNetwork.getCityOfficialsDirectory().getCityOfficials()) {
                        if(cityOfficial.getUserName().equals(userName)) {
                            return true;
                        }
                    }
                }
                
                //Checking serviceAgent directory
                if(!cityNetwork.getCleanersDirectory().getCleaners().isEmpty()) {
                    for(ServiceAgent serviceAgent:cityNetwork.getCleanersDirectory().getCleaners()) {
                        if(serviceAgent.getUserName().equals(userName)) {
                            return true;
                        }
                    }
                }
                
                //Checking org
                if(!cityNetwork.getOrganizationDirectory().getOrganizations().isEmpty()) {
                    for(Organization org:cityNetwork.getOrganizationDirectory().getOrganizations()) {
                        
                        //Checking orgmanagers directory
                        if(!org.getOrgManagerDirectory().getOrgManagers().isEmpty()) {
                            for(OrganizationManager orgManager:org.getOrgManagerDirectory().getOrgManagers()) {
                                if(orgManager.getUserName().equals(userName)) {
                                    return true;
                                }
                            }
                        }
                        
                        //Checking deliveryvolunteers directory
                        if(!org.getDeliveryVolunteerDirectory().getDeliveryVolunteers().isEmpty()) {
                            for(DeliveryAgent deliveryAgent:org.getDeliveryVolunteerDirectory().getDeliveryVolunteers()) {
                                if(deliveryAgent.getUserName().equals(userName)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        
        
        return false;
        
    }
    
}
