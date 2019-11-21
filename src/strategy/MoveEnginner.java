/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import box.AbstractBox;
import Players.Player;

/**
 *
 * @author lucas
 */
public class MoveEnginner{
    private Move move;
    
    public MoveEnginner(Move move){
        this.move = move;
    }
    
    public void move(AbstractBox box, Player p){
        move.move(box, p);
    }

    public void setMove(Move move) {
        this.move = move;
    }
}
