/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import NapakalakiGame.Monster;

/**
 *
 */
public class MonsterView extends javax.swing.JPanel {

    Monster monsterModel;
    
    public MonsterView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        level = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        prize = new GUI.PrizeView();
        jLabel7 = new javax.swing.JLabel();
        badConsequence = new GUI.BadConsequenceView();
        textCultist = new javax.swing.JLabel();
        levelCultist = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        name.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        name.setForeground(new java.awt.Color(204, 204, 204));
        name.setText(" ");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Nivel:");

        level.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        level.setForeground(new java.awt.Color(204, 204, 204));
        level.setText(" ");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Recompensa:");

        prize.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        prize.setOpaque(false);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Mal rollo:");

        badConsequence.setOpaque(false);

        textCultist.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        textCultist.setForeground(new java.awt.Color(204, 204, 204));
        textCultist.setText("Contra Sectarios:");

        levelCultist.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        levelCultist.setForeground(new java.awt.Color(204, 204, 204));
        levelCultist.setMaximumSize(new java.awt.Dimension(3, 13));
        levelCultist.setMinimumSize(new java.awt.Dimension(3, 13));
        levelCultist.setPreferredSize(new java.awt.Dimension(3, 13));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(badConsequence, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(42, 42, 42)
                                .addComponent(textCultist))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(level, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(levelCultist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(prize, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))
                        .addGap(64, 64, 64))
                    .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(textCultist))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(level)
                            .addComponent(levelCultist, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prize, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(badConsequence, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.BadConsequenceView badConsequence;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel level;
    private javax.swing.JLabel levelCultist;
    private javax.swing.JLabel name;
    private GUI.PrizeView prize;
    private javax.swing.JLabel textCultist;
    // End of variables declaration//GEN-END:variables

    public void setMonster(Monster m) {
        
        monsterModel = m;
        
        name.setText(monsterModel.getName());
        level.setText(Integer.toString(monsterModel.getCombatLevel()));
        prize.setTreasure(monsterModel.getPrize());
        badConsequence.setBadConsequence(monsterModel.getBadConsequence());
        
        int levelC = monsterModel.getLevelChangeAgainstCultistPlayer();
        
        if (levelC != 0) {
            
            textCultist.setVisible(true);
            
            if (levelC > 0)
                
                levelCultist.setText("+" + Integer.toString(levelC));
            else
                
                levelCultist.setText(Integer.toString(levelC));
        }
        
        else {
            
            textCultist.setVisible(false);
            levelCultist.setText("");
        }
        
        repaint();
    }
    
}