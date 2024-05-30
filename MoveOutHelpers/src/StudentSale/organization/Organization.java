/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentSale.organization;

import StudentSale.ModificationInfo;
import StudentSale.deliveryAgent.DeliveryAgentDir;
import StudentSale.std.Donation;
import StudentSale.enums.OrganizationType;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author harshila
 */
public class Organization extends ModificationInfo{
    
    private String orgName;
    
    private OrganizationType organizationType;
    
    private String address;
    
    private String phoneNum;
    
    private String emailAddress;
    
    private String organizationImage;
    
    private OrganizationManagerDir organizationManagerDir = new OrganizationManagerDir();
    
    private DeliveryAgentDir deliveryAgentDir = new DeliveryAgentDir();
    
    private List<Donation> items = new ArrayList<>();

    public Organization(String orgName, OrganizationType organizationType, String address, String phoneNum, String emailAddress, 
            String organizationImage, Date dateCreated, Date dateLastUpdated, String createdBy, String modifiedBy) {
        super(dateCreated, dateLastUpdated, createdBy, modifiedBy);
        this.orgName = orgName;
        this.organizationType = organizationType;
        this.address = address;
        this.phoneNum = phoneNum;
        this.emailAddress = emailAddress;
        this.organizationImage = organizationImage;
    }
    
    public String getOrganizationName() {
        return orgName;
    }

    public void setOrganizationName(String orgName) {
        this.orgName = orgName;
    }

    public OrganizationType getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(OrganizationType organizationType) {
        this.organizationType = organizationType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNum;
    }

    public void setPhoneNo(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return emailAddress;
    }

    public void setEmail(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public OrganizationManagerDir getOrgManagerDirectory() {
        return organizationManagerDir;
    }

    public void setOrgManagerDirectory(OrganizationManagerDir organizationManagerDir) {
        this.organizationManagerDir = organizationManagerDir;
    }

    public DeliveryAgentDir getDeliveryVolunteerDirectory() {
        return deliveryAgentDir;
    }

    public void setDeliveryVolunteerDirectory(DeliveryAgentDir deliveryAgentDir) {
        this.deliveryAgentDir = deliveryAgentDir;
    }

    public List<Donation> getDonations() {
        return items;
    }

    public void setDonations(List<Donation> items) {
        this.items = items;
    }

    public String getOrganizationImage() {
        return organizationImage;
    }

    public void setOrganizationImage(String organizationImage) {
        this.organizationImage = organizationImage;
    }

    @Override
    public String toString() {
        return orgName;
    }
            
}
