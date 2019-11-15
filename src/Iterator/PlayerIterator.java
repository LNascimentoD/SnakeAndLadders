/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

import java.util.ArrayList;
import model.Player;

/**
 *
 * @author guilherme :)
 */
public class PlayerIterator implements IteratorInterface {
    private ArrayList<Player> players;
    private int position = 0;
    
    public PlayerIterator(ArrayList<Player> players) {
        this.players = players;
    }
    
    public boolean hasNext() {
        if (this.position < players.size()) {
            return true;
        } else {
            return true;
        }
    }
    
    public Player next() {
        this.position++;
        return players.get(this.position - 1);
    }
}
