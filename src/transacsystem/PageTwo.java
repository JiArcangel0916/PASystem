package transacsystem;

public class PageTwo extends javax.swing.JFrame {

    public PageTwo() {
        super("PAS | Dasboard");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bookappointmentpanel2 = new javax.swing.JPanel();
        bookappointmentbutton2 = new javax.swing.JButton();
        billingpanel2 = new javax.swing.JPanel();
        appointmentLogButton = new javax.swing.JButton();
        logoutpanel2 = new javax.swing.JPanel();
        logoutbutton2 = new javax.swing.JButton();
        patientlogpanel = new javax.swing.JPanel();
        patientLogButton = new javax.swing.JButton();
        hospicon2 = new javax.swing.JLabel();
        samplehospinctxt2 = new javax.swing.JLabel();
        pagetwobg2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1280, 840));
        setPreferredSize(new java.awt.Dimension(1280, 840));
        setSize(new java.awt.Dimension(1280, 840));
        getContentPane().setLayout(null);

        bookappointmentpanel2.setBackground(new java.awt.Color(2, 113, 121));

        bookappointmentbutton2.setBackground(new java.awt.Color(2, 113, 121));
        bookappointmentbutton2.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        bookappointmentbutton2.setForeground(new java.awt.Color(255, 255, 255));
        bookappointmentbutton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BookAppointmentIconFINAL.png"))); // NOI18N
        bookappointmentbutton2.setText("Book Appointment");
        bookappointmentbutton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 20, 0, 0));
        bookappointmentbutton2.setBorderPainted(false);
        bookappointmentbutton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bookappointmentbutton2.setFocusable(false);
        bookappointmentbutton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bookappointmentbutton2.setIconTextGap(25);
        bookappointmentbutton2.setMaximumSize(new java.awt.Dimension(470, 100));
        bookappointmentbutton2.setMinimumSize(new java.awt.Dimension(470, 100));
        bookappointmentbutton2.setPreferredSize(new java.awt.Dimension(470, 100));
        bookappointmentbutton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookappointmentbutton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bookappointmentpanel2Layout = new javax.swing.GroupLayout(bookappointmentpanel2);
        bookappointmentpanel2.setLayout(bookappointmentpanel2Layout);
        bookappointmentpanel2Layout.setHorizontalGroup(
            bookappointmentpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookappointmentpanel2Layout.createSequentialGroup()
                .addComponent(bookappointmentbutton2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bookappointmentpanel2Layout.setVerticalGroup(
            bookappointmentpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookappointmentpanel2Layout.createSequentialGroup()
                .addComponent(bookappointmentbutton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(bookappointmentpanel2);
        bookappointmentpanel2.setBounds(430, 180, 470, 100);

        billingpanel2.setBackground(new java.awt.Color(2, 113, 121));
        billingpanel2.setMaximumSize(new java.awt.Dimension(470, 100));

        appointmentLogButton.setBackground(new java.awt.Color(2, 113, 121));
        appointmentLogButton.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        appointmentLogButton.setForeground(new java.awt.Color(255, 255, 255));
        appointmentLogButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AppointmentLogIconFINAL.png"))); // NOI18N
        appointmentLogButton.setText("Appointment Log");
        appointmentLogButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 25, 0, 0));
        appointmentLogButton.setBorderPainted(false);
        appointmentLogButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        appointmentLogButton.setFocusable(false);
        appointmentLogButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        appointmentLogButton.setIconTextGap(25);
        appointmentLogButton.setOpaque(true);
        appointmentLogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentLogButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout billingpanel2Layout = new javax.swing.GroupLayout(billingpanel2);
        billingpanel2.setLayout(billingpanel2Layout);
        billingpanel2Layout.setHorizontalGroup(
            billingpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, billingpanel2Layout.createSequentialGroup()
                .addComponent(appointmentLogButton, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        billingpanel2Layout.setVerticalGroup(
            billingpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billingpanel2Layout.createSequentialGroup()
                .addComponent(appointmentLogButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        appointmentLogButton.getAccessibleContext().setAccessibleName("billingButton");

        getContentPane().add(billingpanel2);
        billingpanel2.setBounds(430, 315, 470, 100);

        logoutpanel2.setBackground(new java.awt.Color(255, 175, 46));
        logoutpanel2.setMinimumSize(new java.awt.Dimension(470, 80));
        logoutpanel2.setPreferredSize(new java.awt.Dimension(470, 80));

        logoutbutton2.setBackground(new java.awt.Color(255, 175, 46));
        logoutbutton2.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        logoutbutton2.setForeground(new java.awt.Color(255, 255, 255));
        logoutbutton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LogoutIconFINAL.png"))); // NOI18N
        logoutbutton2.setText("Logout");
        logoutbutton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 30, 0, 0));
        logoutbutton2.setBorderPainted(false);
        logoutbutton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutbutton2.setFocusPainted(false);
        logoutbutton2.setFocusable(false);
        logoutbutton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        logoutbutton2.setIconTextGap(25);
        logoutbutton2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        logoutbutton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbutton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout logoutpanel2Layout = new javax.swing.GroupLayout(logoutpanel2);
        logoutpanel2.setLayout(logoutpanel2Layout);
        logoutpanel2Layout.setHorizontalGroup(
            logoutpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoutbutton2, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );
        logoutpanel2Layout.setVerticalGroup(
            logoutpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutpanel2Layout.createSequentialGroup()
                .addComponent(logoutbutton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(logoutpanel2);
        logoutpanel2.setBounds(430, 600, 470, 80);

        patientlogpanel.setBackground(new java.awt.Color(2, 113, 121));
        patientlogpanel.setMaximumSize(new java.awt.Dimension(470, 100));

        patientLogButton.setBackground(new java.awt.Color(2, 113, 121));
        patientLogButton.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        patientLogButton.setForeground(new java.awt.Color(255, 255, 255));
        patientLogButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PatientLogIconFINAL (1).png"))); // NOI18N
        patientLogButton.setText("Patients Log");
        patientLogButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 25, 0, 0));
        patientLogButton.setBorderPainted(false);
        patientLogButton.setFocusPainted(false);
        patientLogButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        patientLogButton.setIconTextGap(20);
        patientLogButton.setMaximumSize(new java.awt.Dimension(415, 59));
        patientLogButton.setMinimumSize(new java.awt.Dimension(415, 59));
        patientLogButton.setOpaque(true);
        patientLogButton.setPreferredSize(new java.awt.Dimension(415, 59));
        patientLogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientLogButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout patientlogpanelLayout = new javax.swing.GroupLayout(patientlogpanel);
        patientlogpanel.setLayout(patientlogpanelLayout);
        patientlogpanelLayout.setHorizontalGroup(
            patientlogpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(patientLogButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );
        patientlogpanelLayout.setVerticalGroup(
            patientlogpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(patientLogButton, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        getContentPane().add(patientlogpanel);
        patientlogpanel.setBounds(430, 450, 470, 100);

        hospicon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Eyecon.JPG"))); // NOI18N
        getContentPane().add(hospicon2);
        hospicon2.setBounds(50, 50, 45, 40);

        samplehospinctxt2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        samplehospinctxt2.setForeground(new java.awt.Color(255, 255, 255));
        samplehospinctxt2.setText("Sample Clinic Inc.");
        getContentPane().add(samplehospinctxt2);
        samplehospinctxt2.setBounds(110, 60, 180, 16);

        pagetwobg2.setBackground(new java.awt.Color(2, 113, 121));
        pagetwobg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DashboardPageBG.png"))); // NOI18N
        pagetwobg2.setText("Patient Log");
        pagetwobg2.setMaximumSize(new java.awt.Dimension(1280, 840));
        pagetwobg2.setMinimumSize(new java.awt.Dimension(1280, 840));
        pagetwobg2.setPreferredSize(new java.awt.Dimension(1280, 840));
        getContentPane().add(pagetwobg2);
        pagetwobg2.setBounds(0, 0, 1280, 840);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookappointmentbutton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookappointmentbutton2ActionPerformed
        NewOrExisiting Dialog = new NewOrExisiting(this);
        Dialog.setVisible(true);
        Dialog.setLocationRelativeTo(null);
    }//GEN-LAST:event_bookappointmentbutton2ActionPerformed

    private void appointmentLogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentLogButtonActionPerformed
        AppointmentLog log = new AppointmentLog();
        log.setVisible(true);
        log.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_appointmentLogButtonActionPerformed

    private void logoutbutton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbutton2ActionPerformed
        PageOne PageOneFrame = new PageOne();
        PageOneFrame.setVisible(true);
        PageOneFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_logoutbutton2ActionPerformed

    private void patientLogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientLogButtonActionPerformed
        PatientsLog patients = new PatientsLog();
        patients.setVisible(true);
        patients.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_patientLogButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PageTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PageTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PageTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PageTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PageTwo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton appointmentLogButton;
    private javax.swing.JPanel billingpanel2;
    private javax.swing.JButton bookappointmentbutton2;
    private javax.swing.JPanel bookappointmentpanel2;
    private javax.swing.JLabel hospicon2;
    private javax.swing.JButton logoutbutton2;
    private javax.swing.JPanel logoutpanel2;
    private javax.swing.JLabel pagetwobg2;
    private javax.swing.JButton patientLogButton;
    private javax.swing.JPanel patientlogpanel;
    private javax.swing.JLabel samplehospinctxt2;
    // End of variables declaration//GEN-END:variables
}
