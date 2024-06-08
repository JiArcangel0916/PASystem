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
        patientsLogButton = new javax.swing.JButton();
        logoutpanel2 = new javax.swing.JPanel();
        logoutbutton2 = new javax.swing.JButton();
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
        bookappointmentbutton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BookAppointment.JPG"))); // NOI18N
        bookappointmentbutton2.setText("Book Appointment");
        bookappointmentbutton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 20, 0, 0));
        bookappointmentbutton2.setBorderPainted(false);
        bookappointmentbutton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bookappointmentbutton2.setFocusable(false);
        bookappointmentbutton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bookappointmentbutton2.setIconTextGap(20);
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
                .addComponent(bookappointmentbutton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bookappointmentpanel2Layout.setVerticalGroup(
            bookappointmentpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookappointmentpanel2Layout.createSequentialGroup()
                .addComponent(bookappointmentbutton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(bookappointmentpanel2);
        bookappointmentpanel2.setBounds(430, 210, 470, 100);

        billingpanel2.setBackground(new java.awt.Color(2, 113, 121));

        patientsLogButton.setBackground(new java.awt.Color(2, 113, 121));
        patientsLogButton.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        patientsLogButton.setForeground(new java.awt.Color(255, 255, 255));
        patientsLogButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Billing.JPG"))); // NOI18N
        patientsLogButton.setText("Patient Log");
        patientsLogButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 25, 0, 0));
        patientsLogButton.setBorderPainted(false);
        patientsLogButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        patientsLogButton.setFocusable(false);
        patientsLogButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        patientsLogButton.setIconTextGap(25);
        patientsLogButton.setOpaque(true);
        patientsLogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientsLogButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout billingpanel2Layout = new javax.swing.GroupLayout(billingpanel2);
        billingpanel2.setLayout(billingpanel2Layout);
        billingpanel2Layout.setHorizontalGroup(
            billingpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billingpanel2Layout.createSequentialGroup()
                .addComponent(patientsLogButton, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        billingpanel2Layout.setVerticalGroup(
            billingpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billingpanel2Layout.createSequentialGroup()
                .addComponent(patientsLogButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        patientsLogButton.getAccessibleContext().setAccessibleName("billingButton");

        getContentPane().add(billingpanel2);
        billingpanel2.setBounds(430, 350, 470, 100);

        logoutpanel2.setBackground(new java.awt.Color(255, 175, 46));
        logoutpanel2.setMinimumSize(new java.awt.Dimension(470, 80));
        logoutpanel2.setPreferredSize(new java.awt.Dimension(470, 80));

        logoutbutton2.setBackground(new java.awt.Color(255, 175, 46));
        logoutbutton2.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        logoutbutton2.setForeground(new java.awt.Color(255, 255, 255));
        logoutbutton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logout.JPG"))); // NOI18N
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

        hospicon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Eyecon.JPG"))); // NOI18N
        getContentPane().add(hospicon2);
        hospicon2.setBounds(50, 50, 45, 40);

        samplehospinctxt2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        samplehospinctxt2.setForeground(new java.awt.Color(255, 255, 255));
        samplehospinctxt2.setText("Sample Clinic Inc.");
        getContentPane().add(samplehospinctxt2);
        samplehospinctxt2.setBounds(110, 60, 180, 16);

        pagetwobg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DashboardPageBG.png"))); // NOI18N
        pagetwobg2.setText("jLabel1");
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

    private void patientsLogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientsLogButtonActionPerformed
        PatientLog log = new PatientLog();
        log.setVisible(true);
        log.setLocationRelativeTo(null);
        this.dispose();
        
//        BillingList Bill = new BillingList();
//        Bill.setVisible(true);
//        Bill.setLocationRelativeTo(null);
//        this.dispose();
    }//GEN-LAST:event_patientsLogButtonActionPerformed

    private void logoutbutton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbutton2ActionPerformed
        PageOne PageOneFrame = new PageOne();
        PageOneFrame.setVisible(true);
        PageOneFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_logoutbutton2ActionPerformed

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
    private javax.swing.JPanel billingpanel2;
    private javax.swing.JButton bookappointmentbutton2;
    private javax.swing.JPanel bookappointmentpanel2;
    private javax.swing.JLabel hospicon2;
    private javax.swing.JButton logoutbutton2;
    private javax.swing.JPanel logoutpanel2;
    private javax.swing.JLabel pagetwobg2;
    private javax.swing.JButton patientsLogButton;
    private javax.swing.JLabel samplehospinctxt2;
    // End of variables declaration//GEN-END:variables
}
