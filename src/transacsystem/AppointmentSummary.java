package transacsystem;

import javax.swing.JFrame;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppointmentSummary extends javax.swing.JFrame {

    private final JFrame RegForm;
    private String firstName, lastName, birthday, gen, phone, hei, wei, purpose, type, sched;
    private int age;
    private Connection con;

    public AppointmentSummary(JFrame RegForm, String firstName, String lastName, int age, String birthday, String gen, String phone, String hei, String wei, String purpose, String type, String sched) {
        super("PAS | Appointment Summary");
        initComponents();
        createConnection();
        this.RegForm = RegForm;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.birthday = birthday;
        this.gen = gen;
        this.phone = phone;
        this.hei = hei;
        this.wei = wei;
        this.purpose = purpose;
        this.type = type;
        this.sched = sched;
        fillDetails();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        birthdayField = new javax.swing.JTextField();
        genderField = new javax.swing.JTextField();
        heightField = new javax.swing.JTextField();
        weightField = new javax.swing.JTextField();
        contactField = new javax.swing.JTextField();
        purposeField = new javax.swing.JTextField();
        dateField = new javax.swing.JTextField();
        typeField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        cancelButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        contButton = new javax.swing.JButton();
        doctorsFee = new javax.swing.JLabel();
        ageField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1280, 840));
        setMinimumSize(new java.awt.Dimension(1280, 840));
        setPreferredSize(new java.awt.Dimension(1280, 840));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 840));

        jPanel2.setBackground(new java.awt.Color(2, 113, 121));
        jPanel2.setPreferredSize(new java.awt.Dimension(100, 94));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Appointment Summary");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(429, 429, 429)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel2.setBackground(new java.awt.Color(2, 113, 121));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(2, 113, 121));
        jLabel2.setText("Patient Information");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(2, 113, 121));
        jLabel3.setText("Appointment Details");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setText("Gender");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setText("Name");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setText("Birthday");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel7.setText("Contact Number");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel8.setText("Height");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel9.setText("Type of Doctor");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel10.setText("Weight");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel11.setText("Purpose of Visit");

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel12.setText("Date of Appointment");

        nameField.setEditable(false);
        nameField.setBackground(new java.awt.Color(255, 255, 255));
        nameField.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        nameField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        nameField.setFocusTraversalPolicyProvider(true);
        nameField.setFocusable(false);
        nameField.setMinimumSize(new java.awt.Dimension(255, 36));
        nameField.setPreferredSize(new java.awt.Dimension(255, 36));

        birthdayField.setEditable(false);
        birthdayField.setBackground(new java.awt.Color(255, 255, 255));
        birthdayField.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        birthdayField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        birthdayField.setFocusTraversalPolicyProvider(true);
        birthdayField.setFocusable(false);
        birthdayField.setMinimumSize(new java.awt.Dimension(255, 36));
        birthdayField.setPreferredSize(new java.awt.Dimension(255, 36));

        genderField.setEditable(false);
        genderField.setBackground(new java.awt.Color(255, 255, 255));
        genderField.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        genderField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        genderField.setFocusTraversalPolicyProvider(true);
        genderField.setFocusable(false);
        genderField.setMinimumSize(new java.awt.Dimension(255, 36));
        genderField.setPreferredSize(new java.awt.Dimension(255, 36));

        heightField.setEditable(false);
        heightField.setBackground(new java.awt.Color(255, 255, 255));
        heightField.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        heightField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        heightField.setFocusTraversalPolicyProvider(true);
        heightField.setFocusable(false);
        heightField.setMinimumSize(new java.awt.Dimension(255, 36));
        heightField.setPreferredSize(new java.awt.Dimension(255, 36));

        weightField.setEditable(false);
        weightField.setBackground(new java.awt.Color(255, 255, 255));
        weightField.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        weightField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        weightField.setFocusTraversalPolicyProvider(true);
        weightField.setFocusable(false);
        weightField.setMinimumSize(new java.awt.Dimension(255, 36));
        weightField.setPreferredSize(new java.awt.Dimension(255, 36));

        contactField.setEditable(false);
        contactField.setBackground(new java.awt.Color(255, 255, 255));
        contactField.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        contactField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        contactField.setFocusTraversalPolicyProvider(true);
        contactField.setFocusable(false);
        contactField.setMinimumSize(new java.awt.Dimension(255, 36));
        contactField.setPreferredSize(new java.awt.Dimension(255, 36));

        purposeField.setEditable(false);
        purposeField.setBackground(new java.awt.Color(255, 255, 255));
        purposeField.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        purposeField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        purposeField.setFocusTraversalPolicyProvider(true);
        purposeField.setFocusable(false);
        purposeField.setMinimumSize(new java.awt.Dimension(614, 36));
        purposeField.setPreferredSize(new java.awt.Dimension(614, 36));

        dateField.setEditable(false);
        dateField.setBackground(new java.awt.Color(255, 255, 255));
        dateField.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        dateField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        dateField.setFocusTraversalPolicyProvider(true);
        dateField.setFocusable(false);
        dateField.setMinimumSize(new java.awt.Dimension(614, 36));
        dateField.setPreferredSize(new java.awt.Dimension(614, 36));

        typeField.setEditable(false);
        typeField.setBackground(new java.awt.Color(255, 255, 255));
        typeField.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        typeField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        typeField.setFocusTraversalPolicyProvider(true);
        typeField.setFocusable(false);
        typeField.setMinimumSize(new java.awt.Dimension(614, 36));
        typeField.setPreferredSize(new java.awt.Dimension(614, 36));

        jPanel3.setBackground(new java.awt.Color(2, 113, 121));
        jPanel3.setPreferredSize(new java.awt.Dimension(693, 2));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 857, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(2, 113, 121));
        jPanel4.setMinimumSize(new java.awt.Dimension(100, 2));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        cancelButton.setBackground(new java.awt.Color(204, 204, 204));
        cancelButton.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.setBorderPainted(false);
        cancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelButton.setFocusPainted(false);
        cancelButton.setMaximumSize(new java.awt.Dimension(116, 50));
        cancelButton.setMinimumSize(new java.awt.Dimension(116, 50));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        editButton.setBackground(new java.awt.Color(255, 175, 46));
        editButton.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        editButton.setForeground(new java.awt.Color(255, 255, 255));
        editButton.setText("Edit");
        editButton.setBorderPainted(false);
        editButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editButton.setFocusPainted(false);
        editButton.setMaximumSize(new java.awt.Dimension(72, 50));
        editButton.setMinimumSize(new java.awt.Dimension(72, 50));
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        contButton.setBackground(new java.awt.Color(255, 175, 46));
        contButton.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        contButton.setForeground(new java.awt.Color(255, 255, 255));
        contButton.setText("Continue");
        contButton.setBorderPainted(false);
        contButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        contButton.setFocusPainted(false);
        contButton.setMaximumSize(new java.awt.Dimension(135, 50));
        contButton.setMinimumSize(new java.awt.Dimension(135, 50));
        contButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contButtonActionPerformed(evt);
            }
        });

        doctorsFee.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        doctorsFee.setForeground(new java.awt.Color(2, 113, 121));
        doctorsFee.setToolTipText("");

        ageField.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        ageField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        ageField.setFocusable(false);
        ageField.setMaximumSize(new java.awt.Dimension(255, 36));
        ageField.setMinimumSize(new java.awt.Dimension(255, 36));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel13.setText("Age");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1342, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(genderField, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(birthdayField, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(143, 143, 143)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(heightField, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(weightField, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contactField, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(0, 109, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(purposeField, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(doctorsFee, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(typeField, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(contButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heightField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(weightField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(contactField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(birthdayField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(genderField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(purposeField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(typeField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(doctorsFee, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        CancelDialog dialog = new CancelDialog(this, RegForm);
        dialog.setVisible(true);
        dialog.setLocationRelativeTo(null);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_editButtonActionPerformed

    private void contButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contButtonActionPerformed
        AppointmentBookedDialog dialog = new AppointmentBookedDialog(this, RegForm);
        dialog.setVisible(true);
        dialog.setLocationRelativeTo(null);
        try {
            String sql = "INSERT INTO pasystem.patient (`First Name`, `Last Name`, `Age`, `Birthday`, `Height`, `Weight`, `Phone Number`, `Gender`, `Appointment Purpose`, `Type of Doctor`, `Schedule`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stat = con.prepareStatement(sql);
            
            stat.setString(1, firstName);
            stat.setString(2, lastName);
            stat.setInt(3, age);
            stat.setString(4, birthday);
            stat.setString(5, hei);
            stat.setString(6, wei);
            stat.setString(7, phone);
            stat.setString(8, gen);
            stat.setString(9, purpose);
            stat.setString(10, type);
            stat.setString(11, sched);
            stat.execute();
            
            stat.close();
        } catch (SQLException ex) {
            Logger.getLogger(AppointmentSummary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_contButtonActionPerformed

    private void fillDetails() {
        nameField.setText(firstName + " " + lastName);
        ageField.setText(String.valueOf(age));
        birthdayField.setText(birthday);
        genderField.setText(gen);
        heightField.setText(hei);
        weightField.setText(wei);
        contactField.setText(phone);
        purposeField.setText(purpose);
        dateField.setText(sched);
        typeField.setText(type);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(AppointmentSummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppointmentSummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppointmentSummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppointmentSummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new AppointmentSummary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageField;
    private javax.swing.JTextField birthdayField;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton contButton;
    private javax.swing.JTextField contactField;
    private javax.swing.JTextField dateField;
    private javax.swing.JLabel doctorsFee;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField genderField;
    private javax.swing.JTextField heightField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField purposeField;
    private javax.swing.JTextField typeField;
    private javax.swing.JTextField weightField;
    // End of variables declaration//GEN-END:variables

    void createConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pasystem", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

}
