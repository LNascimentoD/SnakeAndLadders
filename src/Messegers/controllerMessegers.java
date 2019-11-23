/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Messegers;

import Game.controllerTurn;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class controllerMessegers {
    private controllerTurn controlTurn;
    
    public controllerMessegers(controllerTurn ct){
        this.controlTurn = ct;
    }
    
    public void message(int playerSize){
        String resultado;
        int numberPlayer = controlTurn.getPlayer();
        
        if(numberPlayer < (playerSize)){
            resultado = "O jogador "+ numberPlayer +" tirou: " + String.valueOf(controlTurn.getDado()) + " O jogador " + (numberPlayer+1) + " é o proximo a jogar.";
        }else{
            resultado = "O jogador "+ numberPlayer +" tirou: " + String.valueOf(controlTurn.getDado()) + " O jogador 1 é o proximo a jogar.";
        }
        
        JOptionPane.showMessageDialog(null, resultado);
    }
    
    public void message(){
        int numberPlayer = controlTurn.getPlayer();
        
        JOptionPane.showMessageDialog(null, "O jogador: " + numberPlayer + " tirou mais do que o necessário e perdeu a vez :(");
    }
}
