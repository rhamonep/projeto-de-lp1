/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.SearchSolicitationBlock;

import control.App;
import model.Group;
import model.User;

/**
 *
 * @author Usuario
 */
public class UserGroups extends javax.swing.JPanel {

    private User user;
    private Group group;
    private int panelFunction; 
            
    public UserGroups(Object obj, int i) {
        initComponents();
        this.panelFunction = i;
        
        switch(panelFunction){
            case 1:
                this.user = (User) obj;
                jLabel2.setText(this.user.getName());
                jLabel1.setIcon(this.user.getProfilePicture());
                jButton1.setText("Aceitar");
                jButton2.setText("Recusar");
                break;
            case 2:
                this.user = (User) obj;
                jLabel2.setText(this.user.getName());
                jLabel1.setIcon(this.user.getProfilePicture());
                jButton1.setText("Desbloquear");
                jButton2.setVisible(false);
                jButton2.setEnabled(false);
                break;
            
            case 3:
                this.group = (Group) obj;
                jLabel2.setText(this.group.getName());
                jLabel1.setIcon(this.group.getProfilePicture());
                jButton1.setText("Ver Grupo");
                
                if(this.group.isMember(App.getNetwork().getCurrentUser())){
                    jButton2.setText("Sair do grupo");
                } else if(this.group.isInMemberRequest(App.getNetwork().getCurrentUser())){
                    jButton2.setText("Cancelar Solicitação");
                } else {
                    jButton2.setText("Solicitar entrada");
                }
                break;
                
            default:
                this.user = (User) obj;
                jLabel2.setText(this.user.getName());
                jLabel1.setIcon(this.user.getProfilePicture());
                jButton1.setText("Ver Perfil");
                if(App.getNetwork().getCurrentUser().isFriendsWith(this.user)){
                    jButton2.setText("Desfazer Amizade");
                } else{
                    jButton2.setText("Solicitar Amizade");
                }                    
                break;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel1.setText("Foto");

        jLabel2.setText("Nome do Grupo/Pessoa");

        jButton1.setText("Solicitar ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addComponent(jButton1)
                .addComponent(jButton2))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        switch(panelFunction){
            case 1:
                App.getNetwork().getCurrentUser().removeFriendRequest(this.user);
                break;
            case 3:
                this.group.addMemberRequest(App.getNetwork().getCurrentUser());              
            default:
                if(App.getNetwork().getCurrentUser().isFriendsWith(this.user)){
                    App.getNetwork().getCurrentUser().removeFriend(this.user);
                } else{
                    this.user.addFriendRequest(App.getNetwork().getCurrentUser());
                }
                  
                break;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        switch(panelFunction){
            case 1:
                
                jButton2.setText("Recusar");
                break;
            case 2:

                jLabel2.setText(this.user.getName());
                jLabel1.setIcon(this.user.getProfilePicture());
                jButton1.setText("Desbloquear");
                jButton2.setVisible(false);
                jButton2.setEnabled(false);
                break;
            
            case 3:
                jLabel2.setText(this.group.getName());
                jLabel1.setIcon(this.group.getProfilePicture());
                
            default:

                jLabel2.setText(this.user.getName());
                jLabel1.setIcon(this.user.getProfilePicture());
                jButton1.setText("Ver Perfil");
                jButton2.setText("Desfazer Amizade");
                break;
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
