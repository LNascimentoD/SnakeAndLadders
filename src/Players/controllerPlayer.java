/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Players;

import Players.Iterator.PlayerIterator;
import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class controllerPlayer {
    private ArrayList<Player> players = new ArrayList();
    private PlayerIterator pI;
    
    public controllerPlayer(int quantidade){
        this.players = new ArrayList();
        
        for(int i = 1; i <= quantidade; i++){
            Player p = new Player(i);
            this.players.add(p);
        }
        
        this.pI = new PlayerIterator(this.players);
    }
    
    public Player nextPlayer(){
        return pI.next();
    }
    
    public ArrayList<Player> getPlayers(){
       return this.players; 
    }
    
    public int sizePlayers(){
       return this.players.size(); 
    }
}
