package transacsystem;

import javax.swing.JFrame;

public class CancelDialog extends javax.swing.JFrame {

    private final JFrame RegForm;
    private final JFrame temp;
    
    public CancelDialog(JFrame RegForm) {
        super("Cancel Appointment Booking");
        initComponents();
        this.RegForm = RegForm;
        this.temp = null;
    }

    public CancelDialog(JFrame RegForm, JFrame temp) {
        super("Cancel Appointment Booking");
        initComponents();
        this.RegForm = RegForm;
        this.temp = temp;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        noButton = new javax.swing.JButton();
        yesButton = new javax.swing.JButton();

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(510, 340));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(510, 280));
        jPanel2.setMinimumSize(new java.awt.Dimension(510, 280));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/QuestionMark.JPG"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel2.setText("Cancel Booking?");

        noButton.setBackground(new java.awt.Color(255, 175, 46));
        noButton.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        noButton.setForeground(new java.awt.Color(255, 255, 255));
        noButton.setText("No");
        noButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        noButton.setBorderPainted(false);
        noButton.setFocusPainted(false);
        noButton.setMaximumSize(new java.awt.Dimension(56, 35));
        noButton.setMinimumSize(new java.awt.Dimension(56, 35));
        noButton.setPreferredSize(new java.awt.Dimension(56, 35));
        noButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noButtonActionPerformed(evt);
            }
        });

        yesButton.setBackground(new java.awt.Color(204, 204, 204));
        yesButton.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        yesButton.setText("Yes");
        yesButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        yesButton.setBorderPainted(false);
        yesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(noButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(54, 54, 54)
                            .addComponent(yesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addGap(68, 68, 68)))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesButtonActionPerformed
        setVisible(false);
        PageTwo pgTwo = new PageTwo();
        pgTwo.setVisible(true);
        pgTwo.setLocationRelativeTo(null);
        this.RegForm.dispose();
        this.temp.dispose();
        this.dispose();
    }//GEN-LAST:event_yesButtonActionPerformed

    private void noButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noButtonActionPerformed
        setVisible(false);
        this.dispose();
    }//GEN-LAST:event_noButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CancelDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CancelDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CancelDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CancelDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new CancelDialog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton noButton;
    private javax.swing.JButton yesButton;
    // End of variables declaration//GEN-END:variables
}
