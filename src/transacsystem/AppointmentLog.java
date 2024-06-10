package transacsystem;

import java.awt.Color;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.table.JTableHeader;
import java.sql.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.SwingConstants;

public class AppointmentLog extends javax.swing.JFrame {

    private Connection con;
    private DefaultTableCellRenderer center = new DefaultTableCellRenderer();

    public AppointmentLog() {
        super("PAS | Appointments Log");
        createConnection();
        initComponents();

        JTableHeader tableHeader = AppointmentsTable.getTableHeader();
        tableHeader.setBackground(new Color(2, 113, 121));
        tableHeader.setForeground(Color.WHITE);
        tableHeader.setFont(new Font("Century Gothic", Font.BOLD, 18));
        refreshbutton4.doClick();
        searchField.setText("Search Surname");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toppanel4 = new javax.swing.JPanel();
        patientlogtxt4 = new javax.swing.JLabel();
        backbutton4 = new javax.swing.JButton();
        selectbutton4 = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        trashbutton4 = new javax.swing.JButton();
        refreshbutton4 = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        AppointmentsTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 250, 250));
        setMinimumSize(new java.awt.Dimension(1280, 840));
        setPreferredSize(new java.awt.Dimension(1280, 840));
        setSize(new java.awt.Dimension(1280, 840));
        getContentPane().setLayout(null);

        toppanel4.setBackground(new java.awt.Color(2, 113, 121));
        toppanel4.setMinimumSize(new java.awt.Dimension(780, 94));

        patientlogtxt4.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        patientlogtxt4.setForeground(new java.awt.Color(255, 255, 255));
        patientlogtxt4.setText("Appointment Log");

        javax.swing.GroupLayout toppanel4Layout = new javax.swing.GroupLayout(toppanel4);
        toppanel4.setLayout(toppanel4Layout);
        toppanel4Layout.setHorizontalGroup(
            toppanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toppanel4Layout.createSequentialGroup()
                .addGap(482, 482, 482)
                .addComponent(patientlogtxt4)
                .addContainerGap(495, Short.MAX_VALUE))
        );
        toppanel4Layout.setVerticalGroup(
            toppanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toppanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(patientlogtxt4)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(toppanel4);
        toppanel4.setBounds(0, 0, 1280, 94);

        backbutton4.setBackground(new java.awt.Color(204, 204, 204));
        backbutton4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        backbutton4.setText("Back");
        backbutton4.setBorder(null);
        backbutton4.setBorderPainted(false);
        backbutton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbutton4.setFocusPainted(false);
        backbutton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbutton4ActionPerformed(evt);
            }
        });
        getContentPane().add(backbutton4);
        backbutton4.setBounds(100, 160, 90, 50);

        selectbutton4.setBackground(new java.awt.Color(255, 175, 46));
        selectbutton4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        selectbutton4.setForeground(new java.awt.Color(255, 255, 255));
        selectbutton4.setText("Select");
        selectbutton4.setBorder(null);
        selectbutton4.setBorderPainted(false);
        selectbutton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectbutton4.setFocusPainted(false);
        selectbutton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectbutton4ActionPerformed(evt);
            }
        });
        getContentPane().add(selectbutton4);
        selectbutton4.setBounds(470, 720, 130, 50);

        searchButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Albrecht Arcangel\\Downloads\\SystemResources\\SearchIconWhite.png")); // NOI18N
        searchButton.setBorder(null);
        searchButton.setBorderPainted(false);
        searchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchButton.setFocusPainted(false);
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(searchButton);
        searchButton.setBounds(1160, 160, 50, 40);

        trashbutton4.setBackground(new java.awt.Color(255, 175, 46));
        trashbutton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TrashButtonTrashFINAL.png"))); // NOI18N
        trashbutton4.setBorder(null);
        trashbutton4.setBorderPainted(false);
        trashbutton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        trashbutton4.setFocusPainted(false);
        trashbutton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trashbutton4ActionPerformed(evt);
            }
        });
        getContentPane().add(trashbutton4);
        trashbutton4.setBounds(680, 720, 60, 50);

        refreshbutton4.setBackground(new java.awt.Color(255, 175, 46));
        refreshbutton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RefreshIconWhiteFINAL.png"))); // NOI18N
        refreshbutton4.setBorder(null);
        refreshbutton4.setBorderPainted(false);
        refreshbutton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refreshbutton4.setFocusPainted(false);
        refreshbutton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshbutton4ActionPerformed(evt);
            }
        });
        getContentPane().add(refreshbutton4);
        refreshbutton4.setBounds(610, 720, 60, 50);

        searchField.setBackground(new java.awt.Color(204, 204, 204));
        searchField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        searchField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        searchField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        searchField.setMinimumSize(new java.awt.Dimension(76, 4));
        searchField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchFieldFocusGained(evt);
            }
        });
        getContentPane().add(searchField);
        searchField.setBounds(930, 160, 230, 40);

        AppointmentsTable.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        AppointmentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Last Name", "First Name", "Last Visit"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AppointmentsTable.setGridColor(new java.awt.Color(2, 113, 121));
        AppointmentsTable.setRowHeight(40);
        AppointmentsTable.setSelectionForeground(new java.awt.Color(2, 113, 121));
        AppointmentsTable.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        AppointmentsTable.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        AppointmentsTable.setShowGrid(true);
        AppointmentsTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(AppointmentsTable);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(260, 240, 730, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backbutton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbutton4ActionPerformed
        PageTwo Dashboard = new PageTwo();
        Dashboard.setVisible(true);
        Dashboard.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_backbutton4ActionPerformed

    private void selectbutton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectbutton4ActionPerformed
        int row = AppointmentsTable.getSelectedRow();
        if (row >= 0) {
            String lastName = AppointmentsTable.getValueAt(row, 0).toString();
            String firstName = AppointmentsTable.getValueAt(row, 1).toString();
            String lastVisit = AppointmentsTable.getValueAt(row, 2).toString();

            Summary summary = new Summary(lastName, firstName, lastVisit);
            summary.setVisible(true);
            summary.setLocationRelativeTo(null);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Please select a patient from the table.", "No Patient Selected", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_selectbutton4ActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String search = searchField.getText();
        PreparedStatement stat;
        ResultSet res;
        String lastName, firstName, lastVisit;

        try {
            String sql = "SELECT `Last Name`, `First Name`, `Schedule` FROM pasystem.patient WHERE `Last Name` LIKE ?";
            stat = con.prepareStatement(sql);
            stat.setString(1, "%" + search + "%");

            res = stat.executeQuery();

            DefaultTableModel resModel = new DefaultTableModel();
            resModel.addColumn("Last Name");
            resModel.addColumn("First Name");
            resModel.addColumn("Last Visit");

            while (res.next()) {
                lastName = res.getString("Last Name");
                firstName = res.getString("First Name");
                lastVisit = res.getString("Schedule");
                resModel.addRow(new Object[]{lastName, firstName, lastVisit});
            }

            AppointmentsTable.setModel(resModel);
            center.setHorizontalAlignment(SwingConstants.CENTER);

            for (int i = 0; i < AppointmentsTable.getColumnCount(); i++) {
                AppointmentsTable.getColumnModel().getColumn(i).setCellRenderer(center);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "This person is not in the Patient Log", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void trashbutton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trashbutton4ActionPerformed
        int row = AppointmentsTable.getSelectedRow();
        int resp;
        //If may naselect na row ang user
        if (row >= 0) {
            resp = JOptionPane.showConfirmDialog(null, "Delete scheduled appointment?", "Deleting Appointment", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (resp == 0) {
                try {
                    String lastName = AppointmentsTable.getValueAt(row, 0).toString();
                    String firstName = AppointmentsTable.getValueAt(row, 1).toString();
                    String lastVisit = AppointmentsTable.getValueAt(row, 2).toString();
                    String sql = "DELETE FROM pasystem.patient WHERE `Last Name` = ? AND `First Name` = ? AND `Schedule` = ?";

                    //Pinalitan yung mga question mark sa String sql
                    try (PreparedStatement stat = con.prepareStatement(sql)) {
                        stat.setString(1, lastName);
                        stat.setString(2, firstName);
                        stat.setString(3, lastVisit);
                        stat.executeUpdate();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                refreshbutton4.doClick();
            }
        //If walang naselect na row ang user
        } else {
            JOptionPane.showMessageDialog(this, "No patient selected to delete", "No Patient Selected", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_trashbutton4ActionPerformed

    private void refreshbutton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshbutton4ActionPerformed
        DefaultTableModel tbMod = new DefaultTableModel();
        String sql = "SELECT * FROM pasystem.patient";
        try {
            Statement stat = con.createStatement();
            ResultSet res = stat.executeQuery(sql);

            tbMod.addColumn("Last Name");
            tbMod.addColumn("First Name");
            tbMod.addColumn("Last Visit");

            while (res.next()) {
                String lName = res.getString("Last Name");
                String fName = res.getString("First Name");
                String lVisit = res.getString("Schedule");
                tbMod.addRow(new Object[]{lName, fName, lVisit});
            }
            
            //Setting the model of the table to the created table
            AppointmentsTable.setModel(tbMod);
            
            //Center the cells of each column
            center.setHorizontalAlignment(SwingConstants.CENTER);

            for (int i = 0; i < AppointmentsTable.getColumnCount(); i++) {
                AppointmentsTable.getColumnModel().getColumn(i).setCellRenderer(center);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_refreshbutton4ActionPerformed

    private void searchFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusGained
        searchField.setText("");
    }//GEN-LAST:event_searchFieldFocusGained

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
            java.util.logging.Logger.getLogger(AppointmentLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppointmentLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppointmentLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppointmentLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppointmentLog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AppointmentsTable;
    private javax.swing.JButton backbutton4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel patientlogtxt4;
    private javax.swing.JButton refreshbutton4;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton selectbutton4;
    private javax.swing.JPanel toppanel4;
    private javax.swing.JButton trashbutton4;
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
