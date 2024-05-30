/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.donationDealerWorkArea;

import StudentSale.CityNetwork;
import StudentSale.EcoSystem;
import StudentSale.CollectionCenter;
import StudentSale.User;
import StudentSale.helper.ValidateInputs;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import javax.swing.JPanel;

/**
 *
 * @author harshila
 */
public class CreateCollectionCenterJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private CityNetwork cityNetwork;
    private User userAccount;
    private static final Logger logger = Logger.getLogger(CreateCollectionCenterJPanel.class.getName());

    /**
     * Creates new form CreateNewBankJPanel
     */
    public CreateCollectionCenterJPanel(JPanel userProcessContainer, User userAccount,EcoSystem ecoSystem, CityNetwork cityNetwork) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecoSystem=ecoSystem;
        this.cityNetwork=cityNetwork;
        this.userAccount=userAccount;
        lblcity.setText(cityNetwork.getCityName().name());
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headingbnk = new javax.swing.JLabel();
        namebnktxt = new javax.swing.JLabel();
        locbnktxt = new javax.swing.JLabel();
        namebnk = new javax.swing.JTextField();
        locbnk = new javax.swing.JTextField();
        addbnk = new javax.swing.JButton();
        bankbackbtn = new javax.swing.JButton();
        citylabel = new javax.swing.JLabel();
        lblcity = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(javax.swing.UIManager.getDefaults().getColor("SlidingButton.selectedBackground"));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headingbnk.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        headingbnk.setText("Create New Collection Center");
        add(headingbnk, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 32, 386, 29));

        namebnktxt.setText("Name:");
        add(namebnktxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 164, -1, -1));

        locbnktxt.setText("Location :");
        add(locbnktxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 199, -1, -1));

        namebnk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namebnkActionPerformed(evt);
            }
        });
        add(namebnk, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 161, 88, -1));

        locbnk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locbnkActionPerformed(evt);
            }
        });
        add(locbnk, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 196, 88, -1));

        addbnk.setText("Add");
        addbnk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbnkActionPerformed(evt);
            }
        });
        add(addbnk, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 259, -1, -1));

        bankbackbtn.setText("< < Back");
        bankbackbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankbackbtnActionPerformed(evt);
            }
        });
        add(bankbackbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 39, -1, -1));

        citylabel.setText("City:");
        add(citylabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(728, 97, -1, 30));
        add(lblcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(785, 97, 130, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bg.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addbnkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbnkActionPerformed
        // TODO add your handling code here:
         if(isDataEnteredValid()){
             
             for (CollectionCenter fb : cityNetwork.getFoodBankDirectory().getFoodBanks()){
                 if (fb.getLocation().equals(locbnk.getText())){
                     JOptionPane.showMessageDialog(this, " !Error! This FoodBank Location is already registered in the system.\nPlease try with another location.");
                     return;
                 }
             }
             cityNetwork.getFoodBankDirectory().getFoodBanks().add(new CollectionCenter(namebnk.getText(),locbnk.getText(),
        new Date(), new Date(),userAccount.getName(),userAccount.getName()));
             JOptionPane.showMessageDialog(this, " Added New Food Bank Successfully!");
             logger.log(Level.INFO, "Food Bank Saved");
             resetUi();
         }else{
             JOptionPane.showMessageDialog(this, "Error ! Please input valid values");
             return;
         }
        
    }//GEN-LAST:event_addbnkActionPerformed

    private void bankbackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankbackbtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] components = userProcessContainer.getComponents();
        ManageCollectionCenterJPanel manageFoodBankJPanel = (ManageCollectionCenterJPanel) components[components.length-1];
        manageFoodBankJPanel.populateData();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_bankbackbtnActionPerformed

    private void namebnkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namebnkActionPerformed
        if( !ValidateInputs.isNameValid(namebnk.getText()) ){
                   JOptionPane.showMessageDialog(this, "Enter Name correctly");

       }
    }//GEN-LAST:event_namebnkActionPerformed

    private void locbnkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locbnkActionPerformed
        if( !ValidateInputs.isNameValid(locbnk.getText()) ){
                   JOptionPane.showMessageDialog(this, "Enter location correctly");

       }
    }//GEN-LAST:event_locbnkActionPerformed
      private boolean isDataEnteredValid() {
        if(ValidateInputs.isNameValid(namebnk.getText()) && ValidateInputs.isAddressValid(locbnk.getText())){
            return true;
        }
        return false;
    }
      
    private void resetUi() {
        
        namebnk.setText("");
        locbnk.setText("");
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbnk;
    private javax.swing.JButton bankbackbtn;
    private javax.swing.JLabel citylabel;
    private javax.swing.JLabel headingbnk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblcity;
    private javax.swing.JTextField locbnk;
    private javax.swing.JLabel locbnktxt;
    private javax.swing.JTextField namebnk;
    private javax.swing.JLabel namebnktxt;
    // End of variables declaration//GEN-END:variables
}
