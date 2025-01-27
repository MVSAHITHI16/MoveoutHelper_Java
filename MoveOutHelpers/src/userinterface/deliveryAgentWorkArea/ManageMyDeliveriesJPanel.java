/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.deliveryAgentWorkArea;

import StudentSale.CityNetwork;
import StudentSale.EcoSystem;
import StudentSale.User;
import StudentSale.deliveryAgent.DeliveryAgent;
import StudentSale.std.Donation;
import StudentSale.std.Student;
import StudentSale.enums.Category;
import StudentSale.enums.DonationStatus;
import StudentSale.enums.PickUp;
import StudentSale.organization.Organization;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sishwathoka
 */
public class ManageMyDeliveriesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SysAdminHomeJPanel
     */
    
    private JPanel userProcessJPanel;
    private EcoSystem ecoSystem;
    private CityNetwork cityNetwork;
    private Organization org;
    private User userLogged;
    private DeliveryAgent deliveryAgent;
    
    public ManageMyDeliveriesJPanel(JPanel userProcessJpanel, EcoSystem ecoSystem, CityNetwork cityNetwork, Organization org, User userLogged) {
        initComponents();
        this.userProcessJPanel = userProcessJpanel;
        this.ecoSystem = ecoSystem;
        this.cityNetwork = cityNetwork;
        this.org = org;
        this.userLogged = userLogged;
        this.deliveryAgent = (DeliveryAgent) userLogged;
        
        populateData();
        headerCityNameLabel.setText(cityNetwork.getCityName().name());
    }
    
    public void populateData() {
        DefaultTableModel currentOrdersModel = (DefaultTableModel) currentPickUpsTbl.getModel();
        currentOrdersModel.setRowCount(0);
        int currentPickUpcount=0;
        
        DefaultTableModel delieveredOrdersModel = (DefaultTableModel) deliveryHistoryTbl.getModel();
        delieveredOrdersModel.setRowCount(0);
        int donationHistoryCount=0;
        
        DeliveryAgent volunteer = (DeliveryAgent) userLogged;
        
        for(Donation donation:volunteer.getDonations()){
            if(donation.getDonationStatus().name().equalsIgnoreCase(DonationStatus.ReadyToPickup.name()) 
                    || donation.getDonationStatus().name().equalsIgnoreCase(DonationStatus.PickupAwaiting.name())
                    || donation.getDonationStatus().name().equalsIgnoreCase(DonationStatus.Accepted.name())){
                currentPickUpcount++;
                Object[] row = new Object[7];
                    row[0] = currentPickUpcount;
                    row[1] = donation;
                    row[2] = donation.getDonor().getName();
                    row[3] = donation.getCategory().name();
                    if(donation.getPickUp().name().equals(PickUp.Home.name())) {
                        row[4] = donation.getAddressToPickUp();
                    }else{
                        row[4] = donation.getFoodBank().getLocation();
                    }
                    if(donation.getDateofExpiry()!=null) {
                        row[5] = donation.getDateofExpiry();
                    }
                    row[6] = donation.getDonationStatus();
                    
                    currentOrdersModel.addRow(row);
            }
        }
        availableDonationsCntLbl.setText(String.valueOf(currentPickUpcount));
        
        for(Donation donation:volunteer.getDonations()){
            if(donation.getDonationStatus().name().equalsIgnoreCase(DonationStatus.PickedUp.name()) 
                    || donation.getDonationStatus().name().equalsIgnoreCase(DonationStatus.Expired.name())
                    || donation.getDonationStatus().name().equalsIgnoreCase(DonationStatus.Closed.name())){
                donationHistoryCount++;
                Object[] row = new Object[7];
                    row[0] = donationHistoryCount;
                    row[1] = donation;
                    row[2] = donation.getDonor().getName();
                    row[3] = donation.getCategory().name();
                    if(donation.getPickUp().name().equals(PickUp.Home.name())) {
                        row[4] = donation.getAddressToPickUp();
                    }else{
                        row[4] = donation.getFoodBank().getLocation();
                    }
                    if(donation.getDateofExpiry()!=null) {
                        row[5] = donation.getDateofExpiry();
                    }
                    row[6] = donation.getDonationStatus();
                    
                    delieveredOrdersModel.addRow(row);
            }
        }
        ttlCountLbl.setText(String.valueOf(donationHistoryCount));
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pickupHdrLbl = new javax.swing.JLabel();
        totalCntHdrLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        currentPickUpsTbl = new javax.swing.JTable();
        ttlCountLbl = new javax.swing.JLabel();
        crntOrdersHdrLbl1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        deliveryHistoryTbl = new javax.swing.JTable();
        pickedupButton = new javax.swing.JButton();
        pendingCntLbl = new javax.swing.JLabel();
        availableDonationsCntLbl = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        headerCityNameLabel = new javax.swing.JLabel();
        headerCityTagLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(javax.swing.UIManager.getDefaults().getColor("DesktopIcon.background"));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pickupHdrLbl.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        pickupHdrLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pickupHdrLbl.setText("Donations Waiting for PickUp");
        add(pickupHdrLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 350, -1));

        totalCntHdrLbl.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        totalCntHdrLbl.setText("Total Count :");
        add(totalCntHdrLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 110, -1));

        currentPickUpsTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Serial-No", "Information", "Student Name", "Category", "Pickup Address", "Expiry", "Donation Request Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        currentPickUpsTbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(currentPickUpsTbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 1060, 160));

        ttlCountLbl.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        ttlCountLbl.setText("0");
        add(ttlCountLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, 40, -1));

        crntOrdersHdrLbl1.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        crntOrdersHdrLbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        crntOrdersHdrLbl1.setText("Donation History");
        add(crntOrdersHdrLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 240, -1));

        deliveryHistoryTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Serial-No", "Information", "Donor Name", "Category", "Pickup Address", "Expiry", "Donation Request Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        deliveryHistoryTbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(deliveryHistoryTbl);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 1060, 160));

        pickedupButton.setText("Picked Up");
        pickedupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickedupButtonActionPerformed(evt);
            }
        });
        add(pickedupButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 250, 117, -1));

        pendingCntLbl.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        pendingCntLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pendingCntLbl.setText("Count :");
        add(pendingCntLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 70, -1));

        availableDonationsCntLbl.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        availableDonationsCntLbl.setText("0");
        add(availableDonationsCntLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 30, -1));

        backBtn.setText("< < Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));
        add(headerCityNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, 120, 30));

        headerCityTagLabel.setText("City:");
        add(headerCityTagLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 50, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bg.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, -30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void pickedupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pickedupButtonActionPerformed

        int selectedRow = currentPickUpsTbl.getSelectedRow();
        if(selectedRow <0){
            JOptionPane.showMessageDialog(this, "Please select a row to update delivery");
            return;
        }

        DefaultTableModel currentOrdersModel = (DefaultTableModel) currentPickUpsTbl.getModel();
        Donation dn = (Donation) currentOrdersModel.getValueAt(selectedRow, 1);
        
        dn.setDonationStatus(DonationStatus.PickedUp);
        dn.setLastUpdatedDate(new Date());
        dn.setModifiedBy(userLogged.getName());

        populateData();
    }//GEN-LAST:event_pickedupButtonActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessJPanel.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessJPanel.getLayout();
        cardLayout.previous(userProcessJPanel);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel availableDonationsCntLbl;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel crntOrdersHdrLbl1;
    private javax.swing.JTable currentPickUpsTbl;
    private javax.swing.JTable deliveryHistoryTbl;
    private javax.swing.JLabel headerCityNameLabel;
    private javax.swing.JLabel headerCityTagLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel pendingCntLbl;
    private javax.swing.JButton pickedupButton;
    private javax.swing.JLabel pickupHdrLbl;
    private javax.swing.JLabel totalCntHdrLbl;
    private javax.swing.JLabel ttlCountLbl;
    // End of variables declaration//GEN-END:variables
}
