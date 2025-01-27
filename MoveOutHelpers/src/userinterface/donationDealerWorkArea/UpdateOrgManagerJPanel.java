/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.donationDealerWorkArea;

import StudentSale.CityNetwork;
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
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author harshila
 */
public class UpdateOrgManagerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateOrgManagerJPanel
     */
    private JPanel userProcessJpanel;
    private EcoSystem ecoSystem;
    private CityNetwork cityNetwork;
    private OrganizationManager orgManager;
    private User userLogged;    
    private String imagePath;
    
    public UpdateOrgManagerJPanel(JPanel userProcessJpanel, EcoSystem ecoSystem, CityNetwork cityNetwork, OrganizationManager orgManager, User userLogged) {
        initComponents();
        this.userProcessJpanel = userProcessJpanel;
        this.ecoSystem = ecoSystem;
        this.orgManager = orgManager;
        this.userLogged = userLogged;
        this.cityNetwork = cityNetwork;
        picLbl.setSize(126, 139);
        populateData();
        populateCityHeader();
    }
    
    private void populateCityHeader(){
        headerCityNameLbl.setText(cityNetwork.getCityName().name());
    }
    
    private void setDefaultPhoto() {
        setPhoto(getClass().getResource(Constants.DEFAULT_PROFILE_IMAGE_PATH).getPath());
    }   
    private void populateData() {
        
        usrNameTxtFld.setText(orgManager.getUserName());
        nameTxtFld.setText(orgManager.getName());
        psswrdTxtFld.setText(orgManager.getPassword());
        phoneNumTxtFld.setText(orgManager.getPhoneNo());
        emailTxtFld.setText(orgManager.getEmail());
        addrssTxtFld.setText(orgManager.getAddress());
        
        setPhoto(orgManager.getProfilePic());
    }
       
    private void setPhoto(String photo) {
        
        if(photo.equals(Constants.DEFAULT_PROFILE_IMAGE_PATH)) {
            ImageIcon pic = new ImageIcon(Paths.get(Constants.DEFAULT_PROFILE_IMAGE_PATH).toAbsolutePath().toString());
            Image photoResized = pic.getImage().getScaledInstance(picLbl.getWidth(), picLbl.getHeight(),4);
            picLbl.setIcon(new ImageIcon(photoResized));
            return;
        }
 
        ImageIcon pic = new ImageIcon(photo);
        Image photoResized = pic.getImage().getScaledInstance(picLbl.getWidth(), picLbl.getHeight(),4);
        picLbl.setIcon(new ImageIcon(photoResized));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        backBtn = new javax.swing.JButton();
        headerLbl = new javax.swing.JLabel();
        picLbl = new javax.swing.JLabel();
        uploadBtn = new javax.swing.JButton();
        nameTxtFld = new javax.swing.JTextField();
        nameLbl = new javax.swing.JLabel();
        usrNameLbl = new javax.swing.JLabel();
        usrNameTxtFld = new javax.swing.JTextField();
        psswrdTxtFld = new javax.swing.JTextField();
        psswrdLbl = new javax.swing.JLabel();
        emailLbl = new javax.swing.JLabel();
        emailTxtFld = new javax.swing.JTextField();
        phoneNumTxtFld = new javax.swing.JTextField();
        phoneNumLbl = new javax.swing.JLabel();
        addrssLbl = new javax.swing.JLabel();
        addrssTxtFld = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();
        headerCityTagLbl = new javax.swing.JLabel();
        headerCityNameLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(javax.swing.UIManager.getDefaults().getColor("SlidingButton.selectedBackground"));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backBtn.setText("< < Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 42, -1, -1));

        headerLbl.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        headerLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLbl.setText("Update Organization Manager");
        add(headerLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 34, 415, 34));

        picLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(picLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 154, 126, 139));

        uploadBtn.setText("upload");
        uploadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadBtnActionPerformed(evt);
            }
        });
        add(uploadBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 311, -1, -1));

        nameTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtFldActionPerformed(evt);
            }
        });
        add(nameTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 154, 234, 30));

        nameLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        nameLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nameLbl.setText("Name :");
        add(nameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 160, 122, -1));

        usrNameLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        usrNameLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        usrNameLbl.setText("User Name :");
        add(usrNameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 212, 122, -1));

        usrNameTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usrNameTxtFldActionPerformed(evt);
            }
        });
        add(usrNameTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 206, 234, 30));

        psswrdTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psswrdTxtFldActionPerformed(evt);
            }
        });
        add(psswrdTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 254, 234, 30));

        psswrdLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        psswrdLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        psswrdLbl.setText("Password :");
        add(psswrdLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 260, 122, -1));

        emailLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        emailLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        emailLbl.setText("Email :");
        add(emailLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 308, 122, -1));

        emailTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxtFldActionPerformed(evt);
            }
        });
        add(emailTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 302, 234, 30));

        phoneNumTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumTxtFldActionPerformed(evt);
            }
        });
        add(phoneNumTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 352, 234, 30));

        phoneNumLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        phoneNumLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        phoneNumLbl.setText("Phone No :");
        add(phoneNumLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 358, 122, -1));

        addrssLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        addrssLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        addrssLbl.setText("Address :");
        add(addrssLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 406, 122, -1));

        addrssTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addrssTxtFldActionPerformed(evt);
            }
        });
        add(addrssTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 400, 234, 30));

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 480, -1, -1));

        headerCityTagLbl.setText("City:");
        add(headerCityTagLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 34, -1, 30));
        add(headerCityNameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 34, 130, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bg.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessJpanel.remove(this);

        Component[] components = userProcessJpanel.getComponents();
        ManageOrganizationJPanel manageOrganizationsJPanel = (ManageOrganizationJPanel) components[components.length-1];
        manageOrganizationsJPanel.populateData();

        CardLayout cardLayout = (CardLayout) userProcessJpanel.getLayout();
        cardLayout.previous(userProcessJpanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void uploadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadBtnActionPerformed
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
    }//GEN-LAST:event_uploadBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        if(isDataEnteredValid()) {

            if(!orgManager.getUserName().equals(usrNameTxtFld.getText()) && UserNameHelper.isUserNameAlreadyExisted(ecoSystem, usrNameTxtFld.getText())) {
                JOptionPane.showMessageDialog(this, "UserName already Exists in the Ecosystem.");
                return;
            }
            if(!orgManager.getEmail().equals(emailTxtFld.getText()) && EmailHelper.isEmailAlreadyExisted(ecoSystem, emailTxtFld.getText())) {
                JOptionPane.showMessageDialog(this, "Email already Exists in the Ecosystem.");
                return;
            }
            if(!orgManager.getPhoneNo().equals(phoneNumTxtFld.getText()) && PhoneNoHelper.isPhoneNoAlreadyExisted(ecoSystem, phoneNumTxtFld.getText())) {
                JOptionPane.showMessageDialog(this, "PhoneNo already Exists in the Ecosystem.");
                return;
            }

            orgManager.setName(nameTxtFld.getText());
            orgManager.setUserName(usrNameTxtFld.getText());
            orgManager.setPassword(psswrdTxtFld.getText());
            orgManager.setEmail(emailTxtFld.getText());
            orgManager.setPhoneNo(phoneNumTxtFld.getText());
            orgManager.setAddress(addrssTxtFld.getText());

            JOptionPane.showMessageDialog(this, "Successfully saved new Organization Manager");
        }else{
            JOptionPane.showMessageDialog(this, "Error saving new Organization Manager. Please check DataTypes");
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void nameTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtFldActionPerformed
       if(!ValidateInputs.isNameValid(nameTxtFld.getText())){
           JOptionPane.showMessageDialog(this, "Enter Name correctly");
       }
    }//GEN-LAST:event_nameTxtFldActionPerformed

    private void usrNameTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usrNameTxtFldActionPerformed
         if(!ValidateInputs.isUsernameValid(usrNameTxtFld.getText())){
           JOptionPane.showMessageDialog(this, "Enter Username correctly");
       }
    }//GEN-LAST:event_usrNameTxtFldActionPerformed

    private void psswrdTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psswrdTxtFldActionPerformed
        if( !ValidateInputs.isPhoneNumberValid(psswrdTxtFld.getText()))
               {
                   JOptionPane.showMessageDialog(this, "Enter passwordd correctly with minimum 8 char)");

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

    private void addrssTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addrssTxtFldActionPerformed
        if(!ValidateInputs.isAddressValid(addrssTxtFld.getText())){
           JOptionPane.showMessageDialog(this, "Enter Address correctly");
       }
    }//GEN-LAST:event_addrssTxtFldActionPerformed
    private boolean isDataEnteredValid() {
        if(ValidateInputs.isNameValid(nameTxtFld.getText()) && ValidateInputs.isUsernameValid(usrNameTxtFld.getText()) && 
                ValidateInputs.isEmailValid(emailTxtFld.getText()) && ValidateInputs.isPhoneNumberValid(phoneNumTxtFld.getText())
                && ValidateInputs.isPasswordValid(psswrdTxtFld.getText()) && ValidateInputs.isAddressValid(addrssTxtFld.getText()))  {
        return true; 
        }
        return false;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addrssLbl;
    private javax.swing.JTextField addrssTxtFld;
    private javax.swing.JButton backBtn;
    private javax.swing.ButtonGroup buttonGroup1;
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
    private javax.swing.JLabel picLbl;
    private javax.swing.JLabel psswrdLbl;
    private javax.swing.JTextField psswrdTxtFld;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton uploadBtn;
    private javax.swing.JLabel usrNameLbl;
    private javax.swing.JTextField usrNameTxtFld;
    // End of variables declaration//GEN-END:variables
}
