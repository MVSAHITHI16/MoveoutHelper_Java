/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentSale;

import StudentSale.std.StudentsDir;
import StudentSale.sysAdmin.SysAdminDirectory;
import StudentSale.driver.DriversDirectory;
import StudentSale.packingAgent.PackingAgentsDirectory;

/**
 *
 * @author sishwathoka
 */
public class EcoSystem {
    
    private static EcoSystem ecoSystem;
    
    private CityNetworkDir cityNtwDir = new CityNetworkDir();
    
    private StudentsDir studentsDir = new StudentsDir();
    
    private SysAdminDirectory sysAdminsDirectory = new SysAdminDirectory();
    
    private PackingAgentsDirectory packingAgentsDirectory = new PackingAgentsDirectory();
    
    private DriversDirectory driversDirectory = new DriversDirectory();
    
    private EcoSystem() {
        
    }

    public static EcoSystem getInstance() {
        if(ecoSystem==null){
            ecoSystem = new EcoSystem();
        }
        return ecoSystem;
    }

    public CityNetworkDir getCityNetworkDirectory() {
        return cityNtwDir;
    }

    public void setCityNetworkDirectory(CityNetworkDir cityNtwDir) {
        this.cityNtwDir = cityNtwDir;
    }

    public StudentsDir getDonorsDirectory() {
        return studentsDir;
    }

    public void setDonorsDirectory(StudentsDir studentsDir) {
        this.studentsDir = studentsDir;
    }

    public SysAdminDirectory getSysAdminsDirectory() {
        return sysAdminsDirectory;
    }
    
    public PackingAgentsDirectory getPackingAgentsDirectory() {
        return packingAgentsDirectory;
    }
    
    public DriversDirectory getDriversDirectory() {
        return driversDirectory;
    }

    public void setSysAdminsDirectory(SysAdminDirectory sysAdminsDirectory) {
        this.sysAdminsDirectory = sysAdminsDirectory;
    }    
    
}
