/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_Pathologist;

import Plasma_DB4OUtil.DB4OUtil;
import Plasma.EcoSystem;
import Plasma_Enterprise.Enterprise;
import Plasma_Network_Cities.Network_Cities;
import Plasma_Association.Association;
import Plasma_Association.Pathologist_Association;
import Plasma_People.Donor;
import Plasma_User_Account.User_Acc;
import Plasma_Work_Queue.Work_Req;
import HomePages.TableFormat;
import java.awt.Color;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RST
 */
public class Manage_Pathologist_Requests extends javax.swing.JPanel {

    // Creates new form DonorList     
    private EcoSystem system;
    private User_Acc userAccount;
    private Pathologist_Association pathologist;
    private Enterprise enterprise;
    private Network_Cities network;
    private Enterprise enterprise1;
    private Association association;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    public Manage_Pathologist_Requests(EcoSystem system, User_Acc userAccount, Pathologist_Association pathoorganization, Enterprise enterprise, Network_Cities network) {
        initComponents();
        this.pathologist = pathoorganization;
        this.enterprise = enterprise;
        this.system = system;
        this.userAccount = userAccount;
        this.network = network;

        tbl_Organisation_Donors.getTableHeader().setDefaultRenderer(new TableFormat());
        tbl_Pathologist_Donors.getTableHeader().setDefaultRenderer(new TableFormat());
        view_Donors_Association_Table();
        view_Pathologist_Donor_Table();
        view_Blood_Group_ComboBox();

    }

