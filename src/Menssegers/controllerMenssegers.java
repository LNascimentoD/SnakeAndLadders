/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menssegers;

import Game.controllerTurn;
import Players.Player;

/**
 *
 * @author lucas
 */
public class controllerMenssegers {
    private controllerTurn ct;
    
    public controllerMenssegers(controllerTurn ct){
        this.ct = ct;
    }
    
    public String getPlayer(){
        return " ";
    }
    
    public int getDado(){
        return ct.getDado();
    }
}
