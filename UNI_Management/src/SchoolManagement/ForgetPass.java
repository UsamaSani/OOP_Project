/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SchoolManagement;
import java.sql.*;
import java.util.logging.*;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author usama
 */
public class ForgetPass extends javax.swing.JFrame {

    /**
     * Creates new form ForgetPass
     */
    public ForgetPass() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        fpemail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        FNewPass = new javax.swing.JPasswordField();
        SavePassBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        FRBackBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(0, 25, 15));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("NEW PASSWORD");

        fpemail.setBackground(new java.awt.Color(204, 204, 204));
        fpemail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        fpemail.setForeground(new java.awt.Color(0, 0, 0));
        fpemail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fpemail.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));
        fpemail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fpemailMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Email");

        FNewPass.setBackground(new java.awt.Color(204, 204, 204));
        FNewPass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        FNewPass.setForeground(new java.awt.Color(0, 0, 0));
        FNewPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FNewPass.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));

        SavePassBtn.setBackground(new java.awt.Color(0, 25, 15));
        SavePassBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SavePassBtn.setForeground(new java.awt.Color(204, 204, 204));
        SavePassBtn.setText("SAVE");
        SavePassBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SavePassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavePassBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fpemail)
                            .addComponent(FNewPass, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(SavePassBtn)
                        .addGap(232, 232, 232))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fpemail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(FNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(SavePassBtn)
                .addGap(25, 25, 25))
        );

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        FRBackBtn.setBackground(new java.awt.Color(0, 0, 0));
        FRBackBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        FRBackBtn.setForeground(new java.awt.Color(204, 204, 204));
        FRBackBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SchoolManagement/icons8-back-button-50.png"))); // NOI18N
        FRBackBtn.setBorder(null);
        FRBackBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FRBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FRBackBtnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Showcard Gothic", 1, 60)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Forget");

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FRBackBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(247, 247, 247)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(323, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(271, 271, 271))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(FRBackBtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SavePassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavePassBtnActionPerformed
    ResultSet rs;
    PreparedStatement st;
    
    if (fpemail.getText().trim().isEmpty() || new String(FNewPass.getPassword()).trim().isEmpty()) {
        JOptionPane.showMessageDialog(rootPane, "The input field cannot be empty");
    } else {
        try {
            Db_con db = new Db_con();
            Connection con = db.con;
            String checkOldPasswordQuery = "SELECT * FROM teacherinfo WHERE Email = ? AND Password = ?";
            st = con.prepareStatement(checkOldPasswordQuery);
            st.setString(1, fpemail.getText());
            st.setString(2, new String(FNewPass.getPassword()));
            rs = st.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(rootPane, "New password cannot be the same as the old password.");
            } else {
                
                String updateQuery = "UPDATE teacherinfo SET Password = ? WHERE Email = ?";
                st = con.prepareStatement(updateQuery);
                st.setString(1, new String(FNewPass.getPassword()));
                st.setString(2, fpemail.getText());
                int count = st.executeUpdate();

                if (count > 0) {
                    JOptionPane.showMessageDialog(rootPane, "Password updated successfully");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Password update failed");
                }
            }

            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    fpemail.setText("");
    FNewPass.setText("");
    }//GEN-LAST:event_SavePassBtnActionPerformed

    private void FRBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FRBackBtnActionPerformed
        Login lg = new Login();
        lg.setVisible(true);
        dispose();
    }//GEN-LAST:event_FRBackBtnActionPerformed

    private void fpemailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fpemailMouseExited
     ResultSet rs;
    PreparedStatement st;
    }//GEN-LAST:event_fpemailMouseExited

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
            java.util.logging.Logger.getLogger(ForgetPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgetPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgetPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgetPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgetPass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField FNewPass;
    private javax.swing.JButton FRBackBtn;
    private javax.swing.JButton SavePassBtn;
    private javax.swing.JTextField fpemail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}