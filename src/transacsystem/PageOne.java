package transacsystem;

import javax.swing.JOptionPane;

public class PageOne extends javax.swing.JFrame {

    public PageOne() {
        super("Patient Appointment System");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        centerpanel1 = new javax.swing.JPanel();
        samplehospinctxt1 = new javax.swing.JLabel();
        patientappointmenttxt1 = new javax.swing.JLabel();
        systemtxt1 = new javax.swing.JLabel();
        hospicon1 = new javax.swing.JLabel();
        usernametxt1 = new javax.swing.JLabel();
        passwordtxt1 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        loginbutton1 = new javax.swing.JButton();
        usernameField = new javax.swing.JTextField();
        loginbg1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setMinimumSize(null);
        setPreferredSize(new java.awt.Dimension(1280, 832));
        setSize(new java.awt.Dimension(1280, 832));
        getContentPane().setLayout(null);

        centerpanel1.setBackground(new java.awt.Color(255, 255, 255));
        centerpanel1.setPreferredSize(new java.awt.Dimension(458, 565));

        samplehospinctxt1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        samplehospinctxt1.setForeground(new java.awt.Color(2, 113, 121));
        samplehospinctxt1.setText("Sample Clinic Inc.");

        patientappointmenttxt1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        patientappointmenttxt1.setText("Patient Appointment");

        systemtxt1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        systemtxt1.setText("System");

        hospicon1.setBackground(new java.awt.Color(2, 113, 121));
        hospicon1.setForeground(new java.awt.Color(2, 113, 121));
        hospicon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hospicon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/HospitalIconGreen.png"))); // NOI18N

        usernametxt1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        usernametxt1.setText("Username");

        passwordtxt1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        passwordtxt1.setText("Password");

        passwordField.setBackground(new java.awt.Color(204, 204, 204));
        passwordField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        passwordField.setAutoscrolls(false);
        passwordField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1)));

        loginbutton1.setBackground(new java.awt.Color(2, 113, 121));
        loginbutton1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        loginbutton1.setForeground(new java.awt.Color(255, 255, 255));
        loginbutton1.setText("Login");
        loginbutton1.setBorder(null);
        loginbutton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbutton1ActionPerformed(evt);
            }
        });

        usernameField.setBackground(new java.awt.Color(204, 204, 204));
        usernameField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        usernameField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        usernameField.setAutoscrolls(false);
        usernameField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1)));
        usernameField.setMinimumSize(new java.awt.Dimension(64, 19));
        usernameField.setPreferredSize(new java.awt.Dimension(64, 19));

        javax.swing.GroupLayout centerpanel1Layout = new javax.swing.GroupLayout(centerpanel1);
        centerpanel1.setLayout(centerpanel1Layout);
        centerpanel1Layout.setHorizontalGroup(
            centerpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centerpanel1Layout.createSequentialGroup()
                .addGroup(centerpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(centerpanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(centerpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordtxt1)
                            .addComponent(usernametxt1)
                            .addComponent(passwordField)
                            .addComponent(usernameField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(patientappointmenttxt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, centerpanel1Layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(systemtxt1)
                                .addGap(111, 111, 111))))
                    .addGroup(centerpanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(hospicon1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(samplehospinctxt1))
                    .addGroup(centerpanel1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(loginbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        centerpanel1Layout.setVerticalGroup(
            centerpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centerpanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(centerpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hospicon1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, centerpanel1Layout.createSequentialGroup()
                        .addComponent(samplehospinctxt1)
                        .addGap(16, 16, 16)))
                .addGap(35, 35, 35)
                .addComponent(patientappointmenttxt1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(systemtxt1)
                .addGap(26, 26, 26)
                .addComponent(usernametxt1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(passwordtxt1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(loginbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        getContentPane().add(centerpanel1);
        centerpanel1.setBounds(410, 130, 458, 565);

        loginbg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pg1bg.png"))); // NOI18N
        loginbg1.setText("jLabel1");
        getContentPane().add(loginbg1);
        loginbg1.setBounds(0, 0, 1280, 840);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbutton1ActionPerformed
        String userName = usernameField.getText();
        String passWord = passwordField.getText();

        if ("admin".equals(userName) && "admin".equals(passWord)) {
            JOptionPane.showMessageDialog(this, "Login successful!");
            PageTwo PageTwoFrame = new PageTwo();
            PageTwoFrame.setVisible(true);
            PageTwoFrame.setLocationRelativeTo(null);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password.", "Login Failed", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_loginbutton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel centerpanel1;
    private javax.swing.JLabel hospicon1;
    private javax.swing.JLabel loginbg1;
    private javax.swing.JButton loginbutton1;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordtxt1;
    private javax.swing.JLabel patientappointmenttxt1;
    private javax.swing.JLabel samplehospinctxt1;
    private javax.swing.JLabel systemtxt1;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernametxt1;
    // End of variables declaration//GEN-END:variables
}
