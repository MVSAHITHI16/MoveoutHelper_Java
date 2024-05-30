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
import StudentSale.organization.Organization;

import java.awt.CardLayout;
import java.awt.Component;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author harshila
 */
public class UpdateCollectionCenterJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private CollectionCenter foodbank;
    private User userAccount;
    

    /**
     * Creates new form UpdateFoodBankJPanel
     */
    public UpdateCollectionCenterJPanel(JPanel userProcessContainer, EcoSystem ecoSystem, CollectionCenter foodbank, User userAccount) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.foodbank=foodbank;
        this.userAccount  = userAccount;
        populateData();
    }
 
    
    private void populateData(){
        nameTxtFld.setText(foodbank.getName());
        locationTxtFld.setText(foodbank.getLocation());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        updateCollCenterLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        locationLbl = new javax.swing.JLabel();
        nameTxtFld = new javax.swing.JTextField();
        locationTxtFld = new javax.swing.JTextField();
        backbutton = new javax.swing.JButton();
        updatebuton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(javax.swing.UIManager.getDefaults().getColor("SlidingButton.selectedBackground"));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        updateCollCenterLbl.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        updateCollCenterLbl.setText("Update Collection Center");
        add(updateCollCenterLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, 38));

        nameLbl.setText("Name:");
        add(nameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, -1, -1));

        locationLbl.setText("Location :");
        add(locationLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, -1, -1));

        nameTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtFldActionPerformed(evt);
            }
        });
        add(nameTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 88, -1));

        locationTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationTxtFldActionPerformed(evt);
            }
        });
        add(locationTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 88, -1));

        backbutton.setText("< < Back");
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });
        add(backbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 39, -1, -1));

        updatebuton.setText("Update");
        updatebuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebutonActionPerformed(evt);
            }
        });
        add(updatebuton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bg.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] components = userProcessContainer.getComponents();
        ManageCollectionCenterJPanel manageFoodBankJPanel = (ManageCollectionCenterJPanel) components[components.length-1];
        manageFoodBankJPanel.populateData();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backbuttonActionPerformed

    private void updatebutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebutonActionPerformed
        // TODO add your handling code here:
           if(isDataEnteredValid()) {
               foodbank.setName(nameTxtFld.getText());
               foodbank.setLocation(locationTxtFld.getText());

            JOptionPane.showMessageDialog(this, "Successfully Updated ");
            resetUi();
        }else {
            JOptionPane.showMessageDialog(this, "Error! Please enter valid values");
        }
    }//GEN-LAST:event_updatebutonActionPerformed

    private void locationTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationTxtFldActionPerformed
        if(!ValidateInputs.isNameValid(locationTxtFld.getText())){
           JOptionPane.showMessageDialog(this, "Enter Location correctly");
       }
    }//GEN-LAST:event_locationTxtFldActionPerformed

    private void nameTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtFldActionPerformed
        if(!ValidateInputs.isNameValid(nameTxtFld.getText())){
           JOptionPane.showMessageDialog(this, "Enter Name correctly");
       }
    }//GEN-LAST:event_nameTxtFldActionPerformed
    private boolean isDataEnteredValid() {
        if(ValidateInputs.isNameValid(nameTxtFld.getText()) && ValidateInputs.isAddressValid(locationTxtFld.getText())){
            return true;
        }
        return false;
    } 
    
    
    private void resetUi() {
        
        nameTxtFld.setText("");
        locationTxtFld.setText("");
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel locationLbl;
    private javax.swing.JTextField locationTxtFld;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTxtFld;
    private javax.swing.JLabel updateCollCenterLbl;
    private javax.swing.JButton updatebuton;
    // End of variables declaration//GEN-END:variables
}
