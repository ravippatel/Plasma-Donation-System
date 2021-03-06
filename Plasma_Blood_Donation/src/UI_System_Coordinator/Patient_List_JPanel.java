/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_System_Coordinator;

import Plasma_DB4OUtil.DB4OUtil;
import Plasma.EcoSystem;
import Plasma_Enterprise.Enterprise;
import Plasma_Network_Cities.Network_Cities;
import Plasma_Association.Doctor_Association;
import Plasma_Association.Association;
import Plasma_Association.System_Coordinator_Association;
import Plasma_People.Patient_Dir;
import Plasma_User_Account.User_Acc;
import Plasma_Work_Queue.Work_Req;
import HomePages.TableFormat;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RST
 */
public class Patient_List_JPanel extends javax.swing.JPanel {

    //Creates new form Patient_List_JPanel
     
    private Patient_Dir patient_Dir;
    private User_Acc userAccount;
    private EcoSystem system;
    private Network_Cities network;
    private System_Coordinator_Association sys_coordinator_association;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    public Patient_List_JPanel(User_Acc userAccount, EcoSystem system, Network_Cities network, System_Coordinator_Association systorganization) {
        initComponents();
        this.userAccount = userAccount;
        this.system = system;
        this.network = network;
        this.sys_coordinator_association = systorganization;

        tbl_Assignment.getTableHeader().setDefaultRenderer(new TableFormat());
        tbl_Hospital.getTableHeader().setDefaultRenderer(new TableFormat());
        populate_Hospital_Table();
        populate_Request_Table();
    }

    //VIEW ALL THE PATIENTS IN NEED OF PLASMA 
    private void populate_Hospital_Table() {

        DefaultTableModel d = (DefaultTableModel) tbl_Hospital.getModel();
        d.setRowCount(0);

        System.out.println("List of enterprises:");
        System.out.println("List of enterprises ends");
        System.out.println(network.getCity_name());
        for (Enterprise enterprise : network.getEnterprise_Dir().getEnt_List()) {
            if (enterprise.getEnterprise_type().toString().equals("Hospital")) {
                System.out.println("Hosp");
                Object[] row = new Object[2];
                row[0] = enterprise;
                row[1] = enterprise.getName();

                d.addRow(row);
            }
        }
    }

    //ASSIGN ALL THE PATIENTS TO A HOSPITAL
    
    public void populate_Request_Table() {
        DefaultTableModel model = (DefaultTableModel) tbl_Assignment.getModel();

        model.setRowCount(0);

        for (Work_Req request : sys_coordinator_association.getWorkQueue().getWork_Req_List()) {
            Object[] row = new Object[6];
            row[0] = request;
            row[1] = request.getSummary();
            row[2] = request.getPatient();
            row[3] = request.getEnterprise();
            row[4] = request.getStatus();
            row[5] = request.getPatient().isEmergency_Status();

            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAssign = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_Hospital = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_Assignment = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel1.setText("PATIENTS IN NEED OF PLASMA(RECEIVERS)");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel2.setText(" ASSIGN PATIENT TO HOSPITAL");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 100, -1, -1));

        btnAssign.setBackground(new java.awt.Color(31, 31, 31));
        btnAssign.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        btnAssign.setText("ASSIGN");
        btnAssign.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assign_button(evt);
            }
        });
        add(btnAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 640, 142, 60));

        tbl_Hospital.setBackground(new java.awt.Color(0, 0, 0));
        tbl_Hospital.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tbl_Hospital.setForeground(new java.awt.Color(255, 255, 255));
        tbl_Hospital.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hospital Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Hospital.setGridColor(new java.awt.Color(0, 0, 0));
        tbl_Hospital.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tbl_Hospital.setRowHeight(30);
        tbl_Hospital.setShowVerticalLines(false);
        jScrollPane2.setViewportView(tbl_Hospital);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 160, 530, 380));

        tbl_Assignment.setBackground(new java.awt.Color(102, 0, 102));
        tbl_Assignment.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tbl_Assignment.setForeground(new java.awt.Color(255, 255, 255));
        tbl_Assignment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "REQUEST NUMBER", "SUMMARY", "PATIENT UID", "HOSPITAL NAME", "STATUS", "EMERGENCY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Assignment.setGridColor(new java.awt.Color(0, 0, 0));
        tbl_Assignment.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tbl_Assignment.setRowHeight(30);
        tbl_Assignment.setShowVerticalLines(false);
        jScrollPane4.setViewportView(tbl_Assignment);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 820, 370));

        jPanel3.setBackground(new java.awt.Color(31, 31, 31));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));

        jLabel25.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("LINKING PATIENT TO HOSPITAL");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 1616, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, 1640, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 390, -1, -1));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 270, -1, -1));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 282, -1, 0));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 160, 70, 380));
    }// </editor-fold>//GEN-END:initComponents

    //USED TO ADD ALL THE PATIENTS TO HOSPITAL
    private void assign_button(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assign_button
        int row = tbl_Assignment.getSelectedRow();
        int row1 = tbl_Hospital.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>Please select<font color='red'> a row</font> from the<font color='green'> Request Table</I></font></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (row1 < 0) {
            JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>Please select<font color='red'> a row</font> from the<font color='green'> Hospital Table</I></font></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            Work_Req request = (Work_Req) tbl_Assignment.getValueAt(row, 0);
            if (request.getStatus().equals("PlasmaBank Approved. Passing to System Coordinator")) {

                request.setEnterprise((Enterprise) tbl_Hospital.getValueAt(row1, 0));
                request.setStatus("Assigned in Doctor ");

                dB4OUtil.storeSystem(system);
                populate_Request_Table();

                Association org = null;
                Enterprise enterprise = (Enterprise) tbl_Hospital.getValueAt(row1, 0);
                for (Association organization : enterprise.getAssociationDirectory().getAssociationList()) {
                    if (organization instanceof Doctor_Association) {
                        org = organization;
                        break;
                    }
                }
                if (org != null) {
                    org.getWorkQueue().getWork_Req_List().add(request);
                    System.out.println(org.getName());
                    userAccount.getWorkQueue().getWork_Req_List().add(request);
                    JOptionPane.showMessageDialog(null,
                            new JLabel("Patient successfully assignedto the Hospital"),
                            "Info", JOptionPane.INFORMATION_MESSAGE);
                    populate_Request_Table();
                } else {
                    JOptionPane.showMessageDialog(null, "No organization present", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, new JLabel("Work Request is already in progress!!!!!!"), "Warning", JOptionPane.WARNING_MESSAGE);
            }

        }
        dB4OUtil.storeSystem(system);
        populate_Request_Table();

    }//GEN-LAST:event_assign_button


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable tbl_Assignment;
    private javax.swing.JTable tbl_Hospital;
    // End of variables declaration//GEN-END:variables
}
