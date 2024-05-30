/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.deliveryAgentWorkArea;

import StudentSale.EcoSystem;
import StudentSale.User;
import StudentSale.enums.StudentRole;
import StudentSale.helper.Constants;
import StudentSale.helper.EmailHelper;
import StudentSale.helper.PhoneNoHelper;
import StudentSale.helper.UserNameHelper;
import StudentSale.helper.ValidateInputs;
import StudentSale.sysAdmin.SysAdmin;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.nio.file.Paths;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author sishwathoka
 */
public class UpdateDeliveryAgentProfileJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateSysAdminJPanel
     */
    
    private JPanel userProcessJpanel;
    private EcoSystem ecoSystem;
    private User userLogged;
    
    private String imagePath;
    
    public UpdateDeliveryAgentProfileJPanel(JPanel userProcessJpanel, EcoSystem ecoSystem, User userLogged) {
        initComponents();
        this.userProcessJpanel = userProcessJpanel;
        this.ecoSystem = ecoSystem;
        this.userLogged = userLogged;
        
        picHolderjLabel.setSize(126, 139);
        populateData();
    }

    private void populateData() {
        
        nameTxtFld.setText(userLogged.getName());
        userNameTxtFld.setText(userLogged.getUserName());
        psswrdTxtFld.setText(userLogged.getPassword());
        phnNoTxtFld.setText(userLogged.getPhoneNo());
        emailjTextField.setText(userLogged.getEmail());
        addrssTxtFld.setText(userLogged.getAddress());
        imagePath = userLogged.getProfilePic();
        
        setPhoto(userLogged.getProfilePic());
    }
    
    private void setPhoto(String photo) {
        
        if(photo.equals(Constants.DEFAULT_PROFILE_IMAGE_PATH)) {
            ImageIcon pic = new ImageIcon(Paths.get(Constants.DEFAULT_PROFILE_IMAGE_PATH).toAbsolutePath().toString());
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

        jLabel3 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        phnNoTxtFld = new javax.swing.JTextField();
        headingLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        userNameTxtFld = new javax.swing.JTextField();
        usrNameLbl = new javax.swing.JLabel();
        nameTxtFld = new javax.swing.JTextField();
        addrsLbl = new javax.swing.JLabel();
        passwrdLbl = new javax.swing.JLabel();
        addrssTxtFld = new javax.swing.JTextField();
        psswrdTxtFld = new javax.swing.JTextField();
        emailLbl = new javax.swing.JLabel();
        picHolderjLabel = new javax.swing.JLabel();
        emailjTextField = new javax.swing.JTextField();
        uploadjButton = new javax.swing.JButton();
        phoneNojLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Screen Shot 2022-12-15 at 8.48.49 AM.png"))); // NOI18N

        setBackground(javax.swing.UIManager.getDefaults().getColor("DesktopIcon.background"));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backBtn.setText("< < Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 42, -1, -1));

        phnNoTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phnNoTxtFldActionPerformed(evt);
            }
        });
        add(phnNoTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 234, -1));

        headingLbl.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        headingLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headingLbl.setText("Update Delivery Agent Profile");
        add(headingLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 34, 415, 34));

        nameLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        nameLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nameLbl.setText("Name :");
        add(nameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 122, -1));

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, -1, -1));

        userNameTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTxtFldActionPerformed(evt);
            }
        });
        add(userNameTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 234, -1));

        usrNameLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        usrNameLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        usrNameLbl.setText("User Name :");
        add(usrNameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 122, -1));

        nameTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtFldActionPerformed(evt);
            }
        });
        add(nameTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 234, -1));

        addrsLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        addrsLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        addrsLbl.setText("Address :");
        add(addrsLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 122, -1));

        passwrdLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        passwrdLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        passwrdLbl.setText("Password :");
        add(passwrdLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 122, -1));

        addrssTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addrssTxtFldActionPerformed(evt);
            }
        });
        add(addrssTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 234, -1));

        psswrdTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psswrdTxtFldActionPerformed(evt);
            }
        });
        add(psswrdTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 234, -1));

        emailLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        emailLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        emailLbl.setText("Email :");
        add(emailLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 122, -1));

        picHolderjLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(picHolderjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 126, 139));

        emailjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailjTextFieldActionPerformed(evt);
            }
        });
        add(emailjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 234, -1));

        uploadjButton.setText("upload");
        uploadjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadjButtonActionPerformed(evt);
            }
        });
        add(uploadjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 250, -1, -1));

        phoneNojLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        phoneNojLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        phoneNojLabel.setText("Phone No :");
        add(phoneNojLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 122, -1));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 370, -1, -1));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 413, -1, -1));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bg.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessJpanel.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessJpanel.getLayout();
        cardLayout.previous(userProcessJpanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        if(isDataEnteredValid()) {

            if(!userLogged.getUserName().equals(userNameTxtFld.getText()) && UserNameHelper.isUserNameAlreadyExisted(ecoSystem, userNameTxtFld.getText())) {
                JOptionPane.showMessageDialog(this, "UserName already Exists in the Ecosystem.");
                return;
            }
            if(!userLogged.getEmail().equals(emailjTextField.getText()) && EmailHelper.isEmailAlreadyExisted(ecoSystem, emailjTextField.getText())) {
                JOptionPane.showMessageDialog(this, "Email already Exists in the Ecosystem.");
                return;
            }
            if(!userLogged.getPhoneNo().equals(phnNoTxtFld.getText()) && PhoneNoHelper.isPhoneNoAlreadyExisted(ecoSystem, phnNoTxtFld.getText())) {
                JOptionPane.showMessageDialog(this, "PhoneNo already Exists in the Ecosystem.");
                return;
            }

            userLogged.setName(nameTxtFld.getText());
            userLogged.setUserName(userNameTxtFld.getText());
            userLogged.setPassword(psswrdTxtFld.getText());
            userLogged.setEmail(emailjTextField.getText());
            userLogged.setPhoneNo(phnNoTxtFld.getText());
            userLogged.setAddress(addrssTxtFld.getText());
            userLogged.setProfilePic(imagePath);
            userLogged.setLastUpdatedDate(new Date());
            userLogged.setModifiedBy(userLogged.getUserName());
            JOptionPane.showMessageDialog(this, "Successfully updated the Delivery Volunteer Profile");
        }else{
            JOptionPane.showMessageDialog(this, "Error saving Delivery Volunteer Profile. Please check DataTypes");
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private boolean isDataEnteredValid() {
        if(ValidateInputs.isNameValid(nameTxtFld.getText()) && ValidateInputs.isUsernameValid(userNameTxtFld.getText()) && 
                ValidateInputs.isEmailValid(emailjTextField.getText()) && ValidateInputs.isPhoneNumberValid(phnNoTxtFld.getText())
                && ValidateInputs.isPasswordValid(psswrdTxtFld.getText()) && ValidateInputs.isAddressValid(addrssTxtFld.getText())
                 && ValidateInputs.isAddressValid(addrssTxtFld.getText()))  {
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

    private void addrssTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addrssTxtFldActionPerformed
        if( !ValidateInputs.isPasswordValid(addrssTxtFld.getText()) ){
                   JOptionPane.showMessageDialog(this, "Enter Address correctly");
       }
    }//GEN-LAST:event_addrssTxtFldActionPerformed

    private void phnNoTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phnNoTxtFldActionPerformed
        if( !ValidateInputs.isPasswordValid(phnNoTxtFld.getText()) ){
                   JOptionPane.showMessageDialog(this, "Enter PhoneNumber correctly");
       }
    }//GEN-LAST:event_phnNoTxtFldActionPerformed

    private void emailjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailjTextFieldActionPerformed
        if( !ValidateInputs.isPasswordValid(emailjTextField.getText()) ){
                   JOptionPane.showMessageDialog(this, "Enter Email correctly");
       }
    }//GEN-LAST:event_emailjTextFieldActionPerformed

    private void psswrdTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psswrdTxtFldActionPerformed
        if( !ValidateInputs.isPasswordValid(psswrdTxtFld.getText()) ){
                   JOptionPane.showMessageDialog(this, "Enter password correctly with minimun 8 characters");
       }
    }//GEN-LAST:event_psswrdTxtFldActionPerformed

    private void userNameTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTxtFldActionPerformed
        if( !ValidateInputs.isUsernameValid(userNameTxtFld.getText()) ){
                   JOptionPane.showMessageDialog(this, "Enter UserName correctly");

       }
    }//GEN-LAST:event_userNameTxtFldActionPerformed

    private void nameTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtFldActionPerformed
        if( !ValidateInputs.isNameValid(nameTxtFld.getText()) ){
                   JOptionPane.showMessageDialog(this, "Enter Name correctly");

       }
    }//GEN-LAST:event_nameTxtFldActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addrsLbl;
    private javax.swing.JTextField addrssTxtFld;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JTextField emailjTextField;
    private javax.swing.JLabel headingLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTxtFld;
    private javax.swing.JLabel passwrdLbl;
    private javax.swing.JTextField phnNoTxtFld;
    private javax.swing.JLabel phoneNojLabel;
    private javax.swing.JLabel picHolderjLabel;
    private javax.swing.JTextField psswrdTxtFld;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton uploadjButton;
    private javax.swing.JTextField userNameTxtFld;
    private javax.swing.JLabel usrNameLbl;
    // End of variables declaration//GEN-END:variables
}