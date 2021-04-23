/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_Plasma_Bank_Coordinator;

import Plasma_DB4OUtil.DB4OUtil;
import Plasma.EcoSystem;
import Plasma_Enterprise.Enterprise;
import Plasma_Network_Cities.Network_Cities;
import Plasma_Association.Association;
import Plasma_Association.Plasma_Bank_Association;
import Plasma_Association.System_Coordinator_Association;
import Plasma_User_Account.User_Acc;
import Plasma_Work_Queue.Work_Req;
import HomePages.TableFormat;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Akshay
 */
public class Plasma_Request_Panel extends javax.swing.JPanel {

    /**
     * Creates new form PlasmaCountJPanel
     */
    private User_Acc userAccount;
    private Plasma_Bank_Association plasmaorganization;
    private Enterprise enterprise;
    private Network_Cities network;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private EcoSystem system;
    
    public Plasma_Request_Panel(User_Acc userAccount, Plasma_Bank_Association plasmaorganization, Enterprise enterprise, Network_Cities network, EcoSystem system) {
        initComponents();
        this.userAccount = userAccount;
        this.plasmaorganization = plasmaorganization;
        this.enterprise = enterprise;
        this.network = network;
        this.system = system;
         
        jPanel1.setVisible(false);
        tblPlasmaCoordinator.getTableHeader().setDefaultRenderer(new TableFormat());
        populateTextFields();
        populatePlasmaCoordinatorTable();
    }

   

