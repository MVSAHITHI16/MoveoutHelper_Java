/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.studentWorkArea;

import StudentSale.CityName;
import StudentSale.CityNetwork;
import StudentSale.EcoSystem;
import StudentSale.CollectionCenter;
import StudentSale.User;
import StudentSale.serviceAgent.ServiceAgent;
import StudentSale.deliveryAgent.DeliveryAgent;
import StudentSale.std.Donation;
import StudentSale.std.Student;
import StudentSale.enums.Category;
import StudentSale.enums.DonationStatus;
import StudentSale.enums.PickUp;
import StudentSale.enums.UsageStatus;
import StudentSale.enums.StudentRole;
import StudentSale.helper.Constants;
import StudentSale.helper.EmailHelper;
import StudentSale.helper.PhoneNoHelper;
import StudentSale.helper.UserNameHelper;
import StudentSale.helper.ValidateInputs;
import StudentSale.organization.OrganizationManager;
import StudentSale.organization.Organization;
import StudentSale.sysAdmin.SysAdmin;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author sishwathoka
 */
public class CreateNewDonationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateSysAdminJPanel
     */
    
    private JPanel userProcessJpanel;
    private EcoSystem ecoSystem;
    private User userLogged;
    private Student std;
    private String imagePath = Constants.DEFAULT_PROFILE_IMAGE_PATH;
    
    
    /**
     * Creates new form MakeNewDonationJPanel
     */
    public CreateNewDonationJPanel(JPanel userProcessJpanel, EcoSystem ecoSystem, User userLogged) {
        initComponents();
        this.userProcessJpanel = userProcessJpanel;
        this.ecoSystem = ecoSystem;
        this.userLogged = userLogged;
        this.std = (Student) userLogged;
        
        populateCategories();
        populateCities();
        populatePickUpMode();
        populateUsageStatus();
//        setDefaultPhoto();
    }
    
