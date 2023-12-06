
package shelfshare.Views.User;
import javax.swing.JOptionPane;
import shelfshare.Controllers.UserController;
import shelfshare.Models.Entities.BookModel;
import shelfshare.Models.Entities.UserModel;
import shelfshare.Models.Enums.TypeFavBookEnum;
import shelfshare.Models.Enums.UserTypeEnum;
import shelfshare.Views.Book.BookRegister;
import shelfshare.Views.Book.BooksList;

public class Profile extends javax.swing.JFrame {
    
    private UserModel userModel;
    private UserModel loggedInUser;
    private UserController userController;

    public Profile(UserModel user, UserModel loggedInUser) {
        this.userModel = user;
        this.loggedInUser = loggedInUser;
         this.userController = new UserController();
        initComponents();
        txtUsername.setBackground(new java.awt.Color(0, 0, 0, 1));
        txtUsername.setText(user.getUsername());
        txtName.setBackground(new java.awt.Color(0, 0, 0, 1));
        txtName.setText(user.getName());
        txtAge.setBackground(new java.awt.Color(0, 0, 0, 1));
        txtAge.setText(String.valueOf(user.getAge()));
        txtPassword.setBackground(new java.awt.Color(0, 0, 0, 1 ));
        txtPassword.setText(user.getPassword());
        if ("COMMON".equals(this.loggedInUser.getUserType().name())) {
            UserTypeLabel.setVisible(false);
            UserTypeSelect.setVisible(false);
            UsersListLink.setVisible(false);
        }
        if(user.getGender() == 'M'){
            masculine.setState(true);
        }else{
            feminine.setState(true);
        }
        TypeBookSelect.addItem("Romance");
        TypeBookSelect.addItem("Tecnico");
        TypeBookSelect.addItem("Drama");
        UserTypeSelect.addItem("Administrador");
        UserTypeSelect.addItem("Comum");
        
        String bookFavTypeSelect = String.valueOf(user.getBookFavType());
        if ("ROMANCE".equals(bookFavTypeSelect)) {
            TypeBookSelect.select("Romance");
        } else if ("TECNICO".equals(bookFavTypeSelect)) {
            TypeBookSelect.select("Tecnico");
        } else {
            TypeBookSelect.select("Drama");
        }
        
        String userTypeSelect = String.valueOf(user.getUserType());
        if ("ADMIN".equals(userTypeSelect)) {
            UserTypeSelect.select("Administrador");
        } else if ("COMMON".equals(userTypeSelect)) {
            UserTypeSelect.select("Comum");
        } else {
        }

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IllustrationLogin = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        UsernameLabel = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        UsernameSeparator = new javax.swing.JSeparator();
        NameLabel = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        NameSeparator = new javax.swing.JSeparator();
        PasswordLabel = new javax.swing.JLabel();
        PasswordSeparator = new javax.swing.JSeparator();
        txtPassword = new javax.swing.JPasswordField();
        GenderLabel = new javax.swing.JLabel();
        masculine = new java.awt.Checkbox();
        feminine = new java.awt.Checkbox();
        AgeLabel = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        AgeSeparator = new javax.swing.JSeparator();
        TypeBookLabel = new javax.swing.JLabel();
        TypeBookSelect = new java.awt.Choice();
        BtnConfirm = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        UserTypeSelect = new java.awt.Choice();
        UserTypeLabel = new javax.swing.JLabel();
        btnRemoveProfile = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        UsersListLink = new javax.swing.JLabel();
        Close2 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JLabel();
        btnRegister1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IllustrationLogin.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        UsernameLabel.setBackground(new java.awt.Color(255, 255, 255));
        UsernameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UsernameLabel.setForeground(new java.awt.Color(108, 99, 255));
        UsernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        UsernameLabel.setText("Seu nome de usuário");

        txtUsername.setFont(txtUsername.getFont());
        txtUsername.setForeground(new java.awt.Color(108, 99, 255));
        txtUsername.setBorder(null);
        txtUsername.setCaretColor(new java.awt.Color(255, 255, 255));
        txtUsername.setDisabledTextColor(new java.awt.Color(108, 151, 252));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        UsernameSeparator.setBackground(new java.awt.Color(255, 255, 255));
        UsernameSeparator.setForeground(new java.awt.Color(108, 99, 255));

        NameLabel.setBackground(new java.awt.Color(255, 255, 255));
        NameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NameLabel.setForeground(new java.awt.Color(108, 99, 255));
        NameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        NameLabel.setText("Seu nome");

        txtName.setFont(txtName.getFont());
        txtName.setForeground(new java.awt.Color(108, 99, 255));
        txtName.setBorder(null);
        txtName.setCaretColor(new java.awt.Color(255, 255, 255));
        txtName.setDisabledTextColor(new java.awt.Color(108, 151, 252));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        NameSeparator.setBackground(new java.awt.Color(255, 255, 255));
        NameSeparator.setForeground(new java.awt.Color(108, 99, 255));

        PasswordLabel.setBackground(new java.awt.Color(255, 255, 255));
        PasswordLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(108, 99, 255));
        PasswordLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PasswordLabel.setText("Nova senha");

