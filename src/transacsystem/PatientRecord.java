package transacsystem;

import java.awt.Color;
import java.awt.Font;
import java.sql.*;
import javax.swing.table.JTableHeader;

public class PatientRecord extends javax.swing.JFrame {

    private Connection con;
    private String lastName, firstName, lastVisit, birthday;

    public PatientRecord(String lastName, String firstName, String lastVisit) {
        super("PAS | Patient Record");
        createConnection();
        initComponents();
        JTableHeader tableHeader = pastVisitsTable.getTableHeader();
        tableHeader.setBackground(new Color(2, 113, 121));
        tableHeader.setForeground(Color.WHITE);
        tableHeader.setFont(new Font("Century Gothic", Font.BOLD, 18));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollbar5 = new javax.swing.JScrollBar();
        patientinfotxt5 = new javax.swing.JLabel();
        patientinfoline5 = new javax.swing.JPanel();
        nametxt5 = new javax.swing.JLabel();
        birthdaytxt5 = new javax.swing.JLabel();
        gendertxt5 = new javax.swing.JLabel();
        heighttxt5 = new javax.swing.JLabel();
        toppanel5 = new javax.swing.JPanel();
        patientsummarytxt5 = new javax.swing.JLabel();
        weighttxt5 = new javax.swing.JLabel();
        lastvisittxt5 = new javax.swing.JLabel();
        lastvisitline5 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        bookButton = new javax.swing.JButton();
        nameField = new javax.swing.JTextField();
        birthdayField = new javax.swing.JTextField();
        weightField = new javax.swing.JTextField();
        heightField = new javax.swing.JTextField();
        genderField = new javax.swing.JTextField();
        contactField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ageField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pastVisitsTable = new javax.swing.JTable();

        scrollbar5.setBackground(new java.awt.Color(255, 255, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1280, 840));
        setSize(new java.awt.Dimension(1280, 840));

        patientinfotxt5.setBackground(new java.awt.Color(255, 255, 255));
        patientinfotxt5.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        patientinfotxt5.setForeground(new java.awt.Color(2, 113, 121));
        patientinfotxt5.setText("Patient Information");

        patientinfoline5.setBackground(new java.awt.Color(2, 113, 121));
        patientinfoline5.setMinimumSize(new java.awt.Dimension(0, 4));

        javax.swing.GroupLayout patientinfoline5Layout = new javax.swing.GroupLayout(patientinfoline5);
        patientinfoline5.setLayout(patientinfoline5Layout);
        patientinfoline5Layout.setHorizontalGroup(
            patientinfoline5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 796, Short.MAX_VALUE)
        );
        patientinfoline5Layout.setVerticalGroup(
            patientinfoline5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        nametxt5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        nametxt5.setText("Name");

        birthdaytxt5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        birthdaytxt5.setText("Birthday");

        gendertxt5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        gendertxt5.setText("Gender");

        heighttxt5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        heighttxt5.setText("Height");

        toppanel5.setBackground(new java.awt.Color(2, 113, 121));
        toppanel5.setMinimumSize(new java.awt.Dimension(840, 94));
        toppanel5.setPreferredSize(new java.awt.Dimension(840, 94));

        patientsummarytxt5.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        patientsummarytxt5.setForeground(new java.awt.Color(255, 255, 255));
        patientsummarytxt5.setText("Patient Record");

        javax.swing.GroupLayout toppanel5Layout = new javax.swing.GroupLayout(toppanel5);
        toppanel5.setLayout(toppanel5Layout);
        toppanel5Layout.setHorizontalGroup(
            toppanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toppanel5Layout.createSequentialGroup()
                .addGap(495, 495, 495)
                .addComponent(patientsummarytxt5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        toppanel5Layout.setVerticalGroup(
            toppanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toppanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(patientsummarytxt5)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        weighttxt5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        weighttxt5.setText("Weight");

        lastvisittxt5.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        lastvisittxt5.setForeground(new java.awt.Color(2, 113, 121));
        lastvisittxt5.setText("Visits");

        lastvisitline5.setBackground(new java.awt.Color(2, 113, 121));
        lastvisitline5.setMaximumSize(new java.awt.Dimension(947, 2));
        lastvisitline5.setMinimumSize(new java.awt.Dimension(947, 2));
        lastvisitline5.setPreferredSize(new java.awt.Dimension(947, 2));

        javax.swing.GroupLayout lastvisitline5Layout = new javax.swing.GroupLayout(lastvisitline5);
        lastvisitline5.setLayout(lastvisitline5Layout);
        lastvisitline5Layout.setHorizontalGroup(
            lastvisitline5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lastvisitline5Layout.setVerticalGroup(
            lastvisitline5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        backButton.setBackground(new java.awt.Color(204, 204, 204));
        backButton.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        backButton.setText("Back");
        backButton.setBorderPainted(false);
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.setFocusPainted(false);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        bookButton.setBackground(new java.awt.Color(255, 175, 46));
        bookButton.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        bookButton.setForeground(new java.awt.Color(255, 255, 255));
        bookButton.setText("Book Appointment");
        bookButton.setBorderPainted(false);
        bookButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bookButton.setFocusPainted(false);
        bookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookButtonActionPerformed(evt);
            }
        });

        nameField.setEditable(false);
        nameField.setBackground(new java.awt.Color(255, 255, 255));
        nameField.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        nameField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        nameField.setFocusable(false);
        nameField.setMaximumSize(new java.awt.Dimension(255, 36));
        nameField.setMinimumSize(new java.awt.Dimension(255, 36));
        nameField.setPreferredSize(new java.awt.Dimension(255, 36));

        birthdayField.setEditable(false);
        birthdayField.setBackground(new java.awt.Color(255, 255, 255));
        birthdayField.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        birthdayField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        birthdayField.setFocusable(false);
        birthdayField.setMaximumSize(new java.awt.Dimension(255, 36));
        birthdayField.setMinimumSize(new java.awt.Dimension(255, 36));
        birthdayField.setPreferredSize(new java.awt.Dimension(255, 36));

        weightField.setEditable(false);
        weightField.setBackground(new java.awt.Color(255, 255, 255));
        weightField.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        weightField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        weightField.setFocusable(false);
        weightField.setMaximumSize(new java.awt.Dimension(255, 36));
        weightField.setMinimumSize(new java.awt.Dimension(255, 36));
        weightField.setPreferredSize(new java.awt.Dimension(255, 36));

        heightField.setEditable(false);
        heightField.setBackground(new java.awt.Color(255, 255, 255));
        heightField.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        heightField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        heightField.setFocusable(false);
        heightField.setMaximumSize(new java.awt.Dimension(255, 36));
        heightField.setMinimumSize(new java.awt.Dimension(255, 36));
        heightField.setPreferredSize(new java.awt.Dimension(255, 36));

        genderField.setEditable(false);
        genderField.setBackground(new java.awt.Color(255, 255, 255));
        genderField.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        genderField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        genderField.setFocusable(false);
        genderField.setMaximumSize(new java.awt.Dimension(255, 36));
        genderField.setMinimumSize(new java.awt.Dimension(255, 36));
        genderField.setPreferredSize(new java.awt.Dimension(255, 36));

        contactField.setEditable(false);
        contactField.setBackground(new java.awt.Color(255, 255, 255));
        contactField.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        contactField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        contactField.setFocusable(false);
        contactField.setMaximumSize(new java.awt.Dimension(255, 36));
        contactField.setMinimumSize(new java.awt.Dimension(255, 36));
        contactField.setPreferredSize(new java.awt.Dimension(255, 36));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setText("Contact No.");

        ageField.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        ageField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        ageField.setFocusable(false);
        ageField.setMaximumSize(new java.awt.Dimension(255, 36));
        ageField.setMinimumSize(new java.awt.Dimension(255, 36));
        ageField.setPreferredSize(new java.awt.Dimension(255, 36));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Age");

        pastVisitsTable.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        pastVisitsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Purpose of Appointment", "Type of Doctor", "Schedule"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        pastVisitsTable.setGridColor(new java.awt.Color(2, 113, 121));
        pastVisitsTable.setSelectionForeground(new java.awt.Color(2, 113, 121));
        pastVisitsTable.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        pastVisitsTable.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        pastVisitsTable.setShowHorizontalLines(true);
        jScrollPane1.setViewportView(pastVisitsTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toppanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bookButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(patientinfotxt5)
                            .addGap(18, 18, 18)
                            .addComponent(patientinfoline5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(88, 88, 88)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(birthdaytxt5)
                                    .addGap(18, 18, 18)
                                    .addComponent(birthdayField, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(gendertxt5)
                                    .addGap(18, 18, 18)
                                    .addComponent(genderField, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(nametxt5)
                                        .addComponent(jLabel2))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(115, 115, 115)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(heighttxt5)
                                    .addGap(18, 18, 18)
                                    .addComponent(heightField, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(weighttxt5)
                                        .addComponent(jLabel1))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(contactField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(weightField, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lastvisittxt5)
                            .addGap(18, 18, 18)
                            .addComponent(lastvisitline5, javax.swing.GroupLayout.DEFAULT_SIZE, 997, Short.MAX_VALUE))))
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 997, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(toppanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(patientinfotxt5)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(patientinfoline5, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(heighttxt5)
                            .addComponent(heightField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(weighttxt5)
                            .addComponent(weightField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(contactField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nametxt5)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(birthdayField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(birthdaytxt5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gendertxt5)
                            .addComponent(genderField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lastvisittxt5)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lastvisitline5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        PatientsLog PatientLogFrame = new PatientsLog();
        PatientLogFrame.setVisible(true);
        PatientLogFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void bookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookButtonActionPerformed
        RegistrationFormOldPatient newBook = new RegistrationFormOldPatient(lastName, firstName, birthday);
        newBook.setVisible(true);
        newBook.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_bookButtonActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PatientRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new Summary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageField;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField birthdayField;
    private javax.swing.JLabel birthdaytxt5;
    private javax.swing.JButton bookButton;
    private javax.swing.JTextField contactField;
    private javax.swing.JTextField genderField;
    private javax.swing.JLabel gendertxt5;
    private javax.swing.JTextField heightField;
    private javax.swing.JLabel heighttxt5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel lastvisitline5;
    private javax.swing.JLabel lastvisittxt5;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nametxt5;
    private javax.swing.JTable pastVisitsTable;
    private javax.swing.JPanel patientinfoline5;
    private javax.swing.JLabel patientinfotxt5;
    private javax.swing.JLabel patientsummarytxt5;
    private javax.swing.JScrollBar scrollbar5;
    private javax.swing.JPanel toppanel5;
    private javax.swing.JTextField weightField;
    private javax.swing.JLabel weighttxt5;
    // End of variables declaration//GEN-END:variables

    void createConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pasystem", "root", "");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void closeConnection() {
        if (con != null) {
            try {
                con.close();
                System.out.println("Connection closed");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
