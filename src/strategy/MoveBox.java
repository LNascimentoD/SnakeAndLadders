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
public class MoveBox implements Move{
    public void move(AbstractBox box, Player p) {
        p.setPosicao(box.getNum());
        p.setEixoX(box.getEixoX());
        p.setEixoY(box.getEixoY());
    }
}
