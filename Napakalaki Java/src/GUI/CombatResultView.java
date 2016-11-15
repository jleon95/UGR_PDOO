/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import NapakalakiGame.CombatResult;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class CombatResultView extends javax.swing.JFrame {

    CombatResult result;
    CreditsView credview = new CreditsView();

    public CombatResultView() {
        
        initComponents();
    }
    
    public void setCombatResult(CombatResult cr) {
        
        result = cr;
        ImageIcon icon = new ImageIcon();
        Background.setIcon(null);
        credview.setVisible(false);
        credits.setVisible(false);
        
        switch(result){
            
            case Lose:
                
                cResult.setText("Pierdes el combate");
                icon = new ImageIcon(getClass().getResource("/Resources/LOSE.gif"));
                icon.getImage().flush();
                Background.setIcon(icon);
                break;
                
            case LoseAndEscape: 
                
                cResult.setText("Has logrado escapar");
                icon = new ImageIcon(getClass().getResource("/Resources/LOSEANDESCAPE.gif"));
                icon.getImage().flush();
                Background.setIcon(icon);
                break;
                
            case LoseAndDie: 
                
                cResult.setText("Pierdes y mueres");
                icon = new ImageIcon(getClass().getResource("/Resources/LOSEANDDIE.gif"));
                icon.getImage().flush();
                Background.setIcon(icon);
                break;
            
            case LoseAndConvert: 
                
                cResult.setText("Ahora eres Sectario");
                icon = new ImageIcon(getClass().getResource("/Resources/LOSEANDCONVERT.gif"));
                icon.getImage().flush();
                Background.setIcon(icon);
                break;
                
            case Win: 
                
                cResult.setText("Ganas el combate");
                icon = new ImageIcon(getClass().getResource("/Resources/WIN.gif"));
                icon.getImage().flush();
                Background.setIcon(icon);
                break;
                    
            case WinAndWinGame: 
                
                credits.setVisible(true);
                cResult.setText("Has ganado la partida");
                icon = new ImageIcon(getClass().getResource("/Resources/WINANDWINGAME.gif"));
                icon.getImage().flush();
                Background.setIcon(icon);
                break;
            
        }
        
        repaint();
    }
    
    public void showView() {
        
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cResult = new javax.swing.JLabel();
        OK = new javax.swing.JButton();
        credits = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Napakalaki");
        setMaximumSize(new java.awt.Dimension(510, 300));
        setMinimumSize(new java.awt.Dimension(510, 300));
        setResizable(false);
        getContentPane().setLayout(null);

        cResult.setFont(new java.awt.Font("Harrington", 3, 34)); // NOI18N
        cResult.setForeground(new java.awt.Color(204, 204, 204));
        cResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(cResult);
        cResult.setBounds(30, 20, 442, 103);

        OK.setText("OK");
        OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKActionPerformed(evt);
            }
        });
        getContentPane().add(OK);
        OK.setBounds(190, 230, 110, 23);

        credits.setText("Créditos");
        credits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditsActionPerformed(evt);
            }
        });
        getContentPane().add(credits);
        credits.setBounds(190, 190, 110, 23);

        Background.setMaximumSize(new java.awt.Dimension(510, 300));
        Background.setMinimumSize(new java.awt.Dimension(510, 300));
        Background.setPreferredSize(new java.awt.Dimension(510, 300));
        getContentPane().add(Background);
        Background.setBounds(0, 0, 510, 300);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKActionPerformed
        
        this.setVisible(false);
        
        if (result == CombatResult.WinAndWinGame)
            
            System.exit(0);
    }//GEN-LAST:event_OKActionPerformed

    private void creditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditsActionPerformed

        credview.showView(); 
    }//GEN-LAST:event_creditsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton OK;
    private javax.swing.JLabel cResult;
    private javax.swing.JButton credits;
    // End of variables declaration//GEN-END:variables
}