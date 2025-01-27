/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.systemAdminWorkArea;

import StudentSale.EcoSystem;
import StudentSale.User;
import StudentSale.helper.Constants;
import StudentSale.helper.EmailHelper;
import StudentSale.helper.PhoneNoHelper;
import StudentSale.helper.UserNameHelper;
import StudentSale.helper.ValidateInputs;
import StudentSale.organization.OrganizationManager;
import StudentSale.organization.Organization;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.nio.file.Paths;
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
public class UpdateOrganizationManagerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateOrganizationManagerJPanel
     */
    
    private JPanel userProcessJpanel;
    private EcoSystem ecoSystem;
    private OrganizationManager orgManager;
    private User userLogged;
    private static final Logger logger = Logger.getLogger(UpdateOrganizationManagerJPanel.class.getName());
    private String imagePath = Constants.DEFAULT_PROFILE_IMAGE_PATH;
    
    public UpdateOrganizationManagerJPanel(JPanel userProcessJpanel, EcoSystem ecoSystem, OrganizationManager orgManager, User userLogged) {
        initComponents();
        this.userProcessJpanel = userProcessJpanel;
        this.ecoSystem = ecoSystem;
        this.orgManager = orgManager;
        this.userLogged = userLogged;
        
        picHolderLbl.setSize(126, 139);
        populateData();
    }

    private void populateData() {
        
        userNameTextfield.setText(orgManager.getUserName());
        nameTvxtField.setText(orgManager.getName());
        passwrdjTxtField.setText(orgManager.getPassword());
        phoneNumTxt.setText(orgManager.getPhoneNo());
        emailTxtFld.setText(orgManager.getEmail());
        addressjTextField.setText(orgManager.getAddress());
        imagePath = orgManager.getProfilePic();
        
        setPhoto(orgManager.getProfilePic());
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

        passwrdjTxtField = new javax.swing.JTextField();
        phoneNumTxt = new javax.swing.JTextField();
        picHolderLbl = new javax.swing.JLabel();
        headerLbl = new javax.swing.JLabel();
        emailLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        uploadButn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        emailTxtFld = new javax.swing.JTextField();
        userNameTextfield = new javax.swing.JTextField();
        phneNojLabel = new javax.swing.JLabel();
        userNamejLabel = new javax.swing.JLabel();
        nameTvxtField = new javax.swing.JTextField();
        addressLLbl = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        addressjTextField = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(javax.swing.UIManager.getDefaults().getColor("SlidingButton.selectedBackground"));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passwrdjTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwrdjTxtFieldActionPerformed(evt);
            }
        });
        add(passwrdjTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 217, 234, -1));

        phoneNumTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumTxtActionPerformed(evt);
            }
        });
        add(phoneNumTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 299, 234, -1));

        picHolderLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(picHolderLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 126, 139));

        headerLbl.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        headerLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLbl.setText("Update Organization Manager");
        add(headerLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 34, 415, 34));

        emailLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        emailLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        emailLbl.setText("Email :");
        add(emailLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 261, 122, -1));

        nameLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        nameLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nameLbl.setText("Name :");
        add(nameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 134, 122, -1));

        uploadButn.setText("upload");
        uploadButn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadButnActionPerformed(evt);
            }
        });
        add(uploadButn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, -1, -1));

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 413, -1, -1));

        emailTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxtFldActionPerformed(evt);
            }
        });
        add(emailTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 258, 234, -1));

        userNameTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTextfieldActionPerformed(evt);
            }
        });
        add(userNameTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 176, 234, -1));

        phneNojLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        phneNojLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        phneNojLabel.setText("Phone No :");
        add(phneNojLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 302, 122, -1));

        userNamejLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        userNamejLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        userNamejLabel.setText("User Name :");
        add(userNamejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 179, 122, -1));

        nameTvxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTvxtFieldActionPerformed(evt);
            }
        });
        add(nameTvxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 131, 234, -1));

        addressLLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        addressLLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        addressLLbl.setText("Address :");
        add(addressLLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 343, 122, -1));

        passwordLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        passwordLabel.setText("Password :");
        add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 220, 122, -1));

        addressjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressjTextFieldActionPerformed(evt);
            }
        });
        add(addressjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 340, 234, -1));

        backBtn.setText("< < Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 42, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bg.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void uploadButnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadButnActionPerformed
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
    }//GEN-LAST:event_uploadButnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        logger.log(Level.INFO, "Inside Org Manager Update Screen");
        if(isDataEnteredValid()) {

            if(!orgManager.getUserName().equals(userNameTextfield.getText()) && UserNameHelper.isUserNameAlreadyExisted(ecoSystem, userNameTextfield.getText())) {
                JOptionPane.showMessageDialog(this, "UserName already Exists in the Ecosystem.");
                return;
            }
            if(!orgManager.getEmail().equals(emailTxtFld.getText()) && EmailHelper.isEmailAlreadyExisted(ecoSystem, emailTxtFld.getText())) {
                JOptionPane.showMessageDialog(this, "Email already Exists in the Ecosystem.");
                return;
            }
            if(!orgManager.getPhoneNo().equals(phoneNumTxt.getText()) && PhoneNoHelper.isPhoneNoAlreadyExisted(ecoSystem, phoneNumTxt.getText())) {
                JOptionPane.showMessageDialog(this, "PhoneNo already Exists in the Ecosystem.");
                return;
            }

            orgManager.setName(nameTvxtField.getText());
            orgManager.setUserName(userNameTextfield.getText());
            orgManager.setPassword(passwrdjTxtField.getText());
            orgManager.setEmail(emailTxtFld.getText());
            orgManager.setPhoneNo(phoneNumTxt.getText());
            orgManager.setAddress(addressjTextField.getText());
            orgManager.setProfilePic(imagePath);
            
            JOptionPane.showMessageDialog(this, "Successfully updated Organization Manager");
        }else{
            JOptionPane.showMessageDialog(this, "Error updating Organization Manager. Please check DataTypes");
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private boolean isDataEnteredValid() {
        if(ValidateInputs.isNameValid(nameTvxtField.getText()) && ValidateInputs.isUsernameValid(userNameTextfield.getText()) && 
                ValidateInputs.isEmailValid(emailTxtFld.getText()) && ValidateInputs.isPhoneNumberValid(phoneNumTxt.getText())
                && ValidateInputs.isPasswordValid(passwrdjTxtField.getText()) && ValidateInputs.isAddressValid(addressjTextField.getText()))  {
           return true; 
        }
        return false;
    }
    
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessJpanel.remove(this);

        Component[] components = userProcessJpanel.getComponents();
        ManageOrganizationsJPanel manageOrganizationsJPanel = (ManageOrganizationsJPanel) components[components.length-1];
        manageOrganizationsJPanel.populateOrganizations();

        CardLayout cardLayout = (CardLayout) userProcessJpanel.getLayout();
        cardLayout.previous(userProcessJpanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void nameTvxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTvxtFieldActionPerformed
        // TODO add your handling code here:
                                              
       if( !ValidateInputs.isNameValid(nameTvxtField.getText()) ){
                   JOptionPane.showMessageDialog(this, "Enter Name correctly");

       }
    }//GEN-LAST:event_nameTvxtFieldActionPerformed

    private void userNameTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTextfieldActionPerformed
        // TODO add your handling code here:
        if( !ValidateInputs.isUsernameValid(userNameTextfield.getText()) ){
                   JOptionPane.showMessageDialog(this, "Enter UserName correctly");

       }
    }//GEN-LAST:event_userNameTextfieldActionPerformed

    private void passwrdjTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwrdjTxtFieldActionPerformed
        // TODO add your handling code here:
        if( !ValidateInputs.isPasswordValid(passwrdjTxtField.getText()) ){
                   JOptionPane.showMessageDialog(this, "Enter Password correctly(min 8 char)");
       }
    }//GEN-LAST:event_passwrdjTxtFieldActionPerformed

    private void emailTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTxtFldActionPerformed
        // TODO add your handling code here:
                                                   
        if( !ValidateInputs.isPasswordValid(emailTxtFld.getText()) ){
                   JOptionPane.showMessageDialog(this, "Enter Email correctly");
       } 
    }//GEN-LAST:event_emailTxtFldActionPerformed

    private void phoneNumTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumTxtActionPerformed
        // TODO add your handling code here:
                                                   
       if( !ValidateInputs.isPasswordValid(phoneNumTxt.getText()) ){
                   JOptionPane.showMessageDialog(this, "Enter PhoneNumber correctly");
       } 
        
    }//GEN-LAST:event_phoneNumTxtActionPerformed

    private void addressjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressjTextFieldActionPerformed
        // TODO add your handling code here:
        if( !ValidateInputs.isPasswordValid(addressjTextField.getText()) ){
                   JOptionPane.showMessageDialog(this, "Enter Address correctly");
       } 
    }//GEN-LAST:event_addressjTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLLbl;
    private javax.swing.JTextField addressjTextField;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JTextField emailTxtFld;
    private javax.swing.JLabel headerLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTvxtField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField passwrdjTxtField;
    private javax.swing.JLabel phneNojLabel;
    private javax.swing.JTextField phoneNumTxt;
    private javax.swing.JLabel picHolderLbl;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton uploadButn;
    private javax.swing.JTextField userNameTextfield;
    private javax.swing.JLabel userNamejLabel;
    // End of variables declaration//GEN-END:variables
}
