/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Game.controllerGame;
import board.Board;
import box.Ladder;
import box.Snake;
import java.util.ArrayList;
import model.Dice;
import model.Player;
import snake.and.ladders.CriaCasasTabuleiro;
import strategy.MoveBox;
import strategy.MoveEnginner;
import strategy.MoveLadder;
import strategy.MoveSnake;

/**
 *
 * @author lucas
 */
public class screenGame extends javax.swing.JFrame {
        feedBoard f = new feedBoard();
        
    public screenGame() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(200, 500));
        setPreferredSize(new java.awt.Dimension(950, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(950, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/j1.jpeg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 40, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/j1.jpeg"))); // NOI18N
        jLabel4.setText("2");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/j1.jpeg"))); // NOI18N
        jLabel5.setText("3");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/j1.jpeg"))); // NOI18N
        jLabel6.setText("4");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tab2.jpeg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, 600));

        jButton1.setText("Rolar dados");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, 130, 30));

        jLabel3.setText("Cobras e Escadas");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jButton2.setText("Iniciar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 550, 80, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void setPositions(){
        feedBoard f = new feedBoard();
        switch(f.playerSize()){
            case 2:
                jLabel2.setLocation(f.getPlayer(0).getEixoX(), f.getPlayer(0).getEixoY());
                jLabel4.setLocation(f.getPlayer(1).getEixoX(), f.getPlayer(1).getEixoY());
                break;
            case 3:
                jLabel2.setLocation(f.getPlayer(0).getEixoX(), f.getPlayer(0).getEixoY());
                jLabel4.setLocation(f.getPlayer(1).getEixoX(), f.getPlayer(1).getEixoY());
                jLabel5.setLocation(f.getPlayer(2).getEixoX(), f.getPlayer(2).getEixoY());
                break;
            case 4:
                jLabel2.setLocation(f.getPlayer(0).getEixoX(), f.getPlayer(0).getEixoY());
                jLabel4.setLocation(f.getPlayer(1).getEixoX(), f.getPlayer(1).getEixoY());
                jLabel5.setLocation(f.getPlayer(2).getEixoX(), f.getPlayer(2).getEixoY());
                jLabel6.setLocation(f.getPlayer(3).getEixoX(), f.getPlayer(3).getEixoY());
                break;
            default:
                break;
        }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        controllerGame.getInstance().jogada();
        setPositions();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setPositions();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(screenGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(screenGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(screenGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(screenGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new screenGame().setVisible(true);
            }
        });
        
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
