/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_COVID_Coordinator;
import Plasma_DB4OUtil.DB4OUtil;
import Plasma.EcoSystem;
import Plasma_People.Patient_Req;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.SwingUtilities.getWindowAncestor;
import javax.swing.filechooser.FileNameExtensionFilter;
import UI_Govt_Coordinator.New_Donor_JPanel;
/**
 *
 * @author RST
 */
public class New_Receiver_JPanel extends javax.swing.JPanel {

    //Creates new form New_Receiver
    private EcoSystem system;
    private byte[] tempdP;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private boolean valid_email;
    private int yesno;
    private ButtonGroup radioGroup1;

    //constructor
    public New_Receiver_JPanel(EcoSystem system) {
        initComponents();
        this.system = system;
        this.radioGroup1 = new ButtonGroup();
        radioGroup1.add(buttonYes);
        radioGroup1.add(buttonNo);
        populateBloodGroupComboBox();
        populateGenderComboBox();
        populateStateComboBox();
        emailSuccessLabel.setVisible(false);
        emailValidateMessage.setVisible(false);
    }

    //populate blood group Combo Box
    private void populateBloodGroupComboBox() {
        bloodGroupBox.addItem("O+");
        bloodGroupBox.addItem("AB+");
        bloodGroupBox.addItem("O-");
        bloodGroupBox.addItem("AB-");
        bloodGroupBox.addItem("A+");
        bloodGroupBox.addItem("B+");
        bloodGroupBox.addItem("A-");
        bloodGroupBox.addItem("B-");
    }

    //populate gender Combo Box
    private void populateGenderComboBox() {
        genderBox.addItem("Male");
        genderBox.addItem("Female");
        genderBox.addItem("Other");
    }
    //populate state Combo Box

    private void populateStateComboBox() {
        stateBox.addItem("California");
        stateBox.addItem("Massachusetts");
        stateBox.addItem("Georgia");
        stateBox.addItem("Arizona");
        stateBox.addItem("Texas");
        stateBox.addItem("Florida");
        stateBox.addItem("Illinois");
    }

    //Check for valid phone number
    public static boolean phoneNumberValidator(String mobile) {
        Pattern pattern;
        Matcher matcher;
        String PHONE_PATTERN = "^[0-9]{10}$";
        pattern = Pattern.compile(PHONE_PATTERN);
        matcher = pattern.matcher(mobile);
        return matcher.matches();
    }
    //Check for valid pincode

    public static boolean pinCodeValidator(String pin) {
        Pattern pattern;
        Matcher matcher;
        String zip_pattern = "^[0-9]{5}$";
        pattern = Pattern.compile(zip_pattern);
        matcher = pattern.matcher(pin);
        return matcher.matches();
    }
    //Check for valid email

    public static boolean emailValidator(String email) {
        Pattern pattern;
        Matcher matcher;
        String EMAIL_PATTERN = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }

