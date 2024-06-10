package transacsystem;

import javax.swing.*;

public class RegistrationFormOldPatient extends javax.swing.JFrame {

    private String firstName, lastName, birthday, gen, phone, hei, wei, purpose, type, sched, timeDay;
    private int age;
    private String format = "MM/DD/YY";
    
    public RegistrationFormOldPatient(String lastName, String firstName, String birthday) {
        super("PAS | Registration Form");
        initComponents();
        this.setLocationRelativeTo(null);
        firstNameField.setText(firstName);
        lastNameField.setText(lastName);
        doctor.setEnabled(false);
        timeAndDay.setEnabled(false);
        schedule.setText(format);
        birthDay.setText(birthday);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        birthDay = new javax.swing.JTextField();
        height = new javax.swing.JTextField();
        weight = new javax.swing.JTextField();
        ageField = new javax.swing.JTextField();
        label16 = new java.awt.Label();
        label18 = new java.awt.Label();
        label19 = new java.awt.Label();
        appPurpose = new javax.swing.JComboBox<>();
        doctor = new javax.swing.JComboBox<>();
        ConBut1 = new javax.swing.JButton();
        CantBut1 = new javax.swing.JButton();
        gender = new javax.swing.JComboBox<>();
        schedule = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        doctorsFee = new javax.swing.JLabel();
        contactNo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        FNameEmpty = new javax.swing.JLabel();
        LNameEmpty = new javax.swing.JLabel();
        bDayEmpty = new javax.swing.JLabel();
        genderEmpty = new javax.swing.JLabel();
        ageEmpty = new javax.swing.JLabel();
        phoneEmpty = new javax.swing.JLabel();
        heightEmpty = new javax.swing.JLabel();
        weightEmpty = new javax.swing.JLabel();
        purposeEmpty = new javax.swing.JLabel();
        typeEmpty = new javax.swing.JLabel();
        schedEmpty = new javax.swing.JLabel();
        timeAndDay = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 900));
        setSize(new java.awt.Dimension(1280, 900));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 900));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 900));

        jPanel2.setBackground(new java.awt.Color(2, 113, 121));
        jPanel2.setMinimumSize(new java.awt.Dimension(466, 94));
        jPanel2.setPreferredSize(new java.awt.Dimension(780, 94));

        jLabel1.setBackground(new java.awt.Color(2, 113, 121));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registration Form");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(473, 473, 473)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        firstNameField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        firstNameField.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1)));
        firstNameField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        firstNameField.setDoubleBuffered(true);

        lastNameField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lastNameField.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1)));
        lastNameField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        lastNameField.setMinimumSize(new java.awt.Dimension(64, 16));

        birthDay.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        birthDay.setText("MM/DD/YY");
        birthDay.setToolTipText("");
        birthDay.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1)));
        birthDay.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                birthDayFocusGained(evt);
            }
        });

        height.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        height.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1)));
        height.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        weight.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        weight.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1)));
        weight.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        weight.setPreferredSize(new java.awt.Dimension(64, 34));

        ageField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        ageField.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1)));
        ageField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        label16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label16.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        label16.setText("Appointment Purpose");

        label18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label18.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        label18.setText("Type of Doctor");

        label19.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label19.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        label19.setText("Schedule");

        appPurpose.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        appPurpose.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Purpose of Appointment", "Physical Exam", "Consultation", "Preventive Care", "Health Checkup", "Prescribed Medication" }));
        appPurpose.setBorder(new javax.swing.border.MatteBorder(null));
        appPurpose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appPurposeActionPerformed(evt);
            }
        });

        doctor.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        doctor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Type of Doctor", "Pediatrician", "Family Doctor", "Primary Care Physician", "Internal Medicine" }));
        doctor.setBorder(new javax.swing.border.MatteBorder(null));
        doctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorActionPerformed(evt);
            }
        });

        ConBut1.setBackground(new java.awt.Color(255, 175, 46));
        ConBut1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        ConBut1.setForeground(new java.awt.Color(255, 255, 255));
        ConBut1.setText("Continue");
        ConBut1.setBorderPainted(false);
        ConBut1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ConBut1.setFocusPainted(false);
        ConBut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConBut1ActionPerformed(evt);
            }
        });

        CantBut1.setBackground(new java.awt.Color(204, 204, 204));
        CantBut1.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        CantBut1.setText("Cancel");
        CantBut1.setBorderPainted(false);
        CantBut1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CantBut1.setFocusPainted(false);
        CantBut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantBut1ActionPerformed(evt);
            }
        });

        gender.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Not Selected Yet", "Male", "Female", "Rather not say" }));
        gender.setBorder(new javax.swing.border.MatteBorder(null));

        schedule.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        schedule.setText("MM/DD/YY");
        schedule.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1)));
        schedule.setOpaque(true);
        schedule.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                scheduleFocusGained(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(2, 113, 121));
        jPanel3.setMinimumSize(new java.awt.Dimension(831, 4));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 831, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(2, 113, 121));
        jPanel4.setMinimumSize(new java.awt.Dimension(831, 4));
        jPanel4.setPreferredSize(new java.awt.Dimension(831, 4));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 862, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(2, 113, 121));
        jPanel5.setMinimumSize(new java.awt.Dimension(833, 4));
        jPanel5.setPreferredSize(new java.awt.Dimension(833, 4));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 833, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel2.setBackground(new java.awt.Color(2, 113, 121));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(2, 113, 121));
        jLabel2.setText("Personal Information");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setText("First Name");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setText("Last Name");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setText("Birthday");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setText("Gender");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setText("Phone Number");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(2, 113, 121));
        jLabel8.setText("Physical Attributes");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(2, 113, 121));
        jLabel9.setText("Appointment Details");

        doctorsFee.setBackground(new java.awt.Color(2, 113, 121));
        doctorsFee.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        doctorsFee.setForeground(new java.awt.Color(2, 113, 121));
        doctorsFee.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        doctorsFee.setToolTipText("");
        doctorsFee.setFocusable(false);
        doctorsFee.setMaximumSize(new java.awt.Dimension(121, 29));
        doctorsFee.setMinimumSize(new java.awt.Dimension(121, 29));
        doctorsFee.setPreferredSize(new java.awt.Dimension(121, 29));

        contactNo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        contactNo.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1)));
        contactNo.setMaximumSize(new java.awt.Dimension(64, 27));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel10.setText("Age");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel11.setText("Height (in m)");

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel12.setText("Weight (in kg)");

        FNameEmpty.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        FNameEmpty.setForeground(new java.awt.Color(255, 102, 102));
        FNameEmpty.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        FNameEmpty.setFocusable(false);
        FNameEmpty.setMaximumSize(new java.awt.Dimension(100, 19));
        FNameEmpty.setMinimumSize(new java.awt.Dimension(100, 19));
        FNameEmpty.setPreferredSize(new java.awt.Dimension(100, 19));

        LNameEmpty.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        LNameEmpty.setForeground(new java.awt.Color(255, 102, 102));
        LNameEmpty.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LNameEmpty.setFocusable(false);
        LNameEmpty.setMaximumSize(new java.awt.Dimension(100, 19));
        LNameEmpty.setMinimumSize(new java.awt.Dimension(100, 19));
        LNameEmpty.setPreferredSize(new java.awt.Dimension(100, 19));

        bDayEmpty.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        bDayEmpty.setForeground(new java.awt.Color(255, 102, 102));
        bDayEmpty.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bDayEmpty.setFocusable(false);
        bDayEmpty.setMaximumSize(new java.awt.Dimension(100, 19));
        bDayEmpty.setMinimumSize(new java.awt.Dimension(100, 19));
        bDayEmpty.setPreferredSize(new java.awt.Dimension(100, 19));

        genderEmpty.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        genderEmpty.setForeground(new java.awt.Color(255, 102, 102));
        genderEmpty.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        genderEmpty.setFocusable(false);
        genderEmpty.setMaximumSize(new java.awt.Dimension(100, 19));
        genderEmpty.setMinimumSize(new java.awt.Dimension(100, 19));
        genderEmpty.setPreferredSize(new java.awt.Dimension(100, 19));

        ageEmpty.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        ageEmpty.setForeground(new java.awt.Color(255, 102, 102));
        ageEmpty.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ageEmpty.setFocusable(false);
        ageEmpty.setMaximumSize(new java.awt.Dimension(100, 19));
        ageEmpty.setMinimumSize(new java.awt.Dimension(100, 19));
        ageEmpty.setPreferredSize(new java.awt.Dimension(100, 19));

        phoneEmpty.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        phoneEmpty.setForeground(new java.awt.Color(255, 102, 102));
        phoneEmpty.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        phoneEmpty.setFocusable(false);
        phoneEmpty.setMaximumSize(new java.awt.Dimension(100, 19));
        phoneEmpty.setMinimumSize(new java.awt.Dimension(100, 19));
        phoneEmpty.setPreferredSize(new java.awt.Dimension(100, 19));

        heightEmpty.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        heightEmpty.setForeground(new java.awt.Color(255, 102, 102));
        heightEmpty.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        heightEmpty.setFocusable(false);
        heightEmpty.setMaximumSize(new java.awt.Dimension(100, 19));
        heightEmpty.setMinimumSize(new java.awt.Dimension(100, 19));
        heightEmpty.setPreferredSize(new java.awt.Dimension(100, 19));

        weightEmpty.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        weightEmpty.setForeground(new java.awt.Color(255, 102, 102));
        weightEmpty.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        weightEmpty.setFocusable(false);
        weightEmpty.setMaximumSize(new java.awt.Dimension(100, 19));
        weightEmpty.setMinimumSize(new java.awt.Dimension(100, 19));
        weightEmpty.setPreferredSize(new java.awt.Dimension(100, 19));

        purposeEmpty.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        purposeEmpty.setForeground(new java.awt.Color(255, 102, 102));
        purposeEmpty.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        purposeEmpty.setFocusable(false);
        purposeEmpty.setMaximumSize(new java.awt.Dimension(100, 19));
        purposeEmpty.setMinimumSize(new java.awt.Dimension(100, 19));
        purposeEmpty.setPreferredSize(new java.awt.Dimension(100, 19));

        typeEmpty.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        typeEmpty.setForeground(new java.awt.Color(255, 102, 102));
        typeEmpty.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        typeEmpty.setFocusable(false);
        typeEmpty.setMaximumSize(new java.awt.Dimension(100, 19));
        typeEmpty.setMinimumSize(new java.awt.Dimension(100, 19));
        typeEmpty.setPreferredSize(new java.awt.Dimension(100, 19));

        schedEmpty.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        schedEmpty.setForeground(new java.awt.Color(255, 102, 102));
        schedEmpty.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        schedEmpty.setFocusable(false);
        schedEmpty.setMaximumSize(new java.awt.Dimension(100, 19));
        schedEmpty.setMinimumSize(new java.awt.Dimension(100, 19));
        schedEmpty.setPreferredSize(new java.awt.Dimension(100, 19));

        timeAndDay.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        timeAndDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Time" }));
        timeAndDay.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1329, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lastNameField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(firstNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(FNameEmpty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LNameEmpty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(106, 106, 106)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(birthDay)
                    .addComponent(gender, 0, 247, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(bDayEmpty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(genderEmpty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(105, 105, 105)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ageEmpty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ageField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                            .addComponent(contactNo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneEmpty, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(height, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                                    .addComponent(jLabel11)
                                    .addComponent(heightEmpty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(106, 106, 106)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(weight, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                                    .addComponent(jLabel12)
                                    .addComponent(weightEmpty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(CantBut1)
                                .addGap(18, 18, 18)
                                .addComponent(ConBut1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(label16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(appPurpose, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(purposeEmpty, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(label18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27)
                                                .addComponent(doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(label19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27)
                                                .addComponent(schedule, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(timeAndDay, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(schedEmpty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(typeEmpty, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(doctorsFee, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)))
                        .addGap(98, 98, 98)))
                .addGap(79, 79, 79))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(birthDay, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(FNameEmpty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bDayEmpty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ageEmpty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(LNameEmpty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneEmpty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genderEmpty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(10, 10, 10)
                        .addComponent(height, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(10, 10, 10)
                        .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heightEmpty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weightEmpty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(appPurpose, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(purposeEmpty, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(typeEmpty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(doctorsFee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(schedule, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(label19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(schedEmpty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeAndDay))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CantBut1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConBut1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1292, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CantBut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantBut1ActionPerformed
        CancelDialog Dialog = new CancelDialog(this);
        Dialog.setVisible(true);
        Dialog.setLocationRelativeTo(null);
    }//GEN-LAST:event_CantBut1ActionPerformed

    private void ConBut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConBut1ActionPerformed
        String ageTemp;
        String emInfo = "Please fill this up";
        String emGen = "Please select a gender";
        String emPurp = "Please select your purpose of appointment";
        String emDoc = "Please select a doctor";
        String emSched = "Please inidicate schedule for appointment";
        String emPhone = "Please enter your phone number";
        boolean FN = false, LN = false, AGE = false, BD = false, GEN = false, HEI = false, WEI = false, PURP = false, TYPE = false, SCH = false, PH = false, TD = false;
        
        firstName = firstNameField.getText();
        lastName = lastNameField.getText();
        ageTemp = ageField.getText();
        birthday = birthDay.getText();
        gen = gender.getSelectedItem().toString();
        phone = contactNo.getText();
        hei = height.getText();
        wei = weight.getText();
        purpose = appPurpose.getSelectedItem().toString();
        type = doctor.getSelectedItem().toString();
        sched = schedule.getText();
        timeDay = timeAndDay.getSelectedItem().toString();
        
        if (firstName.equals("")) FNameEmpty.setText(emInfo);
        else {FN = true; FNameEmpty.setText("");}
        
        if (lastName.equals("")) LNameEmpty.setText(emInfo);
        else {LN = true; LNameEmpty.setText("");}
        
        if (ageTemp.equals("")) ageEmpty.setText(emInfo);
        else {AGE = true; ageEmpty.setText("");}
        
        if (birthday.equals(format)) bDayEmpty.setText(emInfo);
        else {BD = true; bDayEmpty.setText("");}
        
        if (gen.equals("Not Selected Yet")) genderEmpty.setText(emGen);
        else {GEN = true; genderEmpty.setText("");}
        
        if (hei.equals("")) heightEmpty.setText(emInfo);
        else {HEI = true; heightEmpty.setText("");}
        
        if (wei.equals("")) weightEmpty.setText(emInfo);
        else {WEI = true; weightEmpty.setText("");}
        
        if (purpose.equals("Choose Purpose of Appointment")) purposeEmpty.setText(emPurp);
        else {PURP = true; purposeEmpty.setText("");}
        
        if (!type.equals("Choose Type of Doctor")) TYPE = true;
        
        if (sched.equals("") || sched.equals(format)) schedEmpty.setText(emSched);
        else {SCH = true; schedEmpty.setText("");}
        
        if (phone.equals("")) phoneEmpty.setText(emPhone);
        else {PH = true; phoneEmpty.setText("");}
        
        if (timeDay.equals("Choose Time") || timeDay.equals("Available Hours and Days:")) schedEmpty.setText(emSched);
        else {TD = true; schedEmpty.setText("");}
        
        age = Integer.parseInt(ageTemp);
        
        if ((phone.length() == 11) && FN && LN && AGE && BD && GEN && HEI && WEI && PURP && TYPE && SCH && TD) {
            AppointmentSummary summary = new AppointmentSummary(this, firstName, lastName, age, birthday, gen, phone, hei,wei, purpose, type, sched, timeDay);
            summary.setVisible(true);
            summary.setLocationRelativeTo(null);
        } else if (phone.length() != 11){
            JOptionPane.showMessageDialog(null, "Phone number must only be 11 digits long", "Phone Number errror", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_ConBut1ActionPerformed

    private void doctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorActionPerformed
        String doc = (String) doctor.getSelectedItem();
        int docFee = 0;
        if (doc != null && !doc.equals("Choose Type of Doctor")){
            timeAndDay.setEnabled(true);
            switch (doc){
                case "Pediatrician":
                    docFee = 500;
                    timeAndDay.removeAllItems();
                    timeAndDay.addItem("Available Hours and Days:");
                    timeAndDay.addItem("8-9 AM MON");
                    timeAndDay.addItem("10-11 AM MON");
                    timeAndDay.addItem("11-12 PM MON");
                    timeAndDay.addItem("1-2 PM MON");
                    timeAndDay.addItem("8-9 AM WED");
                    timeAndDay.addItem("10-11 AM WED");
                    timeAndDay.addItem("11-12 PM WED");
                    timeAndDay.addItem("1-2 PM WED");
                    timeAndDay.addItem("8-9 AM FRI");
                    timeAndDay.addItem("10-11 AM FRI");
                    timeAndDay.addItem("11-12 PM FRI");
                    timeAndDay.addItem("1-2 PM FRI");
                    break;
                   
                case "Family Doctor":
                    docFee = 300;
                    timeAndDay.removeAllItems();
                    timeAndDay.addItem("Available Hours and Days:");
                    timeAndDay.addItem("8-9 AM TUE");
                    timeAndDay.addItem("10-11 AM TUE");
                    timeAndDay.addItem("1-2 PM TUE");
                    timeAndDay.addItem("2-3 PM TUE");
                    timeAndDay.addItem("8-9 AM THU");
                    timeAndDay.addItem("10-11 AM THU");
                    timeAndDay.addItem("1-2 PM THU");
                    timeAndDay.addItem("2-3 PM THU");
                    timeAndDay.addItem("8-9 AM FRI");
                    timeAndDay.addItem("10-11 AM FRI");
                    timeAndDay.addItem("1-2 PM FRI");
                    timeAndDay.addItem("2-3 PM FRI");
                    break;
                    
                case "Primary Care Physician":
                    docFee = 700;
                    timeAndDay.removeAllItems();
                    timeAndDay.addItem("Available Hours and Days:");
                    timeAndDay.addItem("10-11 AM MON");
                    timeAndDay.addItem("11-12 PM MON");
                    timeAndDay.addItem("1-2 PM MON");
                    timeAndDay.addItem("2-3 PM MON");
                    timeAndDay.addItem("10-11 AM TUE");
                    timeAndDay.addItem("11-12 PM TUE");
                    timeAndDay.addItem("1-2 PM TUE");
                    timeAndDay.addItem("2-3 PM TUE");
                    timeAndDay.addItem("10-11 AM THU");
                    timeAndDay.addItem("11-12 PM THU");
                    timeAndDay.addItem("1-2 PM THU");
                    timeAndDay.addItem("2-3 PM THU");
                    break;
                
                case "Internal Medicine":
                    docFee = 300;
                    timeAndDay.removeAllItems();
                    timeAndDay.addItem("Available Hours and Days:");
                    timeAndDay.addItem("8-9 AM MON");
                    timeAndDay.addItem("10-11 AM MON");
                    timeAndDay.addItem("11-12 PM MON");
                    timeAndDay.addItem("2-3 PM MON");
                    timeAndDay.addItem("8-9 AM WED");
                    timeAndDay.addItem("10-11 AM WED");
                    timeAndDay.addItem("11-12 PM WED");
                    timeAndDay.addItem("2-3 PM WED");
                    timeAndDay.addItem("8-9 AM THU");
                    timeAndDay.addItem("10-11 AM THU");
                    timeAndDay.addItem("11-12 PM THU");
                    timeAndDay.addItem("2-3 PM THU");
                    break;
            }
            doctorsFee.setText("Doctors Fee: " + docFee + " Php");
        }
        else{
            doctorsFee.setText("");
        }
    }//GEN-LAST:event_doctorActionPerformed

    private void scheduleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_scheduleFocusGained
        schedule.setText("");
    }//GEN-LAST:event_scheduleFocusGained

    private void appPurposeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appPurposeActionPerformed
        String purp = (String) appPurpose.getSelectedItem();
        if (!purp.equals("Choose Purpose of Appointment")){
            doctor.setEnabled(true);
            switch (purp){
                case "Consultation":
                    doctor.removeAllItems();
                    doctor.addItem("Choose Type of Doctor");
                    doctor.addItem("Pediatrician");
                    doctor.addItem("Family Doctor");
                    doctor.addItem("Primary Care Physician");
                    doctor.addItem("Internal Medicine");
                    break;
                
                case "Physical Exam":
                    doctor.removeAllItems();
                    doctor.addItem("Choose Type of Doctor");
                    doctor.addItem("Pediatrician");
                    doctor.addItem("Primary Care Physician");
                    break;
               
                case "Health Checkup":
                    doctor.removeAllItems();
                    doctor.addItem("Choose Type of Doctor");
                    doctor.addItem("Pediatrician");
                    doctor.addItem("Family Doctor");
                    doctor.addItem("Primary Care Physician");
                    doctor.addItem("Internal Medicine");
                    break;
                   
                case "Preventive Care":
                    doctor.removeAllItems();
                    doctor.addItem("Choose Type of Doctor");
                    doctor.addItem("Pediatrician");
                    doctor.addItem("Family Doctor");
                    doctor.addItem("Primary Care Physician");
                    doctor.addItem("Internal Medicine");
                    break;
                    
                case "Prescribed Medication":
                    doctor.removeAllItems();
                    doctor.addItem("Choose Type of Doctor");
                    doctor.addItem("Pediatrician");
                    doctor.addItem("Internal Medicine");
                    break;
            }
        }
        else{
            doctor.setEnabled(false);
            doctor.removeAllItems();
            doctor.addItem("Choose Type of Doctor");
        }
    }//GEN-LAST:event_appPurposeActionPerformed

    private void birthDayFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_birthDayFocusGained
        birthDay.setText("");
    }//GEN-LAST:event_birthDayFocusGained

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CantBut1;
    public javax.swing.JButton ConBut1;
    private javax.swing.JLabel FNameEmpty;
    private javax.swing.JLabel LNameEmpty;
    private javax.swing.JLabel ageEmpty;
    private javax.swing.JTextField ageField;
    private javax.swing.JComboBox<String> appPurpose;
    private javax.swing.JLabel bDayEmpty;
    private javax.swing.JTextField birthDay;
    private javax.swing.JTextField contactNo;
    private javax.swing.JComboBox<String> doctor;
    private javax.swing.JLabel doctorsFee;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JLabel genderEmpty;
    private javax.swing.JTextField height;
    private javax.swing.JLabel heightEmpty;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private java.awt.Label label16;
    private java.awt.Label label18;
    private java.awt.Label label19;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel phoneEmpty;
    private javax.swing.JLabel purposeEmpty;
    private javax.swing.JLabel schedEmpty;
    private javax.swing.JTextField schedule;
    private javax.swing.JComboBox<String> timeAndDay;
    private javax.swing.JLabel typeEmpty;
    private javax.swing.JTextField weight;
    private javax.swing.JLabel weightEmpty;
    // End of variables declaration//GEN-END:variables
}
