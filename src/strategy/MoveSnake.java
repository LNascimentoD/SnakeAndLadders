/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;
import board.Board;
import box.AbstractBox;
import box.Snake;
import Players.Player;

/**
 *
 * @author lucas
 */
public class MoveSnake implements Move{
    public void move(AbstractBox snake, Player p) {
        Snake s = (Snake)snake;
        p.setPosicao(s.getNumTail());
        p.setEixoX(Board.getInstance().getBox(s.getNumTail()).getEixoX());
        p.setEixoY(Board.getInstance().getBox(s.getNumTail()).getEixoY());
        
    }
}
