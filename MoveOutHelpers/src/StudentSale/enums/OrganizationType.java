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
 * @author sahithreddy
 */
public enum OrganizationType {
    
//    GovtNgo,PrivateNgo,ReligiousOrg;
   PrudentialMovers,CostcoMovers,FedexMovers;
    
    public static List<String> getOrganizationTypesList(){
       
        return Stream.of(OrganizationType.values()).map(OrganizationType::name).collect(Collectors.toList());
    }
    
    public static String[] getOrganizationTypesArray() {
        
        return Arrays.stream(OrganizationType.values()).map(OrganizationType::name).toArray(String[]::new);
    }
    
}
