/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentSale.enums;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author sahithireddy
 */
public enum StudentRole {
    
    SystemAdmin,Student,DeliveryAgent,DonationDealer,OrgManager,ServiceAgent,Driver,PackingAgent;
    
    public static List<String> getUserRolesList(){
       
        return Stream.of(StudentRole.values()).map(StudentRole::name).collect(Collectors.toList());
    }
    
    public static String[] getUserRolesArray() {
        
        return Arrays.stream(StudentRole.values()).map(StudentRole::name).toArray(String[]::new);
    }
}
