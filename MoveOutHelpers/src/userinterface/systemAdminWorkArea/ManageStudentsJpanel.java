/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.systemAdminWorkArea;

import StudentSale.EcoSystem;
import StudentSale.User;
import StudentSale.std.Student;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author harshila
 */
public class ManageStudentsJpanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageStudentsJpanel
     */
    private JPanel userProcessJpanel;
    private EcoSystem ecoSystem;
    private User userLogged;

    public ManageStudentsJpanel(JPanel userProcessJpanel, EcoSystem ecoSystem, User userLogged) {
        initComponents();
        this.userProcessJpanel = userProcessJpanel;
        this.ecoSystem = ecoSystem;
        this.userLogged = userLogged;

        populateDonors();
    }

    public void populateDonors() {

        DefaultTableModel model = (DefaultTableModel) tblDonorsList.getModel();
        model.setRowCount(0);
        int count = 0;
        for (User std : ecoSystem.getDonorsDirectory().getDonors()) {

            count++;
            Object[] row = new Object[8];
            row[0] = count;
            row[1] = std;
            row[2] = std.getUserName();
            row[3] = std.getPassword();
            row[4] = std.getAddress();
            row[5] = std.getPhoneNo();
            row[6] = std.getEmail();
            row[7] = std.getCreatedBy();

            model.addRow(row);
        }
        donorCounjLbl.setText(String.valueOf(ecoSystem.getDonorsDirectory().getDonors().size()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UpdateBtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        headerLbl = new javax.swing.JLabel();
        orgheaderLbl = new javax.swing.JLabel();
        donorsLbl = new javax.swing.JLabel();
        donorCounjLbl = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDonorsList = new javax.swing.JTable();
        createBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(javax.swing.UIManager.getDefaults().getColor("SlidingButton.selectedBackground"));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UpdateBtn.setText("Update");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });
        add(UpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(656, 416, 93, 30));

        backbtn.setText("< < Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 40, -1, -1));

        headerLbl.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        headerLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLbl.setText("Manage Students");
        add(headerLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 40, 600, 35));

        orgheaderLbl.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        orgheaderLbl.setText("Count :");
        add(orgheaderLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 416, -1, -1));

        donorsLbl.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        donorsLbl.setText("Student's List");
        add(donorsLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 93, -1, -1));

        donorCounjLbl.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        donorCounjLbl.setText("0");
        add(donorCounjLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 416, 28, -1));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(767, 416, 87, 30));

        tblDonorsList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S-No", "Name", "User Name", "Password", "Address", "MobileNo", "Email", "Created By"
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
        jScrollPane1.setViewportView(tblDonorsList);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 128, 899, 270));

        createBtn.setText("Create >");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });
        add(createBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(872, 416, 118, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bg.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, -90, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDonorsList.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        } else {
            User std = (User) tblDonorsList.getValueAt(selectedRow, 1);
            UpdateStudentJPanel updateDonorJPanel = new UpdateStudentJPanel(userProcessJpanel, ecoSystem, std, userLogged);
            userProcessJpanel.add("UpdateDonorPanel", updateDonorJPanel);
            CardLayout layout = (CardLayout) userProcessJpanel.getLayout();
            layout.next(userProcessJpanel);
        }
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:

        userProcessJpanel.remove(this);
        CardLayout layout = (CardLayout) userProcessJpanel.getLayout();
        layout.previous(userProcessJpanel);
    }//GEN-LAST:event_backbtnActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDonorsList.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        } else {
            User selectedDonor = (User) tblDonorsList.getValueAt(selectedRow, 1);
            ecoSystem.getDonorsDirectory().getDonors().remove(selectedDonor);
            JOptionPane.showMessageDialog(null, "Donor deleted successfully");

            populateDonors();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        CreateNewStudentJPanel panel = new CreateNewStudentJPanel(userProcessJpanel, ecoSystem, userLogged);
        //          userProcessContainer.remove(this);
        userProcessJpanel.add("CreateNewOrganizationJPanel", panel);
        CardLayout layout = (CardLayout) userProcessJpanel.getLayout();
        layout.next(userProcessJpanel);
    }//GEN-LAST:event_createBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JButton backbtn;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton createBtn;
    private javax.swing.JLabel donorCounjLbl;
    private javax.swing.JLabel donorsLbl;
    private javax.swing.JLabel headerLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel orgheaderLbl;
    private javax.swing.JTable tblDonorsList;
    // End of variables declaration//GEN-END:variables
}