//    private void setDefaultPhoto() {
//        
//        setPhoto(getClass().getResource(Constants.DEFAULT_PROFILE_IMAGE_PATH).getPath());
//    }
//    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usageStatusCmbobx = new javax.swing.JComboBox<>();
        pickupmodeLbl = new javax.swing.JLabel();
        pickupModeCmbx = new javax.swing.JComboBox<>();
        lblCollCenter = new javax.swing.JLabel();
        CollCenterCmbx = new javax.swing.JComboBox<>();
        txtPickupadd = new javax.swing.JTextField();
        pickupAddLbl = new javax.swing.JLabel();
        dateOfExpiryLbl = new javax.swing.JLabel();
        infoLbl = new javax.swing.JLabel();
        headerLbl = new javax.swing.JLabel();
        txtInfo = new javax.swing.JTextField();
        cityLabel = new javax.swing.JLabel();
        categoryCmbx = new javax.swing.JComboBox<>();
        createBonationReqBtn = new javax.swing.JButton();
        donCategoryLbl = new javax.swing.JLabel();
        usageStatusLbl = new javax.swing.JLabel();
        cityCmbx = new javax.swing.JComboBox<>();
        dateOfExpiry = new com.toedter.calendar.JDateChooser();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(javax.swing.UIManager.getDefaults().getColor("SlidingButton.selectedBackground"));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usageStatusCmbobx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usageStatusCmbobxMousePressed(evt);
            }
        });
        add(usageStatusCmbobx, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 158, 179, 33));

        pickupmodeLbl.setText("PickUp Mode:");
        add(pickupmodeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 92, 33));

        pickupModeCmbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickupModeCmbxActionPerformed(evt);
            }
        });
        add(pickupModeCmbx, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 160, 179, 33));

        lblCollCenter.setText("Select Bank:");
        add(lblCollCenter, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, -1, 33));

        CollCenterCmbx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CollCenterCmbxMousePressed(evt);
            }
        });
        add(CollCenterCmbx, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 210, 179, 33));

        txtPickupadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPickupaddActionPerformed(evt);
            }
        });
        add(txtPickupadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 260, 179, 33));

        pickupAddLbl.setText("PickUp Address:");
        add(pickupAddLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 93, 33));

        dateOfExpiryLbl.setText("Date of Expiry:");
        add(dateOfExpiryLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 260, 99, 33));

        infoLbl.setText("Information:");
        add(infoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 209, 99, 33));

        headerLbl.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        headerLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLbl.setText("Make New Donation");
        add(headerLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 20, 310, 34));
        add(txtInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 209, 179, 33));

        cityLabel.setText("City:");
        add(cityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 93, 33));

        categoryCmbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryCmbxActionPerformed(evt);
            }
        });
        add(categoryCmbx, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 106, 179, 33));

        createBonationReqBtn.setText("Create Donation Request");
        createBonationReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBonationReqBtnActionPerformed(evt);
            }
        });
        add(createBonationReqBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, 180, 33));

        donCategoryLbl.setText("Donation Category:");
        add(donCategoryLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 109, 118, 33));

        usageStatusLbl.setText("Usage Status:");
        add(usageStatusLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 158, 99, 33));

        cityCmbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityCmbxActionPerformed(evt);
            }
        });
        add(cityCmbx, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 110, 179, 33));
        add(dateOfExpiry, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 260, 179, 33));

        backBtn.setText("< < Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 27, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bg.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void usageStatusCmbobxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usageStatusCmbobxMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_usageStatusCmbobxMousePressed

    private void CollCenterCmbxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CollCenterCmbxMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_CollCenterCmbxMousePressed

    public void populateCategories() {
        
        categoryCmbx.removeAllItems();
        String[] categories = Category.getCategoriesArray();
        for(String category:categories) {
            categoryCmbx.addItem(category);
        }
    }
    
    public void populateUsageStatus() {
        
        usageStatusCmbobx.removeAllItems();
        String[] usageStatus = UsageStatus.getUsageStatusArray();
        for(String status:usageStatus) {
            usageStatusCmbobx.addItem(status);
        }
    }
    
    public void populatePickUpMode() {
        
        pickupModeCmbx.removeAllItems();
        String[] modes = PickUp.getPickUpArray();
        for(String mode:modes) {
            pickupModeCmbx.addItem(mode);
        }
        
        String selectedItem = (String) pickupModeCmbx.getSelectedItem();
        if(selectedItem.equalsIgnoreCase("Home")) {
            CollCenterCmbx.setEnabled(false);
        }else{
            CollCenterCmbx.setEnabled(true);
        }
    }
    
    public void populateCities() {
        
        List<CityNetwork> cityNtw = ecoSystem.getCityNetworkDirectory().getCityNetworks();
        cityCmbx.removeAllItems();
        for(CityNetwork cityNetwork:ecoSystem.getCityNetworkDirectory().getCityNetworks()) {
            cityCmbx.addItem(cityNetwork.getCityName().name());
        }
        
    }
    
    public void populateFoodBanks() {
        CollCenterCmbx.removeAllItems();
        for(CityNetwork cityNetwork:ecoSystem.getCityNetworkDirectory().getCityNetworks()) {
            if (cityNetwork.getCityName().name().equals(cityCmbx.getSelectedItem().toString())){
                if (cityNetwork.getFoodBankDirectory()!=null){
                    for(CollectionCenter fb : cityNetwork.getFoodBankDirectory().getFoodBanks()){
                       CollCenterCmbx.addItem(fb.getName());
                    }
                }
            }            
        }
    }
    
//    
//    public void populateFoodBanks() {
//        selectfoodbankjComboBox.removeAllItems();
//        
//        for(CityNetwork cityNetwork:ecoSystem.getCityNetworkDirectory().getCityNetworks()) {
//            if (cityNetwork.getCityName().name().equals(cityjComboBox.getSelectedItem().toString())){
//                if (cityNetwork.getFoodBankDirectory()!=null){
//                    for(CollectionCenter fb : cityNetwork.getFoodBankDirectory().getFoodBanks()){
//                       selectfoodbankjComboBox.addItem(fb.getName());
//                    }
//                }
//            }            
//        }
//    }
    
    
    private void createBonationReqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBonationReqBtnActionPerformed
        if (txtInfo.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "!Error! Please enter some info about the Donation");
            return;
        }
        String info = txtInfo.getText();
        Category category = Category.valueOf(categoryCmbx.getSelectedItem().toString());
        UsageStatus usageStatus = UsageStatus.valueOf(usageStatusCmbobx.getSelectedItem().toString());
        PickUp pickUp = PickUp.valueOf(pickupModeCmbx.getSelectedItem().toString());
        
        int cityNetworkIndex = cityCmbx.getSelectedIndex();
        if (cityNetworkIndex<0){
            JOptionPane.showMessageDialog(this, "!Error! No City present in the system");
            return;
        }
        CityNetwork cityNetwork =  ecoSystem.getCityNetworkDirectory().getCityNetworks().get(cityNetworkIndex);
        
        int foodBankIndex=-1;
        CollectionCenter collectionCenter = null;
        if (!pickupModeCmbx.getSelectedItem().equals("Home")){
            foodBankIndex = CollCenterCmbx.getSelectedIndex();
            if(foodBankIndex <0) {
                JOptionPane.showMessageDialog(this, "!Error! No food banks present. Please select different options.");
                return;
            }
            collectionCenter = cityNetwork.getFoodBankDirectory().getFoodBanks().get(foodBankIndex);
        }
            
        
        String addressToPickUp = null;
        if ((PickUp.valueOf(pickupModeCmbx.getSelectedItem().toString())).equals(PickUp.Home)){
            if (!ValidateInputs.isAddressValid(txtPickupadd.getText())){
                JOptionPane.showMessageDialog(this, "!Error! Address invalid for Home Pickup");
                return;
            }else{
                addressToPickUp = txtPickupadd.getText();
            }
        }else{
            if (collectionCenter!=null){
                addressToPickUp = collectionCenter.getLocation();
            }
        }
        Date expiryDate = null;
        if(categoryCmbx.getSelectedItem().toString().equals("Food") || categoryCmbx.getSelectedItem().toString().equals("Medicines")){
            expiryDate = (Date) dateOfExpiry.getDate();
        }else{
            dateOfExpiry.removeAll();
            dateOfExpiry.setEnabled(false);
        }
        
        DonationStatus ds = DonationStatus.ReadyToPickup;
        
        if (expiryDate != null){
            if (expiryDate.before(new Date())){
                ds = DonationStatus.Expired;
            }
        }
        
        Donation newDonation = new Donation(info, category, usageStatus, pickUp, collectionCenter, addressToPickUp, expiryDate, imagePath, std, cityNetwork, null, null, null, ds, null, new Date(), new Date(), std.getName(), std.getName());
        JOptionPane.showMessageDialog(this, "Sucessfully added a Donation request.");
        
        txtInfo.setText("");
        txtPickupadd.setText("");
        dateOfExpiry.setDate(null);

    }//GEN-LAST:event_createBonationReqBtnActionPerformed

