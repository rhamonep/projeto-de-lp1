/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Feed;

import control.App;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import model.Comment;
import model.Post;
import model.User;

/**
 *
 * @autho   r Usuario
 */
public class PostView extends javax.swing.JPanel {

    private User user;
    private Post post;
    private WriteCommentary c1;
    private boolean pressed;
    
    public PostView(Post post){
        
        initComponents();
         
        GridBagLayout layout = new GridBagLayout();     
        commentaryPanel.setLayout(layout);
        pressed = false;
        this.user = App.getNetwork().getCurrentUser();
        this.post = post;
        name.setText(this.user.getName());
        text.setText(this.post.getText());
    }
    
    public PostView(User user, Post post) {
   
        initComponents(); 
        GridBagLayout layout = new GridBagLayout();     
        commentaryPanel.setLayout(layout);
        pressed = false;
        this.user = user;
        this.post = post;
        name.setText(post.getUserName());
        text.setText(post.getText());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JLabel();
        Photos = new javax.swing.JPanel();
        privacyButton = new javax.swing.JButton();
        commentaryPanel = new javax.swing.JPanel();
        showCommentsButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        text = new javax.swing.JTextPane();
        date = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        name.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        name.setText("Nome do Usuario");

        javax.swing.GroupLayout PhotosLayout = new javax.swing.GroupLayout(Photos);
        Photos.setLayout(PhotosLayout);
        PhotosLayout.setHorizontalGroup(
            PhotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PhotosLayout.setVerticalGroup(
            PhotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        privacyButton.setText("Publico");
        privacyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                privacyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout commentaryPanelLayout = new javax.swing.GroupLayout(commentaryPanel);
        commentaryPanel.setLayout(commentaryPanelLayout);
        commentaryPanelLayout.setHorizontalGroup(
            commentaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        commentaryPanelLayout.setVerticalGroup(
            commentaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        showCommentsButton.setText("Comentarios");
        showCommentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showCommentsButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Apagar");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        text.setEditable(false);
        text.setBorder(null);

        date.setText("Data");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Photos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(showCommentsButton))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(commentaryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(date)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                        .addComponent(privacyButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton)
                        .addGap(8, 8, 8))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(privacyButton)
                    .addComponent(deleteButton)
                    .addComponent(name)
                    .addComponent(date))
                .addGap(32, 32, 32)
                .addComponent(Photos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showCommentsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(commentaryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void privacyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_privacyButtonActionPerformed
        if(this.post.isPublic()){
            this.post.setVisibility(false);
            this.privacyButton.setText("Tornar Público");
        }else{
            this.post.setVisibility(true);
            this.privacyButton.setText("Tornar Privado");
        }
        App.showFeed();
    }//GEN-LAST:event_privacyButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        this.user.removePost(this.post);
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void showCommentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showCommentsButtonActionPerformed

    }//GEN-LAST:event_showCommentsButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Photos;
    private javax.swing.JPanel commentaryPanel;
    private javax.swing.JLabel date;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel name;
    private javax.swing.JButton privacyButton;
    private javax.swing.JButton showCommentsButton;
    private javax.swing.JTextPane text;
    // End of variables declaration//GEN-END:variables
}
