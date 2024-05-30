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
import StudentSale.enums.StudentRole;
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
import java.nio.file.Paths;
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
public class CreateDeliveryAgentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateDeliveryAgentJPanel
     */
    
    private JPanel userProcessJpanel;
    private EcoSystem ecoSystem;
    private CityNetwork cityNetwork;
    private Organization org;
    private User userLogged;
    private String imagePath = Constants.DEFAULT_PROFILE_IMAGE_PATH;
    private static final Logger logger = Logger.getLogger(CreateDeliveryAgentJPanel.class.getName());
    
    public CreateDeliveryAgentJPanel(JPanel userProcessJpanel, EcoSystem ecoSystem, CityNetwork cityNetwork, Organization org, User userLogged) {
        initComponents();
        
        this.userProcessJpanel = userProcessJpanel;
        this.ecoSystem = ecoSystem;
        this.cityNetwork = cityNetwork;
        this.org = org;
        this.userLogged = userLogged;
        
        picHolderLbl.setSize(126, 139);
        setDefaultPhoto();
        populateCityHeader();
    }
    
    private void populateCityHeader(){
        headerCityNameLbl.setText(cityNetwork.getCityName().name());       

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameTxtFld = new javax.swing.JTextField();
        uploadBttn = new javax.swing.JButton();
        emailTxtFld = new javax.swing.JTextField();
        phoneNumLbl = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        phoneNumTxtFld = new javax.swing.JTextField();
        addressLbl = new javax.swing.JLabel();
        headerLbl = new javax.swing.JLabel();
        psswrdLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        addressTxtFld = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        psswrdTxtFld = new javax.swing.JTextField();
        userNameTxtFld = new javax.swing.JTextField();
        picHolderLbl = new javax.swing.JLabel();
        usrNmeLbl = new javax.swing.JLabel();
        emailLbl = new javax.swing.JLabel();
        headerCityTagLbl = new javax.swing.JLabel();
        headerCityNameLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(javax.swing.UIManager.getDefaults().getColor("SlidingButton.selectedBackground"));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtFldActionPerformed(evt);
            }
        });
        add(nameTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 131, 234, -1));

        uploadBttn.setText("upload");
        uploadBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadBttnActionPerformed(evt);
            }
        });
        add(uploadBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 318, -1, -1));

        emailTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxtFldActionPerformed(evt);
            }
        });
        add(emailTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 258, 234, -1));

        phoneNumLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        phoneNumLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        phoneNumLbl.setText("Phone No :");
        add(phoneNumLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 302, 122, -1));

        backBtn.setText("< < Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 42, -1, -1));

        phoneNumTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumTxtFldActionPerformed(evt);
            }
        });
        add(phoneNumTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 299, 234, -1));

        addressLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        addressLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        addressLbl.setText("Address :");
        add(addressLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 343, 122, -1));

        headerLbl.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        headerLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLbl.setText("Create New Delivery Volunteer");
        add(headerLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 34, 415, 34));

        psswrdLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        psswrdLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        psswrdLbl.setText("Password :");
        add(psswrdLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 220, 122, -1));

        nameLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        nameLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nameLbl.setText("Name :");
        add(nameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 134, 122, -1));

        addressTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTxtFldActionPerformed(evt);
            }
        });
        add(addressTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 340, 234, -1));

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, -1, -1));

        psswrdTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psswrdTxtFldActionPerformed(evt);
            }
        });
        add(psswrdTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 217, 234, -1));

        userNameTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTxtFldActionPerformed(evt);
            }
        });
        add(userNameTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 176, 234, -1));

        picHolderLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(picHolderLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(606, 161, 126, 139));

        usrNmeLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        usrNmeLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        usrNmeLbl.setText("User Name :");
        add(usrNmeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 179, 122, -1));

        emailLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        emailLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        emailLbl.setText("Email :");
        add(emailLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 261, 122, -1));

        headerCityTagLbl.setText("City:");
        add(headerCityTagLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 38, -1, 30));
        add(headerCityNameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 38, 130, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bg.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

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

    private void resetUi() {
        
        nameTxtFld.setText("");
        userNameTxtFld.setText("");
        psswrdTxtFld.setText("");
        emailTxtFld.setText("");
        phoneNumTxtFld.setText("");
        addressTxtFld.setText("");
        
        setDefaultPhoto();
    }
    
    private void setDefaultPhoto() {
        
        setPhoto(getClass().getResource(Constants.DEFAULT_PROFILE_IMAGE_PATH).getPath());
    }

    private void setPhoto(String imagePath) {
        ImageIcon photo = new ImageIcon(imagePath);
        Image photoResized = photo.getImage().getScaledInstance(picHolderLbl.getWidth(), picHolderLbl.getHeight(),4);
        picHolderLbl.setIcon(new ImageIcon(photoResized));
    }
    
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessJpanel.remove(this);

        Component[] components = userProcessJpanel.getComponents();
        ManageDeliveryAgentJPanel manageDeliveryVolunteersJPanel = (ManageDeliveryAgentJPanel) components[components.length-1];
        manageDeliveryVolunteersJPanel.populateDeliveryVolunteers();

        CardLayout cardLayout = (CardLayout) userProcessJpanel.getLayout();
        cardLayout.previous(userProcessJpanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        if(isDataEnteredValid()) {

            if(UserNameHelper.isUserNameAlreadyExisted(ecoSystem, userNameTxtFld.getText())) {
                JOptionPane.showMessageDialog(this, "UserName already Exists in the Ecosystem.");
                return;
            }
            if(EmailHelper.isEmailAlreadyExisted(ecoSystem, emailTxtFld.getText())) {
                JOptionPane.showMessageDialog(this, "Email already Exists in the Ecosystem.");
                return;
            }
            if(PhoneNoHelper.isPhoneNoAlreadyExisted(ecoSystem, phoneNumTxtFld.getText())) {
                JOptionPane.showMessageDialog(this, "PhoneNo already Exists in the Ecosystem.");
                return;
            }

            String name = nameTxtFld.getText();
            String userName = userNameTxtFld.getText();
            String password = psswrdTxtFld.getText();
            String emailAddress = emailTxtFld.getText();
            String phoneNum = phoneNumTxtFld.getText();
            String address = addressTxtFld.getText();

            DeliveryAgent deliveryAgent = new DeliveryAgent(name, phoneNum, emailAddress, address, userName, password, StudentRole.DeliveryAgent, imagePath,
                new Date(), new Date(), userLogged.getName(), userLogged.getName());
            org.getDeliveryVolunteerDirectory().getDeliveryVolunteers().add(deliveryAgent);

            JOptionPane.showMessageDialog(this, "Successfully saved new Delivery Volunteer");
            resetUi();
            
            logger.log(Level.INFO, "Delivery Volunteer Profile created");
            
        }else{
            JOptionPane.showMessageDialog(this, "Error saving new Delivery Volunteer. Please check DataTypes");
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void nameTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtFldActionPerformed
         if(!ValidateInputs.isNameValid(nameTxtFld.getText())){
           JOptionPane.showMessageDialog(this, "Enter Name correctly");
       }
    }//GEN-LAST:event_nameTxtFldActionPerformed

    private void userNameTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTxtFldActionPerformed
       if(!ValidateInputs.isUsernameValid(userNameTxtFld.getText())){
           JOptionPane.showMessageDialog(this, "Enter Username correctly");
       }
    }//GEN-LAST:event_userNameTxtFldActionPerformed

    private void psswrdTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psswrdTxtFldActionPerformed
        if( !ValidateInputs.isPasswordValid(psswrdTxtFld.getText())){
                   JOptionPane.showMessageDialog(this, "Enter password correctly(minimum 8 digits)");

       }
    }//GEN-LAST:event_psswrdTxtFldActionPerformed

    private void emailTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTxtFldActionPerformed
       if( !ValidateInputs.isEmailValid(emailTxtFld.getText()))
               {
                   JOptionPane.showMessageDialog(this, "Enter Email correctly");
               }
    }//GEN-LAST:event_emailTxtFldActionPerformed

    private void phoneNumTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumTxtFldActionPerformed
         if( !ValidateInputs.isPhoneNumberValid(phoneNumTxtFld.getText()))
               {
                   JOptionPane.showMessageDialog(this, "Enter phoneNumber correctly with minimum 10 digits)");

       }
    }//GEN-LAST:event_phoneNumTxtFldActionPerformed

    private void addressTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTxtFldActionPerformed
       if(!ValidateInputs.isAddressValid(addressTxtFld.getText())){
           JOptionPane.showMessageDialog(this, "Enter Address correctly");
       }
    }//GEN-LAST:event_addressTxtFldActionPerformed

    private boolean isDataEnteredValid() {
        if(ValidateInputs.isNameValid(nameTxtFld.getText()) && ValidateInputs.isUsernameValid(userNameTxtFld.getText()) && 
                ValidateInputs.isEmailValid(emailTxtFld.getText()) && ValidateInputs.isPhoneNumberValid(phoneNumTxtFld.getText())
                && ValidateInputs.isPasswordValid(psswrdTxtFld.getText()) && ValidateInputs.isAddressValid(addressTxtFld.getText()))  {
         return true; 
    }
        return false;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLbl;
    private javax.swing.JTextField addressTxtFld;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JTextField emailTxtFld;
    private javax.swing.JLabel headerCityNameLbl;
    private javax.swing.JLabel headerCityTagLbl;
    private javax.swing.JLabel headerLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTxtFld;
    private javax.swing.JLabel phoneNumLbl;
    private javax.swing.JTextField phoneNumTxtFld;
    private javax.swing.JLabel picHolderLbl;
    private javax.swing.JLabel psswrdLbl;
    private javax.swing.JTextField psswrdTxtFld;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton uploadBttn;
    private javax.swing.JTextField userNameTxtFld;
    private javax.swing.JLabel usrNmeLbl;
    // End of variables declaration//GEN-END:variables
}
