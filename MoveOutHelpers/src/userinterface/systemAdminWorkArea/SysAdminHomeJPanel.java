package userinterface.systemAdminWorkArea;

import StudentSale.CityName;
import StudentSale.CityNetwork;
import StudentSale.EcoSystem;
import StudentSale.User;
import StudentSale.sysAdmin.SysAdmin;
import java.awt.CardLayout;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import com.teamdev.jxbrowser.browser.Browser;
import com.teamdev.jxbrowser.engine.Engine;
import com.teamdev.jxbrowser.engine.EngineOptions;
import static com.teamdev.jxbrowser.engine.RenderingMode.HARDWARE_ACCELERATED;
import com.teamdev.jxbrowser.view.swing.BrowserView;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author harshila
 */
public class SysAdminHomeJPanel extends javax.swing.JPanel {

    /**
     * Create System Admin JPanel
     */
    
    private JPanel userProcessJpanel;
    private EcoSystem ecoSystem;
    private User userLogged;
    private static final Logger logger = Logger.getLogger(SysAdminHomeJPanel.class.getName());
    
    public SysAdminHomeJPanel(JPanel userProcessJpanel, EcoSystem ecoSystem, User userLogged) {
        initComponents();
//        open_site();
        this.userProcessJpanel = userProcessJpanel;
        this.ecoSystem = ecoSystem;
        this.userLogged = userLogged;
        populateCities();
        populateSysAdmins();
        logger.log(Level.INFO, "System administrator Home Screen");
    }

//    private void open_site() {
//        Engine engine = Engine.newInstance(
//                EngineOptions.newBuilder(HARDWARE_ACCELERATED)
//                        .licenseKey("1BNDHFSC1G4QI02K8L32PAUZS0N4QR3SW2K85OVN37UV0O7ZX87BFI320OG7GZK1D5EJEH")
//                        .build());
//
//        Browser browser = engine.newBrowser();
//        BrowserView view = BrowserView.newInstance(browser);
//
//        JFrame frame = new JFrame("Swing BrowserView");
//        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        frame.add(view, BorderLayout.CENTER);
//        frame.setSize(700, 500);
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);
//        browser.navigation().loadUrl("C:\\Users\\shric\\OneDrive - Worcester Polytechnic Institute (wpi.edu)\\Desktop\\Harshila\\sample1.html");
//    }

    public void populateCities() {
        List<CityNetwork> cityNetworks = ecoSystem.getCityNetworkDirectory().getCityNetworks();
        cityjComboBox.removeAllItems();
        for (CityNetwork cityNetwork : ecoSystem.getCityNetworkDirectory().getCityNetworks()) {
            cityjComboBox.addItem(cityNetwork.getCityName().name());
        }
        addCityjComboBox.removeAllItems();
        String[] cities = CityName.getCitiesArray();
        for (String city : cities) {
            addCityjComboBox.addItem(city);
        }
    }

    public void populateSysAdmins() {
        DefaultTableModel sysAdminsModel = (DefaultTableModel) sysAdminsjTable.getModel();
        sysAdminsModel.setRowCount(0);
        int sysAdminsCount = 0;
        for (SysAdmin sysAdmin : ecoSystem.getSysAdminsDirectory().getSysAdmins()) {
            sysAdminsCount++;
            Object[] row = new Object[8];
            row[0] = sysAdminsCount;
            row[1] = sysAdmin;
            row[2] = sysAdmin.getUserName();
            row[3] = sysAdmin.getPassword();
            row[4] = sysAdmin.getEmail();
            row[5] = sysAdmin.getPhoneNo();
            row[6] = sysAdmin.getCreatedBy();
            row[7] = sysAdmin.getCreatedDate();
            sysAdminsModel.addRow(row);
        }
        countTotaljLabel.setText(String.valueOf(ecoSystem.getSysAdminsDirectory().getSysAdmins().size()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homejPanel = new javax.swing.JPanel();
        cityjComboBox = new javax.swing.JComboBox<>();
        headerjLabel = new javax.swing.JLabel();
        proceedjButton = new javax.swing.JButton();
        headerjLabel1 = new javax.swing.JLabel();
        addCityjComboBox = new javax.swing.JComboBox<>();
        addCityjButton = new javax.swing.JButton();
        manageSysAdminsjLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sysAdminsjTable = new javax.swing.JTable();
        countLablejLabel = new javax.swing.JLabel();
        countTotaljLabel = new javax.swing.JLabel();
        updatejButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        homejPanel.setBackground(javax.swing.UIManager.getDefaults().getColor("SlidingButton.selectedBackground"));
        homejPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homejPanel.add(cityjComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 224, -1));

        headerjLabel.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        headerjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerjLabel.setText("Manage City");
        homejPanel.add(headerjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 474, 226, 34));

        proceedjButton.setText("Manage >>>");
        proceedjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedjButtonActionPerformed(evt);
            }
        });
        homejPanel.add(proceedjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, -1, -1));

        headerjLabel1.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        headerjLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerjLabel1.setText("Add City");
        homejPanel.add(headerjLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 79, 177, 34));

        homejPanel.add(addCityjComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 224, -1));

        addCityjButton.setText("Add");
        addCityjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCityjButtonActionPerformed(evt);
            }
        });
        homejPanel.add(addCityjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 104, -1));

        manageSysAdminsjLabel.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        manageSysAdminsjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageSysAdminsjLabel.setText("System Admin Profile Details");
        homejPanel.add(manageSysAdminsjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 550, 370, -1));

        sysAdminsjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Serial No", "Name", "User Name", "Password", "Email", "Phone No", "Created By", "Created On"
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
        jScrollPane1.setViewportView(sysAdminsjTable);

        homejPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 600, 943, 227));

        countLablejLabel.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        countLablejLabel.setText("Count :");
        homejPanel.add(countLablejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 848, 55, -1));

        countTotaljLabel.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        countTotaljLabel.setText("0");
        homejPanel.add(countTotaljLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 848, 29, -1));

        updatejButton.setText("Update");
        updatejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatejButtonActionPerformed(evt);
            }
        });
        homejPanel.add(updatejButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 890, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sysnew.jpeg"))); // NOI18N
        homejPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 566, 372));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bg.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        homejPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, -50, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homejPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homejPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void proceedjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedjButtonActionPerformed
        // TODO add your handling code here:
        int selectedIndex = cityjComboBox.getSelectedIndex();
        if (selectedIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please add a city to proceed further");
            return;
        }

        CardLayout cardLayout = (CardLayout) userProcessJpanel.getLayout();
        userProcessJpanel.add("SysAdminCityNetworkPanel", new SysAdminManageCityJPanel(userProcessJpanel, ecoSystem,
                ecoSystem.getCityNetworkDirectory().getCityNetworks().get(selectedIndex), userLogged));
        cardLayout.next(userProcessJpanel);
    }//GEN-LAST:event_proceedjButtonActionPerformed

    private void addCityjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCityjButtonActionPerformed
        // TODO add your handling code here:

        for (CityNetwork cityNetwork : ecoSystem.getCityNetworkDirectory().getCityNetworks()) {
            if (cityNetwork.getCityName().name().equalsIgnoreCase((String) addCityjComboBox.getSelectedItem())) {
                JOptionPane.showMessageDialog(this, "City Already Exists. Please select another one");
                return;
            }
        }
        ecoSystem.getCityNetworkDirectory().getCityNetworks().add(new CityNetwork(CityName.valueOf((String) addCityjComboBox.getSelectedItem()), new Date(),
                new Date(), userLogged.getName(), userLogged.getName()));
        populateCities();
    }//GEN-LAST:event_addCityjButtonActionPerformed

    private void updatejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatejButtonActionPerformed
        // TODO add your handling code here:
        int selectedSysAdmin = sysAdminsjTable.getSelectedRow();
        if (selectedSysAdmin < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to Update");
            return;
        }

        DefaultTableModel sysAdminsModel = (DefaultTableModel) sysAdminsjTable.getModel();
        SysAdmin sysAdmin = (SysAdmin) sysAdminsModel.getValueAt(selectedSysAdmin, 1);
        CardLayout cardLayout = (CardLayout) userProcessJpanel.getLayout();
        userProcessJpanel.add("UpdateSystemAdminJPanel", new UpdateSysAdminJPanel(userProcessJpanel, ecoSystem, sysAdmin, userLogged));
        cardLayout.next(userProcessJpanel);
    }//GEN-LAST:event_updatejButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCityjButton;
    private javax.swing.JComboBox<String> addCityjComboBox;
    private javax.swing.JComboBox<String> cityjComboBox;
    private javax.swing.JLabel countLablejLabel;
    private javax.swing.JLabel countTotaljLabel;
    private javax.swing.JLabel headerjLabel;
    private javax.swing.JLabel headerjLabel1;
    private javax.swing.JPanel homejPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel manageSysAdminsjLabel;
    private javax.swing.JButton proceedjButton;
    private javax.swing.JTable sysAdminsjTable;
    private javax.swing.JButton updatejButton;
    // End of variables declaration//GEN-END:variables
}
