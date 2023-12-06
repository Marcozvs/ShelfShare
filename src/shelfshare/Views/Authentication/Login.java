
package shelfshare.Views.Authentication;
import javax.swing.JOptionPane;
import shelfshare.Controllers.UserController;
import shelfshare.Models.Entities.UserModel;
import shelfshare.Views.Book.BooksList;
import shelfshare.Views.User.Profile;

public class Login extends javax.swing.JFrame {
    
    private UserController userController;
    private UserModel loggedInUser;

    public Login() {
        this.userController = new UserController();
        initComponents();
        txtUsername.setBackground(new java.awt.Color(0, 0, 0, 1));
        txtPassword.setBackground(new java.awt.Color(0, 0, 0, 1 ));
        BtnConfirm.setFont(new java.awt.Font("Segoe UI", 1, 14));
        BtnConfirm.setForeground(new java.awt.Color(108, 99, 255));
        BtnConfirm.setText("Entrar");
        BtnConfirm.setBorder(null);
        BtnConfirm.setFocusPainted(false);
        BtnConfirm.setBackground(java.awt.Color.WHITE);
        BtnConfirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IllustrationLogin = new javax.swing.JPanel();
        Illustration = new javax.swing.JLabel();
        FormLogin = new javax.swing.JPanel();
        Close = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        Subtitle = new javax.swing.JLabel();
        UserLabel = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        UserSeparator = new javax.swing.JSeparator();
        PasswordLabel = new javax.swing.JLabel();
        PasswordSeparator = new javax.swing.JSeparator();
        txtPassword = new javax.swing.JPasswordField();
        BtnConfirm = new javax.swing.JButton();
        DontHaveAccount = new javax.swing.JLabel();
        Register = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IllustrationLogin.setBackground(new java.awt.Color(255, 255, 255));

        Illustration.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/undraw_Login_re_4vu2 (2) (2).png"))); // NOI18N

        javax.swing.GroupLayout IllustrationLoginLayout = new javax.swing.GroupLayout(IllustrationLogin);
        IllustrationLogin.setLayout(IllustrationLoginLayout);
        IllustrationLoginLayout.setHorizontalGroup(
            IllustrationLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IllustrationLoginLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(Illustration)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        IllustrationLoginLayout.setVerticalGroup(
            IllustrationLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IllustrationLoginLayout.createSequentialGroup()
                .addComponent(Illustration, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        getContentPane().add(IllustrationLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 400));

        FormLogin.setBackground(new java.awt.Color(108, 99, 255));

        Close.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Close.setForeground(new java.awt.Color(255, 255, 255));
        Close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Close.setText("X");
        Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });

        Title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Entrar");

        Subtitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Subtitle.setForeground(new java.awt.Color(255, 255, 255));
        Subtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Subtitle.setText("Olá, seja bem vindo");

        UserLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UserLabel.setForeground(new java.awt.Color(255, 255, 255));
        UserLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        UserLabel.setText("Usuário");

        txtUsername.setFont(txtUsername.getFont());
        txtUsername.setForeground(new java.awt.Color(255, 255, 255));
        txtUsername.setBorder(null);
        txtUsername.setCaretColor(new java.awt.Color(255, 255, 255));
        txtUsername.setDisabledTextColor(new java.awt.Color(108, 151, 252));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        UserSeparator.setBackground(new java.awt.Color(255, 255, 255));
        UserSeparator.setForeground(new java.awt.Color(255, 255, 255));

        PasswordLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        PasswordLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PasswordLabel.setText("Senha");

        PasswordSeparator.setBackground(new java.awt.Color(255, 255, 255));
        PasswordSeparator.setForeground(new java.awt.Color(255, 255, 255));

        txtPassword.setFont(txtPassword.getFont());
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(null);
        txtPassword.setCaretColor(new java.awt.Color(255, 255, 255));

        BtnConfirm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnConfirm.setForeground(new java.awt.Color(108, 99, 255));
        BtnConfirm.setText("Entrar");
        BtnConfirm.setBorder(null);
        BtnConfirm.setBorderPainted(false);
        BtnConfirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnConfirmMouseClicked(evt);
            }
        });
        BtnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConfirmActionPerformed(evt);
            }
        });

        DontHaveAccount.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        DontHaveAccount.setForeground(new java.awt.Color(255, 255, 255));
        DontHaveAccount.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        DontHaveAccount.setText("Não possui conta?");

        Register.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        Register.setForeground(new java.awt.Color(255, 255, 255));
        Register.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Register.setText("Cadastre-se");
        Register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ShelfShare");

        javax.swing.GroupLayout FormLoginLayout = new javax.swing.GroupLayout(FormLogin);
        FormLogin.setLayout(FormLoginLayout);
        FormLoginLayout.setHorizontalGroup(
            FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(FormLoginLayout.createSequentialGroup()
                .addGroup(FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Subtitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(FormLoginLayout.createSequentialGroup()
                                .addGroup(FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FormLoginLayout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(UserSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 27, Short.MAX_VALUE))))
                    .addGroup(FormLoginLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(UserLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormLoginLayout.createSequentialGroup()
                                .addComponent(DontHaveAccount)
                                .addGap(14, 14, 14)
                                .addComponent(Register)
                                .addGap(66, 66, 66))
                            .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormLoginLayout.createSequentialGroup()
                                .addGroup(FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(BtnConfirm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PasswordSeparator, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                                    .addComponent(txtPassword))
                                .addGap(22, 22, 22)))
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormLoginLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        FormLoginLayout.setVerticalGroup(
            FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormLoginLayout.createSequentialGroup()
                .addGroup(FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FormLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(FormLoginLayout.createSequentialGroup()
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Subtitle)
                        .addGap(11, 11, 11)
                        .addComponent(UserLabel)
                        .addGap(24, 24, 24))
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(UserSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(BtnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DontHaveAccount)
                    .addComponent(Register))
                .addGap(0, 26, Short.MAX_VALUE))
        );

        getContentPane().add(FormLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 310, 400));

        setSize(new java.awt.Dimension(750, 401));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CloseMouseClicked

    private void BtnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConfirmActionPerformed
        String enteredUsername = txtUsername.getText();
        String enteredPassword = txtPassword.getText();

        if (checkCredentials(enteredUsername, enteredPassword)) {
            this.loggedInUser = getUser(enteredUsername, enteredPassword);
            this.dispose();
            BooksList booksList = new BooksList(loggedInUser, loggedInUser);
            if (!booksList.isVisible()) {
                this.dispose();
                booksList.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(Login.this, "Login falhou. Tente novamente.");
        }
    }//GEN-LAST:event_BtnConfirmActionPerformed

    private boolean checkCredentials(String enteredUsername, String enteredPassword) {
        return this.userController.login(enteredUsername, enteredPassword);
    }
    
    private UserModel getUser(String enteredUsername, String enteredPassword) {
        return this.userController.getUser(enteredUsername, enteredPassword);
    }
    
    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void RegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterMouseClicked
        this.dispose();
        new Register().setVisible(true);
    }//GEN-LAST:event_RegisterMouseClicked

    private void BtnConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnConfirmMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnConfirmMouseClicked
 
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnConfirm;
    private javax.swing.JLabel Close;
    private javax.swing.JLabel DontHaveAccount;
    private javax.swing.JPanel FormLogin;
    private javax.swing.JLabel Illustration;
    private javax.swing.JPanel IllustrationLogin;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JSeparator PasswordSeparator;
    private javax.swing.JLabel Register;
    private javax.swing.JLabel Subtitle;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel UserLabel;
    private javax.swing.JSeparator UserSeparator;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
