/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_Plasma_Bank_Coordinator;

import Plasma_Enterprise.Enterprise;
import Plasma_Association.Plasma_Bank_Association;
import Plasma_User_Account.User_Acc;
import java.util.Date;
/**
 *
 * @author RST
 */

public class Manage_Plasma_Bank_Coordinator_Profile extends javax.swing.JPanel {

    //Creates new form Manage Doctor Profile
     
    private User_Acc user_Account;
    private Enterprise enterprise;
    private Plasma_Bank_Association plasma_association;

    public Manage_Plasma_Bank_Coordinator_Profile(User_Acc userAccount, Plasma_Bank_Association plasmaOrganization, Enterprise enterprise) {
        initComponents();
        this.user_Account = userAccount;
        this.enterprise = enterprise;
        this.plasma_association = plasmaOrganization;
        populate_table_fields();
    }

    //used to populate all the plasma bank details into a table
    private void populate_table_fields() {
        combo_Gender.removeAllItems();
        combo_Gender.addItem("Male");
        combo_Gender.addItem("Female");
        txt_Address.setText(user_Account.getEmployee().getAddress());
        txt_City.setText(user_Account.getEmployee().getCity());
        txt_Contact.setText(String.valueOf(user_Account.getEmployee().getMobile()));
        txt_DOB.setText(String.valueOf(user_Account.getEmployee().getDob()));
        txt_name.setText(user_Account.getEmployee().getName());
        txt_Specialization.setText(user_Account.getEmployee().getSpecialization());
        txt_State.setText(user_Account.getEmployee().getState());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        txt_Contact = new javax.swing.JTextField();
        txt_Address = new javax.swing.JTextField();
        txt_City = new javax.swing.JTextField();
        txt_State = new javax.swing.JTextField();
        txt_Specialization = new javax.swing.JTextField();
        txt_DOB = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        combo_Gender = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 0, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 70, 49));

        txt_name.setBackground(new java.awt.Color(0, 0, 0));
        txt_name.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_name.setForeground(new java.awt.Color(255, 255, 255));
        add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 44, 146, -1));

        txt_Contact.setBackground(new java.awt.Color(0, 0, 0));
        txt_Contact.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_Contact.setForeground(new java.awt.Color(255, 255, 255));
        add(txt_Contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 74, 146, -1));

        txt_Address.setBackground(new java.awt.Color(0, 0, 0));
        txt_Address.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_Address.setForeground(new java.awt.Color(255, 255, 255));
        add(txt_Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 104, 146, -1));

        txt_City.setBackground(new java.awt.Color(0, 0, 0));
        txt_City.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_City.setForeground(new java.awt.Color(255, 255, 255));
        add(txt_City, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 134, 146, -1));

        txt_State.setBackground(new java.awt.Color(0, 0, 0));
        txt_State.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_State.setForeground(new java.awt.Color(255, 255, 255));
        add(txt_State, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 164, 146, -1));

        txt_Specialization.setBackground(new java.awt.Color(0, 0, 0));
        txt_Specialization.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_Specialization.setForeground(new java.awt.Color(255, 255, 255));
        add(txt_Specialization, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 146, -1));

        txt_DOB.setBackground(new java.awt.Color(0, 0, 0));
        txt_DOB.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_DOB.setForeground(new java.awt.Color(255, 255, 255));
        add(txt_DOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 232, 146, -1));

        btnSave.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_button(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 324, 70, 30));

        combo_Gender.setBackground(new java.awt.Color(0, 0, 0));
        combo_Gender.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        combo_Gender.setForeground(new java.awt.Color(255, 255, 255));
        combo_Gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(combo_Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 197, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CITY:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ADDRESS:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NAME:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("SPECIALIZATION:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DOB:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("GENDER:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("STATE:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CONTACT NUMBER:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void save_button(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_button
        // TODO add your handling code here:
        user_Account.getEmployee().setCity(txt_City.getText());
        user_Account.getEmployee().setMobile((txt_Contact.getText()));
        user_Account.getEmployee().setDob(new Date(txt_DOB.getText()));
        user_Account.getEmployee().setGender((String) combo_Gender.getSelectedItem());
        user_Account.getEmployee().setAddress(txt_Address.getText());
        user_Account.getEmployee().setState(txt_City.getText());
        user_Account.getEmployee().setSpecialization(txt_Specialization.getText());
    }//GEN-LAST:event_save_button


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox combo_Gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txt_Address;
    private javax.swing.JTextField txt_City;
    private javax.swing.JTextField txt_Contact;
    private javax.swing.JTextField txt_DOB;
    private javax.swing.JTextField txt_Specialization;
    private javax.swing.JTextField txt_State;
    private javax.swing.JTextField txt_name;
    // End of variables declaration//GEN-END:variables
}
