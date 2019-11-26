/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posProjectForTuring.ui;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import posProjectForTuring.model.Admin;
import posProjectForTuring.model.Cashier;
import posProjectForTuring.model.service.AdminService;
import posProjectForTuring.model.service.CashierService;
import posProjectForTuring.model.service.impl.AdminServiceImpl;
import posProjectForTuring.model.service.impl.CashierServiceImpl;

/**
 *
 * @author hp
 */
public class MainLogin extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public MainLogin() {
        initComponents();
            this.btnAdminSetup.setVisible(true);
    }

    public boolean isAdminExist(){
        boolean bool;
        AdminService adminService = new AdminServiceImpl();        
        List<Admin> adminList = new ArrayList<Admin>();
        
        adminList = adminService.getAllAdmin();
        
        if(adminList.isEmpty()){
            bool = false;
        }
        else{
            bool = true;
        }
        
        return bool;
    }
    public boolean isCashierExist(){
        boolean bool;
        
        CashierService cashierService = new CashierServiceImpl();
        List<Cashier> cashierList = new ArrayList<Cashier>();
        
        cashierList = cashierService.getAllCashiers();
        
        if(cashierList.isEmpty()){
            bool = false;
        }
        else{
            bool = true;
        }
        
        return bool;
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
        jLabel2 = new javax.swing.JLabel();
        btnAdminLogin = new javax.swing.JButton();
        btnCashierLogin = new javax.swing.JButton();
        btnAdminSetup = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 204));
        setLocation(new java.awt.Point(600, 200));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(Color.decode("#263238"));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("SELECT USER TYPE");

        btnAdminLogin.setBackground(Color.decode("#263238"));
        btnAdminLogin.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        btnAdminLogin.setForeground(new java.awt.Color(240, 240, 240));
        btnAdminLogin.setText("ADMIN");
        btnAdminLogin.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 10, 1, 0, new java.awt.Color(240, 240, 240)));
        btnAdminLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdminLogin.setFocusPainted(false);
        btnAdminLogin.setFocusable(false);
        btnAdminLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminLoginActionPerformed(evt);
            }
        });

        btnCashierLogin.setBackground(Color.decode("#263238"));
        btnCashierLogin.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        btnCashierLogin.setForeground(new java.awt.Color(240, 240, 240));
        btnCashierLogin.setText("CASHIER");
        btnCashierLogin.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 10, 1, 0, new java.awt.Color(240, 240, 240)));
        btnCashierLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCashierLogin.setFocusPainted(false);
        btnCashierLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCashierLoginActionPerformed(evt);
            }
        });

        btnAdminSetup.setBackground(Color.decode("#263238"));
        btnAdminSetup.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        btnAdminSetup.setForeground(new java.awt.Color(240, 240, 240));
        btnAdminSetup.setText("FIRST TIME ADMIN SETUP");
        btnAdminSetup.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 5, new java.awt.Color(240, 240, 240)));
        btnAdminSetup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdminSetup.setFocusable(false);
        btnAdminSetup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminSetupActionPerformed(evt);
            }
        });

        jButton2.setBackground(Color.decode("#263238"));
        jButton2.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(240, 240, 240));
        jButton2.setText("QUIT");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 5, 0, 0, new java.awt.Color(240, 240, 240)));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnAdminSetup, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(303, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2)
                            .addComponent(btnAdminLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCashierLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(btnAdminLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(btnCashierLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdminSetup, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
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

    private void btnAdminSetupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminSetupActionPerformed
        AdminAccountRegistration adminAccountRegistration = new AdminAccountRegistration();
        adminAccountRegistration.setVisible(true);
    }//GEN-LAST:event_btnAdminSetupActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnAdminLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminLoginActionPerformed
        if(!isAdminExist()){
            JOptionPane.showMessageDialog(null, "Admin account does not exist!\nPlease Setup an Admin account first!", "NO ADMIN ACCOUNT!", WARNING_MESSAGE);
        }
        else{
            AdminLogin adminLogin = new AdminLogin();
            adminLogin.setVisible(true);
        }
    }//GEN-LAST:event_btnAdminLoginActionPerformed

    private void btnCashierLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCashierLoginActionPerformed
        if(!isCashierExist()){
            JOptionPane.showMessageDialog(null, "Cashier account does not exist!\nAsk your supervisor for more information!", "NO CASHIER ACCOUNT!", WARNING_MESSAGE);
        }
        else{
            CashierLogin cashierLogin = new CashierLogin();
            cashierLogin.setVisible(true);
        }
    }//GEN-LAST:event_btnCashierLoginActionPerformed

    static MainLogin mainLogin;
    public static void disposeMainLogin(){
        mainLogin.dispose();
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
            java.util.logging.Logger.getLogger(MainLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                        if ("Metal".equals(info.getName())) {
                            javax.swing.UIManager.setLookAndFeel(info.getClassName());
                            break;
                        }
                    }
                } catch (Exception e){
                    e.printStackTrace();
                }
                new MainLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminLogin;
    private javax.swing.JButton btnAdminSetup;
    private javax.swing.JButton btnCashierLogin;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}