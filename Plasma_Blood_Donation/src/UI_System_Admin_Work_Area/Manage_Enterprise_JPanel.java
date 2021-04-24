/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_System_Admin_Work_Area;

import Plasma_DB4OUtil.DB4OUtil;
import Plasma.EcoSystem;
import Plasma_Enterprise.Enterprise;
import Plasma_Network_Cities.Network_Cities;
import HomePages.TableFormat;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class Manage_Enterprise_JPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    //Creates new form ManageEnterprise
     
    public Manage_Enterprise_JPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;

        enterpriseJTable.getTableHeader().setDefaultRenderer(new TableFormat());
        populate_Table();
        populate_ComboBox();
    }
    //POPULATE ALL THE ENTEPRISE DATA INTO A TABLE
    
    private void populate_Table() {
        DefaultTableModel table = (DefaultTableModel) enterpriseJTable.getModel();

        table.setRowCount(0);
        for (Network_Cities city : system.getCityList()) {
            for (Enterprise enterprise : city.getEnterprise_Dir().getEnt_List()) {
                Object[] row = new Object[6];
                row[0] = enterprise.getName();
                row[1] = enterprise.getEnterprise_type().getValue();
                row[2] = city.getCity_name();
                row[5] = enterprise.getEmail();
                row[3] = enterprise.getMobile();
                row[4] = enterprise.getPincode();

                table.addRow(row);
            }
        }
    }

    private void populate_ComboBox() {
        network_JComboBox.removeAllItems();
        enterpriseType_JComboBox.removeAllItems();

        for (Network_Cities network : system.getCityList()) {
            network_JComboBox.addItem(network);
        }

        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            enterpriseType_JComboBox.addItem(type);
        }

    }
    //CHECK IF THE MOBILE NUMBER ENTERED IS VALID OR NOT
    public static boolean phoneNumber_Validator(String contact) {
        Pattern pattern;
        Matcher match;
        String PHONE_PATTERN = "^[0-9]{10}$";
        pattern = Pattern.compile(PHONE_PATTERN);
        match = pattern.matcher(contact);
        return match.matches();
    }
    //CHECK IF THE PINCODE IS VALID OR NOT
    public static boolean pinCode_Validator(String zip) {
        Pattern pattern;
        Matcher matcher;
        String zip_pattern = "^[0-9]{5}$";
        pattern = Pattern.compile(zip_pattern);
        matcher = pattern.matcher(zip);
        return matcher.matches();
    }

    public static boolean email_Validator(String email) {
        Pattern pattern;
        Matcher matcher;
        String EMAIL_PATTERN = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(email);
        return matcher.matches();
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
        enterpriseJTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        network_JComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        enterpriseType_JComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        txt_Name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_Contact = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_ZipCode = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_Email = new javax.swing.JTextField();
        btn_CreateEnterprise = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseJTable.setBackground(new java.awt.Color(102, 0, 102));
        enterpriseJTable.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 255, 204)));
        enterpriseJTable.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        enterpriseJTable.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ENTERPRISE NAME", "ENTERPRISE TYPE", "NETWORK", "CONTACT", "ZIPCODE", "EMAIL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        enterpriseJTable.setGridColor(new java.awt.Color(0, 0, 0));
        enterpriseJTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        enterpriseJTable.setRowHeight(30);
        enterpriseJTable.setShowVerticalLines(false);
        jScrollPane1.setViewportView(enterpriseJTable);
        if (enterpriseJTable.getColumnModel().getColumnCount() > 0) {
            enterpriseJTable.getColumnModel().getColumn(0).setResizable(false);
            enterpriseJTable.getColumnModel().getColumn(1).setResizable(false);
            enterpriseJTable.getColumnModel().getColumn(2).setResizable(false);
            enterpriseJTable.getColumnModel().getColumn(3).setResizable(false);
            enterpriseJTable.getColumnModel().getColumn(4).setResizable(false);
            enterpriseJTable.getColumnModel().getColumn(5).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 730, 400));

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204)));
        jPanel2.setForeground(new java.awt.Color(204, 255, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(250, 400));
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setVerifyInputWhenFocusTarget(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CREATE ENTERPRISE");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 408, 36));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NETWORK:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        network_JComboBox.setBackground(new java.awt.Color(0, 0, 0));
        network_JComboBox.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        network_JComboBox.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(network_JComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 163, -1));

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TYPE OF ENTERPRISE:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        enterpriseType_JComboBox.setBackground(new java.awt.Color(0, 0, 0));
        enterpriseType_JComboBox.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        enterpriseType_JComboBox.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(enterpriseType_JComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 110, 160, -1));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NAME:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        txt_Name.setBackground(new java.awt.Color(0, 0, 0));
        txt_Name.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        txt_Name.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txt_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 155, 163, -1));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CONTACT:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        txt_Contact.setBackground(new java.awt.Color(0, 0, 0));
        txt_Contact.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        txt_Contact.setForeground(new java.awt.Color(255, 255, 255));
        txt_Contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ContactActionPerformed(evt);
            }
        });
        jPanel2.add(txt_Contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 163, -1));

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ZIPCODE:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        txt_ZipCode.setBackground(new java.awt.Color(0, 0, 0));
        txt_ZipCode.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        txt_ZipCode.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txt_ZipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 163, -1));

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        txt_Email.setBackground(new java.awt.Color(0, 0, 0));
        txt_Email.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txt_Email.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txt_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 299, 163, -1));

        btn_CreateEnterprise.setBackground(new java.awt.Color(31, 31, 31));
        btn_CreateEnterprise.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_CreateEnterprise.setText("CREATE ENTERPRISE");
        btn_CreateEnterprise.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_CreateEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_enterprise(evt);
            }
        });
        jPanel2.add(btn_CreateEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 210, 33));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 410, 450));

        jPanel3.setBackground(new java.awt.Color(31, 31, 31));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));

        jLabel13.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("ENTERPRISE MANAGEMENT");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 1546, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1570, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 90, 470));
    }// </editor-fold>//GEN-END:initComponents

    private void create_enterprise(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_enterprise

        Network_Cities city = (Network_Cities) network_JComboBox.getSelectedItem();
        Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) enterpriseType_JComboBox.getSelectedItem();
        String check1 = "";

        if (network_JComboBox.getSelectedItem() == null) {
            network_JComboBox.setBorder(BorderFactory.createLineBorder(Color.RED));
            network_JComboBox.setForeground(Color.red);

            JOptionPane.showMessageDialog(null, new JLabel("Select a Network please!"), "Warning", JOptionPane.WARNING_MESSAGE);

            check1 = "no";
        }

        if (enterpriseType_JComboBox.getSelectedItem() == null) {
            enterpriseType_JComboBox.setBorder(BorderFactory.createLineBorder(Color.RED));
            enterpriseType_JComboBox.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, new JLabel("PLEASE Select an Enterprise Type!!!!11"), "Warning", JOptionPane.WARNING_MESSAGE);
            check1 = "no";
        }

        if (txt_Name.getText().isEmpty()) {
            txt_Name.setBorder(BorderFactory.createLineBorder(Color.RED));
            txt_Name.setForeground(Color.red);
        }

        if (txt_Contact.getText().isEmpty()) {
            txt_Contact.setBorder(BorderFactory.createLineBorder(Color.RED));
            txt_Contact.setForeground(Color.red);
        }
        if (txt_Email.getText().isEmpty()) {
            txt_Email.setBorder(BorderFactory.createLineBorder(Color.RED));
            txt_Email.setForeground(Color.red);
        }
        if (txt_ZipCode.getText().isEmpty()) {
            txt_ZipCode.setBorder(BorderFactory.createLineBorder(Color.RED));
            txt_ZipCode.setForeground(Color.red);
        }

        if (txt_Name.getText().isEmpty() || txt_Contact.getText().isEmpty() || txt_Email.getText().isEmpty() || txt_ZipCode.getText().isEmpty()
                || city == null || type == null) {
            JOptionPane.showMessageDialog(null, new JLabel("All fields are mandatory"), "Error", JOptionPane.ERROR_MESSAGE);

            check1 = "no";
        } else if (!phoneNumber_Validator(txt_Contact.getText())) {
            check1 = "no";
            txt_Contact.setBorder(BorderFactory.createLineBorder(Color.RED));
            txt_Contact.setForeground(Color.red);

            JOptionPane.showMessageDialog(null, new JLabel("Contact Number should be 10 digit"), "Error", JOptionPane.ERROR_MESSAGE);

        } else if (!pinCode_Validator(txt_ZipCode.getText())) {
            check1 = "no";
            txt_ZipCode.setBorder(BorderFactory.createLineBorder(Color.RED));
            txt_ZipCode.setForeground(Color.red);

            JOptionPane.showMessageDialog(null, new JLabel("Zip should be 5 digit"), "Error", JOptionPane.ERROR_MESSAGE);

        } else if (!email_Validator(txt_Email.getText())) {
            check1 = "no";
            txt_Email.setBorder(BorderFactory.createLineBorder(Color.RED));
            txt_Email.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, new JLabel("Email ID must be in correct format "), "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            for (Enterprise ent : city.getEnterprise_Dir().getEnt_List()) {

                if (ent.getName().equals(txt_Name.getText())) {
                    JOptionPane.showMessageDialog(null, new JLabel("Enterprise Name can not be same"), "Error", JOptionPane.ERROR_MESSAGE);
                    check1 = "no";
                    txt_Name.setBorder(BorderFactory.createLineBorder(Color.RED));
                    txt_Name.setForeground(Color.red);
                    return;
                }
            }

            // THE MAIN PROCESS AFTER VALIDATION CHECKS
            if (check1.equals("")) {
                String name = txt_Name.getText();

                Enterprise enterprise = city.getEnterprise_Dir().create_And_Add_Enterprise(name, type);
                enterprise.setMobile(((txt_Contact.getText())));
                enterprise.setPincode(Integer.parseInt(txt_ZipCode.getText()));
                enterprise.setEmail(txt_Email.getText());

                populate_Table();

                JOptionPane.showMessageDialog(null, new JLabel("New Enterprise created successfully!!!!"));


                dB4OUtil.storeSystem(system);

                txt_Name.setText("");
                txt_Contact.setText("");
                txt_ZipCode.setText("");
                txt_Email.setText("");

            }
        }
    }//GEN-LAST:event_create_enterprise

    private void txt_ContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ContactActionPerformed
    }//GEN-LAST:event_txt_ContactActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CreateEnterprise;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JComboBox enterpriseType_JComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox network_JComboBox;
    private javax.swing.JTextField txt_Contact;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_Name;
    private javax.swing.JTextField txt_ZipCode;
    // End of variables declaration//GEN-END:variables
}
