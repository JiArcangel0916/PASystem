package transacsystem;

import java.sql.*;

public class Summary extends javax.swing.JFrame {

    private Connection con;
    private String lastName, firstName, lastVisit, birthday, purp, type, sched;

    public Summary(String lastName, String firstName, String lastVisit) {
        super("PAS | Patient Summary");
        createConnection();
        initComponents();
        this.lastName = lastName;
        this.firstName = firstName;
        this.lastVisit = lastVisit;
        fillDetails();
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
        purposeofvisittxt5 = new javax.swing.JLabel();
        typeofdoctortxt5 = new javax.swing.JLabel();
        dateofappointmenttxt5 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        bookButton = new javax.swing.JButton();
        nameField = new javax.swing.JTextField();
        birthdayField = new javax.swing.JTextField();
        purposeText = new javax.swing.JTextField();
        weightField = new javax.swing.JTextField();
        heightField = new javax.swing.JTextField();
        typeofdocText = new javax.swing.JTextField();
        dateAppointText = new javax.swing.JTextField();
        genderField = new javax.swing.JTextField();
        contactField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ageField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        scrollbar5.setBackground(new java.awt.Color(255, 255, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1280, 840));
        setMinimumSize(new java.awt.Dimension(1280, 840));
        setPreferredSize(new java.awt.Dimension(1280, 840));
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
        patientsummarytxt5.setText("Patient Summary");

        javax.swing.GroupLayout toppanel5Layout = new javax.swing.GroupLayout(toppanel5);
        toppanel5.setLayout(toppanel5Layout);
        toppanel5Layout.setHorizontalGroup(
            toppanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, toppanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(patientsummarytxt5)
                .addGap(489, 489, 489))
        );
        toppanel5Layout.setVerticalGroup(
            toppanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toppanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(patientsummarytxt5)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        weighttxt5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        weighttxt5.setText("Weight");

        lastvisittxt5.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        lastvisittxt5.setForeground(new java.awt.Color(2, 113, 121));
        lastvisittxt5.setText("Last Visit");

        lastvisitline5.setBackground(new java.awt.Color(2, 113, 121));
        lastvisitline5.setMaximumSize(new java.awt.Dimension(947, 2));
        lastvisitline5.setMinimumSize(new java.awt.Dimension(947, 2));
        lastvisitline5.setPreferredSize(new java.awt.Dimension(947, 2));

        javax.swing.GroupLayout lastvisitline5Layout = new javax.swing.GroupLayout(lastvisitline5);
        lastvisitline5.setLayout(lastvisitline5Layout);
        lastvisitline5Layout.setHorizontalGroup(
            lastvisitline5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 947, Short.MAX_VALUE)
        );
        lastvisitline5Layout.setVerticalGroup(
            lastvisitline5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        purposeofvisittxt5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        purposeofvisittxt5.setText("Purpose of Visit");

        typeofdoctortxt5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        typeofdoctortxt5.setText("Type of Doctor");

        dateofappointmenttxt5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        dateofappointmenttxt5.setText("Date of Appointment");

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

        purposeText.setEditable(false);
        purposeText.setBackground(new java.awt.Color(255, 255, 255));
        purposeText.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        purposeText.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        purposeText.setFocusable(false);
        purposeText.setMaximumSize(new java.awt.Dimension(614, 36));
        purposeText.setMinimumSize(new java.awt.Dimension(614, 36));
        purposeText.setPreferredSize(new java.awt.Dimension(62, 20));

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

        typeofdocText.setEditable(false);
        typeofdocText.setBackground(new java.awt.Color(255, 255, 255));
        typeofdocText.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        typeofdocText.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        typeofdocText.setFocusable(false);
        typeofdocText.setMaximumSize(new java.awt.Dimension(614, 36));
        typeofdocText.setMinimumSize(new java.awt.Dimension(614, 36));
        typeofdocText.setPreferredSize(new java.awt.Dimension(62, 20));

        dateAppointText.setEditable(false);
        dateAppointText.setBackground(new java.awt.Color(255, 255, 255));
        dateAppointText.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        dateAppointText.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        dateAppointText.setFocusable(false);
        dateAppointText.setMaximumSize(new java.awt.Dimension(614, 36));
        dateAppointText.setMinimumSize(new java.awt.Dimension(614, 36));
        dateAppointText.setPreferredSize(new java.awt.Dimension(62, 20));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toppanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(patientinfotxt5)
                                .addGap(18, 18, 18)
                                .addComponent(patientinfoline5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lastvisittxt5)
                                .addGap(18, 18, 18)
                                .addComponent(lastvisitline5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                            .addComponent(weightField, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateofappointmenttxt5)
                            .addComponent(purposeofvisittxt5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(typeofdoctortxt5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(purposeText, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(typeofdocText, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateAppointText, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bookButton)
                .addGap(116, 116, 116))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lastvisittxt5)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lastvisitline5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(purposeofvisittxt5)
                    .addComponent(purposeText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateofappointmenttxt5)
                    .addComponent(dateAppointText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeofdocText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeofdoctortxt5))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        AppointmentLog PatientLogFrame = new AppointmentLog();
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

    private void fillDetails() {
        String sql = "SELECT * FROM pasystem.patient WHERE `Last Name` LIKE ? AND `First name` LIKE ? AND `Schedule` LIKE ?";
        try {
            PreparedStatement stat = con.prepareStatement(sql);
            stat.setString(1, "%" + lastName + "%");
            stat.setString(2, "%" + firstName + "%");
            stat.setString(3, "%" + lastVisit + "%");

            ResultSet res = stat.executeQuery();
            if (res.next()) {
                birthday = res.getString("Birthday");
                int age = res.getInt("Age");
                String height = res.getString("Height");
                String weight = res.getString("Weight");
                String gender = res.getString("Gender");
                String contact = res.getString("Phone Number");
                String purpose = res.getString("Appointment Purpose");
                String typeDoc = res.getString("Type of Doctor");

                nameField.setText(firstName + " " + lastName);
                ageField.setText(String.valueOf(age));
                birthdayField.setText(birthday);
                heightField.setText(height);
                weightField.setText(weight);
                genderField.setText(gender);
                contactField.setText(contact);
                purposeText.setText(purpose);
                typeofdocText.setText(typeDoc);
                dateAppointText.setText(lastVisit);
            }
        } catch (SQLException e) {
        }
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Summary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Summary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Summary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Summary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
    private javax.swing.JTextField dateAppointText;
    private javax.swing.JLabel dateofappointmenttxt5;
    private javax.swing.JTextField genderField;
    private javax.swing.JLabel gendertxt5;
    private javax.swing.JTextField heightField;
    private javax.swing.JLabel heighttxt5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel lastvisitline5;
    private javax.swing.JLabel lastvisittxt5;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nametxt5;
    private javax.swing.JPanel patientinfoline5;
    private javax.swing.JLabel patientinfotxt5;
    private javax.swing.JLabel patientsummarytxt5;
    private javax.swing.JTextField purposeText;
    private javax.swing.JLabel purposeofvisittxt5;
    private javax.swing.JScrollBar scrollbar5;
    private javax.swing.JPanel toppanel5;
    private javax.swing.JTextField typeofdocText;
    private javax.swing.JLabel typeofdoctortxt5;
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