    private void disableAllButton() {
        uidText.setEnabled(false);
        nameText.setEnabled(false);
        dobDateField.setEnabled(false);
        age.setEnabled(false);
        emailText.setEnabled(false);
        contactText.setEnabled(false);
        genderBox.setEnabled(false);
        bloodGroupBox.setEnabled(false);
        diagnosedDateChooser.setEnabled(false);
        streetText.setEnabled(false);
        cityText.setEnabled(false);
        stateBox.setEnabled(false);
        zipText.setEnabled(false);
        buttonYes.setEnabled(false);
        buttonNo.setEnabled(false);
        Add_Photo_button.setEnabled(false);
    }
    //Check for valid name

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

        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cityText = new javax.swing.JTextField();
        nameText = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        zipText = new javax.swing.JTextField();
        uidText = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        contactText = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        streetText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Add_Photo_button = new javax.swing.JButton();
        buttonYes = new javax.swing.JRadioButton();
        buttonNo = new javax.swing.JRadioButton();
        dobDateField = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        stateBox = new javax.swing.JComboBox();
        bloodGroupBox = new javax.swing.JComboBox();
        genderBox = new javax.swing.JComboBox();
        diagnosedDateChooser = new com.toedter.calendar.JDateChooser();
        Pic = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        emailValidateMessage = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        emailSuccessLabel = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 204, 204));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel12.setText("STREET ADDRESS:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 160, -1, -1));

        jLabel13.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel13.setText("CITY:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 270, -1, -1));

        jButton1.setBackground(new java.awt.Color(31, 31, 31));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_button(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 650, 100, 40));

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setText("NAME:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        cityText.setBackground(new java.awt.Color(0, 0, 0));
        cityText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        cityText.setForeground(new java.awt.Color(255, 255, 255));
        add(cityText, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 280, 210, -1));

        nameText.setBackground(new java.awt.Color(0, 0, 0));
        nameText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        nameText.setForeground(new java.awt.Color(255, 255, 255));
        add(nameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 180, -1));

        jLabel14.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel14.setText("STATE:");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 210, -1, -1));

        jLabel15.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel15.setText("ZIP CODE:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 320, -1, -1));

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel5.setText("UID:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        zipText.setBackground(new java.awt.Color(0, 0, 0));
        zipText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        zipText.setForeground(new java.awt.Color(255, 255, 255));
        add(zipText, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 320, 210, -1));

        uidText.setBackground(new java.awt.Color(0, 0, 0));
        uidText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        uidText.setForeground(new java.awt.Color(255, 255, 255));
        add(uidText, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 170, -1));

        jLabel16.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel16.setText("CONTACT NUMBER:");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel6.setText("DOB:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));

        contactText.setBackground(new java.awt.Color(0, 0, 0));
        contactText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        contactText.setForeground(new java.awt.Color(255, 255, 255));
        contactText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactTextActionPerformed(evt);
            }
        });
        add(contactText, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 260, 170, -1));

        jLabel17.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel17.setText("EMAIL ID:");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, -1, -1));

        emailText.setBackground(new java.awt.Color(0, 0, 0));
        emailText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        emailText.setForeground(new java.awt.Color(255, 255, 255));
        emailText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uEmailKeyTyped(evt);
            }
        });
        add(emailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 200, 176, -1));

        age.setBackground(new java.awt.Color(0, 0, 0));
        age.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        age.setForeground(new java.awt.Color(255, 255, 255));
        age.setEnabled(false);
        age.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ageMouseClicked(evt);
            }
        });
        add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 150, 170, 30));

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel8.setText("GENDER:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, -1));

        jLabel19.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jLabel19.setText("WERE YOU TESTED POSITIVE IN THE LAB");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, -1, 30));

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel9.setText("BLOOD GROUP:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, -1, -1));

        streetText.setBackground(new java.awt.Color(0, 0, 0));
        streetText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        streetText.setForeground(new java.awt.Color(255, 255, 255));
        add(streetText, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 160, 210, -1));

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jLabel10.setText("COVID DIAGONISE DATE:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 570, -1, -1));

        Add_Photo_button.setBackground(new java.awt.Color(31, 31, 31));
        Add_Photo_button.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        Add_Photo_button.setText("ADD PHOTO");
        Add_Photo_button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Add_Photo_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_photo(evt);
            }
        });
        add(Add_Photo_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 210, 150, -1));

        buttonYes.setBackground(new java.awt.Color(0, 0, 0));
        buttonYes.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        buttonYes.setText("Yes");
        buttonYes.setOpaque(false);
        add(buttonYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 500, -1, -1));

        buttonNo.setBackground(new java.awt.Color(0, 0, 0));
        buttonNo.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        buttonNo.setText("No");
        buttonNo.setOpaque(false);
        add(buttonNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 500, -1, -1));

        dobDateField.setBackground(new java.awt.Color(0, 0, 0));
        dobDateField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dobDateField.setForeground(new java.awt.Color(255, 255, 255));
        add(dobDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 180, -1));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_button(evt);
            }
        });
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 650, -1, 48));

        jPanel3.setBackground(new java.awt.Color(31, 31, 31));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("REGISTRATION FORM FOR PATIENT");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 1776, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1800, -1));

        jLabel20.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel20.setText("AGE:");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, -1, -1));

        stateBox.setBackground(new java.awt.Color(0, 0, 0));
        stateBox.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        stateBox.setForeground(new java.awt.Color(255, 255, 255));
        stateBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        stateBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateBoxActionPerformed(evt);
            }
        });
        add(stateBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 210, 210, -1));

        bloodGroupBox.setBackground(new java.awt.Color(0, 0, 0));
        bloodGroupBox.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        bloodGroupBox.setForeground(new java.awt.Color(255, 255, 255));
        bloodGroupBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bloodGroupBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodGroupBoxActionPerformed(evt);
            }
        });
        add(bloodGroupBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 320, 170, -1));

        genderBox.setBackground(new java.awt.Color(0, 0, 0));
        genderBox.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        genderBox.setForeground(new java.awt.Color(255, 255, 255));
        genderBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        genderBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderBoxActionPerformed(evt);
            }
        });
        add(genderBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 180, -1));

        diagnosedDateChooser.setBackground(new java.awt.Color(0, 0, 0));
        diagnosedDateChooser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        diagnosedDateChooser.setForeground(new java.awt.Color(255, 255, 255));
        add(diagnosedDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 570, 190, 23));

        Pic.setBackground(new java.awt.Color(0, 0, 0));
        Pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204)));
        Pic.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        add(Pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 80, 120, 120));

        jButton2.setBackground(new java.awt.Color(31, 31, 31));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton2.setText("START NEW FORM");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_new_form(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 650, 230, 40));

        emailValidateMessage.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        emailValidateMessage.setText("Email format incorrect");
        add(emailValidateMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 980, 10));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel1.setText("COVID DETAILS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 390, 180, -1));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jLabel2.setText("BIOGRAPHIC  DETAILS :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 220, -1));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jLabel4.setText("ADDRESS DETAILS:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 110, 220, -1));

        emailSuccessLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tick.gif"))); // NOI18N
        add(emailSuccessLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 200, 30, 30));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 980, 10));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 980, 10));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 1600, 10));
    }// </editor-fold>//GEN-END:initComponents

    //submit all the details filled to the database

    private void submit_button(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_button
        // TODO add your handling code here:
        if (Pic == null) {
            Pic.setBorder(BorderFactory.createLineBorder(Color.RED));
            Pic.setForeground(Color.red);
            Add_Photo_button.setBorder(BorderFactory.createLineBorder(Color.RED));
            Add_Photo_button.setForeground(Color.red);
        }
        if (stateBox.getSelectedItem().equals("")) {
            stateBox.setBorder(BorderFactory.createLineBorder(Color.RED));
            stateBox.setForeground(Color.red);
        }
        if (genderBox.getSelectedItem().equals("")) {
            genderBox.setBorder(BorderFactory.createLineBorder(Color.RED));
            genderBox.setForeground(Color.red);
        }
        if (bloodGroupBox.getSelectedItem().equals("")) {
            bloodGroupBox.setBorder(BorderFactory.createLineBorder(Color.RED));
            bloodGroupBox.setForeground(Color.red);
        }
        if (nameText.getText().isEmpty()) {
            nameText.setBorder(BorderFactory.createLineBorder(Color.RED));
            nameText.setForeground(Color.red);
        }
        if (uidText.getText().isEmpty()) {
            uidText.setBorder(BorderFactory.createLineBorder(Color.RED));
            uidText.setForeground(Color.red);
        }
        if (emailText.getText().isEmpty()) {
            emailText.setBorder(BorderFactory.createLineBorder(Color.RED));
            emailText.setForeground(Color.red);
        }
        if (contactText.getText().isEmpty()) {
            contactText.setBorder(BorderFactory.createLineBorder(Color.RED));
            contactText.setForeground(Color.red);
        }
        if (zipText.getText().isEmpty()) {
            zipText.setBorder(BorderFactory.createLineBorder(Color.RED));
            zipText.setForeground(Color.red);
        }
        if (cityText.getText().isEmpty()) {
            cityText.setBorder(BorderFactory.createLineBorder(Color.RED));
            cityText.setForeground(Color.red);
        }
        if (streetText.getText().isEmpty()) {
            streetText.setBorder(BorderFactory.createLineBorder(Color.RED));
            streetText.setForeground(Color.red);
        }
        if (diagnosedDateChooser.getDate() == null) {
            diagnosedDateChooser.setBorder(BorderFactory.createLineBorder(Color.RED));
            diagnosedDateChooser.setForeground(Color.red);
        }
        if (dobDateField.getDate() == null) {
            dobDateField.setBorder(BorderFactory.createLineBorder(Color.RED));
            dobDateField.setForeground(Color.red);
        }
        if (age.getText().isEmpty()) {
            age.setBorder(BorderFactory.createLineBorder(Color.RED));
            age.setForeground(Color.red);
        }

        //
        // check if the fields are empty
        if (nameText.getText().isEmpty() || emailText.getText().isEmpty() || cityText.getText().isEmpty() || contactText.getText().isEmpty()
                || zipText.getText().isEmpty() || streetText.getText().isEmpty() || uidText.getText().isEmpty()
                || dobDateField.getDate() == null || diagnosedDateChooser.getDate() == null || age.getText().isEmpty()
                || String.valueOf(genderBox.getSelectedItem()).equals("")
                || String.valueOf(bloodGroupBox.getSelectedItem()).equals("")
                || String.valueOf(stateBox.getSelectedItem()).equals("")
                || Pic == null) {

            JOptionPane.showMessageDialog(null, "All fields are mandatory!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (!buttonNo.isSelected() && !buttonYes.isSelected()) {
            JOptionPane.showMessageDialog(null, new JLabel("All fields are mandatory!!!"), "Error", JOptionPane.ERROR_MESSAGE);
            return;

        } else if (!phoneNumberValidator(contactText.getText())) {
            contactText.setBorder(BorderFactory.createLineBorder(Color.RED));
            contactText.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, new JLabel("Contact Number should be of 10 digits!!!"), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (!pinCodeValidator(zipText.getText())) {
            zipText.setBorder(BorderFactory.createLineBorder(Color.RED));
            zipText.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, new JLabel("Zipcode should be of 5 digits!!!"), "Error", JOptionPane.ERROR_MESSAGE);
            return;

        } else if (!isAlpha(nameText.getText())) {
            nameText.setBorder(BorderFactory.createLineBorder(Color.RED));
            nameText.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, new JLabel("Only aplhabets allowed!!!"), "Error", JOptionPane.ERROR_MESSAGE);
            return;

        } else if (!isAlpha(cityText.getText())) {
            cityText.setBorder(BorderFactory.createLineBorder(Color.RED));
            cityText.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, new JLabel("Only aplhabets allowed!!!"), "Error", JOptionPane.ERROR_MESSAGE);
            return;

        } else if (!emailValidator(emailText.getText())) {
            emailText.setBorder(BorderFactory.createLineBorder(Color.RED));
            emailText.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, new JLabel("Incorrect format for the MAIL ID please correct it!!"), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            int n = JOptionPane.showConfirmDialog(null, new JLabel("Procced to submit the form ?"),
                    "CONFIRMATION REQUIRED", JOptionPane.YES_NO_OPTION);

            if (n == 0) {
                Patient_Req pr = system.getPatientRequestDir().addPatientRequest();

                pr.setReceiverID(uidText.getText());
                pr.setName(nameText.getText());
                pr.setDob(dobDateField.getDate());
                pr.setCovidDiagnosedDate(diagnosedDateChooser.getDate());
                pr.setAge(Integer.parseInt(age.getText()));
                pr.setGender((String) genderBox.getSelectedItem());
                pr.setBloodGroup((String) bloodGroupBox.getSelectedItem());
                pr.setStreetAddress(streetText.getText());
                pr.setCity(cityText.getText());
                pr.setState((String) stateBox.getSelectedItem());
                pr.setZipCode(Integer.parseInt(zipText.getText()));
                pr.setContact((contactText.getText()));
                pr.setEmailID(emailText.getText());
                pr.setStatus("New Request");
                pr.setdP(tempdP);

                if (buttonYes.isSelected()) {
                    pr.setLabConfirmation(true);
                } else if (buttonNo.isSelected()) {
                    pr.setLabConfirmation(false);
                }
                JOptionPane.showMessageDialog(null, new JLabel("Thank you for volunterly registering for plasma donation!! We will contact you. Till then stay home stay safe Take Care"));
                dB4OUtil.storeSystem(system);
                disableAllButton();
            }
        }
    }//GEN-LAST:event_submit_button

    public ImageIcon ResizeImage(String ImagePath) {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(Pic.getWidth(), Pic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

    //used to set picture
    private ImageIcon setPicture(String carImageLocation, JLabel carImage) {

        ImageIcon imageCar;
        imageCar = new ImageIcon(carImageLocation);
        Image picCar = imageCar.getImage();
        Image resizedImage = picCar.getScaledInstance(carImage.getWidth(), carImage.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon selectedCarPicture = new ImageIcon(resizedImage);
        return selectedCarPicture;
    }


    private void back_button(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_button
        // TODO add your handling code here:
        JFrame frame = (JFrame) getWindowAncestor(this);
        frame.dispose();
        New_Receiver_JPanel.super.setVisible(false);
    }//GEN-LAST:event_back_button

    private void contactTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactTextActionPerformed

    private void stateBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateBoxActionPerformed

    }//GEN-LAST:event_stateBoxActionPerformed

    private void bloodGroupBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodGroupBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodGroupBoxActionPerformed

    private void genderBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderBoxActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        Date dob = dobDateField.getDate();
        System.out.println(dob.getYear());
        age.setText((String.valueOf(new Date().getYear() - dob.getYear())));
    }//GEN-LAST:event_formMouseClicked

    private void ageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ageMouseClicked
        // TODO add your handling code here:
        Date dob = dobDateField.getDate();
        System.out.println(dob.getYear());
        age.setText((String.valueOf(new Date().getYear() - dob.getYear())));
    }//GEN-LAST:event_ageMouseClicked

    private void add_photo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_photo
        // TODO add your handling code here:
        JFileChooser f = new JFileChooser();
        f.setCurrentDirectory(new File(System.getProperty("user.dir")));
        //filter the files
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg", "gif", "png");
        f.addChoosableFileFilter(filter);
        int result = f.showSaveDialog(null);
        //if the user click on save in Jfilechooser
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = f.getSelectedFile();
            tempdP = new byte[(int) selectedFile.length()];
            FileInputStream fis;
            try {
                fis = new FileInputStream(selectedFile);
                fis.read(tempdP);
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(New_Donor_JPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            Pic.setIcon(ResizeImage(selectedFile.getAbsolutePath()));
            Pic.setIcon(setPicture(selectedFile.getAbsolutePath(), Pic));
        } else if (result == JFileChooser.CANCEL_OPTION) {
            System.out.println("No File Select");
        }


    }//GEN-LAST:event_add_photo

    private void submit_new_form(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_new_form
        // TODO add your handling code here:
        Pic.setIcon(null);
        radioGroup1.clearSelection();
        // buttonYes.setSelected(false);
        // buttonYes.resetKeyboardActions();
        uidText.setEnabled(true);
        nameText.setEnabled(true);
        dobDateField.setEnabled(true);
        age.setEnabled(false);
        emailText.setEnabled(true);
        contactText.setEnabled(true);
        genderBox.setEnabled(true);
        bloodGroupBox.setEnabled(true);
        diagnosedDateChooser.setEnabled(true);
        streetText.setEnabled(true);
        cityText.setEnabled(true);
        stateBox.setEnabled(true);
        zipText.setEnabled(true);
        buttonYes.setEnabled(true);
        buttonNo.setEnabled(true);
        Add_Photo_button.setEnabled(true);
        uidText.setText("");
        nameText.setText("");
        age.setText("");
        emailText.setText("");
        contactText.setText("");
        streetText.setText("");
        cityText.setText("");
        zipText.setText("");
        genderBox.setSelectedItem("");
        bloodGroupBox.setSelectedItem("");
        stateBox.setSelectedItem("");
        dobDateField.setCalendar(null);
        diagnosedDateChooser.setCalendar(null);     
        Pic.removeAll();
    }//GEN-LAST:event_submit_new_form

    private void uEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uEmailKeyTyped
        // TODO add your handling code here:
        if (!emailValidator(emailText.getText())) {
            emailValidateMessage.setVisible(true);
            valid_email = false;
        } else {
            emailText.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            emailText.setForeground(Color.WHITE);
            emailValidateMessage.setVisible(false);
            emailSuccessLabel.setVisible(true);
            valid_email = true;
            int delay = 2500; //milliseconds
            ActionListener taskPerformer = new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    emailSuccessLabel.setVisible(false);
                }
            };
            javax.swing.Timer tick = new javax.swing.Timer(delay, taskPerformer);
            tick.setRepeats(false);
            tick.start();
        }
    }//GEN-LAST:event_uEmailKeyTyped
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Photo_button;
    private javax.swing.JLabel Pic;
    private javax.swing.JTextField age;
    private javax.swing.JComboBox bloodGroupBox;
    private javax.swing.JRadioButton buttonNo;
    private javax.swing.JRadioButton buttonYes;
    private javax.swing.JTextField cityText;
    private javax.swing.JTextField contactText;
    private com.toedter.calendar.JDateChooser diagnosedDateChooser;
    private com.toedter.calendar.JDateChooser dobDateField;
    private javax.swing.JLabel emailSuccessLabel;
    private javax.swing.JTextField emailText;
    private javax.swing.JLabel emailValidateMessage;
    private javax.swing.JComboBox genderBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField nameText;
    private javax.swing.JComboBox stateBox;
    private javax.swing.JTextField streetText;
    private javax.swing.JTextField uidText;
    private javax.swing.JTextField zipText;
    // End of variables declaration//GEN-END:variables
}
