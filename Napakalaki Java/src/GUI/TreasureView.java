/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import NapakalakiGame.Treasure;
import NapakalakiGame.TreasureKind;

/**
 *
 */
public class TreasureView extends javax.swing.JPanel {

    Treasure treasureModel;
    boolean selected = false;
    
    public TreasureView() {
        initComponents();
        setBackground(new java.awt.Color(255, 0, 0));
        setOpaque(false);
    }

    public boolean isSelected() {
        
        return selected;
    }
    
    public Treasure getTreasure(){
        
        return treasureModel;
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
        name = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        treasurekind = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        goldcoins = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        minbonus = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        maxbonus = new javax.swing.JLabel();

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Nombre:");

        name.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        name.setForeground(new java.awt.Color(204, 204, 204));
        name.setText(" ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Tipo:");

        treasurekind.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        treasurekind.setForeground(new java.awt.Color(204, 204, 204));
        treasurekind.setText(" ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Valor:");

        goldcoins.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        goldcoins.setForeground(new java.awt.Color(204, 204, 204));
        goldcoins.setText(" ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Mín.Bonus:");

        minbonus.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        minbonus.setForeground(new java.awt.Color(204, 204, 204));
        minbonus.setText(" ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Max.Bonus:");

        maxbonus.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        maxbonus.setForeground(new java.awt.Color(204, 204, 204));
        maxbonus.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(maxbonus, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5)
                            .addComponent(goldcoins, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(minbonus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3))
                                .addContainerGap())
                            .addComponent(treasurekind, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(goldcoins))
                    .addComponent(treasurekind, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(maxbonus))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minbonus)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

        selected = (!selected);

        setOpaque(selected);
        
        repaint();
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel goldcoins;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel maxbonus;
    private javax.swing.JLabel minbonus;
    private javax.swing.JLabel name;
    private javax.swing.JLabel treasurekind;
    // End of variables declaration//GEN-END:variables

    public void setTreasure (Treasure t){
    
        treasureModel = t;
        name.setText(treasureModel.getName());
        treasurekind.setText(treasureModel.TypetoString());
        goldcoins.setText(Integer.toString(treasureModel.getGoldCoins()));
        minbonus.setText(Integer.toString(treasureModel.getMinBonus()));
        maxbonus.setText(Integer.toString(treasureModel.getMaxBonus()));
        
        TreasureKind englishtreasure = treasureModel.getType();
        
        if(englishtreasure == TreasureKind.armor)
            
            treasurekind.setText("Armadura");
        
        else if(englishtreasure == TreasureKind.bothHand)
            
            treasurekind.setText("Dos manos");
        
        else if(englishtreasure == TreasureKind.helmet)
            
            treasurekind.setText("Casco");
        
        else if(englishtreasure == TreasureKind.necklace)
            
            treasurekind.setText("Collar");
        
        else if(englishtreasure == TreasureKind.oneHand)
            
            treasurekind.setText("Una mano");
        
        else
            
            treasurekind.setText("Calzado");
        
        repaint();
    }
    
}