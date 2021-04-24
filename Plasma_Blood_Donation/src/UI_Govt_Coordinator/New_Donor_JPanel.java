/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_Govt_Coordinator;

import Plasma_DB4OUtil.DB4OUtil;
import Plasma.EcoSystem;
import Plasma_People.Donor_Req;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import javax.swing.JOptionPane;
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
import static javax.swing.SwingUtilities.getWindowAncestor;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author RST
 */
public class New_Donor_JPanel extends javax.swing.JPanel {

    //Creates new form New_Donor
    private Boolean emailValid;
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private byte[] tempdP;
    private ButtonGroup radioGroup1;
    private ButtonGroup radioGroup2;
    private ButtonGroup radioGroup3;
    private ButtonGroup radioGroup4;
    public New_Donor_JPanel(EcoSystem system) {
        initComponents();
        this.system = system;
        this.radioGroup1 = new ButtonGroup();
        this.radioGroup2 = new ButtonGroup();
        this.radioGroup3 = new ButtonGroup();
        this.radioGroup4 = new ButtonGroup();

        curedDateValidateMessage.setVisible(false);
        emailSuccess.setVisible(false);
        emailValidateMessage.setVisible(false);

        radioGroup1.add(buttonYesGroup1);
        radioGroup1.add(buttonNoGroup1);

        radioGroup2.add(buttonYesGroup2);
        radioGroup2.add(buttonNoGroup2);

        radioGroup3.add(buttonYesGroup3);
        radioGroup3.add(buttonNoGroup3);

        radioGroup4.add(buttonYesGroup4);
        radioGroup4.add(buttonNoGroup4);

        viewBloodGroupBox();
        viewGenderBox();
        viewStateBox();

    }

    private void viewBloodGroupBox() {

        bloodGroupBox.addItem("O+");
        bloodGroupBox.addItem("AB+");
        bloodGroupBox.addItem("O-");
        bloodGroupBox.addItem("AB-");
        bloodGroupBox.addItem("A+");
        bloodGroupBox.addItem("B+");
        bloodGroupBox.addItem("A-");
        bloodGroupBox.addItem("B-");

    }

    private void viewGenderBox() {
        genderBox.addItem("Male");
        genderBox.addItem("Female");
        genderBox.addItem("Other");
    }
    //validate if the pincaode is 5 digits or not

    public static boolean pinCodeValidator(String pincode) {
        Pattern p;
        Matcher m;
        String zip_pattern = "^[0-9]{5}$";
        p = Pattern.compile(zip_pattern);
        m = p.matcher(pincode);
        return m.matches();
    }

    private void viewStateBox() {
        stateBox.addItem("Arizona");
        stateBox.addItem("California");
        stateBox.addItem("Florida");
        stateBox.addItem("Georgia");
        stateBox.addItem("Illinois");
        stateBox.addItem("Massachusetts");
        stateBox.addItem("Texas");
    }

    //function to validate mobile number if it is 10 digits or not
    public static boolean phoneNumberValidator(String contact) {
        Pattern p;
        Matcher m;
        String PHONE_PATTERN = "^[0-9]{10}$";
        p = Pattern.compile(PHONE_PATTERN);
        m = p.matcher(contact);
        return m.matches();
    }

    //validate email id
    public static boolean emailValidator(String email) {
        Pattern pattern;
        Matcher matcher;
        String EMAIL_PATTERN = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }

    //check if the name contains only alphabets
    public boolean isAlpha(String name) {
        return name.matches("[a-zA-Z]+");
    }

