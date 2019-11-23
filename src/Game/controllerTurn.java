/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import Players.Player;
import board.Board;
import strategy.controllerEnginner;
import view.winner;

/**
 *
 * @author lucas
 */
public class controllerTurn {
    private Player player;
    private controllerEnginner enginner;
    private int dice;
    
    public controllerTurn(Player p, int dice){
        this.player = p;
        this.enginner = new controllerEnginner();
        this.dice = dice;
    }
    
    public int jogada(){
        if(dice + player.getPosicao() == 100){
            winner w = new winner(player.getNumero());
            w.setVisible(true);
            return 1;
        }else if(dice + player.getPosicao() <= 99){
            enginner.move(Board.getInstance().getBox(this.player.getPosicao()+ this.dice), this.player);
            return 2;
        }else{
            return 3;
        }
    }
    
    public int getPlayer(){
        return this.player.getNumero();
    }
    
    public int getPositionPlayer(){
        return this.player.getPosicao();
    }
    
    public int getDado(){
        return this.dice;
    }
}
