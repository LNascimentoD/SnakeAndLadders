/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import Players.Player;
import board.Board;
import box.AbstractBox;
import model.Dice;

/**
 *
 * @author lucas
 */
public class MoveBonus implements Move{
    public void move(AbstractBox box, Player p) {
        Dice d = new Dice();
        int temp = d.rollDice();
        AbstractBox newbox;
        
        if(temp > 3){
            newbox = Board.getInstance().getBox((temp - 3) + box.getNum());
        }else{
            newbox = Board.getInstance().getBox(box.getNum() - temp);
        }
        
        p.setEixoX(newbox.getEixoX());
        p.setEixoY(newbox.getEixoY());
        p.setPosicao(newbox.getNum());
    }
    
}
