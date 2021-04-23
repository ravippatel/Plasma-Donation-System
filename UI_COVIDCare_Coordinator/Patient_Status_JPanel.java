/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_COVIDCare_Coordinator;
import Plasma_DB4OUtil.DB4OUtil;
import Plasma.EcoSystem;
import Plasma_People.Patient;
import Plasma_People.Patient_Req;
import HomePages.TableFormat;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author RST
 */
public class Patient_Status_JPanel extends javax.swing.JPanel {

    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    Patient_Status_JPanel(EcoSystem system) {
        initComponents();
        this.system = system;
        patientTable.getTableHeader().setDefaultRenderer(new TableFormat());
        patientTable1.getTableHeader().setDefaultRenderer(new TableFormat());
        populateTable();
        populateTable1();

    }

    private void populateTable() {
        DefaultTableModel table = (DefaultTableModel) patientTable.getModel();

        table.setRowCount(0);

        for (Patient p : system.getPatientDir().getPatient_List()) {
            Object row[] = new Object[4];
            row[0] = p;
            row[1] = p.getName();
            row[2] = p.getMobile();
            row[3] = p.getStatus();

            table.addRow(row);
        }
    }

    private void populateTable1() {
        DefaultTableModel dtm = (DefaultTableModel) patientTable1.getModel();

        dtm.setRowCount(0);

        for (Patient_Req p : system.getPatientRequestDir().getPatient_Req_List()) {
            Object row[] = new Object[4];
            row[0] = p;
            row[1] = p.getName();
            row[2] = p.getContact();
            row[3] = p.getStatus();

            dtm.addRow(row);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        patientTable1 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel1.setText("LIST OF PATIENT NEED OF PLASMA");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, -1, -1));

        patientTable.setBackground(new java.awt.Color(102, 0, 102));
        patientTable.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        patientTable.setForeground(new java.awt.Color(255, 255, 255));
        patientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PATIENT ID", "NAME", "CONTACT", "STATUS"
            }
        ));
        patientTable.setFocusable(false);
        patientTable.setGridColor(new java.awt.Color(0, 0, 0));
        patientTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        patientTable.setRowHeight(30);
        patientTable.setShowVerticalLines(false);
        jScrollPane1.setViewportView(patientTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 1230, 220));

        jButton2.setBackground(new java.awt.Color(31, 31, 31));
        jButton2.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jButton2.setText("DELETE");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_button(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 450, 120, 40));

        jPanel3.setBackground(new java.awt.Color(31, 31, 31));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));

        jLabel25.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("STATUS FOR THE PATIENT");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 1680, Short.MAX_VALUE)
                .addGap(110, 110, 110))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1800, -1));

        patientTable1.setBackground(new java.awt.Color(102, 0, 102));
        patientTable1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        patientTable1.setForeground(new java.awt.Color(255, 255, 255));
        patientTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Name", "Contact", "Status"
            }
        ));
        patientTable1.setFocusable(false);
        patientTable1.setGridColor(new java.awt.Color(0, 0, 0));
        patientTable1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        patientTable1.setRowHeight(30);
        patientTable1.setShowVerticalLines(false);
        jScrollPane2.setViewportView(patientTable1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 1220, 220));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setAlignmentX(1.0F);
        jSeparator1.setAlignmentY(1.0F);
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 422, 1220, 20));
    }// </editor-fold>//GEN-END:initComponents
    
    //delete patient request
    
    private void delete_button(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_button
        // TODO add your handling code here:

        int selectedRow = patientTable1.getSelectedRow();
        Patient_Req dr = ((Patient_Req) patientTable1.getValueAt(selectedRow, 0));

        system.getPatientRequestDir().removePatientRequest(dr);

        dB4OUtil.storeSystem(system);
        populateTable1();


    }//GEN-LAST:event_delete_button


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable patientTable;
    private javax.swing.JTable patientTable1;
    // End of variables declaration//GEN-END:variables
}