        PasswordSeparator.setBackground(new java.awt.Color(255, 255, 255));
        PasswordSeparator.setForeground(new java.awt.Color(108, 99, 255));

        txtPassword.setFont(txtPassword.getFont());
        txtPassword.setForeground(new java.awt.Color(108, 99, 255));
        txtPassword.setBorder(null);
        txtPassword.setCaretColor(new java.awt.Color(255, 255, 255));

        GenderLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        GenderLabel.setForeground(new java.awt.Color(108, 99, 255));
        GenderLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        GenderLabel.setText("Sexo:");

        masculine.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        masculine.setForeground(new java.awt.Color(108, 99, 255));
        masculine.setLabel("Masculino");

        feminine.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        feminine.setForeground(new java.awt.Color(108, 99, 255));
        feminine.setLabel("Feminino");

        AgeLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AgeLabel.setForeground(new java.awt.Color(108, 99, 255));
        AgeLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        AgeLabel.setText("Idade:");

        txtAge.setFont(txtAge.getFont());
        txtAge.setForeground(new java.awt.Color(108, 99, 255));
        txtAge.setBorder(null);
        txtAge.setCaretColor(new java.awt.Color(255, 255, 255));
        txtAge.setDisabledTextColor(new java.awt.Color(108, 151, 252));
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        AgeSeparator.setBackground(new java.awt.Color(255, 255, 255));
        AgeSeparator.setForeground(new java.awt.Color(108, 99, 255));

        TypeBookLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TypeBookLabel.setForeground(new java.awt.Color(108, 99, 255));
        TypeBookLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TypeBookLabel.setText("Tipo de Livro Favorito:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsername)
                            .addComponent(UsernameSeparator)
                            .addComponent(txtName)
                            .addComponent(NameSeparator)
                            .addComponent(txtPassword)
                            .addComponent(PasswordSeparator)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 106, Short.MAX_VALUE)))
                        .addGap(48, 48, 48))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(GenderLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(masculine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(feminine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(AgeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(AgeSeparator)
                                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(TypeBookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TypeBookSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UsernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UsernameSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NameSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(feminine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(masculine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GenderLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgeLabel)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AgeSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TypeBookLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TypeBookSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BtnConfirm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnConfirm.setForeground(new java.awt.Color(108, 99, 255));
        BtnConfirm.setText("Salvar");
        BtnConfirm.setBorder(null);
        BtnConfirm.setBorderPainted(false);
        BtnConfirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConfirmActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shelfshare/Assets/Images/undraw_Updated_resume_re_7r9j (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        UserTypeLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UserTypeLabel.setForeground(new java.awt.Color(108, 99, 255));
        UserTypeLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        UserTypeLabel.setText("Tipo do Usuário");

        btnRemoveProfile.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRemoveProfile.setForeground(new java.awt.Color(255, 51, 51));
        btnRemoveProfile.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRemoveProfile.setText("Remover perfil");
        btnRemoveProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemoveProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRemoveProfileMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout IllustrationLoginLayout = new javax.swing.GroupLayout(IllustrationLogin);
        IllustrationLogin.setLayout(IllustrationLoginLayout);
        IllustrationLoginLayout.setHorizontalGroup(
            IllustrationLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IllustrationLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(IllustrationLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(IllustrationLoginLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(IllustrationLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UserTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UserTypeSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRemoveProfile))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(IllustrationLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IllustrationLoginLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IllustrationLoginLayout.createSequentialGroup()
                        .addComponent(BtnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141))))
        );
        IllustrationLoginLayout.setVerticalGroup(
            IllustrationLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IllustrationLoginLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UserTypeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UserTypeSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemoveProfile)
                .addGap(420, 420, 420))
            .addGroup(IllustrationLoginLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(IllustrationLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 820, 510));

        jPanel1.setBackground(new java.awt.Color(108, 99, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 500));

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ShelfShare");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Perfil");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        UsersListLink.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        UsersListLink.setForeground(new java.awt.Color(255, 255, 255));
        UsersListLink.setText("Usuários");
        UsersListLink.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UsersListLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsersListLinkMouseClicked(evt);
            }
        });

        Close2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Close2.setForeground(new java.awt.Color(255, 255, 255));
        Close2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Close2.setText("Sair");
        Close2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });

        btnRegister.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Cadastrar livro");
        btnRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegisterMouseClicked(evt);
            }
        });

        btnRegister1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRegister1.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister1.setText("Estante");
        btnRegister1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegister1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegister1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(Close2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(UsersListLink, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btnRegister, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btnRegister1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UsersListLink)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegister)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegister1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 304, Short.MAX_VALUE)
                .addComponent(Close2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 510));

        setSize(new java.awt.Dimension(1019, 502));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConfirmActionPerformed
        if (!validateAge()) {
            return;
        }
        userModel.setName(txtName.getText());
        try {
            int age = Integer.parseInt(txtAge.getText());
            userModel.setAge(age);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, insira uma idade válida.");
        }
        if (masculine.getState()) {
            userModel.setGender('M');
        } else {
            userModel.setGender('F');
        }
        
        userModel.setPassword(txtPassword.getText());
        userModel.setUsername(txtUsername.getText());
        
        String selectedBookType = TypeBookSelect.getSelectedItem().toString().toUpperCase();
        if ("ROMANCE".equals(selectedBookType)) {
            userModel.setBookFavType(TypeFavBookEnum.ROMANCE);
        } else if ("TECNICO".equals(selectedBookType)) {
            userModel.setBookFavType(TypeFavBookEnum.TECHNICIAN);
        } else {
            userModel.setBookFavType(TypeFavBookEnum.DRAMA);
        }
        
         String selectedUserType = UserTypeSelect.getSelectedItem().toString().toUpperCase();
        if ("ADMIN".equals(selectedUserType)) {
            userModel.setUserType(UserTypeEnum.ADMIN);
        } else {
            userModel.setUserType(UserTypeEnum.COMMON);
        }
        
        UserController userController = new UserController();

        boolean updatingSuccess = userController.updateUser(userModel.getId(), userModel);

        if (updatingSuccess) {
            JOptionPane.showMessageDialog(this, "Atualização do perfil bem-sucedida!");
        } else {
            JOptionPane.showMessageDialog(this, "Falha na atualização do perfil. Por favor, tente novamente.");
        }
    }//GEN-LAST:event_BtnConfirmActionPerformed
    private boolean validateAge() {
        if (!txtAge.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Por favor, insira uma idade válida (apenas números).");
            return false;
        }

        return true;
    }
    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void UsersListLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsersListLinkMouseClicked
        new UsersList(this.userModel, this.loggedInUser).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UsersListLinkMouseClicked

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CloseMouseClicked

    private void btnRemoveProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveProfileMouseClicked
    int confirmation = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja remover o perfil?", "Remover Perfil", JOptionPane.YES_NO_OPTION);
    
    if (confirmation == JOptionPane.YES_OPTION) {
        boolean removeSuccess = this.userController.deleteUser(this.userModel.getId());
        if (removeSuccess) {
            JOptionPane.showMessageDialog(this, "Remoção do perfil bem-sucedida");
            if (this.userModel.getId().equals(this.loggedInUser.getId())) {
                this.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Erro na remoção do perfil");
        }
    }
    }//GEN-LAST:event_btnRemoveProfileMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseClicked
        BookModel bookModel = new BookModel();
        new BookRegister(bookModel, this.loggedInUser).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegisterMouseClicked

    private void btnRegister1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegister1MouseClicked
        new BooksList(this.userModel, this.loggedInUser).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegister1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgeLabel;
    private javax.swing.JSeparator AgeSeparator;
    private javax.swing.JButton BtnConfirm;
    private javax.swing.JLabel Close2;
    private javax.swing.JLabel GenderLabel;
    private javax.swing.JPanel IllustrationLogin;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JSeparator NameSeparator;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JSeparator PasswordSeparator;
    private javax.swing.JLabel TypeBookLabel;
    private java.awt.Choice TypeBookSelect;
    private javax.swing.JLabel UserTypeLabel;
    private java.awt.Choice UserTypeSelect;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JSeparator UsernameSeparator;
    private javax.swing.JLabel UsersListLink;
    private javax.swing.JLabel btnRegister;
    private javax.swing.JLabel btnRegister1;
    private javax.swing.JLabel btnRemoveProfile;
    private java.awt.Checkbox feminine;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private java.awt.Checkbox masculine;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
