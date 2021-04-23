/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_System_Admin_Work_Area;

import Plasma_DB4OUtil.DB4OUtil;
import Plasma.EcoSystem;
import Plasma_Network_Cities.Network_Cities;
import HomePages.TableFormat;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RST
 */
public class Manage_Network_JPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    //Creates new form ManageNetworkJPanel
    public Manage_Network_JPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.system = system;
        networkJTable.getTableHeader().setDefaultRenderer(new TableFormat());
        populate_Network_Table();
    }

    //USED TO CREATE NETWORK TABLE
    private void populate_Network_Table() {
        DefaultTableModel table = (DefaultTableModel) networkJTable.getModel();

        table.setRowCount(0);
        for (Network_Cities network : system.getCityList()) {
            Object[] row = new Object[3];
            row[0] = network.getCity_name();
            row[1] = network.getState();
            row[2] = network.getCountry();
            table.addRow(row);
        }
    }

    //CHECK IF NAME IS ALPHABETS OR NOT
    public boolean isAlpha(String name) {
        return name.matches("[a-zA-Z]+");
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
        networkJTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_NetWorkName = new javax.swing.JTextField();
        txt_State = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_Country = new javax.swing.JTextField();
        btnCreateNetwork = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        networkJTable.setBackground(new java.awt.Color(0, 0, 0));
        networkJTable.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 255, 204)));
        networkJTable.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        networkJTable.setForeground(new java.awt.Color(255, 255, 255));
        networkJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "State", "Country"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        networkJTable.setFocusable(false);
        networkJTable.setGridColor(new java.awt.Color(255, 255, 255));
        networkJTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        networkJTable.setRowHeight(30);
        networkJTable.setSelectionForeground(new java.awt.Color(204, 255, 204));
        networkJTable.setShowVerticalLines(false);
        jScrollPane1.setViewportView(networkJTable);
        if (networkJTable.getColumnModel().getColumnCount() > 0) {
            networkJTable.getColumnModel().getColumn(0).setResizable(false);
            networkJTable.getColumnModel().getColumn(1).setResizable(false);
            networkJTable.getColumnModel().getColumn(2).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 510, 780, 330));

        jPanel3.setBackground(new java.awt.Color(31, 31, 31));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));

        jLabel12.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("NETWORK MANAGEMENT");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
                .addGap(586, 586, 586))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1500, -1));

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204)));
        jPanel2.setPreferredSize(new java.awt.Dimension(250, 400));
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setVerifyInputWhenFocusTarget(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NAME:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 103, -1, -1));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("STATE:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 152, -1, -1));

        txt_NetWorkName.setBackground(new java.awt.Color(0, 0, 0));
        txt_NetWorkName.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        txt_NetWorkName.setForeground(new java.awt.Color(255, 255, 255));
        txt_NetWorkName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NetWorkNameActionPerformed(evt);
            }
        });
        jPanel2.add(txt_NetWorkName, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 100, 141, -1));

        txt_State.setBackground(new java.awt.Color(0, 0, 0));
        txt_State.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        txt_State.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txt_State, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 149, 141, -1));

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("COUNTRY:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 200, -1, -1));

        txt_Country.setBackground(new java.awt.Color(0, 0, 0));
        txt_Country.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        txt_Country.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txt_Country, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 197, 141, -1));

        btnCreateNetwork.setBackground(new java.awt.Color(31, 31, 31));
        btnCreateNetwork.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnCreateNetwork.setText("CREATE NETWORK");
        btnCreateNetwork.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCreateNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Create_Network(evt);
            }
        });
        jPanel2.add(btnCreateNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 210, 35));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CREATE NETWORK");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 326, 36));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 410, 360));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 830, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void Create_Network(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Create_Network

        if (txt_NetWorkName.getText().isEmpty()) {
            txt_NetWorkName.setBorder(BorderFactory.createLineBorder(Color.RED));
            txt_NetWorkName.setForeground(Color.red);
        }
        if (txt_State.getText().isEmpty()) {
            txt_State.setBorder(BorderFactory.createLineBorder(Color.RED));
            txt_State.setForeground(Color.red);
        }
        if (txt_Country.getText().isEmpty()) {
            txt_Country.setBorder(BorderFactory.createLineBorder(Color.RED));
            txt_Country.setForeground(Color.red);
        }

        String check1 = "";

        if (txt_NetWorkName.getText().isEmpty() || txt_State.getText().isEmpty() || txt_Country.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>All fields are</I><font color='red'> mandatory</font>!</h2></html>"), "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            for (Network_Cities network : system.getCityList()) {
                if (network.getCity_name().equals(txt_NetWorkName.getText())) {
                    JOptionPane.showMessageDialog(null, new JLabel("<html><h2><font color='red'><I>Network Name</I></font> can not be <font color='red'>same</font>!</h2></html>"), "Error", JOptionPane.ERROR_MESSAGE);

                    check1 = "no";
                    return;
                }
            }
            if (!isAlpha(txt_State.getText())) {
                check1 = "no";
                txt_State.setBorder(BorderFactory.createLineBorder(Color.RED));
                txt_State.setForeground(Color.red);

                JOptionPane.showMessageDialog(null, new JLabel("<html><h2>Name of the<font color='red'><I> State</I></font> must contain only<font color='green'> alphabets</font>!</h2></html>"), "Error", JOptionPane.ERROR_MESSAGE);

            }
            if (!isAlpha(txt_Country.getText())) {
                check1 = "no";
                txt_Country.setBorder(BorderFactory.createLineBorder(Color.RED));
                txt_Country.setForeground(Color.red);
                JOptionPane.showMessageDialog(null, new JLabel("<html><h2>Name of the<font color='red'><I> Country</I></font> must contain only<font color='green'> alphabets</font>!</h2></html>"), "Error", JOptionPane.ERROR_MESSAGE);

            }

            if (check1.equals("no")) {
            } else {
                Network_Cities network = system.createAndAddNetworkCity();
                network.setCity_name(txt_NetWorkName.getText());
                network.setState(txt_State.getText());
                network.setCountry(txt_Country.getText());
                populate_Network_Table();
                JOptionPane.showMessageDialog(null, new JLabel("<html><h2>New <I>Network</I><font color='green'> created</font> successfully!</h2></html>"));
                dB4OUtil.storeSystem(system);
                txt_NetWorkName.setText("");
                txt_State.setText("");
                txt_Country.setText("");
            }
        }
    }//GEN-LAST:event_Create_Network
    private void txt_NetWorkNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NetWorkNameActionPerformed
    }//GEN-LAST:event_txt_NetWorkNameActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateNetwork;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable networkJTable;
    private javax.swing.JTextField txt_Country;
    private javax.swing.JTextField txt_NetWorkName;
    private javax.swing.JTextField txt_State;
    // End of variables declaration//GEN-END:variables
}