    private void disableAllButton() {

        uidText.setEnabled(false);
        nameText.setEnabled(false);
        dobDateField.setEnabled(false);
        ageText.setEnabled(false);
        emailText.setEnabled(false);
        contactText.setEnabled(false);
        genderBox.setEnabled(false);
        bloodGroupBox.setEnabled(false);
        diagnosedDateField.setEnabled(false);
        curedDateField.setEnabled(false);
        lastDonationDateField.setEnabled(false);
        streetText.setEnabled(false);
        cityText.setEnabled(false);
        stateBox.setEnabled(false);
        zipText.setEnabled(false);
        buttonYesGroup1.setEnabled(false);
        buttonNoGroup1.setEnabled(false);
        buttonYesGroup2.setEnabled(false);
        buttonNoGroup2.setEnabled(false);
        buttonYesGroup3.setEnabled(false);
        buttonNoGroup3.setEnabled(false);
        buttonYesGroup4.setEnabled(false);
        buttonNoGroup4.setEnabled(false);
        addPhoto.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        uidText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ageText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        streetText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cityText = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        zipText = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        contactText = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        addPhoto = new javax.swing.JButton();
        buttonYesGroup2 = new javax.swing.JRadioButton();
        buttonNoGroup2 = new javax.swing.JRadioButton();
        buttonNoGroup1 = new javax.swing.JRadioButton();
        buttonYesGroup1 = new javax.swing.JRadioButton();
        buttonNoGroup3 = new javax.swing.JRadioButton();
        buttonYesGroup3 = new javax.swing.JRadioButton();
        buttonNoGroup4 = new javax.swing.JRadioButton();
        buttonYesGroup4 = new javax.swing.JRadioButton();
        lblProfilePicture = new javax.swing.JLabel();
        lastDonationDateField = new com.toedter.calendar.JDateChooser();
        lblBack = new javax.swing.JLabel();
        curedDateField = new com.toedter.calendar.JDateChooser();
        dobDateField = new com.toedter.calendar.JDateChooser();
        diagnosedDateField = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        stateBox = new javax.swing.JComboBox();
        bloodGroupBox = new javax.swing.JComboBox();
        genderBox = new javax.swing.JComboBox();
        curedDateValidateMessage = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        emailValidateMessage = new javax.swing.JLabel();
        emailSuccess = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 204, 204));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setText("NAME:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        nameText.setBackground(new java.awt.Color(0, 0, 0));
        nameText.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        nameText.setForeground(new java.awt.Color(255, 255, 255));
        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });
        add(nameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 180, -1));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(676, 218, -1, -1));

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel5.setText("UID:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, -1, -1));

        uidText.setBackground(new java.awt.Color(0, 0, 0));
        uidText.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        uidText.setForeground(new java.awt.Color(255, 255, 255));
        add(uidText, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 180, -1));

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel6.setText("DOB:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel7.setText("AGE:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, -1, -1));

        ageText.setBackground(new java.awt.Color(0, 0, 0));
        ageText.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        ageText.setForeground(new java.awt.Color(255, 255, 255));
        ageText.setEnabled(false);
        ageText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ageTextMouseClicked(evt);
            }
        });
        ageText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ageTextKeyPressed(evt);
            }
        });
        add(ageText, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 180, -1));

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel8.setText("GENDER:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel9.setText("BLOOD GROUP:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, -1, 20));

        streetText.setBackground(new java.awt.Color(0, 0, 0));
        streetText.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        streetText.setForeground(new java.awt.Color(255, 255, 255));
        add(streetText, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 580, 180, 30));

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel10.setText("COVID DETECTED DATE:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 550, -1, -1));

        jLabel11.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel11.setText("COVID CURED DATE");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 590, -1, -1));

        jLabel12.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel12.setText("STREET ADDRESS:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 580, -1, -1));

        jLabel13.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel13.setText("CITY:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 620, -1, -1));

        cityText.setBackground(new java.awt.Color(0, 0, 0));
        cityText.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        cityText.setForeground(new java.awt.Color(255, 255, 255));
        add(cityText, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 620, 180, 30));

        jLabel14.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel14.setText("STATE:");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 670, -1, -1));

        jLabel15.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel15.setText("ZIPCODE:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 730, -1, 20));

        zipText.setBackground(new java.awt.Color(0, 0, 0));
        zipText.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        zipText.setForeground(new java.awt.Color(255, 255, 255));
        add(zipText, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 720, 180, 30));

        jLabel16.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel16.setText("CONTACT NUMBER:");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, -1, -1));

        contactText.setBackground(new java.awt.Color(0, 0, 0));
        contactText.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        contactText.setForeground(new java.awt.Color(255, 255, 255));
        add(contactText, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 180, -1));

        jLabel17.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel17.setText("EMAIL ID:");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, -1, -1));

        emailText.setBackground(new java.awt.Color(0, 0, 0));
        emailText.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        emailText.setForeground(new java.awt.Color(255, 255, 255));
        emailText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailTextMouseClicked(evt);
            }
        });
        emailText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uEmailKeyTyped(evt);
            }
        });
        add(emailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 180, -1));

        jLabel18.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel18.setText("If donated ,Date of last donation of Plasma");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 630, -1, -1));

        jLabel19.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel19.setText("WAS COVID 19 CONFIRMED IN LAB?");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 170, -1, -1));

        jLabel20.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel20.setText("DO YOU HAVE ANY SYMPTYOMS?");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 250, -1, -1));

        jLabel21.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel21.setText("HAVE YOU COMPLETED 14 DAYS FROM THE LAST SYMPTOMS DAY?");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 340, 720, -1));

        jLabel22.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel22.setText("DO YOU HAVE YOUR UPDATED COVID REPORT");
        add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 410, 600, 50));

        btnSubmit.setBackground(new java.awt.Color(31, 31, 31));
        btnSubmit.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_button(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 740, 110, 40));

        addPhoto.setBackground(new java.awt.Color(31, 31, 31));
        addPhoto.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        addPhoto.setText("Add photo");
        addPhoto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_photo(evt);
            }
        });
        add(addPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 120, 40));

        buttonYesGroup2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonYesGroup2.setText("YES");
        buttonYesGroup2.setOpaque(false);
        add(buttonYesGroup2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 280, -1, -1));

        buttonNoGroup2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonNoGroup2.setText("NO");
        buttonNoGroup2.setOpaque(false);
        add(buttonNoGroup2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 280, -1, -1));

        buttonNoGroup1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonNoGroup1.setText("NO");
        buttonNoGroup1.setOpaque(false);
        buttonNoGroup1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNoGroup1ActionPerformed(evt);
            }
        });
        add(buttonNoGroup1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 200, -1, -1));

        buttonYesGroup1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonYesGroup1.setText("YES");
        buttonYesGroup1.setOpaque(false);
        add(buttonYesGroup1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 200, -1, -1));

        buttonNoGroup3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonNoGroup3.setText("NO");
        buttonNoGroup3.setOpaque(false);
        add(buttonNoGroup3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 370, -1, -1));

        buttonYesGroup3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonYesGroup3.setText("YES");
        buttonYesGroup3.setOpaque(false);
        add(buttonYesGroup3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 370, -1, -1));

        buttonNoGroup4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonNoGroup4.setText("NO");
        buttonNoGroup4.setOpaque(false);
        add(buttonNoGroup4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 460, -1, -1));

        buttonYesGroup4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonYesGroup4.setText("YES");
        buttonYesGroup4.setOpaque(false);
        add(buttonYesGroup4, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 460, -1, -1));

        lblProfilePicture.setBackground(new java.awt.Color(0, 0, 0));
        lblProfilePicture.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204)));
        add(lblProfilePicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, 130));

        lastDonationDateField.setBackground(new java.awt.Color(0, 0, 0));
        lastDonationDateField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lastDonationDateField.setForeground(new java.awt.Color(255, 255, 255));
        add(lastDonationDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 630, 200, -1));

        lblBack.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblBack.setForeground(new java.awt.Color(255, 255, 255));
        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        lblBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 760, -1, 54));

        curedDateField.setBackground(new java.awt.Color(0, 0, 0));
        curedDateField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        curedDateField.setForeground(new java.awt.Color(255, 255, 255));
        curedDateField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                UCovidCuredDateKeyTyped(evt);
            }
        });
        add(curedDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 590, 210, -1));

        dobDateField.setBackground(new java.awt.Color(0, 0, 0));
        dobDateField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dobDateField.setForeground(new java.awt.Color(255, 255, 255));
        dobDateField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dobDateFieldFocusLost(evt);
            }
        });
        dobDateField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dobDateFieldMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dobDateFieldMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                agePop(evt);
            }
        });
        dobDateField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uDobKeyTyped(evt);
            }
        });
        add(dobDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 170, -1));

        diagnosedDateField.setBackground(new java.awt.Color(0, 0, 0));
        diagnosedDateField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        diagnosedDateField.setForeground(new java.awt.Color(255, 255, 255));
        add(diagnosedDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 550, 210, -1));

        jButton2.setBackground(new java.awt.Color(31, 31, 31));
        jButton2.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jButton2.setText("New Form");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_form(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 740, 120, 40));

        stateBox.setBackground(new java.awt.Color(0, 0, 0));
        stateBox.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        stateBox.setForeground(new java.awt.Color(255, 255, 255));
        stateBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        stateBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateBoxActionPerformed(evt);
            }
        });
        add(stateBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 660, 180, 40));

        bloodGroupBox.setBackground(new java.awt.Color(0, 0, 0));
        bloodGroupBox.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        bloodGroupBox.setForeground(new java.awt.Color(255, 255, 255));
        bloodGroupBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bloodGroupBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodGroupBoxActionPerformed(evt);
            }
        });
        add(bloodGroupBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 520, 180, -1));

        genderBox.setBackground(new java.awt.Color(0, 0, 0));
        genderBox.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        genderBox.setForeground(new java.awt.Color(255, 255, 255));
        genderBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        genderBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderBoxActionPerformed(evt);
            }
        });
        add(genderBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 170, -1));

        curedDateValidateMessage.setBackground(new java.awt.Color(0, 0, 0));
        curedDateValidateMessage.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        curedDateValidateMessage.setText("Cured Date is before the Diagnosed Date!");
        add(curedDateValidateMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 530, -1, -1));

        jPanel3.setBackground(new java.awt.Color(31, 31, 31));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));

        jLabel25.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText(" RESGISTRATION FORM  FOR  DONOR");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 1666, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1690, -1));

        emailValidateMessage.setBackground(new java.awt.Color(0, 0, 0));
        emailValidateMessage.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        emailValidateMessage.setText("Email format incorrect!");
        add(emailValidateMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        emailSuccess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tick.gif"))); // NOI18N
        add(emailSuccess, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 30, 30));

        jLabel2.setFont(new java.awt.Font("Cambria Math", 1, 20)); // NOI18N
        jLabel2.setText("BIOGRAPHIC DETAILS");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 20, 610));

        jLabel24.setFont(new java.awt.Font("Cambria Math", 1, 20)); // NOI18N
        jLabel24.setText("COVID DETAILS");
        add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 100, -1, -1));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 370, 20, 360));
    }// </editor-fold>//GEN-END:initComponents

    private void submit_button(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_button
        // TODO add your handling code here:
        Date currentDate = new Date();
        if (lblProfilePicture == null) {
            lblProfilePicture.setBorder(BorderFactory.createLineBorder(Color.RED));
            lblProfilePicture.setForeground(Color.red);
            addPhoto.setBorder(BorderFactory.createLineBorder(Color.RED));
            addPhoto.setForeground(Color.red);
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
        if (diagnosedDateField.getDate() == null) {
            diagnosedDateField.setBorder(BorderFactory.createLineBorder(Color.RED));
            diagnosedDateField.setForeground(Color.red);
        }
        if (curedDateField.getDate() == null) {
            curedDateField.setBorder(BorderFactory.createLineBorder(Color.RED));
            curedDateField.setForeground(Color.red);
        }
        if (lastDonationDateField.getDate() == null) {
            lastDonationDateField.setBorder(BorderFactory.createLineBorder(Color.RED));
            lastDonationDateField.setForeground(Color.red);
        }
        if (dobDateField.getDate() == null) {
            dobDateField.setBorder(BorderFactory.createLineBorder(Color.RED));
            dobDateField.setForeground(Color.red);
        }
        if (ageText.getText().isEmpty()) {
            ageText.setBorder(BorderFactory.createLineBorder(Color.RED));
            ageText.setForeground(Color.red);
        }
        //check if all fields are filled

        if (nameText.getText().isEmpty() || emailText.getText().isEmpty() || cityText.getText().isEmpty()
                || contactText.getText().isEmpty() || zipText.getText().isEmpty() || streetText.getText().isEmpty()
                || uidText.getText().isEmpty() || curedDateField.getDate() == null || diagnosedDateField.getDate() == null
                || dobDateField.getDate() == null || lastDonationDateField.getDate() == null
                || ageText.getText().isEmpty()
                || String.valueOf(genderBox.getSelectedItem()).equals("")
                || String.valueOf(bloodGroupBox.getSelectedItem()).equals("")
                || String.valueOf(stateBox.getSelectedItem()).equals("")) {
            JOptionPane.showMessageDialog(null, new JLabel("All fields are mandatory"), "Error", JOptionPane.ERROR_MESSAGE);
        } //check if all the buttons are selected
        else if (!buttonNoGroup1.isSelected() && !buttonYesGroup1.isSelected()
                || !buttonNoGroup2.isSelected() && !buttonYesGroup2.isSelected()
                || !buttonNoGroup3.isSelected() && !buttonYesGroup3.isSelected()
                || !buttonNoGroup4.isSelected() && !buttonYesGroup4.isSelected()) {
            JOptionPane.showMessageDialog(null, new JLabel("All fields are mandatory "), "Error", JOptionPane.ERROR_MESSAGE);

        } else if (!isAlpha(nameText.getText())) {
            nameText.setBorder(BorderFactory.createLineBorder(Color.RED));
            nameText.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, new JLabel("Name must only  contain alphabets!!!!"), "Error", JOptionPane.ERROR_MESSAGE);

        } else if (!isAlpha(cityText.getText())) {
            cityText.setBorder(BorderFactory.createLineBorder(Color.RED));
            cityText.setForeground(Color.red);

            JOptionPane.showMessageDialog(null, "City name must contain only alphabets.", "Error", JOptionPane.ERROR_MESSAGE);

        } else if (!phoneNumberValidator(contactText.getText())) {
            //JOptionPane.showMessageDialog(null, "Contact number should be 10 digit and Zip should be 5 digit" , "Error", JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, new JLabel("Contact number should be of 10 digits"), "Error", JOptionPane.ERROR_MESSAGE);
            // return;
        } else if (!pinCodeValidator(zipText.getText())) {
            //JOptionPane.showMessageDialog(null, "Contact number should be 10 digit and Zip should be 5 digit" , "Error", JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, new JLabel("Zipcode should be of 5 digits"), "Error", JOptionPane.ERROR_MESSAGE);

        } else if (!emailValidator(emailText.getText())) {
            //JOptionPane.showMessageDialog(null, "Email ID must be in correct format!" , "Error", JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, new JLabel("Email ID should be in correct format"), "Error", JOptionPane.ERROR_MESSAGE);

        } else if (currentDate.equals(lastDonationDateField.getDate()) || lastDonationDateField.getDate().after(currentDate)) {
            //JOptionPane.showMessageDialog(null, "Date should be past date", "Error", JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, new JLabel("<html><h2><font color='red'><I>Date</I></font> should be<font color='green'> past date</font>!</h2></html>"), "Error", JOptionPane.ERROR_MESSAGE);

        } else if (diagnosedDateField.getDate().compareTo(curedDateField.getDate()) > 0) {
            //JOptionPane.showMessageDialog(null, "Cured Date should be ahead of Diagnosed Date", "Error", JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, new JLabel("<html><h2><font color='red'><I>Cured Date</I></font> should be ahead of<font color='red'><I> Diagnosed Date</I></font>!</h2></html>"), "Error", JOptionPane.ERROR_MESSAGE);

        } else {

            int n = JOptionPane.showConfirmDialog(null, new JLabel("Would you like to submit the form?"),
                    "CONFIRMATION REQUIRED", JOptionPane.YES_NO_OPTION);

            if (n == 0) {

                Donor_Req r = system.getDonorRequestDir().addDonor_Req();
                r.setDonor_ID(uidText.getText());
                r.setName(nameText.getText());
                r.setDateOfBirth(dobDateField.getDate());
                r.setCOVID_Infected_Date(diagnosedDateField.getDate());
                r.setCOVID_Cured_Date(curedDateField.getDate());
                r.setPrevious_Donation_Date(lastDonationDateField.getDate());
                r.setAge(Integer.parseInt(ageText.getText()));
                r.setGender((String) genderBox.getSelectedItem());
                r.setBlood_Group((String) bloodGroupBox.getSelectedItem());
                r.setAddress(streetText.getText());
                r.setCity(cityText.getText());
                r.setState((String) stateBox.getSelectedItem());
                r.setZipCode(Integer.parseInt(zipText.getText()));
                r.setContact(contactText.getText());
                r.setEmailID(emailText.getText());
                r.setStatus("New Request");
                r.setdP(tempdP);

                if (buttonYesGroup1.isSelected()) {
                    r.setLab_Confirmation(true);
                } else if (buttonNoGroup1.isSelected()) {
                    r.setLab_Confirmation(false);
                }

                if (buttonYesGroup2.isSelected()) {
                    r.setSymptoms(true);
                } else if (buttonNoGroup2.isSelected()) {
                    r.setSymptoms(false);
                }

                if (buttonYesGroup3.isSelected()) {
                    r.setLast_Day_Symptoms(true);
                } else if (buttonNoGroup3.isSelected()) {
                    r.setLast_Day_Symptoms(false);
                }

                if (buttonYesGroup4.isSelected()) {
                    r.setFollowUpTest(true);
                } else if (buttonNoGroup4.isSelected()) {
                    r.setFollowUpTest(false);
                }
                JOptionPane.showMessageDialog(null, new JLabel("Thank you for registering for the help"));
                dB4OUtil.storeSystem(system);
                disableAllButton();
            }
        }
    }//GEN-LAST:event_submit_button

    private void add_photo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_photo
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.dir")));
        //filter the files
        FileNameExtensionFilter f = new FileNameExtensionFilter("*.Images", "jpg", "gif", "png");
        file.addChoosableFileFilter(f);
        int res = file.showSaveDialog(null);
        if (res == JFileChooser.APPROVE_OPTION) {
            File selected = file.getSelectedFile();
            tempdP = new byte[(int) selected.length()];
            FileInputStream fis;
            try {
                fis = new FileInputStream(selected);
                fis.read(tempdP);
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(New_Donor_JPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            lblProfilePicture.setIcon(ResizeImage(selected.getAbsolutePath()));
            lblProfilePicture.setIcon(setPicture(selected.getAbsolutePath(), lblProfilePicture));
        } else if (res == JFileChooser.CANCEL_OPTION) {
        }
    }//GEN-LAST:event_add_photo

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        // TODO add your handling code here:
        JFrame frame = (JFrame) getWindowAncestor(this);
        frame.dispose();
        New_Donor_JPanel.super.setVisible(false);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_lblBackMouseClicked

    private void new_form(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_form
        // TODO add your handling code here:
        lblProfilePicture.setIcon(null);
        radioGroup1.clearSelection();
        radioGroup2.clearSelection();
        radioGroup3.clearSelection();
        radioGroup4.clearSelection();
        uidText.setEnabled(true);
        nameText.setEnabled(true);
        dobDateField.setEnabled(true);
        ageText.setEnabled(false);
        emailText.setEnabled(true);
        contactText.setEnabled(true);
        genderBox.setEnabled(true);
        bloodGroupBox.setEnabled(true);
        diagnosedDateField.setEnabled(true);
        curedDateField.setEnabled(true);
        lastDonationDateField.setEnabled(true);
        streetText.setEnabled(true);
        cityText.setEnabled(true);
        stateBox.setEnabled(true);
        zipText.setEnabled(true);
        buttonYesGroup1.setEnabled(true);
        buttonNoGroup1.setEnabled(true);
        buttonYesGroup2.setEnabled(true);
        buttonNoGroup2.setEnabled(true);
        buttonYesGroup3.setEnabled(true);
        buttonNoGroup3.setEnabled(true);
        buttonYesGroup4.setEnabled(true);
        buttonNoGroup4.setEnabled(true);
        addPhoto.setEnabled(true);

        uidText.setText("");
        nameText.setText("");
        ageText.setText("");
        emailText.setText("");
        contactText.setText("");
        streetText.setText("");
        cityText.setText("");
        zipText.setText("");

        genderBox.setSelectedItem("");
        bloodGroupBox.setSelectedItem("");
        stateBox.setSelectedItem("");

        dobDateField.setCalendar(null);
        diagnosedDateField.setCalendar(null);
        curedDateField.setCalendar(null);
        lastDonationDateField.setCalendar(null);

        buttonYesGroup1.setSelected(false);
        buttonNoGroup1.setSelected(false);
        buttonYesGroup2.setSelected(false);
        buttonNoGroup2.setSelected(false);
        buttonYesGroup3.setSelected(false);
        buttonNoGroup3.setSelected(false);
        buttonYesGroup4.setSelected(false);
        buttonNoGroup4.setSelected(false);
        lblProfilePicture.removeAll();
    }//GEN-LAST:event_new_form

    private void stateBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateBoxActionPerformed


    }//GEN-LAST:event_stateBoxActionPerformed

    private void bloodGroupBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodGroupBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodGroupBoxActionPerformed

    private void genderBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderBoxActionPerformed

    private void uEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uEmailKeyTyped
        // TODO add your handling code here:
        if (!emailValidator(emailText.getText())) {
            emailValidateMessage.setVisible(true);
            emailValid = false;
        } else {
            emailText.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            emailText.setForeground(Color.WHITE);
            emailValidateMessage.setVisible(false);
            emailSuccess.setVisible(true);
            emailValid = true;
            int delay = 2500; //milliseconds
            ActionListener taskPerformer = new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    emailSuccess.setVisible(false);
                }
            };
            javax.swing.Timer tick = new javax.swing.Timer(delay, taskPerformer);
            tick.setRepeats(false);
            tick.start();
        }


    }//GEN-LAST:event_uEmailKeyTyped

    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextActionPerformed

    private void uDobKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uDobKeyTyped
        
    }//GEN-LAST:event_uDobKeyTyped

    private void ageTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageTextKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTextKeyPressed

    private void ageTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ageTextMouseClicked
        // TODO add your handling code here:
        Date dob = dobDateField.getDate();
        ageText.setText((String.valueOf(new Date().getYear() - dob.getYear())));    
    }//GEN-LAST:event_ageTextMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        Date dob = dobDateField.getDate();
        ageText.setText((String.valueOf(new Date().getYear() - dob.getYear())));
    }//GEN-LAST:event_formMouseClicked

    private void dobDateFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dobDateFieldMouseExited
        
    }//GEN-LAST:event_dobDateFieldMouseExited

    public ImageIcon ResizeImage(String ImagePath) {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(lblProfilePicture.getWidth(), lblProfilePicture.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

    private ImageIcon setPicture(String carImageLocation, JLabel carImage) {

        ImageIcon imageCar;
        imageCar = new ImageIcon(carImageLocation);
        Image picCar = imageCar.getImage();
        Image resizedImage = picCar.getScaledInstance(carImage.getWidth(), carImage.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon selectedCarPicture = new ImageIcon(resizedImage);

        return selectedCarPicture;
    }

    private void dobDateFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dobDateFieldMousePressed

    }//GEN-LAST:event_dobDateFieldMousePressed


    private void dobDateFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dobDateFieldFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_dobDateFieldFocusLost

    private void UCovidCuredDateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UCovidCuredDateKeyTyped
        // TODO add your handling code here:
        if (diagnosedDateField.getDate().compareTo(curedDateField.getDate()) > 0) {
             curedDateValidateMessage.setVisible(true);
        }


    }//GEN-LAST:event_UCovidCuredDateKeyTyped

    private void agePop(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agePop
        // TODO add your handling code here:
        Date dob = dobDateField.getDate();
        System.out.println(dob.getYear());
        ageText.setText((String.valueOf(new Date().getYear() - dob.getYear())));

    }//GEN-LAST:event_agePop

    private void emailTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailTextMouseClicked
        // TODO add your handling code here:

        Date dob = dobDateField.getDate();
        ageText.setText((String.valueOf(new Date().getYear() - dob.getYear())));
    }//GEN-LAST:event_emailTextMouseClicked

    private void buttonNoGroup1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNoGroup1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonNoGroup1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPhoto;
    private javax.swing.JTextField ageText;
    private javax.swing.JComboBox bloodGroupBox;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JRadioButton buttonNoGroup1;
    private javax.swing.JRadioButton buttonNoGroup2;
    private javax.swing.JRadioButton buttonNoGroup3;
    private javax.swing.JRadioButton buttonNoGroup4;
    private javax.swing.JRadioButton buttonYesGroup1;
    private javax.swing.JRadioButton buttonYesGroup2;
    private javax.swing.JRadioButton buttonYesGroup3;
    private javax.swing.JRadioButton buttonYesGroup4;
    private javax.swing.JTextField cityText;
    private javax.swing.JTextField contactText;
    private com.toedter.calendar.JDateChooser curedDateField;
    private javax.swing.JLabel curedDateValidateMessage;
    private com.toedter.calendar.JDateChooser diagnosedDateField;
    private com.toedter.calendar.JDateChooser dobDateField;
    private javax.swing.JLabel emailSuccess;
    private javax.swing.JTextField emailText;
    private javax.swing.JLabel emailValidateMessage;
    private javax.swing.JComboBox genderBox;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private com.toedter.calendar.JDateChooser lastDonationDateField;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblProfilePicture;
    private javax.swing.JTextField nameText;
    private javax.swing.JComboBox stateBox;
    private javax.swing.JTextField streetText;
    private javax.swing.JTextField uidText;
    private javax.swing.JTextField zipText;
    // End of variables declaration//GEN-END:variables
}
