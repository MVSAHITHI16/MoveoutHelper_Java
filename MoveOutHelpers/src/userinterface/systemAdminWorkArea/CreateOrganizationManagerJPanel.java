/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.systemAdminWorkArea;

import StudentSale.EcoSystem;
import StudentSale.User;
import StudentSale.enums.StudentRole;
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
public class CreateOrganizationManagerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateOrganizationManagerJPanel
     */
    
    private JPanel userProcessJpanel;
    private EcoSystem ecoSystem;
    private Organization org;
    private User userLogged;
    private String imagePath = Constants.DEFAULT_PROFILE_IMAGE_PATH;
    private static final Logger logger = Logger.getLogger(CreateOrganizationManagerJPanel.class.getName());
    
    public CreateOrganizationManagerJPanel(JPanel userProcessJpanel, EcoSystem ecoSystem, Organization org, User userLogged) {
        initComponents();
        this.userProcessJpanel = userProcessJpanel;
        this.ecoSystem = ecoSystem; 
        this.org = org;
        this.userLogged = userLogged;
        
        picHolderLbl.setSize(126, 139);
        setDefaultPhoto();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        phoneNumTxtFld = new javax.swing.JTextField();
        headerLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        usrNameTxtFld = new javax.swing.JTextField();
        usrNameLbl = new javax.swing.JLabel();
        nameTxtFld = new javax.swing.JTextField();
        addLbl = new javax.swing.JLabel();
        passwrdLbl = new javax.swing.JLabel();
        addTxtFld = new javax.swing.JTextField();
        passwrdTxtFld = new javax.swing.JTextField();
        picHolderLbl = new javax.swing.JLabel();
        emailLbl = new javax.swing.JLabel();
        uploadBtn = new javax.swing.JButton();
        emailTxtFld = new javax.swing.JTextField();
        phoneNumLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(javax.swing.UIManager.getDefaults().getColor("DesktopIcon.background"));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        headerLbl.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        headerLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLbl.setText("Create New Organization Manager");
        add(headerLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 34, 415, 34));

        nameLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        nameLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nameLbl.setText("Name :");
        add(nameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 134, 122, -1));

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 413, -1, -1));

        usrNameTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usrNameTxtFldActionPerformed(evt);
            }
        });
        add(usrNameTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 176, 234, -1));

        usrNameLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        usrNameLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        usrNameLbl.setText("User Name :");
        add(usrNameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 179, 122, -1));

        nameTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtFldActionPerformed(evt);
            }
        });
        add(nameTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 131, 234, -1));

        addLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        addLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        addLbl.setText("Address :");
        add(addLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 343, 122, -1));

        passwrdLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        passwrdLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        passwrdLbl.setText("Password :");
        add(passwrdLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 220, 122, -1));

        addTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTxtFldActionPerformed(evt);
            }
        });
        add(addTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 340, 234, -1));

        passwrdTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwrdTxtFldActionPerformed(evt);
            }
        });
        add(passwrdTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 217, 234, -1));

        picHolderLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(picHolderLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 126, 139));

        emailLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        emailLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        emailLbl.setText("Email :");
        add(emailLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 261, 122, -1));

        uploadBtn.setText("upload");
        uploadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadBtnActionPerformed(evt);
            }
        });
        add(uploadBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, -1, -1));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bg.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -120, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessJpanel.remove(this);

        Component[] components = userProcessJpanel.getComponents();
        ManageOrganizationsJPanel manageOrganizationsJPanel = (ManageOrganizationsJPanel) components[components.length-1];
        manageOrganizationsJPanel.populateOrganizations();

        CardLayout cardLayout = (CardLayout) userProcessJpanel.getLayout();
        cardLayout.previous(userProcessJpanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        if(isDataEnteredValid()) {

            if(UserNameHelper.isUserNameAlreadyExisted(ecoSystem, usrNameTxtFld.getText())) {
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
            String userName = usrNameTxtFld.getText();
            String password = passwrdTxtFld.getText();
            String emailAddress = emailTxtFld.getText();
            String phoneNum = phoneNumTxtFld.getText();
            String address = addTxtFld.getText();

            OrganizationManager orgManager = new OrganizationManager(name, phoneNum, emailAddress, address, userName, password, StudentRole.OrgManager, imagePath,
                new Date(), new Date(), userLogged.getName(), userLogged.getName());
            org.getOrgManagerDirectory().getOrgManagers().add(orgManager);
            
            JOptionPane.showMessageDialog(this, "Successfully saved new Organization Manager");
            logger.log(Level.INFO, "Organization Manager Profile saved");
            resetUi();
        }else{
            JOptionPane.showMessageDialog(this, "Error saving new Organization Manager. Please check DataTypes");
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private boolean isDataEnteredValid() {
        if(ValidateInputs.isNameValid(nameTxtFld.getText()) && ValidateInputs.isUsernameValid(usrNameTxtFld.getText()) && 
                ValidateInputs.isEmailValid(emailTxtFld.getText()) && ValidateInputs.isPhoneNumberValid(phoneNumTxtFld.getText())
                && ValidateInputs.isPasswordValid(passwrdTxtFld.getText()) && ValidateInputs.isAddressValid(addTxtFld.getText()))  {
           return true; 
        }
        return false;
    }
    
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

    private void nameTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtFldActionPerformed
        // TODO add your handling code here:
        if(!ValidateInputs.isNameValid(nameTxtFld.getText()) || nameTxtFld.getText().length() < 8){
           JOptionPane.showMessageDialog(this, "Enter Name correctly");
       }
    }//GEN-LAST:event_nameTxtFldActionPerformed

    private void usrNameTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usrNameTxtFldActionPerformed
        // TODO add your handling code here:
        if(!ValidateInputs.isUsernameValid(usrNameTxtFld.getText())){
           JOptionPane.showMessageDialog(this, "Enter Username correctly");
       }
    }//GEN-LAST:event_usrNameTxtFldActionPerformed

    private void passwrdTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwrdTxtFldActionPerformed
        // TODO add your handling code here:
        if( !ValidateInputs.isPasswordValid(passwrdTxtFld.getText())){
                   JOptionPane.showMessageDialog(this, "Enter password correctly(minimum 8 digits)");

       }
    }//GEN-LAST:event_passwrdTxtFldActionPerformed

    private void emailTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTxtFldActionPerformed
        // TODO add your handling code here:
        if( !ValidateInputs.isEmailValid(emailTxtFld.getText()))
               {
                   JOptionPane.showMessageDialog(this, "Enter Email correctly");

       }
        
    }//GEN-LAST:event_emailTxtFldActionPerformed

    private void phoneNumTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumTxtFldActionPerformed
        // TODO add your handling code here:
        if( !ValidateInputs.isPhoneNumberValid(phoneNumTxtFld.getText()))
               {
                   JOptionPane.showMessageDialog(this, "Enter phoneNumber correctly with minimum 10 digits)");

       }
    }//GEN-LAST:event_phoneNumTxtFldActionPerformed

    private void addTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTxtFldActionPerformed
        // TODO add your handling code here:
        if(!ValidateInputs.isAddressValid(addTxtFld.getText())){
           JOptionPane.showMessageDialog(this, "Enter Address correctly");
       }
    }//GEN-LAST:event_addTxtFldActionPerformed

    private void resetUi() {
        
        nameTxtFld.setText("");
        usrNameTxtFld.setText("");
        passwrdTxtFld.setText("");
        emailTxtFld.setText("");
        phoneNumTxtFld.setText("");
        addTxtFld.setText("");
        
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addLbl;
    private javax.swing.JTextField addTxtFld;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JTextField emailTxtFld;
    private javax.swing.JLabel headerLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTxtFld;
    private javax.swing.JLabel passwrdLbl;
    private javax.swing.JTextField passwrdTxtFld;
    private javax.swing.JLabel phoneNumLbl;
    private javax.swing.JTextField phoneNumTxtFld;
    private javax.swing.JLabel picHolderLbl;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton uploadBtn;
    private javax.swing.JLabel usrNameLbl;
    private javax.swing.JTextField usrNameTxtFld;
    // End of variables declaration//GEN-END:variables
}
