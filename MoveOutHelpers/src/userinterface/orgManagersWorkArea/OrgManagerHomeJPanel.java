/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.orgManagersWorkArea;

import StudentSale.CityNetwork;
import StudentSale.EcoSystem;
import StudentSale.User;
import StudentSale.organization.Organization;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author sahithreddy
 */
public class OrgManagerHomeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NgoManagerHomeJPanel
     */
    
    private JPanel userProcessJPanel;
    private EcoSystem ecoSystem;
    private CityNetwork cityNetwork;
    private Organization org;
    private User userLogged;
    
    public OrgManagerHomeJPanel(JPanel userProcessJPanel, EcoSystem ecoSystem, CityNetwork cityNetwork, Organization org, User userLogged) {
        initComponents();
        
        this.userProcessJPanel = userProcessJPanel;
        this.ecoSystem = ecoSystem;
        this.cityNetwork = cityNetwork;
        this.org = org;
        this.userLogged = userLogged;
        
        lblheadercityName.setText(cityNetwork.getCityName().name());
        organizationValuejLabel.setText(org.getOrganizationName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerjLabel = new javax.swing.JLabel();
        manageOrganizationInfoJButton = new javax.swing.JButton();
        manageDeliveryVolunteersJButton = new javax.swing.JButton();
        manageDonationsJButton = new javax.swing.JButton();
        organizationjLabel = new javax.swing.JLabel();
        organizationValuejLabel = new javax.swing.JLabel();
        lblheadercityTag = new javax.swing.JLabel();
        lblheadercityName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(javax.swing.UIManager.getDefaults().getColor("SlidingButton.selectedBackground"));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerjLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        headerjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerjLabel.setText("Manage Organization");
        add(headerjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 380, -1));

        manageOrganizationInfoJButton.setText("Manage Organization Info");
        manageOrganizationInfoJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationInfoJButtonActionPerformed(evt);
            }
        });
        add(manageOrganizationInfoJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 207, -1));

        manageDeliveryVolunteersJButton.setText("Manage Delivery Volunteers");
        manageDeliveryVolunteersJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageDeliveryVolunteersJButtonActionPerformed(evt);
            }
        });
        add(manageDeliveryVolunteersJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 207, -1));

        manageDonationsJButton.setText("Manage Donations");
        manageDonationsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageDonationsJButtonActionPerformed(evt);
            }
        });
        add(manageDonationsJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 207, -1));

        organizationjLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        organizationjLabel.setText("Organization Name:");
        add(organizationjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, 28));

        organizationValuejLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        organizationValuejLabel.setText("<Value>");
        add(organizationValuejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 277, 28));

        lblheadercityTag.setText("City:");
        add(lblheadercityTag, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, -1, 30));
        add(lblheadercityName, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 130, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bg.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void manageOrganizationInfoJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationInfoJButtonActionPerformed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) userProcessJPanel.getLayout();
        userProcessJPanel.add("UpdateOrganizationInfo", new UpdateOrganizationInfoJPanel(userProcessJPanel, ecoSystem, cityNetwork,org, userLogged));
        cardLayout.next(userProcessJPanel);
    }//GEN-LAST:event_manageOrganizationInfoJButtonActionPerformed

    private void manageDeliveryVolunteersJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageDeliveryVolunteersJButtonActionPerformed

        CardLayout cardLayout = (CardLayout) userProcessJPanel.getLayout();
        userProcessJPanel.add("ManageDeliveryVolunteers",new ManageDeliveryAgentJPanel(userProcessJPanel, ecoSystem, cityNetwork, org, userLogged));
        cardLayout.next(userProcessJPanel);
    }//GEN-LAST:event_manageDeliveryVolunteersJButtonActionPerformed

    private void manageDonationsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageDonationsJButtonActionPerformed

        CardLayout cardLayout = (CardLayout) userProcessJPanel.getLayout();
        userProcessJPanel.add("ManageDonationsPanel", new ManageDonationsJPanel(userProcessJPanel, ecoSystem, cityNetwork, org, userLogged));
        cardLayout.next(userProcessJPanel);
    }//GEN-LAST:event_manageDonationsJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel headerjLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblheadercityName;
    private javax.swing.JLabel lblheadercityTag;
    private javax.swing.JButton manageDeliveryVolunteersJButton;
    private javax.swing.JButton manageDonationsJButton;
    private javax.swing.JButton manageOrganizationInfoJButton;
    private javax.swing.JLabel organizationValuejLabel;
    private javax.swing.JLabel organizationjLabel;
    // End of variables declaration//GEN-END:variables
}
