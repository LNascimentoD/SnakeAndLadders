/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import Players.Player;
import board.Board;
import strategy.controllerEnginner;

/**
 *
 * @author lucas
 */
public class controllerTurn {
    private Player player;
    private controllerEnginner enginner;
    private int dado;
    
    public controllerTurn(Player p, int dado){
        this.player = p;
        this.enginner = new controllerEnginner();
        this.dado = dado;
    }
    
    public void jogada(){
        enginner.move(Board.getInstance().getBox(this.player.getPosicao()+ this.dado), this.player);
    }
    
    public String getPlayer(){
        return this.player.getNumero();
    }
    
    public int getDado(){
        return this.dado;
    }
    
     public boolean winner(Player p){
        if(p.getPosicao() == 100){
            return true;
        }
        return false;
    }
}
