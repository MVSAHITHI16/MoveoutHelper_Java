/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentSale;

import StudentSale.donationDealer.DonationDealerDir;
import StudentSale.serviceAgent.ServiceAgentDir;
import StudentSale.organization.OrganizationDir;
import java.util.Date;

/**
 *
 * @author sishwathoka
 */
public class CityNetwork extends ModificationInfo{
    
    private CityName cityName;
    
    private OrganizationDir organizationDir = new OrganizationDir();
    
    private DonationDealerDir donationDealerDir = new DonationDealerDir();
    
    private ServiceAgentDir serviceAgentDir = new ServiceAgentDir();
    
    private CollectionCenterDir collectionCenterDir = new CollectionCenterDir();

    public CityNetwork(CityName cityName, Date dateCreated, Date dateLastUpdated, String createdBy, String modifiedBy) {
        super(dateCreated, dateLastUpdated, createdBy, modifiedBy);
        this.cityName = cityName;
    }

    public CityName getCityName() {
        return cityName;
    }

    public void setCityName(CityName cityName) {
        this.cityName = cityName;
    }

    public OrganizationDir getOrganizationDirectory() {
        return organizationDir;
    }

    public void setOrganizationDirectory(OrganizationDir organizationDir) {
        this.organizationDir = organizationDir;
    }

    public CollectionCenterDir getFoodBankDirectory() {
        return collectionCenterDir;
    }

    public void setFoodBankDirectory(CollectionCenterDir collectionCenterDir) {
        this.collectionCenterDir = collectionCenterDir;
    }

    public DonationDealerDir getCityOfficialsDirectory() {
        return donationDealerDir;
    }

    public void setCityOfficialsDirectory(DonationDealerDir donationDealerDir) {
        this.donationDealerDir = donationDealerDir;
    }

    public ServiceAgentDir getCleanersDirectory() {
        return serviceAgentDir;
    }

    public void setCleanersDirectory(ServiceAgentDir serviceAgentDir) {
        this.serviceAgentDir = serviceAgentDir;
    }
    
}
