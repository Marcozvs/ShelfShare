package shelfshare.Views.Components;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import shelfshare.Models.Entities.UserModel;

public class UserItem extends javax.swing.JPanel {
    private boolean selected;
    
    public UserModel getUserModel(){
        return userModel;
    }
    
    public boolean isSelected(){
        repaint();
        return selected;
    }
    
    public void setSelected(boolean selected){
        this.selected = selected;
    }

    public UserItem() {
        initComponents();
        setOpaque(false);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
    
    private UserModel userModel;
    public void setUserModel(UserModel userModel){
        this.userModel = userModel;
        userNameLabel.setText(userModel.getName());
        if(String.valueOf(userModel.getUserType()) == "COMMON"){
            userTypeLabel.setText("Tipo: Comum");
        }else{
            userTypeLabel.setText("Tipo: Administrador");
        }
        if(String.valueOf(userModel.getBookFavType()) == "ROMANCE"){
            userFavBooksLabel.setText("Gênero: Romance");
        } else if(String.valueOf(userModel.getBookFavType()) == "TECHNICIAN"){
            userFavBooksLabel.setText("Gênero: Técnico");
        }else{
            userFavBooksLabel.setText("Gênero: Drama");
        }
    }

    public void paint(Graphics graphics){
        Graphics2D g2 = (Graphics2D) graphics.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color(204,204,255));
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        if(selected){
            g2.setColor(new Color(94,156,255));
            g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);
        }
        g2.dispose();
        super.paint(graphics);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userNameLabel = new javax.swing.JLabel();
        userTypeLabel = new javax.swing.JLabel();
        userFavBooksLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        userNameLabel.setBackground(new java.awt.Color(255, 255, 255));
        userNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(108, 99, 255));
        userNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        userNameLabel.setText("Nome do usuário");

        userTypeLabel.setBackground(new java.awt.Color(255, 255, 255));
        userTypeLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        userTypeLabel.setForeground(new java.awt.Color(153, 153, 255));
        userTypeLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        userTypeLabel.setText("(tipo do usuário)");

        userFavBooksLabel.setBackground(new java.awt.Color(255, 255, 255));
        userFavBooksLabel.setForeground(new java.awt.Color(102, 102, 102));
        userFavBooksLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        userFavBooksLabel.setText("Generos favoritos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userNameLabel)
                            .addComponent(userTypeLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(userFavBooksLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userTypeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(userFavBooksLabel)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel userFavBooksLabel;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JLabel userTypeLabel;
    // End of variables declaration//GEN-END:variables
}
