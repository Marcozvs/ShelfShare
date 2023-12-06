
package shelfshare.Views.User;

import java.awt.Component;
import shelfshare.Controllers.UserController;
import shelfshare.Models.Entities.UserModel;
import shelfshare.Views.Components.UserItem;
import shelfshare.Models.Enums.UserTypeEnum;
import shelfshare.Models.Enums.TypeFavBookEnum;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import shelfshare.Models.Entities.BookModel;
import shelfshare.Models.Interfaces.EventItem;
import shelfshare.Views.Book.BookRegister;
import shelfshare.Views.Book.BooksList;
import shelfshare.Views.User.Profile;
import shelfshare.Views.Components.ScrollBarCustom;

public class UsersList extends javax.swing.JFrame {
    
    private UserModel userModel;
    private UserModel loggedInUser;
    
    private UserController userController;
    
    private UserModel[] users;
    
    private UUID userSelectedId;
    
    private EventItem event;
    
    public void setEvent(EventItem event){
        this.event = event;
    }
    
    public UsersList(UserModel user, UserModel loggedInUser) {
        this.userModel = user;
        this.loggedInUser = loggedInUser;

        this.userController = new UserController();

        this.users = this.userController.getUsers().toArray(new UserModel[0]);
        
        initComponents();
        nameSelect.setVisible(false);
        userTypeSelect.setVisible(false);
        userFavBooksSelect.setVisible(false);
        editUser.setVisible(false);
        removeUser.setVisible(false);
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        generateCards();
    }
    
    public void addUser(UserModel userModel){
        UserItem userItem = new UserItem();
        userItem.setUserModel(userModel);
        userItem.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent me){
                if(SwingUtilities.isLeftMouseButton(me)){
                    event.itemClick(userItem, userModel);
                    userSelectedId = userModel.getId();
                }
            }
        });
        panelItem.add(userItem);
        panelItem.repaint();
        panelItem.revalidate();
    }
    
    public void generateCards(){
        setEvent(new EventItem() {
            @Override
            public void itemClick(Component com, UserModel userModel) {
                setSelected(com);
                showItem(userModel);
            }
        });
        for (UserModel user : users) {
            addUser(user);
        }
    }
    
    public void setSelected(Component item){
        for(Component com:panelItem.getComponents()){
            UserItem i = (UserItem)com;
            if(i.isSelected()){
                i.setSelected(false);
            }
            ((UserItem)item).setSelected(true);
        }
    }
    
    public void showItem(UserModel userModel){
        nameSelect.setVisible(true);
        userTypeSelect.setVisible(true);
        userFavBooksSelect.setVisible(true);
        editUser.setVisible(true);
        removeUser.setVisible(true);
        nameSelect.setText(userModel.getName());
        if(String.valueOf(userModel.getUserType()) == "COMMON"){
            userTypeSelect.setText("Tipo: Comum");
        }else{
            userTypeSelect.setText("Tipo: Administrador");
        }
        if(String.valueOf(userModel.getBookFavType()) == "ROMANCE"){
            userFavBooksSelect.setText("Gênero: Romance");
        } else if(String.valueOf(userModel.getBookFavType()) == "TECHNICIAN"){
            userFavBooksSelect.setText("Gênero: Técnico");
        }else{
            userFavBooksSelect.setText("Gênero: Drama");
        }
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
        btnRegister1 = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        panelItem = new shelfshare.Views.Components.PanelItem();
        jPanel2 = new javax.swing.JPanel();
        nameSelect = new javax.swing.JLabel();
        userTypeSelect = new javax.swing.JLabel();
        userFavBooksSelect = new javax.swing.JLabel();
        editUser = new javax.swing.JLabel();
        removeUser = new javax.swing.JLabel();

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

        UsersListLink.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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
                    .addComponent(btnRegister2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btnRegister1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
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
                .addComponent(btnRegister1)
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

        nameSelect.setBackground(new java.awt.Color(255, 255, 255));
        nameSelect.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nameSelect.setForeground(new java.awt.Color(255, 255, 255));
        nameSelect.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nameSelect.setText("Nome do usuário");

        userTypeSelect.setBackground(new java.awt.Color(255, 255, 255));
        userTypeSelect.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        userTypeSelect.setForeground(new java.awt.Color(239, 239, 239));
        userTypeSelect.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        userTypeSelect.setText("(tipo do usuário)");

        userFavBooksSelect.setBackground(new java.awt.Color(255, 255, 255));
        userFavBooksSelect.setForeground(new java.awt.Color(255, 255, 255));
        userFavBooksSelect.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        userFavBooksSelect.setText("Generos favoritos");

        editUser.setBackground(new java.awt.Color(255, 255, 255));
        editUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editUser.setForeground(new java.awt.Color(255, 255, 255));
        editUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        editUser.setText("Editar");
        editUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editUserMouseClicked(evt);
            }
        });

        removeUser.setBackground(new java.awt.Color(255, 255, 255));
        removeUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        removeUser.setForeground(new java.awt.Color(255, 102, 102));
        removeUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        removeUser.setText("Remover");
        removeUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeUserMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userTypeSelect, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameSelect, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(editUser)
                        .addGap(18, 18, 18)
                        .addComponent(removeUser)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(userFavBooksSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameSelect)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userTypeSelect)
                .addGap(13, 13, 13)
                .addComponent(userFavBooksSelect)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editUser)
                    .addComponent(removeUser))
                .addContainerGap(391, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 200, 510));

        setSize(new java.awt.Dimension(1019, 506));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UsersListLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsersListLinkMouseClicked
        BookModel bookModel = new BookModel();
        new BookRegister(bookModel, this.loggedInUser).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UsersListLinkMouseClicked

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CloseMouseClicked

    private void removeUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeUserMouseClicked
    int confirmation = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja remover o perfil?", "Remover Perfil", JOptionPane.YES_NO_OPTION);
    
    if (confirmation == JOptionPane.YES_OPTION) {
        boolean removeSuccess = this.userController.deleteUser(this.userSelectedId);
        if (removeSuccess) {
            JOptionPane.showMessageDialog(this, "Remoção do perfil bem-sucedida");
            new UsersList(this.userModel, this.loggedInUser).setVisible(true);
            if (this.userModel.getId().equals(this.loggedInUser.getId())) {
                this.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Erro na remoção do perfil");
        }
    }
    }//GEN-LAST:event_removeUserMouseClicked

    private void editUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editUserMouseClicked
        UserModel userModel = userController.getUserById(this.userSelectedId);
        this.dispose();
        Profile profile = new Profile(userModel, loggedInUser);
        if (!profile.isVisible()) {
            profile.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_editUserMouseClicked

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

    private void btnRegister1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegister1MouseClicked
        new BooksList(this.userModel, this.loggedInUser).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegister1MouseClicked

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close2;
    private javax.swing.JLabel UsersListLink;
    private javax.swing.JLabel btnRegister1;
    private javax.swing.JLabel btnRegister2;
    private javax.swing.JLabel editUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nameSelect;
    private shelfshare.Views.Components.PanelItem panelItem;
    private javax.swing.JLabel removeUser;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JLabel userFavBooksSelect;
    private javax.swing.JLabel userTypeSelect;
    // End of variables declaration//GEN-END:variables
}
