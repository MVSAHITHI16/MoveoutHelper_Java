package userinterface.systemAdminWorkArea;

import StudentSale.EcoSystem;
import StudentSale.User;
import StudentSale.driver.Driver;
import StudentSale.helper.Constants;
import StudentSale.helper.EmailHelper;
import StudentSale.helper.PhoneNoHelper;
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
public class UpdateDriverJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdatePackingAgentJPanel
     */
    private JPanel userProcessJpanel;
    private EcoSystem ecoSystem;
    private Driver driver;
    private User userLogged;
    private String imagePath;
    private static final Logger logger = Logger.getLogger(UpdateDriverJPanel.class.getName());

    public UpdateDriverJPanel(JPanel userProcessJpanel, EcoSystem ecoSystem, Driver driver, User userLogged) {
        initComponents();
        this.userProcessJpanel = userProcessJpanel;
        this.ecoSystem = ecoSystem;
        this.driver = driver;
        this.userLogged = userLogged;
        picHolderjLabel.setSize(126, 139);
        populateData();
    }

    private void populateData() {
        namejTextField.setText(driver.getName());
        phoneNojTextField.setText(driver.getPhoneNo());
        emailjTextField.setText(driver.getEmail());
        addressjTextField.setText(driver.getAddress());
        imagePath = driver.getProfilePic();
        setPhoto(driver.getProfilePic());
    }

    private void setPhoto(String profilePic) {
        if (profilePic.equals(Constants.DEFAULT_PROFILE_IMAGE_PATH)) {
            ImageIcon photo = new ImageIcon(getClass().getResource(Constants.DEFAULT_PROFILE_IMAGE_PATH).getPath());
            Image photoResized = photo.getImage().getScaledInstance(picHolderjLabel.getWidth(), picHolderjLabel.getHeight(), 4);
            picHolderjLabel.setIcon(new ImageIcon(photoResized));
            return;
        }
        ImageIcon photo = new ImageIcon(profilePic);
        Image photoResized = photo.getImage().getScaledInstance(picHolderjLabel.getWidth(), picHolderjLabel.getHeight(), 4);
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

        namejTextField = new javax.swing.JTextField();
        addressjLabel = new javax.swing.JLabel();
        addressjTextField = new javax.swing.JTextField();
        backjButton = new javax.swing.JButton();
        phoneNojTextField = new javax.swing.JTextField();
        emailjLabel = new javax.swing.JLabel();
        headerjLabel = new javax.swing.JLabel();
        picHolderjLabel = new javax.swing.JLabel();
        namejLabel = new javax.swing.JLabel();
        emailjTextField = new javax.swing.JTextField();
        updatejButton = new javax.swing.JButton();
        uploadjButton = new javax.swing.JButton();
        phoneNojLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(javax.swing.UIManager.getDefaults().getColor("DesktopIcon.background"));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        namejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namejTextFieldActionPerformed(evt);
            }
        });
        add(namejTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 131, 234, -1));

        addressjLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        addressjLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        addressjLabel.setText("Address :");
        add(addressjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 254, 122, -1));

        addressjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressjTextFieldActionPerformed(evt);
            }
        });
        add(addressjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 254, 234, -1));

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
        add(phoneNojTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 213, 234, -1));

        emailjLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        emailjLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        emailjLabel.setText("Email :");
        add(emailjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 172, 122, -1));

        headerjLabel.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        headerjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerjLabel.setText("Update Driver");
        add(headerjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 34, 415, 34));

        picHolderjLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(picHolderjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 126, 139));

        namejLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        namejLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        namejLabel.setText("Name :");
        add(namejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 134, 122, -1));

        emailjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailjTextFieldActionPerformed(evt);
            }
        });
        add(emailjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 172, 234, -1));

        updatejButton.setText("Update");
        updatejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatejButtonActionPerformed(evt);
            }
        });
        add(updatejButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 295, -1, -1));

        uploadjButton.setText("Upload");
        uploadjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadjButtonActionPerformed(evt);
            }
        });
        add(uploadjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, -1, -1));

        phoneNojLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        phoneNojLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        phoneNojLabel.setText("Phone No :");
        add(phoneNojLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 213, 122, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bg.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, -50, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "Back button pressed");
        userProcessJpanel.remove(this);
        Component[] components = userProcessJpanel.getComponents();
        ManageDriverJPanel manageDriverJPanel = (ManageDriverJPanel) components[components.length - 1];
        manageDriverJPanel.populateDrivers();
        CardLayout cardLayout = (CardLayout) userProcessJpanel.getLayout();
        cardLayout.previous(userProcessJpanel);
    }//GEN-LAST:event_backjButtonActionPerformed

    private void updatejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatejButtonActionPerformed
        // TODO add your handling code here:
        if (isDataEnteredValid()) {

            if (!driver.getEmail().equals(emailjTextField.getText()) && EmailHelper.isEmailAlreadyExisted(ecoSystem, emailjTextField.getText())) {
                JOptionPane.showMessageDialog(this, "Email already Exists in the Ecosystem.");
                return;
            }
            if (!driver.getPhoneNo().equals(phoneNojTextField.getText()) && PhoneNoHelper.isPhoneNoAlreadyExisted(ecoSystem, phoneNojTextField.getText())) {
                JOptionPane.showMessageDialog(this, "PhoneNo already Exists in the Ecosystem.");
                return;
            }

            driver.setName(namejTextField.getText());
            driver.setEmail(emailjTextField.getText());
            driver.setPhoneNo(phoneNojTextField.getText());
            driver.setAddress(addressjTextField.getText());
            driver.setProfilePic(imagePath);
            driver.setLastUpdatedDate(new Date());
            driver.setModifiedBy(userLogged.getUserName());
            JOptionPane.showMessageDialog(this, "Successfully updated Driver");
            logger.log(Level.INFO, "Packing Agent Saved");
        } else {
            JOptionPane.showMessageDialog(this, "Error updating  Driver. Please check DataTypes");
        }
    }//GEN-LAST:event_updatejButtonActionPerformed

    private boolean isDataEnteredValid() {
        if (ValidateInputs.isNameValid(namejTextField.getText())
                && ValidateInputs.isEmailValid(emailjTextField.getText()) && ValidateInputs.isPhoneNumberValid(phoneNojTextField.getText())
                && ValidateInputs.isAddressValid(addressjTextField.getText())) {
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

    private void emailjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailjTextFieldActionPerformed
        // TODO add your handling code here:
         if( !ValidateInputs.isPasswordValid(emailjTextField.getText()) ){
                   JOptionPane.showMessageDialog(this, "Enter Email correctly");
       } 
    }//GEN-LAST:event_emailjTextFieldActionPerformed

    private void namejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namejTextFieldActionPerformed
        // TODO add your handling code here:
        if(!ValidateInputs.isNameValid(namejTextField.getText()) || namejTextField.getText().length() < 8){
           JOptionPane.showMessageDialog(this, "Enter Name correctly");
       }
    }//GEN-LAST:event_namejTextFieldActionPerformed

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
    private javax.swing.JLabel phoneNojLabel;
    private javax.swing.JTextField phoneNojTextField;
    private javax.swing.JLabel picHolderjLabel;
    private javax.swing.JButton updatejButton;
    private javax.swing.JButton uploadjButton;
    // End of variables declaration//GEN-END:variables
}
