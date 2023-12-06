
package shelfshare.Views.Authentication;

import shelfshare.Controllers.UserController;
import shelfshare.Models.Entities.UserModel;

import javax.swing.*;
import shelfshare.Models.Enums.TypeFavBookEnum;
import shelfshare.Models.Enums.UserTypeEnum;

public class Register extends javax.swing.JFrame {

    public Register() {
        initComponents();
        txtUsername.setBackground(new java.awt.Color(0, 0, 0, 1));
        txtName.setBackground(new java.awt.Color(0, 0, 0, 1));
        txtAge.setBackground(new java.awt.Color(0, 0, 0, 1));
        txtPassword.setBackground(new java.awt.Color(0, 0, 0, 1 ));
        txtConfirmPassword.setBackground(new java.awt.Color(0, 0, 0, 1 ));
        BtnConfirm.setFont(new java.awt.Font("Segoe UI", 1, 14));
        BtnConfirm.setForeground(new java.awt.Color(108, 99, 255));
        BtnConfirm.setBorder(null);
        BtnConfirm.setFocusPainted(false);
        BtnConfirm.setBackground(java.awt.Color.WHITE);
        TypeBookSelect.addItem("Romance");
        TypeBookSelect.addItem("Tecnico");
        TypeBookSelect.addItem("Drama");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FormLogin = new javax.swing.JPanel();
        Close = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        Subtitle = new javax.swing.JLabel();
        VisibleIcon = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        UsernameLabel = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        UsernameSeparator = new javax.swing.JSeparator();
        NameLabel = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        NameSeparator = new javax.swing.JSeparator();
        PasswordLabel1 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        PasswordSeparator = new javax.swing.JSeparator();
        ConfirmPasswordLabel = new javax.swing.JLabel();
        txtConfirmPassword = new javax.swing.JPasswordField();
        ConfirmPasswordSeparator = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        GenderLabel = new javax.swing.JLabel();
        masculine = new java.awt.Checkbox();
        feminine = new java.awt.Checkbox();
        Age = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        AgeSeparator = new javax.swing.JSeparator();
        TypeBookLabel = new javax.swing.JLabel();
        TypeBookSelect = new java.awt.Choice();
        BtnConfirm = new javax.swing.JButton();
        btnReturn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        Title.setText("Cadastrar-se");

        Subtitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Subtitle.setForeground(new java.awt.Color(255, 255, 255));
        Subtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Subtitle.setText("Preencha as informações abaixo para realizar seu cadastro");

        VisibleIcon.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(108, 99, 255));

        UsernameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UsernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        UsernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        UsernameLabel.setText("Seu nome de usuário");

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

        UsernameSeparator.setBackground(new java.awt.Color(255, 255, 255));
        UsernameSeparator.setForeground(new java.awt.Color(255, 255, 255));

        NameLabel.setBackground(new java.awt.Color(255, 255, 255));
        NameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NameLabel.setForeground(new java.awt.Color(255, 255, 255));
        NameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        NameLabel.setText("Seu nome");

        txtName.setFont(txtName.getFont());
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setBorder(null);
        txtName.setCaretColor(new java.awt.Color(255, 255, 255));
        txtName.setDisabledTextColor(new java.awt.Color(108, 151, 252));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        NameSeparator.setBackground(new java.awt.Color(255, 255, 255));
        NameSeparator.setForeground(new java.awt.Color(255, 255, 255));

        PasswordLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PasswordLabel1.setForeground(new java.awt.Color(255, 255, 255));
        PasswordLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PasswordLabel1.setText("Nova senha");

        txtPassword.setFont(txtPassword.getFont());
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(null);
        txtPassword.setCaretColor(new java.awt.Color(255, 255, 255));

        PasswordSeparator.setBackground(new java.awt.Color(255, 255, 255));
        PasswordSeparator.setForeground(new java.awt.Color(255, 255, 255));

        ConfirmPasswordLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ConfirmPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmPasswordLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ConfirmPasswordLabel.setText("Confirme sua senha");

        txtConfirmPassword.setFont(txtConfirmPassword.getFont());
        txtConfirmPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtConfirmPassword.setBorder(null);
        txtConfirmPassword.setCaretColor(new java.awt.Color(255, 255, 255));

        ConfirmPasswordSeparator.setBackground(new java.awt.Color(255, 255, 255));
        ConfirmPasswordSeparator.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(UsernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(83, 83, 83))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ConfirmPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PasswordLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PasswordSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(NameSeparator, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txtConfirmPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                                                .addComponent(txtPassword))
                                            .addGap(22, 22, 22)))
                                    .addComponent(ConfirmPasswordSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 22, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(UsernameSeparator, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(UsernameLabel)
                        .addGap(24, 24, 24))
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(UsernameSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(NameLabel)
                        .addGap(24, 24, 24))
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(NameSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PasswordLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConfirmPasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConfirmPasswordSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(108, 99, 255));

        GenderLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        GenderLabel.setForeground(new java.awt.Color(255, 255, 255));
        GenderLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        GenderLabel.setText("Sexo:");

        masculine.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        masculine.setForeground(new java.awt.Color(255, 255, 255));
        masculine.setLabel("Masculino");

        feminine.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        feminine.setForeground(new java.awt.Color(255, 255, 255));
        feminine.setLabel("Feminino");

        Age.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Age.setForeground(new java.awt.Color(255, 255, 255));
        Age.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Age.setText("Idade:");

        txtAge.setFont(txtAge.getFont());
        txtAge.setForeground(new java.awt.Color(255, 255, 255));
        txtAge.setBorder(null);
        txtAge.setCaretColor(new java.awt.Color(255, 255, 255));
        txtAge.setDisabledTextColor(new java.awt.Color(108, 151, 252));
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        AgeSeparator.setBackground(new java.awt.Color(255, 255, 255));
        AgeSeparator.setForeground(new java.awt.Color(255, 255, 255));

        TypeBookLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TypeBookLabel.setForeground(new java.awt.Color(255, 255, 255));
        TypeBookLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TypeBookLabel.setText("Tipo de Livro Favorito:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TypeBookSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(GenderLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(masculine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(feminine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Age)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AgeSeparator)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(TypeBookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(feminine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(masculine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GenderLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Age)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AgeSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TypeBookLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TypeBookSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BtnConfirm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnConfirm.setForeground(new java.awt.Color(108, 99, 255));
        BtnConfirm.setText("Cadastrar");
        BtnConfirm.setBorder(null);
        BtnConfirm.setBorderPainted(false);
        BtnConfirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConfirmActionPerformed(evt);
            }
        });

        btnReturn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnReturn.setForeground(new java.awt.Color(255, 255, 255));
        btnReturn.setText("Voltar");
        btnReturn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReturnMouseClicked(evt);
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
            .addGroup(FormLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormLoginLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnReturn)
                        .addGap(227, 227, 227)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(240, 240, 240)
                        .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FormLoginLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FormLoginLayout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addComponent(VisibleIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormLoginLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormLoginLayout.createSequentialGroup()
                                        .addComponent(BtnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32))))))
                    .addGroup(FormLoginLayout.createSequentialGroup()
                        .addGroup(FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Subtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        FormLoginLayout.setVerticalGroup(
            FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormLoginLayout.createSequentialGroup()
                .addGroup(FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnReturn)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Subtitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormLoginLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(VisibleIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(FormLoginLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getContentPane().add(FormLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 400));

        setSize(new java.awt.Dimension(750, 401));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void BtnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConfirmActionPerformed
        if (validateFieldsFill() && !validatePasswords() || !validateAge()) {
            return;
        }

        UserModel userModel = createUserModelFromInput();
        UserController userController = new UserController();

        if (registerUser(userController, userModel)) {
            showSuccessMessage();
            dispose();
            new Login().setVisible(true);
        } else {
            showFailureMessage();
        }
    }//GEN-LAST:event_BtnConfirmActionPerformed

    private boolean validateFieldsFill() {
        
        if(txtUsername.getText().isEmpty() && txtName.getText().isEmpty() && (txtPassword.getText().isEmpty() || txtConfirmPassword.getText().isEmpty()) && txtAge.getText().isEmpty() && TypeBookSelect.getSelectedItem() == null){
           JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos");
            return false; 
        }
        if (txtUsername.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha o campo 'Seu nome de usuário'.");
            return false;
        }
        
        if (txtName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha o campo 'Seu nome'.");
            return false;
        }
        
        if (txtPassword.getText().isEmpty() || txtConfirmPassword.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha o campos senhas");
            return false;
        }
        
        if (txtAge.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha o campo idade");
            return false;
        }
        
        if (TypeBookSelect.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Por favor, selecione um tipo de livro favorito.");
            return false;
        }
        
        if (!masculine.getState() && !feminine.getState()) {
            JOptionPane.showMessageDialog(this, "Por favor, selecione o sexo.");
            return false;
        }

        return true;
    }
    
    private boolean validatePasswords() {
        if (!txtPassword.getText().equals(txtConfirmPassword.getText())) {
            JOptionPane.showMessageDialog(this, "As senhas não coincidem.");
            return false;
        }
        return true;
    }

    private boolean validateAge() {
        if (!txtAge.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Por favor, insira uma idade válida (apenas números).");
            return false;
        }

        return true;
    }

    private UserModel createUserModelFromInput() {
        UserModel userModel = new UserModel();
        userModel.setName(txtName.getText());

        try {
            int age = Integer.parseInt(txtAge.getText());
            userModel.setAge(age);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, insira uma idade válida.");
        }

        userModel.setUserType(UserTypeEnum.COMMON);

        userModel.setGender(masculine.getState() ? 'M' : 'F');
        userModel.setPassword(txtPassword.getText());
        userModel.setUsername(txtUsername.getText());

        String selectedBookType = TypeBookSelect.getSelectedItem().toUpperCase();

        switch (selectedBookType) {
            case "ROMANCE":
                userModel.setBookFavType(TypeFavBookEnum.ROMANCE);
                break;
            case "TECNICO":
                userModel.setBookFavType(TypeFavBookEnum.TECHNICIAN);
                break;
            default:
                userModel.setBookFavType(TypeFavBookEnum.DRAMA);
        }

        return userModel;
    }
    
    private boolean registerUser(UserController userController, UserModel userModel) {
        return userController.createUser(userModel);
    }

    private void showSuccessMessage() {
        JOptionPane.showMessageDialog(this, "Registro bem-sucedido!");
    }

    private void showFailureMessage() {
        JOptionPane.showMessageDialog(this, "Falha no registro. Por favor, tente novamente.");
    }
    
    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CloseMouseClicked

    private void btnReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnMouseClicked
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_btnReturnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Age;
    private javax.swing.JSeparator AgeSeparator;
    private javax.swing.JButton BtnConfirm;
    private javax.swing.JLabel Close;
    private javax.swing.JLabel ConfirmPasswordLabel;
    private javax.swing.JSeparator ConfirmPasswordSeparator;
    private javax.swing.JPanel FormLogin;
    private javax.swing.JLabel GenderLabel;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JSeparator NameSeparator;
    private javax.swing.JLabel PasswordLabel1;
    private javax.swing.JSeparator PasswordSeparator;
    private javax.swing.JLabel Subtitle;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel TypeBookLabel;
    private java.awt.Choice TypeBookSelect;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JSeparator UsernameSeparator;
    private javax.swing.JLayeredPane VisibleIcon;
    private javax.swing.JLabel btnReturn;
    private java.awt.Checkbox feminine;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.Checkbox masculine;
    private javax.swing.JTextField txtAge;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
