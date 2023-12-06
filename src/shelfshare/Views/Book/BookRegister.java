
package shelfshare.Views.Book;
import java.util.UUID;
import javax.swing.JOptionPane;
import shelfshare.Controllers.BookController;
import shelfshare.Views.User.*;
import shelfshare.Controllers.UserController;
import shelfshare.Models.Entities.BookModel;
import shelfshare.Models.Entities.UserModel;
import shelfshare.Models.Enums.TypeFavBookEnum;

public class BookRegister extends javax.swing.JFrame {
    
    private BookModel bookModel;
    private UserModel loggedInUser;
    private UserController userController;

    public BookRegister(BookModel book, UserModel loggedInUser) {
        this.bookModel = book;
        this.loggedInUser = loggedInUser;
        this.userController = new UserController();
        initComponents();
        if ("COMMON".equals(this.loggedInUser.getUserType().name())) {
            UsersListLink.setVisible(false);
        }
        TypeBookSelect.addItem("Romance");
        TypeBookSelect.addItem("Tecnico");
        TypeBookSelect.addItem("Drama");
        
        TypeFavBookEnum bookType = this.bookModel.getTypeBook();
        if (bookType == TypeFavBookEnum.ROMANCE) {
            TypeBookSelect.select("Romance");
        } else if (bookType == TypeFavBookEnum.TECHNICIAN) {
            TypeBookSelect.select("Tecnico");
        } else {
            TypeBookSelect.select("Drama");
        }
        txtTitle.setText(bookModel.getTitle());
        txtAuthor.setText(bookModel.getAuthor());
        txtScore.setText(String.valueOf(bookModel.getAverageScore())); 

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IllustrationLogin = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        UsernameSeparator = new javax.swing.JSeparator();
        TypeBookLabel = new javax.swing.JLabel();
        TypeBookSelect = new java.awt.Choice();
        AuthorLabel = new javax.swing.JLabel();
        txtAuthor = new javax.swing.JTextField();
        UsernameSeparator1 = new javax.swing.JSeparator();
        ScoreLabel = new javax.swing.JLabel();
        txtScore = new javax.swing.JTextField();
        UsernameSeparator2 = new javax.swing.JSeparator();
        BtnConfirm = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
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

        titleLabel.setBackground(new java.awt.Color(255, 255, 255));
        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(108, 99, 255));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titleLabel.setText("Titulo do livro");

