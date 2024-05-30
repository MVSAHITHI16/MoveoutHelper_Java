/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentSale.sysAdmin;

import StudentSale.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harshila
 */
public class SysAdminDirectory {
    
    private List<SysAdmin> sysAdmins =  new ArrayList<>();

    public List<SysAdmin> getSysAdmins() {
        return sysAdmins;
    }

    public void setSysAdmins(List<SysAdmin> sysAdmins) {
        this.sysAdmins = sysAdmins;
    }

    public User isUserSysAdmin(String userName, String password) {
        
        if(!getSysAdmins().isEmpty()){
            
            for(SysAdmin sysAdmin:getSysAdmins()) {
                if(sysAdmin.getUserName().equals(userName) && sysAdmin.getPassword().equals(password)) {
                    return sysAdmin;
                }
            }
        }
        
        return null;
    }
    
}
