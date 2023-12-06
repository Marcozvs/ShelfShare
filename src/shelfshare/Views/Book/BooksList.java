
package shelfshare.Views.Book;

import java.awt.Component;
import shelfshare.Controllers.UserController;
import shelfshare.Controllers.AssessmentController;
import shelfshare.Services.AssessmentService;
import shelfshare.Models.Entities.AssessmentModel;
import shelfshare.Models.Entities.UserModel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import shelfshare.Controllers.BookController;
import shelfshare.Models.Entities.BookModel;
import shelfshare.Models.Enums.UserTypeEnum;
import shelfshare.Models.Interfaces.EventBookItem;
import shelfshare.Views.Components.BookItem;
import shelfshare.Views.User.Profile;
import shelfshare.Views.Components.ScrollBarCustom;
import shelfshare.Views.User.UsersList;

public class BooksList extends javax.swing.JFrame {
    
    private UserModel userModel;
    private UserModel loggedInUser;
    
    private UserController userController;
    private BookController bookController;
    
    private BookModel[] books;
    
    private UUID bookSelectedId;
    
    private EventBookItem event;
    
    public void setEvent(EventBookItem event){
        this.event = event;
    }
    
    public BooksList(UserModel user, UserModel loggedInUser) {
        this.userModel = user;
        this.loggedInUser = loggedInUser;

        this.userController = new UserController();
        this.bookController = new BookController();

        this.books = this.bookController.getAllBooks().toArray(new BookModel[0]);
        
        initComponents();
        if ("COMMON".equals(this.loggedInUser.getUserType().name())) {
            UsersListLink.setVisible(false);
        }
        txtTitle.setVisible(false);
        txtGenre.setVisible(false);
        txtAuthor.setVisible(false);
        txtAverageGradeSelect.setVisible(false);
        evaluateBook.setVisible(false);
        editBook.setVisible(false);
        removeBook.setVisible(false);
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        generateCards();
    }
    
