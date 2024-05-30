/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.orgManagersWorkArea;

import StudentSale.CityNetwork;
import StudentSale.EcoSystem;
import StudentSale.User;
import StudentSale.deliveryAgent.DeliveryAgent;
import StudentSale.std.Donation;
import StudentSale.std.Student;
import StudentSale.enums.DonationStatus;
import StudentSale.enums.PickUp;
import StudentSale.organization.OrganizationManager;
import StudentSale.organization.Organization;
import java.awt.CardLayout;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sahithreddy
 */
public class ManageDonationsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDonationsJPanel
     */
    
    private JPanel userProcessJPanel;
    private EcoSystem ecoSystem;
    private CityNetwork cityNetwork;
    private Organization org;
    private User userLogged;
    private static final Logger logger = Logger.getLogger(ManageDonationsJPanel.class.getName());
    
    public ManageDonationsJPanel(JPanel userProcessJPanel, EcoSystem ecoSystem, CityNetwork cityNetwork, Organization org, User userLogged) {
        initComponents();
        
        this.userProcessJPanel = userProcessJPanel;
        this.ecoSystem = ecoSystem;
        this.cityNetwork = cityNetwork;
        this.org = org;
        this.userLogged = userLogged;
        
        populateData();
        lblheadercityName.setText(cityNetwork.getCityName().name());
        
    }
    
    private void populateData() {
        
        deliveryVolunteerjComboBox.removeAllItems();
        for(DeliveryAgent deliveryAgent:org.getDeliveryVolunteerDirectory().getDeliveryVolunteers()) {
            deliveryVolunteerjComboBox.addItem(deliveryAgent.getName());
        }
        
        DefaultTableModel currentOrdersModel = (DefaultTableModel) availableDonationsjTable.getModel();
        currentOrdersModel.setRowCount(0);
        int currentOrderCount=0;
        
        DefaultTableModel successOrderModel = (DefaultTableModel) acceptedDonationsjTable.getModel();
        successOrderModel.setRowCount(0);
        int successOrderCount=0;
        
        for(Student std:ecoSystem.getDonorsDirectory().getDonors()) {
            
            for(Donation donation:std.getDonations()) {
                if(donation.getDateofExpiry()!=null && donation.getDateofExpiry().before(new Date())){
                    continue;
                }
                if(donation.getDonationStatus().name().equals(DonationStatus.ReadyToPickup.name()) && 
                        donation.getCityNetwork().getCityName().name().equals(cityNetwork.getCityName().name())) {
                    
                    currentOrderCount++;
                    Object[] row = new Object[8];
                    row[0] = currentOrderCount;
                    row[1] = donation;
                    row[2] = donation.getDonor().getName();
                    row[3] = donation.getCategory().name();
                    row[4] = donation.getUsageStatus().name();
                    if(donation.getPickUp().name().equals(PickUp.Home.name())) {
                        row[5] = donation.getAddressToPickUp();
                    }else{
                        row[5] = donation.getFoodBank().getLocation();
                    }
                    if(donation.getDateofExpiry()!=null) {
                        row[6] = donation.getDateofExpiry();
                    }
                    row[7] = donation.getDonationStatus().name();
                    
                    currentOrdersModel.addRow(row);
                }
                
            }
            
        }
        
        availableDonationsCountjLabel.setText(String.valueOf(currentOrderCount));
        
        for(Donation donation:org.getDonations()) {
            
            successOrderCount++;
            Object[] row = new Object[8];
            row[0] = successOrderCount;
            row[1] = donation;
            row[2] = donation.getDonor().getName();
            row[3] = donation.getCategory().name();
            row[4] = donation.getUsageStatus().name();
            if(donation.getPickUp().name().equals(PickUp.Home.name())) {
                row[5] = donation.getAddressToPickUp();
            }else{
                row[5] = donation.getFoodBank().getLocation();
            }
            if(donation.getDateofExpiry()!=null) {
                row[6] = donation.getDateofExpiry();
            }
            row[7] = donation.getDonationStatus().name();
            
            successOrderModel.addRow(row);
        }
        
        totalDonationsAcceptedCountjLabel.setText(String.valueOf(successOrderCount));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        currentOrdersHeaderjLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        acceptedDonationsjTable = new javax.swing.JTable();
        backButtonjButton = new javax.swing.JButton();
        deliveryVolunteerjComboBox = new javax.swing.JComboBox<>();
        currentDonationsHeaderjLabel = new javax.swing.JLabel();
        deliveryPersonjLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        availableDonationsjTable = new javax.swing.JTable();
        acceptjButton = new javax.swing.JButton();
        totalCountHeaderjLabel = new javax.swing.JLabel();
        totalDonationsAcceptedCountjLabel = new javax.swing.JLabel();
        pendingCountHeaderjLabel = new javax.swing.JLabel();
        availableDonationsCountjLabel = new javax.swing.JLabel();
        receivedjButton = new javax.swing.JButton();
        lblheadercityTag = new javax.swing.JLabel();
        lblheadercityName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(javax.swing.UIManager.getDefaults().getColor("SlidingButton.selectedBackground"));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        currentOrdersHeaderjLabel1.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        currentOrdersHeaderjLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        currentOrdersHeaderjLabel1.setText("Donations Accepted");
        add(currentOrdersHeaderjLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 342, 326, 29));

        acceptedDonationsjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Serial-No", "Information", "Donor Name", "Category", "UsageStatus", "PickUp Address", "Expiry", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        acceptedDonationsjTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(acceptedDonationsjTable);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 989, 188));

        backButtonjButton.setText("< < Back");
        backButtonjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonjButtonActionPerformed(evt);
            }
        });
        add(backButtonjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 23, 85, -1));

        add(deliveryVolunteerjComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 297, 158, -1));

        currentDonationsHeaderjLabel.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        currentDonationsHeaderjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        currentDonationsHeaderjLabel.setText("Students Donations Available in the City");
        add(currentDonationsHeaderjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 28, 399, 29));

        deliveryPersonjLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        deliveryPersonjLabel.setText("Choose Delivery Volunteer :");
        add(deliveryPersonjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 299, 208, -1));

        availableDonationsjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Serial-No", "Information", "Donor Name", "Category", "UsageStatus", "PickUp Address", "Expiry", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        availableDonationsjTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(availableDonationsjTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 989, 186));

        acceptjButton.setText("Accept and Assign Order");
        acceptjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptjButtonActionPerformed(evt);
            }
        });
        add(acceptjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 297, -1, -1));

        totalCountHeaderjLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        totalCountHeaderjLabel.setText("Total Count :");
        add(totalCountHeaderjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 597, 100, -1));

        totalDonationsAcceptedCountjLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        totalDonationsAcceptedCountjLabel.setText("0");
        add(totalDonationsAcceptedCountjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 597, 32, -1));

        pendingCountHeaderjLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        pendingCountHeaderjLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pendingCountHeaderjLabel.setText("Count :");
        add(pendingCountHeaderjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 299, 100, -1));

        availableDonationsCountjLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        availableDonationsCountjLabel.setText("0");
        add(availableDonationsCountjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 299, 24, -1));

        receivedjButton.setText("Delivery Received");
        receivedjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receivedjButtonActionPerformed(evt);
            }
        });
        add(receivedjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(887, 595, -1, -1));

        lblheadercityTag.setText("City:");
        add(lblheadercityTag, new org.netbeans.lib.awtextra.AbsoluteConstraints(832, 23, -1, 30));
        add(lblheadercityName, new org.netbeans.lib.awtextra.AbsoluteConstraints(893, 23, 130, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bg.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonjButtonActionPerformed
        // TODO add your handling code here:

        userProcessJPanel.remove(this);
        CardLayout layout = (CardLayout) userProcessJPanel.getLayout();
        layout.previous(userProcessJPanel);
    }//GEN-LAST:event_backButtonjButtonActionPerformed

    private void acceptjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptjButtonActionPerformed
        // TODO add your handling code here:
        int selectedIndex = availableDonationsjTable.getSelectedRow();
        if(selectedIndex<0 || deliveryVolunteerjComboBox.getSelectedIndex()<0) {
            JOptionPane.showMessageDialog(this, "Please select a row or make sure you assign a delivery volunteer");
            return;
        }
        DefaultTableModel currentDonationsModel = (DefaultTableModel) availableDonationsjTable.getModel();
        Donation donation = (Donation) currentDonationsModel.getValueAt(selectedIndex, 1);

        donation.setOrgManager((OrganizationManager) userLogged);
        donation.setDeliveryVolunteer(org.getDeliveryVolunteerDirectory().getDeliveryVolunteers().get(deliveryVolunteerjComboBox.getSelectedIndex()));
        donation.setLastUpdatedDate(new Date());
        donation.setModifiedBy(userLogged.getName());
        donation.setDonationStatus(DonationStatus.PickupAwaiting);
        donation.setOrganization(org);
        
        org.getDonations().add(donation);
        org.getDeliveryVolunteerDirectory().getDeliveryVolunteers().get(deliveryVolunteerjComboBox.getSelectedIndex()).getDonations().add(donation);
        
        populateData();
        logger.log(Level.INFO, "Donation request accepted");
    }//GEN-LAST:event_acceptjButtonActionPerformed

    private void receivedjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receivedjButtonActionPerformed
        int selectedIndex = acceptedDonationsjTable.getSelectedRow();
        if(selectedIndex<0) {
            JOptionPane.showMessageDialog(this, "Please select a row to close the donation delivery");
            return;
        }
        DefaultTableModel acceptedDonationsModel = (DefaultTableModel) acceptedDonationsjTable.getModel();
        Donation donation = (Donation) acceptedDonationsModel.getValueAt(selectedIndex, 1);
        
        if (donation.getDonationStatus().equals(DonationStatus.Closed)){
            JOptionPane.showMessageDialog(this, "!Error! This Donation request is already closed");
            return;
        }
        
        if (donation.getDonationStatus().equals(DonationStatus.PickedUp) || donation.getDonationStatus().equals(DonationStatus.Expired)){
            donation.setLastUpdatedDate(new Date());
            donation.setModifiedBy(userLogged.getName());
            donation.setDonationStatus(DonationStatus.Closed);
        }else{
            JOptionPane.showMessageDialog(this, "!Error! This Donation is not yet picked up by delivery volunteer");
            return;
        }
        
        populateData();
    }//GEN-LAST:event_receivedjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable acceptedDonationsjTable;
    private javax.swing.JButton acceptjButton;
    private javax.swing.JLabel availableDonationsCountjLabel;
    private javax.swing.JTable availableDonationsjTable;
    private javax.swing.JButton backButtonjButton;
    private javax.swing.JLabel currentDonationsHeaderjLabel;
    private javax.swing.JLabel currentOrdersHeaderjLabel1;
    private javax.swing.JLabel deliveryPersonjLabel;
    private javax.swing.JComboBox<String> deliveryVolunteerjComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblheadercityName;
    private javax.swing.JLabel lblheadercityTag;
    private javax.swing.JLabel pendingCountHeaderjLabel;
    private javax.swing.JButton receivedjButton;
    private javax.swing.JLabel totalCountHeaderjLabel;
    private javax.swing.JLabel totalDonationsAcceptedCountjLabel;
    // End of variables declaration//GEN-END:variables
}
