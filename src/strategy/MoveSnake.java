/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;
import box.AbstractBox;
import box.Snake;
import box.SpecialBox;
import model.Player;

/**
 *
 * @author lucas
 */
public class MoveSnake implements Move{
    public void move(AbstractBox snake, Player p) {
        Snake s = (Snake)snake;
        p.setPosicao(s.getNum());
        p.setEixoX(s.getTailX());
        p.setEixoY(s.getTailY());
    }
}
