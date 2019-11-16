/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Player;

/**
 *
 * @author lucas
 */
public class feedBoard {
    public int getX(Player p){
        return p.getEixoX();
    }
    public int getY(Player p){
        return p.getEixoY();
    }
    public int getNum(Player p){
        return p.getPosicao();
    }
}