    public void populateTextFields(){
        
        Enterprise ent1 = null;
        Association org1 = null;
        
        for (Enterprise enterprise : network.getEnterprise_Dir().getEnt_List()) {
            if (enterprise.getEnterprise_type().toString().equals("PlasmaBank")) {
            
                ent1 = enterprise;
                System.out.println(enterprise);
                break;
            }
        }
        
        
       
        for (Association organization : ent1.getAssociationDirectory().getAssociationList()) {
            if(organization instanceof Plasma_Bank_Association) {
                org1 = organization;
                break;
            }
        }
        
        if (org1 != null) {
           
            System.out.println(org1.getName()+"Orgcheck");
            
            //user.addUserRequest(request);
            
            
            
            
        } else {
        
         JOptionPane.showMessageDialog(null, "No organization present", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
        
        txtAnegative.setText(String.valueOf(org1.getBloodGroup().getaN()));
        txtApositive.setText(String.valueOf(org1.getBloodGroup().getaP()));
        txtABpositive.setText(String.valueOf(org1.getBloodGroup().getAbP()));
        txtABnegative.setText(String.valueOf(org1.getBloodGroup().getAbN()));
        txtOpositive.setText(String.valueOf(org1.getBloodGroup().getoP()));
        txtOnegative.setText(String.valueOf(org1.getBloodGroup().getoN()));
        txtBpositive.setText(String.valueOf(org1.getBloodGroup().getbP()));
        txtBnegative.setText(String.valueOf(org1.getBloodGroup().getbN()));
        
    }
    
    public void populatePlasmaCoordinatorTable(){
        DefaultTableModel model = (DefaultTableModel)tblPlasmaCoordinator.getModel();
        
        model.setRowCount(0);
        
        for(Work_Req request : userAccount.getWorkQueue().getWork_Req_List()){
            Object[] row = new Object[6];
            row[0] = request;
            row[1] = request.getPatient();
            row[2] = request.getPatient().getName();
            row[3] = request.getPatient().getEmailID();
            row[4] = request.getPatient().getBlood_Group();
            row[5] = request.getStatus();
             
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtApositive = new javax.swing.JTextField();
        btnApprove = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtAnegative = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtOpositive = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtBnegative = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtBpositive = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtOnegative = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtABpositive = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtABnegative = new javax.swing.JTextField();
        btnOnHold = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPlasmaCoordinator = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel1.setText("LIST FOR PENDING PLASMA REQUEST");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, -1, -1));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 247, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setText("BLOOD GROUP CATEGORY");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 190, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel4.setText("QUANTITY AVAILABLE");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, -1, -1));

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel5.setText("A+");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 30, 20));

        txtApositive.setBackground(new java.awt.Color(102, 0, 102));
        txtApositive.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        txtApositive.setForeground(new java.awt.Color(255, 255, 255));
        txtApositive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApositiveActionPerformed(evt);
            }
        });
        add(txtApositive, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 190, -1));

        btnApprove.setBackground(new java.awt.Color(31, 31, 31));
        btnApprove.setFont(new java.awt.Font("Cambria Math", 1, 20)); // NOI18N
        btnApprove.setText("ACCEPT REQUEST AND PROCCED");
        btnApprove.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });
        add(btnApprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 670, 310, 40));

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel7.setText("A-");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 600, -1, -1));

        txtAnegative.setBackground(new java.awt.Color(102, 0, 102));
        txtAnegative.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        txtAnegative.setForeground(new java.awt.Color(255, 255, 255));
        add(txtAnegative, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 600, 190, -1));

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel8.setText("O+");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, -1, -1));

        txtOpositive.setBackground(new java.awt.Color(102, 0, 102));
        txtOpositive.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        txtOpositive.setForeground(new java.awt.Color(255, 255, 255));
        add(txtOpositive, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 500, 190, -1));

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel9.setText("O-");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 700, -1, -1));

        txtBnegative.setBackground(new java.awt.Color(102, 0, 102));
        txtBnegative.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        txtBnegative.setForeground(new java.awt.Color(255, 255, 255));
        add(txtBnegative, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 650, 190, -1));

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel10.setText("B+");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 30, 30));

        txtBpositive.setBackground(new java.awt.Color(102, 0, 102));
        txtBpositive.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        txtBpositive.setForeground(new java.awt.Color(255, 255, 255));
        add(txtBpositive, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 190, -1));

        jLabel11.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel11.setText("B-");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 660, -1, -1));

        txtOnegative.setBackground(new java.awt.Color(102, 0, 102));
        txtOnegative.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        txtOnegative.setForeground(new java.awt.Color(255, 255, 255));
        add(txtOnegative, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 700, 190, -1));

        jLabel12.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel12.setText("AB+");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 550, -1, -1));

        txtABpositive.setBackground(new java.awt.Color(102, 0, 102));
        txtABpositive.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        txtABpositive.setForeground(new java.awt.Color(255, 255, 255));
        add(txtABpositive, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 550, 190, -1));

        jLabel13.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel13.setText("AB-");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 750, -1, -1));

        txtABnegative.setBackground(new java.awt.Color(102, 0, 102));
        txtABnegative.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        txtABnegative.setForeground(new java.awt.Color(255, 255, 255));
        add(txtABnegative, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 750, 190, -1));

        btnOnHold.setBackground(new java.awt.Color(31, 31, 31));
        btnOnHold.setFont(new java.awt.Font("Cambria Math", 1, 20)); // NOI18N
        btnOnHold.setText("HOLD REQUEST");
        btnOnHold.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOnHold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOnHoldActionPerformed(evt);
            }
        });
        add(btnOnHold, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 670, 230, 40));

        tblPlasmaCoordinator.setBackground(new java.awt.Color(102, 0, 102));
        tblPlasmaCoordinator.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tblPlasmaCoordinator.setForeground(new java.awt.Color(255, 255, 255));
        tblPlasmaCoordinator.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "REQUEST NUMBER", "PATIENT ID", "PATIENT Name", "EMAILID", "BLOOD GROUP", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPlasmaCoordinator.setGridColor(new java.awt.Color(0, 0, 0));
        tblPlasmaCoordinator.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblPlasmaCoordinator.setRowHeight(30);
        tblPlasmaCoordinator.setShowVerticalLines(false);
        tblPlasmaCoordinator.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPlasmaCoordinatorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPlasmaCoordinator);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 1270, 200));

        jPanel3.setBackground(new java.awt.Color(31, 31, 31));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));

        jLabel25.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("PLASMA DONATION BANK");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 1546, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1570, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, 510, 180));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/Images/emergency.gif"))); // NOI18N
        jLabel6.setOpaque(true);
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, 511, 180));
    }// </editor-fold>//GEN-END:initComponents

    private void txtApositiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApositiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApositiveActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblPlasmaCoordinator.getSelectedRow();
        
        if (selectedRow < 0){
            //JOptionPane.showMessageDialog(null, "Please select a row first!" );
            JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Please select<font color='red'> a row</font> from the<font color='green'> table</I></font></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
            
            return;
        }
        else{
            Work_Req request = (Work_Req)tblPlasmaCoordinator.getValueAt(selectedRow, 0);
            System.out.println(request.getStatus());
            if(request.getStatus().equals("Legally Approved. Forwarding to Plasma Bank")
                || request.getStatus().equals("On Hold Due to Plasma unavailability")){
                request.setStatus("PlasmaBank Approved. Passing to System Coordinator");
                JOptionPane.showMessageDialog(null, new JLabel(  "PlasmaBank Approved. Passing to System Coordinator"), "Warning", JOptionPane.WARNING_MESSAGE);
                dB4OUtil.storeSystem(system);
                populatePlasmaCoordinatorTable();
        
                Enterprise ent = null;
                Association org = null;
        
                for (Enterprise enterprise : network.getEnterprise_Dir().getEnt_List()) {
                    if (enterprise.getEnterprise_type().toString().equals("Hospital")) {
                            ent = enterprise;
                            break;
                    }
                }
                for (Association organization : ent.getAssociationDirectory().getAssociationList()) {
                    if(organization instanceof System_Coordinator_Association) {
                        org = organization;
                        break;
                    }
                }
        
                if (org != null) {
                    org.getWorkQueue().getWork_Req_List().add(request);
                    org.getBloodGroup().subtractBloodGroup(request.getPatient().getBlood_Group());
                    populateTextFields();
                }
                else {
                    JOptionPane.showMessageDialog(null, "No organization present", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            else{
                // JOptionPane.showMessageDialog(null, "Work Request is already in progress!" );
                 JOptionPane.showMessageDialog(null, new JLabel("Work Request is already in progress!!!!!!!!!!"), "Warning", JOptionPane.WARNING_MESSAGE);
                
            }
        }
            
     dB4OUtil.storeSystem(system);
        
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnOnHoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOnHoldActionPerformed
        // TODO add your handling code here:
         int selectedRow = tblPlasmaCoordinator.getSelectedRow();
        
        if (selectedRow < 0){
            //JOptionPane.showMessageDialog(null, "Please select a row first!" );
            
            JOptionPane.showMessageDialog(null, new JLabel(  "Please select a row from the table!!!!!"), "Warning", JOptionPane.WARNING_MESSAGE);
            
            
            return;
        }
        else{
            Work_Req request = (Work_Req)tblPlasmaCoordinator.getValueAt(selectedRow, 0);
            if(request.getStatus().equals("Legally Approved. Passing to PlasmaBank")){
                request.setStatus("On Hold Due to Plasma unavailability");
                
                dB4OUtil.storeSystem(system);
                populatePlasmaCoordinatorTable();   
            }
            else{
              JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>Work Request is<font color='red'> already</font> in progress!</I></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
                
              //  JOptionPane.showMessageDialog(null, "Work Request is already in progress!" ); 
            }
        }
        
    }//GEN-LAST:event_btnOnHoldActionPerformed

    private void tblPlasmaCoordinatorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPlasmaCoordinatorMouseClicked
        // TODO add your handling code here:
        
        int selectedRow = tblPlasmaCoordinator.getSelectedRow();
       // jPanel1.setVisible(true);
        if (selectedRow < 0){   
            //JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Please select<font color='red'> a row</font> from the<font color='green'> table!</I></font></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
             return;
        }
         else{
            jPanel1.setVisible(true);
            Work_Req request = (Work_Req)tblPlasmaCoordinator.getValueAt(selectedRow, 0);
            if(request.getStatus().equals("Legally Approved. Passing to PlasmaBank")){
                //request.setStatus("On Hold Due to Plasma unavailability");
                if(request.getPatient().isEmergency_Status() == true){
                jPanel1.setVisible(true);
                }
                //dB4OUtil.storeSystem(system);
                //populatePlasmaCoordinatorTable();   
            }
            else{
              //JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>Work Request is<font color='red'> already</font> in progress!</I></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
                 jPanel1.setVisible(false);
              //  JOptionPane.showMessageDialog(null, "Work Request is already in progress!" ); 
            }
        }
        
        
        
    }//GEN-LAST:event_tblPlasmaCoordinatorMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnOnHold;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblPlasmaCoordinator;
    private javax.swing.JTextField txtABnegative;
    private javax.swing.JTextField txtABpositive;
    private javax.swing.JTextField txtAnegative;
    private javax.swing.JTextField txtApositive;
    private javax.swing.JTextField txtBnegative;
    private javax.swing.JTextField txtBpositive;
    private javax.swing.JTextField txtOnegative;
    private javax.swing.JTextField txtOpositive;
    // End of variables declaration//GEN-END:variables
}
