/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_Govt_Coordinator;
import Plasma_DB4OUtil.DB4OUtil;
import Plasma.EcoSystem;
import Plasma_People.Donor;
import HomePages.TableFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.SheetsScopes;
import com.google.api.services.sheets.v4.model.ValueRange;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.List;
import javax.swing.JLabel;

/**
 *
 * @author RST
 */
public class Create_Donor_JPanel extends javax.swing.JPanel {

    //Creates new form Donor List
    
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private static final String APPLICATION_NAME = "Google Sheets API Java Quickstart";
    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
    private static final String TOKENS_DIRECTORY_PATH = "tokens";

    /**
     * Global instance of the scopes required by this quickstart. If modifying
     * these scopes, delete your previously saved tokens/ folder.
     */
    private static final List<String> SCOPES = Collections.singletonList(SheetsScopes.SPREADSHEETS_READONLY);
    private static final String CREDENTIALS_FILE_PATH = "/credentials.json";

    /**
     * Creates an authorized Credential object.
     *
     * @param HTTP_TRANSPORT The network HTTP Transport.
     * @return An authorized Credential object.
     * @throws IOException If the credentials.json file cannot be found.
     */
    private static Credential getCredentials(final NetHttpTransport HTTP_TRANSPORT) throws IOException {
        // Load client secrets.
        //InputStream in = Google.class.getResourceAsStream(CREDENTIALS_FILE_PATH);
        // InputStream in =  new FileInputStream("C:\\Users\\adwai\\Documents\\NetBeansProjects\\google\\credentials.json");
        InputStream in = new FileInputStream("credentials.json");
        if (in == null) {
            throw new FileNotFoundException("Resource not found: " + CREDENTIALS_FILE_PATH);
        }
        GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));

        // Build flow and trigger user authorization request.
        GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(
                HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, SCOPES)
                .setDataStoreFactory(new FileDataStoreFactory(new java.io.File(TOKENS_DIRECTORY_PATH)))
                .setAccessType("offline")
                .build();
        LocalServerReceiver receiver = new LocalServerReceiver.Builder().setPort(8888).build();
        return new AuthorizationCodeInstalledApp(flow, receiver).authorize("user");

    }

    public Create_Donor_JPanel(EcoSystem system) throws GeneralSecurityException, IOException {
        initComponents();
        this.system = system;

        tblGoogleSheet.getTableHeader().setDefaultRenderer(new TableFormat());
        donorTable.getTableHeader().setDefaultRenderer(new TableFormat());
        populateTable();
        populateGoogleSheetTable();

    }

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) donorTable.getModel();

        dtm.setRowCount(0);

        for (Donor donor : system.getDonorDir().getDonor_List()) {
            Object row[] = new Object[2];
            row[0] = donor;
            row[1] = donor.getName();

            dtm.addRow(row);
        }
    }

    private void populateGoogleSheetTable() throws GeneralSecurityException, IOException {
        final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
        final String spreadsheetId = "1YulpIxHOwFfDMM57n7hbxZueFSsw-q414bD5tzNMUv0";
        final String range = "Form Responses 2!A2:S";
        Sheets service = new Sheets.Builder(HTTP_TRANSPORT, JSON_FACTORY, getCredentials(HTTP_TRANSPORT))
                .setApplicationName(APPLICATION_NAME)
                .build();
        ValueRange response = service.spreadsheets().values()
                .get(spreadsheetId, range)
                .execute();
        List<List<Object>> values = response.getValues();
        if (values == null || values.isEmpty()) {
            System.out.println("No data found.");
        } else {

            DefaultTableModel dtm = (DefaultTableModel) tblGoogleSheet.getModel();

            dtm.setRowCount(0);

            for (List row : values) {
                // Print columns A and E, which correspond to indices 0 and 4.
                //  System.out.printf("%s, %s\n", row.get(0), row.get(4));
                //    System.out.printf("%s, %s\n", row.get(0), row.get(1));
                System.out.println(row.get(1));
                System.out.println(row.get(3));
                Object row1[] = new Object[4];

                row1[1] = row.get(1);
                row1[2] = row.get(2);
                row1[0] = row.get(3);
                row1[3] = row.get(7);
                dtm.addRow(row1);
            }
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
        tblGoogleSheet = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        contactTextField = new javax.swing.JTextField();
        buttonCreate = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        donorTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        uidTextField = new javax.swing.JTextField();
        bloodGroupTextField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblGoogleSheet.setBackground(new java.awt.Color(102, 0, 102));
        tblGoogleSheet.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tblGoogleSheet.setForeground(new java.awt.Color(255, 255, 255));
        tblGoogleSheet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UID", "NAME", "CONTACT", "BLOOD GROUP"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblGoogleSheet.setFocusable(false);
        tblGoogleSheet.setGridColor(new java.awt.Color(0, 0, 0));
        tblGoogleSheet.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblGoogleSheet.setRowHeight(30);
        tblGoogleSheet.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tblGoogleSheet);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 1200, 180));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LIST OF DONORS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 760, -1));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setText("NAME:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, 70, 30));

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setText("CONTACT NUMBER:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, -1, 40));

        nameTextField.setBackground(new java.awt.Color(0, 0, 0));
        nameTextField.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        nameTextField.setForeground(new java.awt.Color(255, 255, 255));
        nameTextField.setEnabled(false);
        add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 360, 212, -1));

        contactTextField.setBackground(new java.awt.Color(0, 0, 0));
        contactTextField.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        contactTextField.setForeground(new java.awt.Color(255, 255, 255));
        contactTextField.setEnabled(false);
        add(contactTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 400, 212, 30));

        buttonCreate.setBackground(new java.awt.Color(31, 31, 31));
        buttonCreate.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        buttonCreate.setText("PROCEED TO CREATE DONOR");
        buttonCreate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonCreate.setEnabled(false);
        buttonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceed_button(evt);
            }
        });
        add(buttonCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 530, 360, 40));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel4.setText(" DONOR PROFILE CREATION");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, -1, -1));

        donorTable.setBackground(new java.awt.Color(102, 0, 102));
        donorTable.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        donorTable.setForeground(new java.awt.Color(255, 255, 255));
        donorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UID", "NAME"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        donorTable.setGridColor(new java.awt.Color(0, 0, 0));
        donorTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        donorTable.setRowHeight(30);
        donorTable.setShowVerticalLines(false);
        jScrollPane2.setViewportView(donorTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 620, 1180, 200));

        jPanel3.setBackground(new java.awt.Color(31, 31, 31));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));

        jLabel25.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("DONOR PROFILE");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 1576, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, -1));

        jButton2.setBackground(new java.awt.Color(31, 31, 31));
        jButton2.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jButton2.setText("VIEW DETAILS");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_details(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 160, 40));

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel5.setText("UID:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, -1, 20));

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel6.setText("BLOOD GROUP:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 480, -1, 30));

        uidTextField.setBackground(new java.awt.Color(0, 0, 0));
        uidTextField.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        uidTextField.setForeground(new java.awt.Color(255, 255, 255));
        uidTextField.setEnabled(false);
        add(uidTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 440, 210, 30));

        bloodGroupTextField.setBackground(new java.awt.Color(0, 0, 0));
        bloodGroupTextField.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        bloodGroupTextField.setForeground(new java.awt.Color(255, 255, 255));
        bloodGroupTextField.setEnabled(false);
        add(bloodGroupTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 480, 210, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 620, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 600, 1180, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void proceed_button(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceed_button
        // TODO add your handling code here:

        Donor donor = system.getDonorDir().addDonor();
        donor.setName(nameTextField.getText());
        donor.setID(uidTextField.getText());

        System.out.println(contactTextField.getText());
        donor.setMobile(contactTextField.getText());
        donor.setBlood_Group(bloodGroupTextField.getText());
        donor.setRecent_status("Government Approved");

        dB4OUtil.storeSystem(system);
        populateTable();
        JOptionPane.showMessageDialog(null, new JLabel("A new Donor is successfully added!"));

        //JOptionPane.showMessageDialog(null,"new Donor added!");
        nameTextField.setText("");
        contactTextField.setText("");
        uidTextField.setText("");
        bloodGroupTextField.setText("");
        buttonCreate.setEnabled(false);


    }//GEN-LAST:event_proceed_button

    private void view_details(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_details
        // TODO add your handling code here:

        int selectedRow = tblGoogleSheet.getSelectedRow();
        if (selectedRow < 0) {
            // JOptionPane.showMessageDialog(null,"Please select a row from the table first to View Details!","Warning!",JOptionPane.WARNING_MESSAGE);

            JOptionPane.showMessageDialog(null, new JLabel("Please select a row  from the table!!!!!! "), "Warning", JOptionPane.WARNING_MESSAGE);

        } else {

            //String.valueOf(tblGoogleSheet.getValueAt(selectedRow, 0));
            nameTextField.setText(String.valueOf(tblGoogleSheet.getValueAt(selectedRow, 1)));
            contactTextField.setText(String.valueOf(tblGoogleSheet.getValueAt(selectedRow, 2)));
            uidTextField.setText(String.valueOf(tblGoogleSheet.getValueAt(selectedRow, 0)));
            bloodGroupTextField.setText(String.valueOf(tblGoogleSheet.getValueAt(selectedRow, 3)));

            buttonCreate.setEnabled(true);

        }


    }//GEN-LAST:event_view_details


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bloodGroupTextField;
    private javax.swing.JButton buttonCreate;
    private javax.swing.JTextField contactTextField;
    private javax.swing.JTable donorTable;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTable tblGoogleSheet;
    private javax.swing.JTextField uidTextField;
    // End of variables declaration//GEN-END:variables
}