        txtTitle.setFont(txtTitle.getFont());
        txtTitle.setForeground(new java.awt.Color(108, 99, 255));
        txtTitle.setBorder(null);
        txtTitle.setCaretColor(new java.awt.Color(255, 255, 255));
        txtTitle.setDisabledTextColor(new java.awt.Color(108, 151, 252));
        txtTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTitleActionPerformed(evt);
            }
        });

        UsernameSeparator.setBackground(new java.awt.Color(255, 255, 255));
        UsernameSeparator.setForeground(new java.awt.Color(108, 99, 255));

        TypeBookLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TypeBookLabel.setForeground(new java.awt.Color(108, 99, 255));
        TypeBookLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TypeBookLabel.setText("Tipo de Livro Favorito:");

        AuthorLabel.setBackground(new java.awt.Color(255, 255, 255));
        AuthorLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AuthorLabel.setForeground(new java.awt.Color(108, 99, 255));
        AuthorLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        AuthorLabel.setText("Autor do livro");

        txtAuthor.setFont(txtAuthor.getFont());
        txtAuthor.setForeground(new java.awt.Color(108, 99, 255));
        txtAuthor.setBorder(null);
        txtAuthor.setCaretColor(new java.awt.Color(255, 255, 255));
        txtAuthor.setDisabledTextColor(new java.awt.Color(108, 151, 252));
        txtAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAuthorActionPerformed(evt);
            }
        });

        UsernameSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        UsernameSeparator1.setForeground(new java.awt.Color(108, 99, 255));

        ScoreLabel.setBackground(new java.awt.Color(255, 255, 255));
        ScoreLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ScoreLabel.setForeground(new java.awt.Color(108, 99, 255));
        ScoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ScoreLabel.setText("Nota do livro");

        txtScore.setFont(txtScore.getFont());
        txtScore.setForeground(new java.awt.Color(108, 99, 255));
        txtScore.setBorder(null);
        txtScore.setCaretColor(new java.awt.Color(255, 255, 255));
        txtScore.setDisabledTextColor(new java.awt.Color(108, 151, 252));
        txtScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtScoreActionPerformed(evt);
            }
        });

        UsernameSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        UsernameSeparator2.setForeground(new java.awt.Color(108, 99, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(UsernameSeparator)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTitle)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 110, Short.MAX_VALUE)))
                        .addGap(48, 48, 48))
                    .addComponent(txtAuthor)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AuthorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TypeBookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TypeBookSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(UsernameSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ScoreLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtScore, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UsernameSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UsernameSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AuthorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UsernameSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScoreLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UsernameSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TypeBookLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TypeBookSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(84, 84, 84))
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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shelfshare/Assets/Images/undraw_Books_re_8gea (1).png"))); // NOI18N

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

        javax.swing.GroupLayout IllustrationLoginLayout = new javax.swing.GroupLayout(IllustrationLogin);
        IllustrationLogin.setLayout(IllustrationLoginLayout);
        IllustrationLoginLayout.setHorizontalGroup(
            IllustrationLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IllustrationLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(506, 506, 506))
            .addGroup(IllustrationLoginLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(IllustrationLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 820, 500));

        jPanel1.setBackground(new java.awt.Color(108, 99, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 500));

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ShelfShare");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
        btnRegister.setText("Estante");
        btnRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegisterMouseClicked(evt);
            }
        });

        btnRegister1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegister1.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister1.setText("Cadastrar livro");
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
                .addGap(12, 12, 12)
                .addComponent(btnRegister1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegister)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 294, Short.MAX_VALUE)
                .addComponent(Close2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 500));

        setSize(new java.awt.Dimension(1019, 502));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConfirmActionPerformed
        if (!validateScore()) {
            return;
        }
        
        String selectedBookType = TypeBookSelect.getSelectedItem().toString().toUpperCase();
        TypeFavBookEnum bookTypeEnum;

        if ("ROMANCE".equals(selectedBookType)) {
            bookTypeEnum = TypeFavBookEnum.ROMANCE;
        } else if ("TECNICO".equals(selectedBookType)) {
            bookTypeEnum = TypeFavBookEnum.TECHNICIAN;
        } else {
            bookTypeEnum = TypeFavBookEnum.DRAMA;
        }
        
        this.bookModel.setTitle(txtTitle.getText());
        this.bookModel.setAuthor(txtAuthor.getText());
        this.bookModel.setScore(Float.parseFloat(txtScore.getText()));
        this.bookModel.setTypeBook(bookTypeEnum);

        float score = Float.parseFloat(txtScore.getText());
        
        if (this.bookModel.getId() == null) {
            UUID uuid = UUID.randomUUID();
            BookModel bookModel = new BookModel(uuid, txtTitle.getText(), txtAuthor.getText(), score, bookTypeEnum);
        }
        
        BookController bookController = new BookController();   
        
        if (this.bookModel.getId() == null) {
            boolean registerSuccess = bookController.addBook(bookModel);
            if (registerSuccess) {
                JOptionPane.showMessageDialog(this, "Livro cadastrado com sucesso");
            } else {
                JOptionPane.showMessageDialog(this, "Falha no cadastro do livro. Por favor, tente novamente.");
            }
        } else {
            
            boolean updateSuccess = bookController.updateBook(bookModel);
            if (updateSuccess) {
                System.out.println(bookModel.getId());
                JOptionPane.showMessageDialog(this, "Livro atualizado com sucesso");
            } else {
                JOptionPane.showMessageDialog(this, "Falha na atualização do livro. Por favor, tente novamente.");
            }
        }
        
    }//GEN-LAST:event_BtnConfirmActionPerformed
   private boolean validateScore() {
    String scoreText = txtScore.getText();

    if (!scoreText.matches("\\d+(\\.\\d+)?(,\\d+)?")) {
        JOptionPane.showMessageDialog(this, "Por favor, insira uma nota válida (números, ponto ou vírgula).");
        return false;
    }

    scoreText = scoreText.replace(",", ".");

    float score = Float.parseFloat(scoreText);

    if (score < 0 || score > 10) {
        JOptionPane.showMessageDialog(this, "A nota do livro deve estar entre 0 e 10.");
        return false;
    }

    return true;
}

    private void txtTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTitleActionPerformed
    }//GEN-LAST:event_txtTitleActionPerformed

    private void UsersListLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsersListLinkMouseClicked
        UserModel userModel = new UserModel();
        new UsersList(userModel, this.loggedInUser).setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_UsersListLinkMouseClicked

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CloseMouseClicked

    private void txtAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAuthorActionPerformed

    private void txtScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtScoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtScoreActionPerformed

    private void btnRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseClicked
        UserModel userModel = new UserModel();
        new BooksList(userModel, this.loggedInUser).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegisterMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        UserModel userModel = userController.getUserById(loggedInUser.getId());
        this.dispose();
        Profile profile = new Profile(userModel, loggedInUser);
        if (!profile.isVisible()) {
            profile.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnRegister1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegister1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegister1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AuthorLabel;
    private javax.swing.JButton BtnConfirm;
    private javax.swing.JLabel Close2;
    private javax.swing.JPanel IllustrationLogin;
    private javax.swing.JLabel ScoreLabel;
    private javax.swing.JLabel TypeBookLabel;
    private java.awt.Choice TypeBookSelect;
    private javax.swing.JSeparator UsernameSeparator;
    private javax.swing.JSeparator UsernameSeparator1;
    private javax.swing.JSeparator UsernameSeparator2;
    private javax.swing.JLabel UsersListLink;
    private javax.swing.JLabel btnRegister;
    private javax.swing.JLabel btnRegister1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtScore;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