    public void addBook(BookModel bookModel){
        BookItem bookItem = new BookItem();
        bookItem.setBookModel(bookModel);
        bookItem.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent me){
                if(SwingUtilities.isLeftMouseButton(me)){
                    event.itemClick(bookItem, bookModel);
                    bookSelectedId = bookModel.getId();
                }
            }
        });
        panelItem.add(bookItem);
        panelItem.repaint();
        panelItem.revalidate();
    }
    
    public void generateCards(){
        setEvent(new EventBookItem() {
            @Override
            public void itemClick(Component com, BookModel bookModel) {
                setSelected(com);
                showItem(bookModel);
            }
        });
        AssessmentService assessmentService = new AssessmentService();
        for (BookModel book : books) {
            float newAverage = assessmentService.getMediaReviewBook(book.getId());
            book.setAverageScore(newAverage);
            addBook(book);
        }
    }
    
    public void setSelected(Component item){
        for(Component com:panelItem.getComponents()){
            BookItem i = (BookItem)com;
            if(i.isSelected()){
                i.setSelected(false);
            }
            ((BookItem)item).setSelected(true);
        }
    }
    
    public void showItem(BookModel bookModel){
        txtTitle.setVisible(true);
        txtGenre.setVisible(true);
        txtAuthor.setVisible(true);
        txtAverageGradeSelect.setVisible(true);
        evaluateBook.setVisible(true);
        if (UserTypeEnum.ADMIN.equals(this.loggedInUser.getUserType())) {
            editBook.setVisible(true);
            removeBook.setVisible(true);
        }
        txtTitle.setText(bookModel.getTitle());
        if(String.valueOf(bookModel.getTypeBook()) == "ROMANCE"){
            txtGenre.setText("Gênero: Romance");
        } else if(String.valueOf(bookModel.getTypeBook()) == "TECHNICIAN"){
            txtGenre.setText("Gênero: Técnico");
        }else{
            txtGenre.setText("Gênero: Drama");
        }
        txtAuthor.setText("Autor: " + bookModel.getAuthor());
        updateAverageGrade(bookModel.getId());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        UsersListLink = new javax.swing.JLabel();
        Close2 = new javax.swing.JLabel();
        btnRegister2 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        panelItem = new shelfshare.Views.Components.PanelItem();
        jPanel2 = new javax.swing.JPanel();
        txtTitle = new javax.swing.JLabel();
        txtGenre = new javax.swing.JLabel();
        editBook = new javax.swing.JLabel();
        removeBook = new javax.swing.JLabel();
        evaluateBook = new javax.swing.JLabel();
        txtAuthor = new javax.swing.JLabel();
        txtAverageGradeSelect = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        btnRegister2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRegister2.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister2.setText("Cadastrar livro");
        btnRegister2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegister2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegister2MouseClicked(evt);
            }
        });

        btnRegister.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Estante");
        btnRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegisterMouseClicked(evt);
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
                    .addComponent(btnRegister2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btnRegister, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
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
                .addComponent(btnRegister2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegister)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 304, Short.MAX_VALUE)
                .addComponent(Close2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 510));

        scroll.setBorder(null);
        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panelItem.setBackground(new java.awt.Color(255, 255, 255));
        scroll.setViewportView(panelItem);

        getContentPane().add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 620, 510));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        txtTitle.setBackground(new java.awt.Color(255, 255, 255));
        txtTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTitle.setForeground(new java.awt.Color(255, 255, 255));
        txtTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtTitle.setText("Título");

        txtGenre.setBackground(new java.awt.Color(255, 255, 255));
        txtGenre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtGenre.setForeground(new java.awt.Color(239, 239, 239));
        txtGenre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtGenre.setText("Genêro");

        editBook.setBackground(new java.awt.Color(255, 255, 255));
        editBook.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editBook.setForeground(new java.awt.Color(255, 255, 255));
        editBook.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        editBook.setText("Editar");
        editBook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editBookMouseClicked(evt);
            }
        });

        removeBook.setBackground(new java.awt.Color(255, 255, 255));
        removeBook.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        removeBook.setForeground(new java.awt.Color(255, 102, 102));
        removeBook.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        removeBook.setText("Remover");
        removeBook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeBookMouseClicked(evt);
            }
        });

        evaluateBook.setBackground(new java.awt.Color(255, 255, 255));
        evaluateBook.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        evaluateBook.setForeground(new java.awt.Color(255, 255, 255));
        evaluateBook.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        evaluateBook.setText("Avaliar");
        evaluateBook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        evaluateBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                evaluateBookMouseClicked(evt);
            }
        });

        txtAuthor.setBackground(new java.awt.Color(255, 255, 255));
        txtAuthor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtAuthor.setForeground(new java.awt.Color(239, 239, 239));
        txtAuthor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtAuthor.setText("Autor");

        txtAverageGradeSelect.setBackground(new java.awt.Color(255, 255, 255));
        txtAverageGradeSelect.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtAverageGradeSelect.setForeground(new java.awt.Color(239, 239, 239));
        txtAverageGradeSelect.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtAverageGradeSelect.setText("Nota Média");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAverageGradeSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(editBook)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(evaluateBook)
                        .addGap(18, 18, 18)
                        .addComponent(removeBook))
                    .addComponent(txtTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtGenre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAuthor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtGenre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtAuthor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtAverageGradeSelect)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editBook)
                    .addComponent(removeBook)
                    .addComponent(evaluateBook))
                .addContainerGap(356, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 200, 510));

        setSize(new java.awt.Dimension(1019, 506));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UsersListLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsersListLinkMouseClicked
        new UsersList(this.userModel, this.loggedInUser).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UsersListLinkMouseClicked

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CloseMouseClicked

    private void removeBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeBookMouseClicked
        int confirmation = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja remover o livro?", "Remover Livro", JOptionPane.YES_NO_OPTION);
    
    if (confirmation == JOptionPane.YES_OPTION) {
        boolean removeSuccess = this.bookController.removeBook(this.bookSelectedId);
        if (removeSuccess) {
            JOptionPane.showMessageDialog(this, "Remoção do livro bem-sucedida");
            new BooksList(this.userModel, this.loggedInUser).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Erro na remoção do livro");
        }
    }
    }//GEN-LAST:event_removeBookMouseClicked

    private void editBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBookMouseClicked
        BookModel bookModel = bookController.getBookById(this.bookSelectedId);
        this.dispose();
        BookRegister bookRegister = new BookRegister(bookModel, loggedInUser);
        if (!bookRegister.isVisible()) {
            bookRegister.setVisible(true);
            this.dispose();
        }        
    }//GEN-LAST:event_editBookMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        UserModel userModel = userController.getUserById(loggedInUser.getId());
        this.dispose();
        Profile profile = new Profile(userModel, loggedInUser);
        if (!profile.isVisible()) {
            profile.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnRegister2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegister2MouseClicked
        BookModel bookModel = new BookModel();
        new BookRegister(bookModel, this.loggedInUser).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegister2MouseClicked

    private void btnRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseClicked
        new BooksList(this.userModel, this.loggedInUser).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegisterMouseClicked

    private void evaluateBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_evaluateBookMouseClicked
        String input = JOptionPane.showInputDialog(this, "Digite a nota do livro:");
        if (input != null) {
            try {
                double grade = Double.parseDouble(input);

                if (grade >= 1 && grade <= 5) {
                    UUID userId = loggedInUser.getId();
                    UUID bookId = bookSelectedId;

                    AssessmentModel assessment = new AssessmentModel(userId, bookId, (float) grade);

                    AssessmentService assessmentService = new AssessmentService();
                    boolean addSuccess = assessmentService.addAssessment(assessment);

                    if (addSuccess) {
                        updateAverageGrade(bookId);
                        JOptionPane.showMessageDialog(this, "Avaliação do livro bem-sucedida");
                        new BooksList(userModel, loggedInUser).setVisible(true);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "Erro na avaliação do livro");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Digite uma nota válida (entre 1 e 5).");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Digite uma nota válida (número decimal).");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Insira algum valor para a nota");
        }
    }//GEN-LAST:event_evaluateBookMouseClicked

    private void updateAverageGrade(UUID bookId) {
        AssessmentService assessmentService = new AssessmentService();
        float newAverage = assessmentService.getMediaReviewBook(bookId);
        txtAverageGradeSelect.setText("Nota média: " + String.valueOf(newAverage));
    }

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close2;
    private javax.swing.JLabel UsersListLink;
    private javax.swing.JLabel btnRegister;
    private javax.swing.JLabel btnRegister2;
    private javax.swing.JLabel editBook;
    private javax.swing.JLabel evaluateBook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private shelfshare.Views.Components.PanelItem panelItem;
    private javax.swing.JLabel removeBook;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JLabel txtAuthor;
    private javax.swing.JLabel txtAverageGradeSelect;
    private javax.swing.JLabel txtGenre;
    private javax.swing.JLabel txtTitle;
    // End of variables declaration//GEN-END:variables
}
