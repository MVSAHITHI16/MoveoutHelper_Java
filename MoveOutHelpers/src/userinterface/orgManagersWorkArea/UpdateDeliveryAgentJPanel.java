/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.orgManagersWorkArea;

import StudentSale.CityNetwork;
import StudentSale.EcoSystem;
import StudentSale.User;
import StudentSale.deliveryAgent.DeliveryAgent;
import StudentSale.helper.Constants;
import StudentSale.helper.EmailHelper;
import StudentSale.helper.PhoneNoHelper;
import StudentSale.helper.UserNameHelper;
import StudentSale.helper.ValidateInputs;
import StudentSale.organization.Organization;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author sahithreddy
 */
public class UpdateDeliveryAgentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateDeliveryAgentJPanel
     */
    
    private JPanel userProcessJpanel;
    private EcoSystem ecoSystem;
    private CityNetwork cityNetwork;
    private Organization org;
    private DeliveryAgent deliveryAgent;
    private User userLogged;
    private String imagePath;
    private static final Logger logger = Logger.getLogger(UpdateDeliveryAgentJPanel.class.getName());
    
    public UpdateDeliveryAgentJPanel(JPanel userProcessJpanel, EcoSystem ecoSystem, CityNetwork cityNetwork, Organization org, 
            DeliveryAgent deliveryAgent, User userLogged ) {
        initComponents();
        
        this.userProcessJpanel = userProcessJpanel;
        this.ecoSystem = ecoSystem;
        this.cityNetwork = cityNetwork;
        this.org = org;
        this.deliveryAgent = deliveryAgent;
        this.userLogged = userLogged;
        
        picHolderLbl.setSize(126, 139);
//        setDefaultPhoto();
        populateData();
        populateCityHeader();
    }
    
    private void populateCityHeader(){
        headercityNameLbl.setText(cityNetwork.getCityName().name());
    }
    
    private void setDefaultPhoto() {
        setPhoto(getClass().getResource(Constants.DEFAULT_PROFILE_IMAGE_PATH).getPath());
    }
    
    private void populateData() {
        
        nameTxtFld.setText(deliveryAgent.getName());
        usrNameTxtFld.setText(deliveryAgent.getUserName());
        psswrdTextField.setText(deliveryAgent.getPassword());
        phoneNoTextField.setText(deliveryAgent.getPhoneNo());
        emailTxtFld.setText(deliveryAgent.getEmail());
        addssTxtFld.setText(deliveryAgent.getAddress());
        imagePath = deliveryAgent.getProfilePic();
        
        setPhoto(deliveryAgent.getProfilePic());
    }
    
    private void setPhoto(String photo) {
        
        if(photo.equals(Constants.DEFAULT_PROFILE_IMAGE_PATH)) {
            ImageIcon pic = new ImageIcon(getClass().getResource(Constants.DEFAULT_PROFILE_IMAGE_PATH).getPath());
            Image photoResized = pic.getImage().getScaledInstance(picHolderLbl.getWidth(), picHolderLbl.getHeight(),4);
            picHolderLbl.setIcon(new ImageIcon(photoResized));
            return;
        }
 
        ImageIcon pic = new ImageIcon(photo);
        Image photoResized = pic.getImage().getScaledInstance(picHolderLbl.getWidth(), picHolderLbl.getHeight(),4);
        picHolderLbl.setIcon(new ImageIcon(photoResized));
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        namejLabel = new javax.swing.JLabel();
        nameTxtFld = new javax.swing.JTextField();
        emailTxtFld = new javax.swing.JTextField();
        addrssLbl = new javax.swing.JLabel();
        updateBton = new javax.swing.JButton();
        psswordLbl = new javax.swing.JLabel();
        uploadBttn = new javax.swing.JButton();
        addssTxtFld = new javax.swing.JTextField();
        usrNameTxtFld = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        phneNjLbl = new javax.swing.JLabel();
        psswrdTextField = new javax.swing.JTextField();
        userNameLbl = new javax.swing.JLabel();
        phoneNoTextField = new javax.swing.JTextField();
        emailLbl = new javax.swing.JLabel();
        headerLbl = new javax.swing.JLabel();
        picHolderLbl = new javax.swing.JLabel();
        headerCityTag = new javax.swing.JLabel();
        headercityNameLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(javax.swing.UIManager.getDefaults().getColor("SlidingButton.selectedBackground"));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        namejLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        namejLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        namejLabel.setText("Name :");
        add(namejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 122, 122, 31));

        nameTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtFldActionPerformed(evt);
            }
        });
        add(nameTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 122, 234, 31));

        emailTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxtFldActionPerformed(evt);
            }
        });
        add(emailTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 273, 234, 31));

        addrssLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        addrssLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        addrssLbl.setText("Address :");
        add(addrssLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 371, 122, 31));

        updateBton.setText("Update");
        updateBton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtonActionPerformed(evt);
            }
        });
        add(updateBton, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 432, -1, -1));

        psswordLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        psswordLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        psswordLbl.setText("Password :");
        add(psswordLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 224, 122, 31));

        uploadBttn.setText("upload");
        uploadBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadBttnActionPerformed(evt);
            }
        });
        add(uploadBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(719, 322, -1, -1));

        addssTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addssTxtFldActionPerformed(evt);
            }
        });
        add(addssTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 371, 234, 31));

        usrNameTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usrNameTxtFldActionPerformed(evt);
            }
        });
        add(usrNameTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 175, 234, 31));

        backBtn.setText("< < Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 41, -1, -1));

        phneNjLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        phneNjLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        phneNjLbl.setText("Phone No :");
        add(phneNjLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 322, 122, 31));

        psswrdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psswrdTextFieldActionPerformed(evt);
            }
        });
        add(psswrdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 224, 234, 31));

        userNameLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        userNameLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        userNameLbl.setText("User Name :");
        add(userNameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 175, 122, 31));

        phoneNoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNoTextFieldActionPerformed(evt);
            }
        });
        add(phoneNoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 322, 234, 31));

        emailLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        emailLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        emailLbl.setText("Email :");
        add(emailLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 273, 122, 31));

        headerLbl.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        headerLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLbl.setText("Update Delivery Volunteer");
        add(headerLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 34, 415, 34));

        picHolderLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(picHolderLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(695, 150, 126, 139));

        headerCityTag.setText("City:");
        add(headerCityTag, new org.netbeans.lib.awtextra.AbsoluteConstraints(649, 20, -1, 30));
        add(headercityNameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 130, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bg.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, -30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void updateBtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtonActionPerformed
        // TODO add your handling code here:
        if(isDataEnteredValid()) {

            if(!deliveryAgent.getUserName().equals(usrNameTxtFld.getText()) && UserNameHelper.isUserNameAlreadyExisted(ecoSystem, usrNameTxtFld.getText())) {
                JOptionPane.showMessageDialog(this, "UserName already Exists in the Ecosystem.");
                return;
            }
            if(!deliveryAgent.getEmail().equals(emailTxtFld.getText()) && EmailHelper.isEmailAlreadyExisted(ecoSystem, emailTxtFld.getText())) {
                JOptionPane.showMessageDialog(this, "Email already Exists in the Ecosystem.");
                return;
            }
            if(!deliveryAgent.getPhoneNo().equals(phoneNoTextField.getText()) && PhoneNoHelper.isPhoneNoAlreadyExisted(ecoSystem, phoneNoTextField.getText())) {
                JOptionPane.showMessageDialog(this, "PhoneNo already Exists in the Ecosystem.");
                return;
            }

            deliveryAgent.setName(nameTxtFld.getText());
            deliveryAgent.setUserName(usrNameTxtFld.getText());
            deliveryAgent.setPassword(psswrdTextField.getText());
            deliveryAgent.setEmail(emailTxtFld.getText());
            deliveryAgent.setPhoneNo(phoneNoTextField.getText());
            deliveryAgent.setAddress(addssTxtFld.getText());
            deliveryAgent.setProfilePic(imagePath);
            deliveryAgent.setLastUpdatedDate(new Date());
            deliveryAgent.setModifiedBy(userLogged.getUserName());
            JOptionPane.showMessageDialog(this, "Successfully saved Delivery Volunteer");
            logger.log(Level.INFO, "Delivery Volunteer Profile Updated");
        }else{
            JOptionPane.showMessageDialog(this, "Error saving Delivery Volunteer. Please check DataTypes");
        }
    }//GEN-LAST:event_updateBtonActionPerformed

    private boolean isDataEnteredValid() {
        if(ValidateInputs.isNameValid(nameTxtFld.getText()) && ValidateInputs.isUsernameValid(usrNameTxtFld.getText()) && 
                ValidateInputs.isEmailValid(emailTxtFld.getText()) && ValidateInputs.isPhoneNumberValid(phoneNoTextField.getText())
                && ValidateInputs.isPasswordValid(psswrdTextField.getText()) && ValidateInputs.isAddressValid(addssTxtFld.getText()))  {
         return true; 
    }
        return false;
    }
    
    private void uploadBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadBttnActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("/"));
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Jpeg format", "jpeg"));
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Jpg format", "jpg"));
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Png format", "png"));
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            imagePath = selectedFile.getAbsolutePath();
            setPhoto(imagePath);
        }
    }//GEN-LAST:event_uploadBttnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessJpanel.remove(this);

        Component[] components = userProcessJpanel.getComponents();
        ManageDeliveryAgentJPanel manageDeliveryVolunteersJPanel = (ManageDeliveryAgentJPanel) components[components.length-1];
        manageDeliveryVolunteersJPanel.populateDeliveryVolunteers();

        CardLayout cardLayout = (CardLayout) userProcessJpanel.getLayout();
        cardLayout.previous(userProcessJpanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void nameTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtFldActionPerformed
        // TODO add your handling code here:
        if(!ValidateInputs.isNameValid(nameTxtFld.getText())){
           JOptionPane.showMessageDialog(this, "Enter Address correctly");
       }
    }//GEN-LAST:event_nameTxtFldActionPerformed

    private void usrNameTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usrNameTxtFldActionPerformed
        // TODO add your handling code here:
        if(!ValidateInputs.isUsernameValid(usrNameTxtFld.getText())){
           JOptionPane.showMessageDialog(this, "Enter Username correctly");
       }
    }//GEN-LAST:event_usrNameTxtFldActionPerformed

    private void psswrdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psswrdTextFieldActionPerformed
        // TODO add your handling code here:
        if( !ValidateInputs.isPasswordValid(psswrdTextField.getText())){
                   JOptionPane.showMessageDialog(this, "Enter password correctly(minimum 8 digits)");

       }
    }//GEN-LAST:event_psswrdTextFieldActionPerformed

    private void emailTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTxtFldActionPerformed
        // TODO add your handling code here:
        if( !ValidateInputs.isEmailValid(emailTxtFld.getText()))
               {
                   JOptionPane.showMessageDialog(this, "Enter Email correctly");

       }
    }//GEN-LAST:event_emailTxtFldActionPerformed

    private void phoneNoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNoTextFieldActionPerformed
        // TODO add your handling code here:
        if( !ValidateInputs.isPhoneNumberValid(phoneNoTextField.getText()))
               {
                   JOptionPane.showMessageDialog(this, "Enter phoneNumber correctly with minimum 10 digits)");

       }
    }//GEN-LAST:event_phoneNoTextFieldActionPerformed

    private void addssTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addssTxtFldActionPerformed
        // TODO add your handling code here:
        if(!ValidateInputs.isAddressValid(addssTxtFld.getText())){
           JOptionPane.showMessageDialog(this, "Enter Address correctly");
       }
    }//GEN-LAST:event_addssTxtFldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addrssLbl;
    private javax.swing.JTextField addssTxtFld;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JTextField emailTxtFld;
    private javax.swing.JLabel headerCityTag;
    private javax.swing.JLabel headerLbl;
    private javax.swing.JLabel headercityNameLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField nameTxtFld;
    private javax.swing.JLabel namejLabel;
    private javax.swing.JLabel phneNjLbl;
    private javax.swing.JTextField phoneNoTextField;
    private javax.swing.JLabel picHolderLbl;
    private javax.swing.JLabel psswordLbl;
    private javax.swing.JTextField psswrdTextField;
    private javax.swing.JButton updateBton;
    private javax.swing.JButton uploadBttn;
    private javax.swing.JLabel userNameLbl;
    private javax.swing.JTextField usrNameTxtFld;
    // End of variables declaration//GEN-END:variables
}