/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentSale.std;

import StudentSale.CityNetwork;
import StudentSale.CollectionCenter;
import StudentSale.ModificationInfo;
import StudentSale.serviceAgent.ServiceAgent;
import StudentSale.deliveryAgent.DeliveryAgent;
import StudentSale.enums.Category;
import StudentSale.enums.DonationStatus;
import StudentSale.enums.PickUp;
import StudentSale.enums.UsageStatus;
import StudentSale.organization.OrganizationManager;
import StudentSale.organization.Organization;
import java.util.Date;

/**
 *
 * @author harshila
 */
public class Donation extends ModificationInfo{
    
    private String info;
    
    private Category category;
    
    private UsageStatus usageStatus;
    
    private PickUp pickUp;
    
    private CollectionCenter collectionCenter;
    
    private String addressToPickUp;
    
    private Date expiryDate;
    
    private String photoPicture;
    
    private Student std;
    
    private CityNetwork cityNetwork;
    
    private Organization org;
    
    private OrganizationManager orgManager;
    
    private DeliveryAgent deliveryAgent;
    
    private DonationStatus donationStatus;
    
    private ServiceAgent serviceAgent;

    public Donation(Date dateCreated, Date dateLastUpdated, String createdBy, String modifiedBy) {
        super(dateCreated, dateLastUpdated, createdBy, modifiedBy);
    }

    public Donation(String info, Category category, UsageStatus usageStatus, PickUp pickUp, CollectionCenter collectionCenter, String addressToPickUp, Date expiryDate, String photoPicture, Student std, CityNetwork cityNetwork, Organization org, OrganizationManager orgManager, DeliveryAgent deliveryAgent, DonationStatus donationStatus, ServiceAgent serviceAgent, Date dateCreated, Date dateLastUpdated, String createdBy, String modifiedBy) {
        super(dateCreated, dateLastUpdated, createdBy, modifiedBy);
        this.info = info;
        this.category = category;
        this.usageStatus = usageStatus;
        this.pickUp = pickUp;
        this.collectionCenter = collectionCenter;
        this.addressToPickUp = addressToPickUp;
        this.expiryDate = expiryDate;
        this.photoPicture = photoPicture;
        this.std = std;
        this.cityNetwork = cityNetwork;
        this.org = org;
        this.orgManager = orgManager;
        this.deliveryAgent = deliveryAgent;
        this.donationStatus = donationStatus;
        this.serviceAgent = serviceAgent;
        
        this.std.getDonations().add(this);
    }    
    
    public String getInformation() {
        return info;
    }

    public void setInformation(String info) {
        this.info = info;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public UsageStatus getUsageStatus() {
        return usageStatus;
    }

    public void setUsageStatus(UsageStatus usageStatus) {
        this.usageStatus = usageStatus;
    }

    public PickUp getPickUp() {
        return pickUp;
    }

    public void setPickUp(PickUp pickUp) {
        this.pickUp = pickUp;
    }

    public CollectionCenter getFoodBank() {
        return collectionCenter;
    }

    public void setFoodBank(CollectionCenter collectionCenter) {
        this.collectionCenter = collectionCenter;
    }

    public String getAddressToPickUp() {
        return addressToPickUp;
    }

    public void setAddressToPickUp(String addressToPickUp) {
        this.addressToPickUp = addressToPickUp;
    }

    public Date getDateofExpiry() {
        return expiryDate;
    }

    public void setDateofExpiry(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getPicture() {
        return photoPicture;
    }

    public void setPicture(String photoPicture) {
        this.photoPicture = photoPicture;
    }

    public Student getDonor() {
        return std;
    }

    public void setDonor(Student std) {
        this.std = std;
    }

    public CityNetwork getCityNetwork() {
        return cityNetwork;
    }

    public void setCityNetwork(CityNetwork cityNetwork) {
        this.cityNetwork = cityNetwork;
    }

    public Organization getOrganization() {
        return org;
    }

    public void setOrganization(Organization org) {
        this.org = org;
    }

    public OrganizationManager getOrgManager() {
        return orgManager;
    }

    public void setOrgManager(OrganizationManager orgManager) {
        this.orgManager = orgManager;
    }

    public DeliveryAgent getDeliveryVolunteer() {
        return deliveryAgent;
    }

    public void setDeliveryVolunteer(DeliveryAgent deliveryAgent) {
        this.deliveryAgent = deliveryAgent;
    }

    public DonationStatus getDonationStatus() {
        return donationStatus;
    }

    public void setDonationStatus(DonationStatus donationStatus) {
        this.donationStatus = donationStatus;
    }

    public ServiceAgent getCleaner() {
        return serviceAgent;
    }

    public void setCleaner(ServiceAgent serviceAgent) {
        this.serviceAgent = serviceAgent;
    }

    @Override
    public String toString() {
        return info;
    }    
}