    public void view_Pathologist_Donor_Table() {
        DefaultTableModel table = (DefaultTableModel) tbl_Pathologist_Donors.getModel();

        table.setRowCount(0);

        for (Work_Req work : userAccount.getWorkQueue().getWork_Req_List()) {
            Object[] row = new Object[6];
            row[0] = work;
            row[1] = work.getDonor();
            row[2] = work.getDonor().getName();
            row[3] = work.getDonor().getBlood_Group();
            row[4] = work.getUser_Acc().getUsername();
            row[5] = work.getStatus();

            table.addRow(row);
        }
    }
        //populate the donor association table
    public void view_Donors_Association_Table() {
        DefaultTableModel table = (DefaultTableModel) tbl_Organisation_Donors.getModel();

        table.setRowCount(0);

        for (Work_Req work : pathologist.getWorkQueue().getWork_Req_List()) {
            Object[] row = new Object[6];
            row[0] = work;
            row[1] = work.getSummary();
            row[2] = work.getDonor();
            row[3] = work.getDonor().getName();
            row[4] = work.getDonor().getMobile();
            row[5] = work.getStatus();

            table.addRow(row);
        }
    }
        private void view_Blood_Group_ComboBox() {

        bloodGroup_ComboBox.addItem("O+");
        bloodGroup_ComboBox.addItem("AB+");
        bloodGroup_ComboBox.addItem("O-");
        bloodGroup_ComboBox.addItem("AB-");
        bloodGroup_ComboBox.addItem("A+");
        bloodGroup_ComboBox.addItem("B+");
        bloodGroup_ComboBox.addItem("A-");
        bloodGroup_ComboBox.addItem("B-");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Organisation_Donors = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnAssignPathologist = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_Pathologist_Donors = new javax.swing.JTable();
        button_Add_Plasma = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        buttonPlasmaDonated = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        button_Discard_Plasma = new javax.swing.JButton();
        check_BP = new javax.swing.JCheckBox();
        check_Pulse = new javax.swing.JCheckBox();
        check_Test = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        bloodGroup_ComboBox = new javax.swing.JComboBox();
        buttonProcessRequest = new javax.swing.JButton();
        textRequest = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        check_Plasma = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_Organisation_Donors.setBackground(new java.awt.Color(0, 0, 0));
        tbl_Organisation_Donors.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tbl_Organisation_Donors.setForeground(new java.awt.Color(255, 255, 255));
        tbl_Organisation_Donors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Number", "Summary", "Donor UID", "Donor Name", "Contact", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Organisation_Donors.setGridColor(new java.awt.Color(0, 0, 0));
        tbl_Organisation_Donors.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tbl_Organisation_Donors.setRowHeight(30);
        tbl_Organisation_Donors.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tbl_Organisation_Donors);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 1330, 160));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PLASMA DONOR LIST");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, 511, -1));

        btnAssignPathologist.setBackground(new java.awt.Color(31, 31, 31));
        btnAssignPathologist.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        btnAssignPathologist.setText("ASSIGN TO ME");
        btnAssignPathologist.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAssignPathologist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assign_me(evt);
            }
        });
        add(btnAssignPathologist, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, 160, 30));

        tbl_Pathologist_Donors.setBackground(new java.awt.Color(0, 0, 0));
        tbl_Pathologist_Donors.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tbl_Pathologist_Donors.setForeground(new java.awt.Color(255, 255, 255));
        tbl_Pathologist_Donors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Number", "Donor UID", "Donor Name", "Blood Group", "Assigned to", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Pathologist_Donors.setGridColor(new java.awt.Color(0, 0, 0));
        tbl_Pathologist_Donors.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tbl_Pathologist_Donors.setRowHeight(30);
        tbl_Pathologist_Donors.setShowVerticalLines(false);
        jScrollPane2.setViewportView(tbl_Pathologist_Donors);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 1330, 190));

        button_Add_Plasma.setBackground(new java.awt.Color(31, 31, 31));
        button_Add_Plasma.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        button_Add_Plasma.setForeground(new java.awt.Color(255, 255, 255));
        button_Add_Plasma.setText("ADD PLASMA TO BLOOD BANK");
        button_Add_Plasma.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button_Add_Plasma.setEnabled(false);
        button_Add_Plasma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_Add_Plasma(evt);
            }
        });
        add(button_Add_Plasma, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 690, 340, 40));

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setText("BLOOD PRESSURE");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 640, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel4.setText("PULSE RATE");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 640, -1, 20));

        buttonPlasmaDonated.setBackground(new java.awt.Color(0, 0, 0));
        buttonPlasmaDonated.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        buttonPlasmaDonated.setText("PLASMA DONATED BY DONOR");
        buttonPlasmaDonated.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonPlasmaDonated.setEnabled(false);
        buttonPlasmaDonated.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_Plasma_Donated(evt);
            }
        });
        add(buttonPlasmaDonated, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 710, 340, 40));

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel5.setText("HEALTH CHECKS");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 640, 130, 20));

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel6.setText("TEST ON PLASMA FOR INFECTION");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 640, 360, -1));

        button_Discard_Plasma.setBackground(new java.awt.Color(31, 31, 31));
        button_Discard_Plasma.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        button_Discard_Plasma.setForeground(new java.awt.Color(255, 255, 255));
        button_Discard_Plasma.setText("REMOVE UNWANTED  PLASMA");
        button_Discard_Plasma.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button_Discard_Plasma.setEnabled(false);
        button_Discard_Plasma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_Remove_Plasma(evt);
            }
        });
        add(button_Discard_Plasma, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 750, 340, 40));

        check_BP.setBackground(new java.awt.Color(0, 0, 0));
        check_BP.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        check_BP.setForeground(new java.awt.Color(255, 255, 255));
        check_BP.setEnabled(false);
        check_BP.setOpaque(false);
        check_BP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_BPActionPerformed(evt);
            }
        });
        add(check_BP, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 640, 20, -1));

        check_Pulse.setBackground(new java.awt.Color(0, 0, 0));
        check_Pulse.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        check_Pulse.setForeground(new java.awt.Color(255, 255, 255));
        check_Pulse.setEnabled(false);
        check_Pulse.setOpaque(false);
        add(check_Pulse, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 640, 20, 20));

        check_Test.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        check_Test.setForeground(new java.awt.Color(255, 255, 255));
        check_Test.setEnabled(false);
        check_Test.setOpaque(false);
        check_Test.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_TestActionPerformed(evt);
            }
        });
        add(check_Test, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 640, 30, 30));

        jPanel3.setBackground(new java.awt.Color(31, 31, 31));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));

        jLabel25.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("MANAGE PLASMA DONOR - PATHOLOGIST");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 1602, Short.MAX_VALUE)
                .addGap(46, 46, 46))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1660, -1));

        bloodGroup_ComboBox.setBackground(new java.awt.Color(31, 31, 31));
        bloodGroup_ComboBox.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        bloodGroup_ComboBox.setForeground(new java.awt.Color(255, 255, 255));
        bloodGroup_ComboBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bloodGroup_ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodGroup_ComboBoxActionPerformed(evt);
            }
        });
        add(bloodGroup_ComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 570, 110, 30));

        buttonProcessRequest.setBackground(new java.awt.Color(31, 31, 31));
        buttonProcessRequest.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        buttonProcessRequest.setText("PROCEED WITH REQUEST");
        buttonProcessRequest.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonProcessRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceed_req(evt);
            }
        });
        add(buttonProcessRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 550, 290, 40));

        textRequest.setBackground(new java.awt.Color(102, 0, 102));
        textRequest.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        textRequest.setForeground(new java.awt.Color(255, 255, 255));
        textRequest.setBorder(null);
        textRequest.setEnabled(false);
        textRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textRequestActionPerformed(evt);
            }
        });
        add(textRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 570, 200, 30));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setText("BLOOD GROUP");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 570, -1, 30));

        check_Plasma.setBackground(new java.awt.Color(0, 0, 0));
        check_Plasma.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        check_Plasma.setForeground(new java.awt.Color(255, 255, 255));
        check_Plasma.setEnabled(false);
        check_Plasma.setOpaque(false);
        check_Plasma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_PlasmaActionPerformed(evt);
            }
        });
        add(check_Plasma, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 640, 20, 20));

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel9.setText("REQUESTS NUMBER");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 570, 260, 30));
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 80, 120, 100));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 620, 1320, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void assign_me(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assign_me
        int row = tbl_Organisation_Donors.getSelectedRow();

        if (row < 0) {
            JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>Please select<font color='red'> a row</font> from the<font color='green'> table</I></font></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);

        } else {
            Work_Req request = (Work_Req) tbl_Organisation_Donors.getValueAt(row, 0);
            if (request.getStatus().equals("Assigned to Hospital")) {
                request.setStatus("Assigned to Pathologist" + userAccount.getUsername());
                request.setUser_Acc(userAccount);
                userAccount.getWorkQueue().getWork_Req_List().add(request);
            } else {

                JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>Work Request is<font color='red'> already</font> in progress!</I></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
            }

            dB4OUtil.storeSystem(system);

            view_Donors_Association_Table();
            view_Pathologist_Donor_Table();
        }
    }//GEN-LAST:event_assign_me
    //add the plasma donated by patient to bank 
    private void button_Add_Plasma(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_Add_Plasma
        if (!check_Plasma.isSelected()) {
            check_Plasma.setBorder(BorderFactory.createLineBorder(Color.RED));
            check_Plasma.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>Kindly do the<font color='red'> Test</font> for other infections!</I></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);

        } else if (bloodGroup_ComboBox.getSelectedItem() == null) {
            bloodGroup_ComboBox.setBorder(BorderFactory.createLineBorder(Color.RED));
            bloodGroup_ComboBox.setForeground(Color.red);
            // JOptionPane.showMessageDialog(null, "Kindly select a Blood Group!", "Error", JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>Kindly select a<font color='red'> Blood Group!</font><I></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);

        } else {
            for (Enterprise ent : network.getEnterprise_Dir().getEnt_List()) {
                if (ent.getEnterprise_type().toString().equals("PlasmaBank")) {
                    enterprise1 = ent;
                }
            }
            for (Association org : enterprise1.getAssociationDirectory().getAssociationList()) {
                System.out.println(org.getClass().getTypeName() + " asit");
                if (org.getClass().getTypeName().equals("Business.Organization.PlasmaBankOrganization")) {
                    association = org;
                }
            }

            try {
                association.getBloodGroup().addBloodG(String.valueOf(bloodGroup_ComboBox.getSelectedItem()));
            } catch (NullPointerException ex) {
                System.out.println("");
            }
            int selectedRow = tbl_Pathologist_Donors.getSelectedRow();
            if (selectedRow < 0) {
                JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>Kindly select a<font color='red'> row!</font><I></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            Work_Req request = (Work_Req) tbl_Pathologist_Donors.getValueAt(selectedRow, 0);
            request.setStatus("Plasma added to Bank");
            dB4OUtil.storeSystem(system);
            view_Donors_Association_Table();
            view_Pathologist_Donor_Table();
            JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>Plasma<font color='green'> added</font> to the bank!<I></h2></html>"));
            button_Add_Plasma.setEnabled(false);
            button_Discard_Plasma.setEnabled(false);
        }
        dB4OUtil.storeSystem(system);

    }//GEN-LAST:event_button_Add_Plasma

    private void check_TestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_TestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_TestActionPerformed

    private void check_BPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_BPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_BPActionPerformed

    private void button_Plasma_Donated(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_Plasma_Donated

        int selectedRow = tbl_Pathologist_Donors.getSelectedRow();

        if (!check_BP.isSelected()) {
            check_BP.setBorder(BorderFactory.createLineBorder(Color.RED));
            check_BP.setForeground(Color.red);
        }
        if (!check_Test.isSelected()) {
            check_Test.setBorder(BorderFactory.createLineBorder(Color.RED));
            check_Test.setForeground(Color.red);
        }
        if (!check_Pulse.isSelected()) {
            check_Pulse.setBorder(BorderFactory.createLineBorder(Color.RED));
            check_Pulse.setForeground(Color.red);
        }

        if (selectedRow < 0) {

            JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>Please select<font color='red'> a Request Number</font> from the<font color='green'> table</I></font></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (!check_BP.isSelected() || !check_Test.isSelected() || !check_Pulse.isSelected()) {
            JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>Kindly do the<font color='red'> Health Check of the Donor</font> before the<font color='green'> Plasma Donation</I></font></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            Work_Req request1 = (Work_Req) tbl_Organisation_Donors.getValueAt(selectedRow, 0);
            request1.setStatus("Plasma Donated");
            dB4OUtil.storeSystem(system);
            view_Donors_Association_Table();
            view_Pathologist_Donor_Table();
            JOptionPane.showMessageDialog(null, new JLabel("<html><h2><font color='green'><I>Plasma Donated!</I></font></h2></html>"));

            for (Donor d : system.getDonorDir().getDonor_List()) {
                if (d.getID().equals(request1.getDonor().getID())) {
                    d.setPrevious_Donation_Date(new Date());
                    d.setRecent_status("Plasma Donated");
                    System.out.println(String.valueOf(d.getPrevious_Donation_Date()) + " last donation date");
                }
            }
            buttonPlasmaDonated.setEnabled(false);
            bloodGroup_ComboBox.setEnabled(true);
            button_Add_Plasma.setEnabled(true);
            button_Discard_Plasma.setEnabled(true);
            check_Plasma.setEnabled(true);
        }
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_button_Plasma_Donated

    private void bloodGroup_ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodGroup_ComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodGroup_ComboBoxActionPerformed

    private void proceed_req(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceed_req
        // TODO add your handling code here:
        int selectedRow = tbl_Pathologist_Donors.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>Please select<font color='red'> a row</font> from the<font color='green'> table</I></font></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            Work_Req request = (Work_Req) tbl_Pathologist_Donors.getValueAt(selectedRow, 0);
            if (request.getStatus().contains("Assigned to Pathologist")) {
                textRequest.setText(String.valueOf(tbl_Organisation_Donors.getValueAt(selectedRow, 0)));
                check_BP.setEnabled(true);
                check_Test.setEnabled(true);
                check_Pulse.setEnabled(true);
                buttonPlasmaDonated.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>Work Request is<font color='red'> already</font> in progress!</I></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_proceed_req

    private void check_PlasmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_PlasmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_PlasmaActionPerformed

    private void button_Remove_Plasma(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_Remove_Plasma
        // TODO add your handling code here:
        int selectedRow = tbl_Pathologist_Donors.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>Please select<font color='red'> a row</font> from the<font color='green'> table</I></font></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            Work_Req request = (Work_Req) tbl_Pathologist_Donors.getValueAt(selectedRow, 0);
            request.setStatus("Plasma Discarded");
            view_Donors_Association_Table();
            view_Pathologist_Donor_Table();
            JOptionPane.showMessageDialog(null, new JLabel("<html><h2><font color='red'><I>Plasma Discarded!</I></font></h2></html>"));
            button_Add_Plasma.setEnabled(false);
            button_Discard_Plasma.setEnabled(false);
            dB4OUtil.storeSystem(system);
        }
    }//GEN-LAST:event_button_Remove_Plasma
    private void textRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textRequestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textRequestActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox bloodGroup_ComboBox;
    private javax.swing.JButton btnAssignPathologist;
    private javax.swing.JButton buttonPlasmaDonated;
    private javax.swing.JButton buttonProcessRequest;
    private javax.swing.JButton button_Add_Plasma;
    private javax.swing.JButton button_Discard_Plasma;
    private javax.swing.JCheckBox check_BP;
    private javax.swing.JCheckBox check_Plasma;
    private javax.swing.JCheckBox check_Pulse;
    private javax.swing.JCheckBox check_Test;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbl_Organisation_Donors;
    private javax.swing.JTable tbl_Pathologist_Donors;
    private javax.swing.JTextField textRequest;
    // End of variables declaration//GEN-END:variables
}
