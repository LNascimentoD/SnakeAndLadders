/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Messegers;

import Game.controllerTurn;
import box.AbstractBox;
import box.Bonus;
import box.Ladder;
import box.Snake;
import javax.swing.JOptionPane;
import view.winner;

/**
 *
 * @author lucas
 */
public class controllerMessegers {
    private controllerTurn controlTurn;
    
    public controllerMessegers(controllerTurn ct){
        this.controlTurn = ct;
    }
    
    public void message(int playerSize, AbstractBox box){
        String resultado;
        int numberPlayer = controlTurn.getPlayer();
        
        if(numberPlayer < (playerSize)){
            resultado = "O jogador "+ numberPlayer +" tirou: " + String.valueOf(controlTurn.getDado()) + " O jogador " + (numberPlayer+1) + " é o proximo a jogar.";
        }else{
            resultado = "O jogador "+ numberPlayer +" tirou: " + String.valueOf(controlTurn.getDado()) + " O jogador 1 é o proximo a jogar.";
        }
                
        if(box instanceof Snake){
            resultado += " Eita, caiu na cabeça de uma cobra.";
        }else if(box instanceof Ladder){
            resultado += " Eba, caiu na base de uma escada.";
        }else if(box instanceof Bonus){
            resultado += " Opa, caiu em uma casa bônus.";
        }else{
            resultado += " Caiu em uma casa normal. :|";
        }
        
        JOptionPane.showMessageDialog(null, resultado);
    }
    
    public void message(){
        int numberPlayer = controlTurn.getPlayer();
        
        JOptionPane.showMessageDialog(null, "O jogador: " + numberPlayer + " tirou mais do que o necessário e perdeu a vez :(");
    }
    
    public void winner(){
        JOptionPane.showMessageDialog(null, "O jogador: " + controlTurn.getPlayer() + " tirou " + controlTurn.getDado() + " e venceu!");
        
        winner w = new winner(controlTurn.getPlayer());
        w.setVisible(true);
    }
}
