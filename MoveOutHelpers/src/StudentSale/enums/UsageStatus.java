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
public enum UsageStatus {
    
    New,Used,Old,Recycleable;
    
    public static List<String> getUsageStatusList(){
       
        return Stream.of(UsageStatus.values()).map(UsageStatus::name).collect(Collectors.toList());
    }
    
    public static String[] getUsageStatusArray() {
        
        return Arrays.stream(UsageStatus.values()).map(UsageStatus::name).toArray(String[]::new);
    } 
    
}
