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
public enum DonationStatus {
    
    ReadyToPickup,Accepted,PickupAwaiting,PickedUp,Expired,Closed;
    
    public static List<String> getDonationStatusList(){
       
        return Stream.of(DonationStatus.values()).map(DonationStatus::name).collect(Collectors.toList());
    }
    
    public static String[] getDonationStatusArray() {
        
        return Arrays.stream(DonationStatus.values()).map(DonationStatus::name).toArray(String[]::new);
    }    
    
}
