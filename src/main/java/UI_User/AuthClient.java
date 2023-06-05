/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_User;

import UI.ClientouAdmin;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import com.directmedia.onlinestore.applicationlocationdevoiture.*;

/**
 *
 * @author pc
 */
public class AuthClient extends javax.swing.JFrame {

    /**
     * Creates new form AuthClient
     */
    public AuthClient() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLogin1 = new javax.swing.JTextField();
        jPassword1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Username");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 169, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Password");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 243, -1, -1));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Se connecter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 331, -1, -1));

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Retour");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 331, -1, -1));

        jLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogin1ActionPerformed(evt);
            }
        });
        jPanel2.add(jLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 167, 144, -1));
        jPanel2.add(jPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 144, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 51));
        jLabel4.setText("Client");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 26, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\bengh\\OneDrive\\Documents\\cv.jpg")); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -4, 780, 410));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
       String email = jLogin1.getText();
    String password = jPassword1.getText().toString();
    
    if (email.equals("admin") && password.equals("admin")) {
        int resAuth = Admin.authentification2(email, password);
        idSession = resAuth;

        JFrame jf = new JFrame();
        JOptionPane jOp = new JOptionPane();
        if (resAuth != -1) {
            jOp.showMessageDialog(jf, "Connexion réussie", "Bienvenue", JOptionPane.PLAIN_MESSAGE);
            this.setVisible(false);
            MenuAdmin mProf = new MenuAdmin();
            mProf.setVisible(true);
        } else {
            jOp.showMessageDialog(jf, "Connexion erronée", "Erreur", JOptionPane.ERROR_MESSAGE);
        } 
    } else {
        int resAuth = Client.authentification2(email, password);
        idSession = resAuth;
        
        JFrame jf = new JFrame();
        JOptionPane jOp = new JOptionPane();
        if (resAuth != -1) {
            jOp.showMessageDialog(jf, "Connexion réussie", "Bienvenue", JOptionPane.PLAIN_MESSAGE);
            this.setVisible(false);
            MenuClient mProf = new MenuClient();
            mProf.setVisible(true);
        } else {
            jOp.showMessageDialog(jf, "Connexion erronée", "Erreur", JOptionPane.ERROR_MESSAGE);
        }       
    }      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.setVisible(false);
ClientouAdmin p = new ClientouAdmin();
p.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLogin1ActionPerformed

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
            java.util.logging.Logger.getLogger(AuthClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AuthClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AuthClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AuthClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AuthClient().setVisible(true);
            }
        });
    }
    public static int idSession = -1;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jLogin1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPassword1;
    // End of variables declaration//GEN-END:variables
}
