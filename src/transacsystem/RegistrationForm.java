package transacsystem;

import javax.swing.JOptionPane;

public class RegistrationForm extends javax.swing.JFrame {

    private String firstName, lastName, birthday, gen, phone, hei, wei, purpose, type, sched;
    
    public RegistrationForm(String lastName, String firstName) {
        super("PAS | Registration Form");
        initComponents();
        this.setLocationRelativeTo(null);
        firstNameField.setText(firstName);
        lastNameField.setText(lastName);
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
        label10 = new java.awt.Label();
        height = new javax.swing.JTextField();
        label11 = new java.awt.Label();
        weight = new javax.swing.JTextField();
        contactNo = new javax.swing.JTextField();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 900));
        setPreferredSize(new java.awt.Dimension(1280, 900));
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
        birthDay.setText("MM/DD/YYYY");
        birthDay.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1)));

        label10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        label10.setText("Height (in m)");

        height.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        height.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1)));
        height.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        label11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label11.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        label11.setText("Weight (in kg)");

        weight.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        weight.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1)));
        weight.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        weight.setPreferredSize(new java.awt.Dimension(64, 34));

        contactNo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        contactNo.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1)));
        contactNo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

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
        appPurpose.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Purpose", "Physical Exam", "Consultation", "Preventive Care" }));
        appPurpose.setBorder(new javax.swing.border.MatteBorder(null));

        doctor.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        doctor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Type", "Pedriatrician", "Family Doctor", "Primary Care Physician", "Internal Medicine" }));
        doctor.setBorder(new javax.swing.border.MatteBorder(null));

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
        schedule.setText("MM/DD/YYYY");
        schedule.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1)));
        schedule.setOpaque(true);

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lastNameField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(106, 106, 106)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(birthDay)
                                .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))
                        .addGap(105, 105, 105)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addContainerGap(217, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(appPurpose, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(schedule, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(121, 121, 121)
                        .addComponent(CantBut1)
                        .addGap(18, 18, 18)
                        .addComponent(ConBut1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(height, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(104, 104, 104)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(label11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(weight, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(birthDay, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(height, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(appPurpose, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(schedule, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CantBut1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ConBut1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(150, 150, 150))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
        firstName = firstNameField.getText();
        lastName = lastNameField.getText();
        birthday = birthDay.getText();
        gen = gender.getSelectedItem().toString();
        phone = contactNo.getText();
        hei = height.getText();
        wei = weight.getText();
        purpose = appPurpose.getSelectedItem().toString();
        type = doctor.getSelectedItem().toString();
        sched = schedule.getText();
        
        if (phone.length() == 11) {
            AppointmentSummary summary = new AppointmentSummary(this, firstName, lastName, birthday, gen, phone, hei,wei, purpose, type, sched);
            summary.setVisible(true);
            summary.setLocationRelativeTo(null);
        } else {
            JOptionPane.showMessageDialog(null, "Phone number must be only 11 digits long", "Phone Number errror", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_ConBut1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CantBut1;
    public javax.swing.JButton ConBut1;
    private javax.swing.JComboBox<String> appPurpose;
    private javax.swing.JTextField birthDay;
    private javax.swing.JTextField contactNo;
    private javax.swing.JComboBox<String> doctor;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JTextField height;
    private javax.swing.JLabel jLabel1;
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
    private java.awt.Label label10;
    private java.awt.Label label11;
    private java.awt.Label label16;
    private java.awt.Label label18;
    private java.awt.Label label19;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JTextField schedule;
    private javax.swing.JTextField weight;
    // End of variables declaration//GEN-END:variables
}
