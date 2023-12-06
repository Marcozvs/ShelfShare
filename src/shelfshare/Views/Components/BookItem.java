package shelfshare.Views.Components;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import shelfshare.Models.Entities.BookModel;

public class BookItem extends javax.swing.JPanel {
    private boolean selected;
    
    public BookModel getBookModel(){
        return bookModel;
    }
    
    public boolean isSelected(){
        repaint();
        return selected;
    }
    
    public void setSelected(boolean selected){
        this.selected = selected;
    }

    public BookItem() {
        initComponents();
        setOpaque(false);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
    
    private BookModel bookModel;
    public void setBookModel(BookModel bookModel){
        this.bookModel = bookModel;
        txtTitle.setText(bookModel.getTitle());
        if(String.valueOf(bookModel.getTypeBook()) == "ROMANCE"){
            txtGenre.setText("Gênero: Romance");
        } else if(String.valueOf(bookModel.getTypeBook()) == "TECHNICIAN"){
            txtGenre.setText("Gênero: Técnico");
        }else{
            txtGenre.setText("Gênero: Drama");
        }
        txtTitle.setText(bookModel.getTitle());
        txtAuthor.setText("Autor: " + bookModel.getAuthor());
        txtAverageGradeSelect.setText("Nota média: " + String.valueOf(bookModel.getAverageScore()));   
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

        txtTitle = new javax.swing.JLabel();
        txtAverageGradeSelect = new javax.swing.JLabel();
        txtAuthor = new javax.swing.JLabel();
        txtGenre = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        txtTitle.setBackground(new java.awt.Color(255, 255, 255));
        txtTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTitle.setForeground(new java.awt.Color(108, 99, 255));
        txtTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtTitle.setText("Titulo");

        txtAverageGradeSelect.setBackground(new java.awt.Color(255, 255, 255));
        txtAverageGradeSelect.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtAverageGradeSelect.setForeground(new java.awt.Color(153, 153, 255));
        txtAverageGradeSelect.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtAverageGradeSelect.setText("Nota Média");

        txtAuthor.setBackground(new java.awt.Color(255, 255, 255));
        txtAuthor.setForeground(new java.awt.Color(102, 102, 102));
        txtAuthor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtAuthor.setText("Autor");

        txtGenre.setBackground(new java.awt.Color(255, 255, 255));
        txtGenre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtGenre.setForeground(new java.awt.Color(153, 153, 255));
        txtGenre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtGenre.setText("Genêro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                    .addComponent(txtTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAverageGradeSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtGenre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGenre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAuthor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtAverageGradeSelect)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel txtAuthor;
    private javax.swing.JLabel txtAverageGradeSelect;
    private javax.swing.JLabel txtGenre;
    private javax.swing.JLabel txtTitle;
    // End of variables declaration//GEN-END:variables
}
