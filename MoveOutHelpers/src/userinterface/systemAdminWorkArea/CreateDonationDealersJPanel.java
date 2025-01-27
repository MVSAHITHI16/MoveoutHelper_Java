package userinterface.systemAdminWorkArea;

import StudentSale.CityNetwork;
import StudentSale.EcoSystem;
import StudentSale.User;
import StudentSale.donationDealer.DonationDealer;
import StudentSale.enums.StudentRole;
import StudentSale.helper.Constants;
import StudentSale.helper.EmailHelper;
import StudentSale.helper.PhoneNoHelper;
import StudentSale.helper.UserNameHelper;
import StudentSale.helper.ValidateInputs;
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
public class CreateDonationDealersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateDonationDealersJPanel
     */
    
    private JPanel userProcessJpanel;
    private EcoSystem ecoSystem;
    private CityNetwork cityNetwork;
    private User userLogged;
    private static final Logger logger = Logger.getLogger(CreateDonationDealersJPanel.class.getName());
    private String imagePath = Constants.DEFAULT_PROFILE_IMAGE_PATH;
    
    public CreateDonationDealersJPanel(JPanel userProcessJpanel, EcoSystem ecoSystem, CityNetwork cityNetwork, User userLogged) {
        initComponents();
        this.userProcessJpanel = userProcessJpanel;
        this.ecoSystem = ecoSystem;
        this.cityNetwork = cityNetwork;
        this.userLogged = userLogged;
        
        picHolderjLabel.setSize(126, 139);
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

        userNamejTextField = new javax.swing.JTextField();
        picHolderjLabel = new javax.swing.JLabel();
        userNamejLabel = new javax.swing.JLabel();
        emailjLabel = new javax.swing.JLabel();
        namejTextField = new javax.swing.JTextField();
        uploadjButton = new javax.swing.JButton();
        emailjTextField = new javax.swing.JTextField();
        phoneNojLabel = new javax.swing.JLabel();
        backjButton = new javax.swing.JButton();
        phoneNojTextField = new javax.swing.JTextField();
        addressjLabel = new javax.swing.JLabel();
        headerjLabel = new javax.swing.JLabel();
        passwordjLabel = new javax.swing.JLabel();
        namejLabel = new javax.swing.JLabel();
        addressjTextField = new javax.swing.JTextField();
        savejButton = new javax.swing.JButton();
        passwordjTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(javax.swing.UIManager.getDefaults().getColor("SlidingButton.selectedBackground"));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userNamejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNamejTextFieldActionPerformed(evt);
            }
        });
        add(userNamejTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 176, 234, -1));

        picHolderjLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(picHolderjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(654, 34, 126, 139));

        userNamejLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        userNamejLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        userNamejLabel.setText("User Name :");
        add(userNamejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 179, 122, -1));

        emailjLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        emailjLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        emailjLabel.setText("Email :");
        add(emailjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 261, 122, -1));

        namejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namejTextFieldActionPerformed(evt);
            }
        });
        add(namejTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 131, 234, -1));

        uploadjButton.setText("upload");
        uploadjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadjButtonActionPerformed(evt);
            }
        });
        add(uploadjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 191, -1, -1));

        emailjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailjTextFieldActionPerformed(evt);
            }
        });
        add(emailjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 258, 234, -1));

        phoneNojLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        phoneNojLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        phoneNojLabel.setText("Phone No :");
        add(phoneNojLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 302, 122, -1));

        backjButton.setText("< < Back");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });
        add(backjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 42, -1, -1));

        phoneNojTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNojTextFieldActionPerformed(evt);
            }
        });
        add(phoneNojTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 299, 234, -1));

        addressjLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        addressjLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        addressjLabel.setText("Address :");
        add(addressjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 343, 122, -1));

        headerjLabel.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        headerjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerjLabel.setText("Create New Donation Dealer Official");
        add(headerjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 34, 415, 34));

        passwordjLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        passwordjLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        passwordjLabel.setText("Password :");
        add(passwordjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 220, 122, -1));

        namejLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        namejLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        namejLabel.setText("Name :");
        add(namejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 134, 122, -1));

        addressjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressjTextFieldActionPerformed(evt);
            }
        });
        add(addressjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 234, -1));

        savejButton.setText("Save");
        savejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savejButtonActionPerformed(evt);
            }
        });
        add(savejButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 413, -1, -1));

        passwordjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordjTextFieldActionPerformed(evt);
            }
        });
        add(passwordjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 217, 234, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bg.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, -20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

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

    private void resetUi() {
        namejTextField.setText("");
        userNamejTextField.setText("");
        passwordjTextField.setText("");
        emailjTextField.setText("");
        phoneNojTextField.setText("");
        addressjTextField.setText("");
        setDefaultPhoto();
    }
    
    private void setDefaultPhoto() {
        setPhoto(getClass().getResource(Constants.DEFAULT_PROFILE_IMAGE_PATH).getPath());
    }

    private void setPhoto(String imagePath) {
        ImageIcon photo = new ImageIcon(imagePath);
        Image photoResized = photo.getImage().getScaledInstance(picHolderjLabel.getWidth(), picHolderjLabel.getHeight(),4);
        picHolderjLabel.setIcon(new ImageIcon(photoResized));
    }
    
    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "Back button pressed");
        userProcessJpanel.remove(this);
        Component[] components = userProcessJpanel.getComponents();
        ManageDonationDealerJPanel manageCityOfficialsJPanel = (ManageDonationDealerJPanel) components[components.length-1];
        manageCityOfficialsJPanel.populateDonationDealers();
        CardLayout cardLayout = (CardLayout) userProcessJpanel.getLayout();
        cardLayout.previous(userProcessJpanel);
    }//GEN-LAST:event_backjButtonActionPerformed

    private void savejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savejButtonActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "Save button pressed");
        if(isDataEnteredValid()) {

            if(UserNameHelper.isUserNameAlreadyExisted(ecoSystem, userNamejTextField.getText())) {
                JOptionPane.showMessageDialog(this, "UserName already Exists in the Ecosystem.");
                return;
            }
            if(EmailHelper.isEmailAlreadyExisted(ecoSystem, emailjTextField.getText())) {
                JOptionPane.showMessageDialog(this, "Email already Exists in the Ecosystem.");
                return;
            }
            if(PhoneNoHelper.isPhoneNoAlreadyExisted(ecoSystem, phoneNojTextField.getText())) {
                JOptionPane.showMessageDialog(this, "PhoneNo already Exists in the Ecosystem.");
                return;
            }

            String name = namejTextField.getText();
            String userName = userNamejTextField.getText();
            String password = passwordjTextField.getText();
            String emailAddress = emailjTextField.getText();
            String phoneNum = phoneNojTextField.getText();
            String address = addressjTextField.getText();

            DonationDealer donationDealer = new DonationDealer(name, phoneNum, emailAddress, address, userName, password, StudentRole.DonationDealer, imagePath,
                new Date(), new Date(), userLogged.getName(), userLogged.getName());
            cityNetwork.getCityOfficialsDirectory().getCityOfficials().add(donationDealer);

            JOptionPane.showMessageDialog(this, "Successfully saved Dealer");
            resetUi();
        }else{
            JOptionPane.showMessageDialog(this, "Error saving new Dealer. Please add correct input");
        }
    }//GEN-LAST:event_savejButtonActionPerformed

    private void namejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namejTextFieldActionPerformed
        // TODO add your handling code here:
        if(!ValidateInputs.isNameValid(namejTextField.getText()) || namejTextField.getText().length() < 8){
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

    private boolean isDataEnteredValid() {
        if(ValidateInputs.isNameValid(namejTextField.getText()) && ValidateInputs.isUsernameValid(userNamejTextField.getText()) && 
                ValidateInputs.isEmailValid(emailjTextField.getText()) && ValidateInputs.isPhoneNumberValid(phoneNojTextField.getText())
                && ValidateInputs.isPasswordValid(passwordjTextField.getText()) && ValidateInputs.isAddressValid(addressjTextField.getText()))  {
           return true; 
        }
        return false;
    }

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
    private javax.swing.JButton savejButton;
    private javax.swing.JButton uploadjButton;
    private javax.swing.JLabel userNamejLabel;
    private javax.swing.JTextField userNamejTextField;
    // End of variables declaration//GEN-END:variables
}