//    private void setPhoto(String imagePath) {
//        ImageIcon photo = new ImageIcon(imagePath);
//        System.out.println(" isshu jash"+picHolderLbl.getWidth());
//        Image photoResized = photo.getImage().getScaledInstance(picHolderLbl.getWidth(), picHolderLbl.getHeight(),4);        
//        picHolderLbl.setIcon(new ImageIcon(photoResized));
//    }
    
    private void pickupModeCmbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pickupModeCmbxActionPerformed
        if (((String) pickupModeCmbx.getSelectedItem()).equals("CollectionCenter")){
            CollCenterCmbx.setEnabled(true);
            txtPickupadd.setText("");
            txtPickupadd.setEnabled(false);
            
            populateFoodBanks();
        }else{
            CollCenterCmbx.removeAllItems();
            
            CollCenterCmbx.setEnabled(false);
            txtPickupadd.setEnabled(true);
        }
    }//GEN-LAST:event_pickupModeCmbxActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessJpanel.remove(this);

        Component[] components = userProcessJpanel.getComponents();
        ManageMyDonationsJPanel manageMyDonationsJPanel = (ManageMyDonationsJPanel) components[components.length-1];
        manageMyDonationsJPanel.populateDonationHistoryTable();

        CardLayout cardLayout = (CardLayout) userProcessJpanel.getLayout();
        cardLayout.previous(userProcessJpanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void cityCmbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityCmbxActionPerformed
        populateFoodBanks();
    }//GEN-LAST:event_cityCmbxActionPerformed

    private void categoryCmbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryCmbxActionPerformed
        if(categoryCmbx.getSelectedItem().toString().equals("Food") || categoryCmbx.getSelectedItem().toString().equals("Medicines")){
            dateOfExpiry.setEnabled(true);
        }else{
            dateOfExpiry.setEnabled(false);
        }
    }//GEN-LAST:event_categoryCmbxActionPerformed

    private void txtPickupaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPickupaddActionPerformed
        // TODO add your handling code here:
        if(!ValidateInputs.isAddressValid(txtPickupadd.getText())){
           JOptionPane.showMessageDialog(this, "Enter Address correctly");
       }
    }//GEN-LAST:event_txtPickupaddActionPerformed


    
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CollCenterCmbx;
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox<String> categoryCmbx;
    private javax.swing.JComboBox<String> cityCmbx;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JButton createBonationReqBtn;
    private com.toedter.calendar.JDateChooser dateOfExpiry;
    private javax.swing.JLabel dateOfExpiryLbl;
    private javax.swing.JLabel donCategoryLbl;
    private javax.swing.JLabel headerLbl;
    private javax.swing.JLabel infoLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCollCenter;
    private javax.swing.JLabel pickupAddLbl;
    private javax.swing.JComboBox<String> pickupModeCmbx;
    private javax.swing.JLabel pickupmodeLbl;
    private javax.swing.JTextField txtInfo;
    private javax.swing.JTextField txtPickupadd;
    private javax.swing.JComboBox<String> usageStatusCmbobx;
    private javax.swing.JLabel usageStatusLbl;
    // End of variables declaration//GEN-END:variables
}