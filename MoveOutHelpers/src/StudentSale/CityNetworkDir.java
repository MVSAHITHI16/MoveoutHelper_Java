/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentSale;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 *
 * @author sishwathoka
 */
public class CityNetworkDir extends ModificationInfo{
    
    private List<CityNetwork> cityNtw = new ArrayList<>();

    public CityNetworkDir(List<CityNetwork> cityNtw, Date dateCreated, Date dateLastUpdated, String createdBy, String modifiedBy) {
        super(dateCreated, dateLastUpdated, createdBy, modifiedBy);
        this.cityNtw=cityNtw;
    }
    
    public CityNetworkDir() {
        super(new Date(), new Date(), "SysAdmin", "SysAdmin");
    }

    public CityNetworkDir(Date dateCreated, Date dateLastUpdated, String createdBy, String modifiedBy) {
        super(dateCreated, dateLastUpdated, createdBy, modifiedBy);
    }
    
    public List<CityNetwork> getCityNetworks() {
        return cityNtw;
    }

    public void setCityNetworks(List<CityNetwork> cityNtw) {
        this.cityNtw = cityNtw;
    }
    
}
