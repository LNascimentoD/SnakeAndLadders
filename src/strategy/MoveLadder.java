/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import box.AbstractBox;
import box.Ladder;
import model.Player;

/**
 *
 * @author lucas
 */
public class MoveLadder implements Move{
    public void move(AbstractBox ladder, Player p) {
        Ladder l = (Ladder)ladder;
        p.setPosicao(l.getNumTop());
        p.setEixoX(l.getTopX());
        p.setEixoY(l.getTopY());
    }
    
}
