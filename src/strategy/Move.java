/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import box.AbstractBox;
import model.Player;

/**
 *
 * @author lucas
 */
public interface Move {
    public void move(AbstractBox box, Player p);
}
