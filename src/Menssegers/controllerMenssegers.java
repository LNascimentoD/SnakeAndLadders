/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menssegers;

import Game.controllerTurn;
import Players.Player;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class controllerMenssegers {
    private controllerTurn ct;
    
    public controllerMenssegers(controllerTurn ct){
        this.ct = ct;
    }
    
    public void menssage(){
        String resultado;
        resultado = "O jogador "+ ct.getPlayer() +" tirou: " + String.valueOf(ct.getDado());
        JOptionPane.showMessageDialog(null, resultado);
        System.out.println(resultado);
    }
}
