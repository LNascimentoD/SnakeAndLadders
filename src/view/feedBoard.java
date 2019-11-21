/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Game.controllerGame;
import Players.Player;
import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class feedBoard {
    ArrayList<Player> player = controllerGame.getInstance().playerList();
    
    public Player getPlayer(int index){
        return this.player.get(index);
    }
}
