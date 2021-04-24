/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_Legal_Officer;
import Plasma_DB4OUtil.DB4OUtil;
import Plasma.EcoSystem;
import Plasma_Enterprise.Enterprise;
import Plasma_Network_Cities.Network_Cities;
import Plasma_Association.Association;
import Plasma_Association.Plasma_Bank_Association;
import Plasma_User_Account.User_Acc;
import Plasma_Work_Queue.Work_Req;
import HomePages.TableFormat;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Properties;
import javax.imageio.ImageIO;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author RST
 */
public class Patient_Consent_JPanel extends javax.swing.JPanel {

    //Creates new form Patient_Consent
    
    private EcoSystem system;
    private User_Acc user;
    private Network_Cities net;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    public Patient_Consent_JPanel(EcoSystem system, User_Acc userAccount, Network_Cities network) {
        initComponents();
        this.system = system;
        this.user = userAccount;
        this.net = network;
        tblPatientConsent.getTableHeader().setDefaultRenderer(new TableFormat());
        view_Patient_Consent_Table();
    }

    public void view_Patient_Consent_Table() {
        DefaultTableModel table = (DefaultTableModel) tblPatientConsent.getModel();

        table.setRowCount(0);

        for (Work_Req work : user.getWorkQueue().getWork_Req_List()) {
            Object[] row = new Object[5];
            row[0] = work;
            row[1] = work.getPatient();
            row[2] = work.getPatient().getName();
            row[3] = work.getPatient().getEmailID();
            row[4] = work.getStatus();

            table.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatientConsent = new javax.swing.JTable();
        btnApproval = new javax.swing.JButton();
        btnDisapproval = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblPatientConsent.setBackground(new java.awt.Color(102, 0, 102));
        tblPatientConsent.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tblPatientConsent.setForeground(new java.awt.Color(255, 255, 255));
        tblPatientConsent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "REQUEST NUMBER", "PATIENT ID", "PATIENT NAME", "PATIENT NAME", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPatientConsent.setFocusable(false);
        tblPatientConsent.setGridColor(new java.awt.Color(0, 0, 0));
        tblPatientConsent.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblPatientConsent.setRowHeight(30);
        tblPatientConsent.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tblPatientConsent);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 1330, 350));

        btnApproval.setBackground(new java.awt.Color(31, 31, 31));
        btnApproval.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnApproval.setText("GIVE LEGAL APPROVAL");
        btnApproval.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnApproval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                legal_approval(evt);
            }
        });
        add(btnApproval, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 550, 260, 40));

        btnDisapproval.setBackground(new java.awt.Color(31, 31, 31));
        btnDisapproval.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnDisapproval.setText("DISAPPROVE");
        btnDisapproval.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDisapproval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disapprove_button(evt);
            }
        });
        add(btnDisapproval, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 550, 140, 40));

        jPanel3.setBackground(new java.awt.Color(31, 31, 31));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));

        jLabel25.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("STATUS FOR TREATMENT CONSENT  LETTER");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 1566, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1590, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void legal_approval(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_legal_approval
        int selectedRow = tblPatientConsent.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, new JLabel("Please select a row from the table"), "Warning", JOptionPane.WARNING_MESSAGE);

        } else {
            Work_Req work = (Work_Req) tblPatientConsent.getValueAt(selectedRow, 0);

            work.setStatus("Legally Approved. Forwarding to Plasma Bank");
            dB4OUtil.storeSystem(system);
            view_Patient_Consent_Table();
            JOptionPane.showMessageDialog(null, new JLabel("Legally approved successfully!!!!!!"), "Info", JOptionPane.INFORMATION_MESSAGE);
            Enterprise ent = null;
            Association org = null;

            for (Enterprise enter : net.getEnterprise_Dir().getEnt_List()) {
                if (enter.getEnterprise_type().toString().equals("PlasmaBank")) {

                    ent = enter;
                    System.out.println(enter);
                    break;
                }
            }

            for (Association association : ent.getAssociationDirectory().getAssociationList()) {
                if (association instanceof Plasma_Bank_Association) {
                    org = association;
                    break;
                }
            }

            if (org != null) {
                org.getWorkQueue().getWork_Req_List().add(work);
                System.out.println(org.getName() + "Orgcheck");
            } else {
                JOptionPane.showMessageDialog(null, "No organization present", "Error", JOptionPane.ERROR_MESSAGE);
            }

            User_Acc u = null;
            for (User_Acc userAcc : org.getUserAccDir().getUser_Account_List()) {
                u = userAcc;
                u.getWorkQueue().getWork_Req_List().add(work);
                break;
            }
        }
    }//GEN-LAST:event_legal_approval

    private void disapprove_button(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disapprove_button
        // TODO add your handling code here:

        int row = tblPatientConsent.getSelectedRow();

        if (row < 0) {
            JOptionPane.showMessageDialog(null, new JLabel("Please select a row from the table"), "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            Work_Req req = (Work_Req) tblPatientConsent.getValueAt(row, 0);

            req.setStatus("Disapproved");
            req.setUser_Acc(user);
            user.getWorkQueue().getWork_Req_List().add(req);

            dB4OUtil.storeSystem(system);
            view_Patient_Consent_Table();
            JOptionPane.showMessageDialog(null, new JLabel("Legally Disapproved!"), "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_disapprove_button

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApproval;
    private javax.swing.JButton btnDisapproval;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPatientConsent;
    // End of variables declaration//GEN-END:variables

}