/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import Players.Player;
import Players.controllerPlayer;
import board.Board;
import board.controllerBoard;
import java.util.ArrayList;
import model.Dice;
import strategy.controllerEnginner;

/**
 *
 * @author lucas
 */
public class controllerGame {   
    private controllerPlayer cp = new controllerPlayer(2);
    private controllerEnginner enginner = new controllerEnginner();
    private controllerBoard cb = new controllerBoard();
    private static controllerGame game;
    
    private controllerGame(){
    }
    
    public static controllerGame getInstance(){
        if(game == null){
            game = new controllerGame();
        }
        
        return game;
    }

    public ArrayList<Player> playerList(){
        return cp.getPlayers();
    }
    
    public void teste(){
        Dice d = new Dice();
        Player p = cp.nextPlayer();
        
        enginner.move(Board.getInstance().getBox(p.getPosicao()+d.rollDice()), p);
        System.out.println(p);
        System.out.println(p.getPosicao() + " " + p.getEixoX() + " " + p.getEixoY());
    }
}
