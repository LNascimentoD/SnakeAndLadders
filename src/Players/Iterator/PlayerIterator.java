/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Players.Iterator;

import java.util.ArrayList;
import Players.Player;

/**
 *
 * @author guilherme :)
 */
public class PlayerIterator implements IteratorInterface {
    private ArrayList<Player> players;
    private int position = -1;
    
    public PlayerIterator(ArrayList<Player> players) {
        this.players = players;
    }
    
    public boolean hasNext() {
        if (this.position < players.size() - 1) {
            return true;
        } else {
            return false;
        }
    }
    
    public Player next() {
        if(hasNext()){
            this.position++;
            Player p = players.get(this.position);
            return p;
        }else{
            this.position = 0;
            return players.get(this.position);
        }
    }
}
