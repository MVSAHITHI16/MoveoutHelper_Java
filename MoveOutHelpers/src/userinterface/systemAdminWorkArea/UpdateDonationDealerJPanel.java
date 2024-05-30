/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.systemAdminWorkArea;

import StudentSale.EcoSystem;
import StudentSale.User;
import StudentSale.donationDealer.DonationDealer;
import StudentSale.helper.Constants;
import StudentSale.helper.EmailHelper;
import StudentSale.helper.PhoneNoHelper;
import StudentSale.helper.UserNameHelper;
import StudentSale.helper.ValidateInputs;
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
 * @author harshila
 */
public class UpdateDonationDealerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateDonationDealerJPanel
     */
    
    private JPanel userProcessJpanel;
    private EcoSystem ecoSystem;
    private DonationDealer cityOfficial;
    private User userLogged;
    
    private String imagePath;
    private static final Logger logger = Logger.getLogger(UpdateDonationDealerJPanel.class.getName());
    
    public UpdateDonationDealerJPanel(JPanel userProcessJpanel, EcoSystem ecoSystem, DonationDealer cityOfficial, User userLogged) {
        initComponents();
        
        this.userProcessJpanel=userProcessJpanel;
        this.ecoSystem=ecoSystem;
        this.cityOfficial=cityOfficial;
        this.userLogged=userLogged;
        
        picHolderjLabel.setSize(126, 139);
        populateData();
    }

    private void populateData() {
        
        namejTextField.setText(cityOfficial.getName());
        userNamejTextField.setText(cityOfficial.getUserName());
        passwordjTextField.setText(cityOfficial.getPassword());
        phoneNojTextField.setText(cityOfficial.getPhoneNo());
        emailjTextField.setText(cityOfficial.getEmail());
        addressjTextField.setText(cityOfficial.getAddress());
        imagePath = cityOfficial.getProfilePic();
        
        setPhoto(cityOfficial.getProfilePic());
    }
    
    private void setPhoto(String photo) {
        
        if(photo.equals(Constants.DEFAULT_PROFILE_IMAGE_PATH)) {
            ImageIcon pic = new ImageIcon(getClass().getResource(Constants.DEFAULT_PROFILE_IMAGE_PATH).getPath());
            Image photoResized = pic.getImage().getScaledInstance(picHolderjLabel.getWidth(), picHolderjLabel.getHeight(),4);
            picHolderjLabel.setIcon(new ImageIcon(photoResized));
            return;
        }
 
        ImageIcon pic = new ImageIcon(photo);
        Image photoResized = pic.getImage().getScaledInstance(picHolderjLabel.getWidth(), picHolderjLabel.getHeight(),4);
        picHolderjLabel.setIcon(new ImageIcon(photoResized));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        phoneNojLabel = new javax.swing.JLabel();
        passwordjTextField = new javax.swing.JTextField();
        userNamejLabel = new javax.swing.JLabel();
        phoneNojTextField = new javax.swing.JTextField();
        emailjLabel = new javax.swing.JLabel();
        headerjLabel = new javax.swing.JLabel();
        picHolderjLabel = new javax.swing.JLabel();
        namejLabel = new javax.swing.JLabel();
        namejTextField = new javax.swing.JTextField();
        emailjTextField = new javax.swing.JTextField();
        addressjLabel = new javax.swing.JLabel();
        updatejButton = new javax.swing.JButton();
        passwordjLabel = new javax.swing.JLabel();
        uploadjButton = new javax.swing.JButton();
        addressjTextField = new javax.swing.JTextField();
        userNamejTextField = new javax.swing.JTextField();
        backjButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(javax.swing.UIManager.getDefaults().getColor("DesktopIcon.background"));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        phoneNojLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        phoneNojLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        phoneNojLabel.setText("Phone No :");
        add(phoneNojLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 302, 122, -1));

        passwordjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordjTextFieldActionPerformed(evt);
            }
        });
        add(passwordjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 217, 234, -1));

        userNamejLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        userNamejLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        userNamejLabel.setText("User Name :");
        add(userNamejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 179, 122, -1));

        phoneNojTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNojTextFieldActionPerformed(evt);
            }
        });
        add(phoneNojTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 299, 234, -1));

        emailjLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        emailjLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        emailjLabel.setText("Email :");
        add(emailjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 261, 122, -1));

        headerjLabel.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        headerjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerjLabel.setText("Update Donation Dealer");
        add(headerjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 34, 415, 34));

        picHolderjLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(picHolderjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, 126, 139));

        namejLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        namejLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        namejLabel.setText("Name :");
        add(namejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 134, 122, -1));

        namejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namejTextFieldActionPerformed(evt);
            }
        });
        add(namejTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 131, 234, -1));

        emailjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailjTextFieldActionPerformed(evt);
            }
        });
        add(emailjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 258, 234, -1));

        addressjLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        addressjLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        addressjLabel.setText("Address :");
        add(addressjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 343, 122, -1));

        updatejButton.setText("Update");
        updatejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatejButtonActionPerformed(evt);
            }
        });
        add(updatejButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 405, -1, -1));

        passwordjLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        passwordjLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        passwordjLabel.setText("Password :");
        add(passwordjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 220, 122, -1));

        uploadjButton.setText("upload");
        uploadjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadjButtonActionPerformed(evt);
            }
        });
        add(uploadjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 300, -1, -1));

        addressjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressjTextFieldActionPerformed(evt);
            }
        });
        add(addressjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 340, 234, -1));

        userNamejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNamejTextFieldActionPerformed(evt);
            }
        });
        add(userNamejTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 176, 234, -1));

        backjButton.setText("< < Back");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });
        add(backjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 42, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bg.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, -20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void updatejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatejButtonActionPerformed
        // TODO add your handling code here:
        if(isDataEnteredValid()) {

            if(!cityOfficial.getUserName().equals(userNamejTextField.getText()) && UserNameHelper.isUserNameAlreadyExisted(ecoSystem, userNamejTextField.getText())) {
                JOptionPane.showMessageDialog(this, "UserName already Exists in the Ecosystem.");
                return;
            }
            if(!cityOfficial.getEmail().equals(emailjTextField.getText()) && EmailHelper.isEmailAlreadyExisted(ecoSystem, emailjTextField.getText())) {
                JOptionPane.showMessageDialog(this, "Email already Exists in the Ecosystem.");
                return;
            }
            if(!cityOfficial.getPhoneNo().equals(phoneNojTextField.getText()) && PhoneNoHelper.isPhoneNoAlreadyExisted(ecoSystem, phoneNojTextField.getText())) {
                JOptionPane.showMessageDialog(this, "PhoneNo already Exists in the Ecosystem.");
                return;
            }

            cityOfficial.setName(namejTextField.getText());
            cityOfficial.setUserName(userNamejTextField.getText());
            cityOfficial.setPassword(passwordjTextField.getText());
            cityOfficial.setEmail(emailjTextField.getText());
            cityOfficial.setPhoneNo(phoneNojTextField.getText());
            cityOfficial.setAddress(addressjTextField.getText());
            cityOfficial.setProfilePic(imagePath);
            cityOfficial.setLastUpdatedDate(new Date());
            cityOfficial.setModifiedBy(userLogged.getUserName());
            
            JOptionPane.showMessageDialog(this, "Successfully updated City Official");
            logger.log(Level.INFO, "Updated City Official");
        }else{
            JOptionPane.showMessageDialog(this, "Error updating City Official. Please check DataTypes");
        }
    }//GEN-LAST:event_updatejButtonActionPerformed

    private boolean isDataEnteredValid() {
        if(ValidateInputs.isNameValid(namejTextField.getText()) && ValidateInputs.isUsernameValid(userNamejTextField.getText()) && 
                ValidateInputs.isEmailValid(emailjTextField.getText()) && ValidateInputs.isPhoneNumberValid(phoneNojTextField.getText())
                && ValidateInputs.isPasswordValid(passwordjTextField.getText()) && ValidateInputs.isAddressValid(addressjTextField.getText()))  {
           return true; 
        }
        return false;
    }
    
    private void uploadjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadjButtonActionPerformed
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
    }//GEN-LAST:event_uploadjButtonActionPerformed

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        // TODO add your handling code here:
        userProcessJpanel.remove(this);

        Component[] components = userProcessJpanel.getComponents();
        ManageDonationDealerJPanel manageCityOfficialsJPanel = (ManageDonationDealerJPanel) components[components.length-1];
        manageCityOfficialsJPanel.populateDonationDealers();

        CardLayout cardLayout = (CardLayout) userProcessJpanel.getLayout();
        cardLayout.previous(userProcessJpanel);
    }//GEN-LAST:event_backjButtonActionPerformed

    private void namejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namejTextFieldActionPerformed
        // TODO add your handling code here:
        if( !ValidateInputs.isNameValid(namejTextField.getText()) ){
                   JOptionPane.showMessageDialog(this, "Enter Name correctly");

       }
    }//GEN-LAST:event_namejTextFieldActionPerformed

    private void userNamejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNamejTextFieldActionPerformed
        // TODO add your handling code here:
        if(!ValidateInputs.isUsernameValid(userNamejTextField.getText())){
           JOptionPane.showMessageDialog(this, "Enter Username correctly");
       }
    }//GEN-LAST:event_userNamejTextFieldActionPerformed

    private void passwordjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordjTextFieldActionPerformed
        // TODO add your handling code here:
        if( !ValidateInputs.isPasswordValid(passwordjTextField.getText())){
                   JOptionPane.showMessageDialog(this, "Enter password correctly(minimum 8 digits)");

       }
    }//GEN-LAST:event_passwordjTextFieldActionPerformed

    private void emailjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailjTextFieldActionPerformed
        // TODO add your handling code here:
        if( !ValidateInputs.isEmailValid(emailjTextField.getText()))
               {
                   JOptionPane.showMessageDialog(this, "Enter Email correctly");

       }
    }//GEN-LAST:event_emailjTextFieldActionPerformed

    private void phoneNojTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNojTextFieldActionPerformed
        // TODO add your handling code here:
        if( !ValidateInputs.isPhoneNumberValid(phoneNojTextField.getText()))
               {
                   JOptionPane.showMessageDialog(this, "Enter phoneNumber correctly with minimum 10 digits)");

       }
    }//GEN-LAST:event_phoneNojTextFieldActionPerformed

    private void addressjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressjTextFieldActionPerformed
        // TODO add your handling code here:
        if(!ValidateInputs.isAddressValid(addressjTextField.getText())){
           JOptionPane.showMessageDialog(this, "Enter Address correctly");
       }
    }//GEN-LAST:event_addressjTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressjLabel;
    private javax.swing.JTextField addressjTextField;
    private javax.swing.JButton backjButton;
    private javax.swing.JLabel emailjLabel;
    private javax.swing.JTextField emailjTextField;
    private javax.swing.JLabel headerjLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel namejLabel;
    private javax.swing.JTextField namejTextField;
    private javax.swing.JLabel passwordjLabel;
    private javax.swing.JTextField passwordjTextField;
    private javax.swing.JLabel phoneNojLabel;
    private javax.swing.JTextField phoneNojTextField;
    private javax.swing.JLabel picHolderjLabel;
    private javax.swing.JButton updatejButton;
    private javax.swing.JButton uploadjButton;
    private javax.swing.JLabel userNamejLabel;
    private javax.swing.JTextField userNamejTextField;
    // End of variables declaration//GEN-END:variables
}
