/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import Messegers.controllerMessegers;
import Players.Player;
import Players.controllerPlayer;
import board.controllerBoard;
import java.util.ArrayList;
import view.screenGame;

/**
 *
 * @author lucas
 */
public class controllerGame {   
    private controllerPlayer controlPlayer;
    private controllerBoard controlBoard;
    private controllerTurn controlTurn;
    private static controllerGame game;
    private controllerMessegers controlMessage;
    private screenGame screenGame;
    
    private controllerGame(){
        controlBoard = new controllerBoard();
    }
    
    public void startGame(){
        screenGame = new screenGame();
        screenGame.setVisible(true);
    }
    
    public static controllerGame getInstance(){
        if(game == null){
            game = new controllerGame();
        }
        
        return game;
    }
    
    public boolean setPlayers(int quantidade){
        if(quantidade > 4 || quantidade < 2){
            return false;
        }else{
            controlPlayer = new controllerPlayer(quantidade);
            return true;
        }
    }

    public ArrayList<Player> playerList(){
        return controlPlayer.getPlayers();
    }
    
    public void jogada(){
        Player p = controlPlayer.nextPlayer();

        controlTurn = new controllerTurn(p);
            
        if(controlTurn.jogada() == 2){
            controlMessage = new controllerMessegers(controlTurn);
            controlMessage.message(controlPlayer.sizePlayers(), controlTurn.getBox());
        }else if(controlTurn.jogada() == 3){
            controlMessage = new controllerMessegers(controlTurn);
            controlMessage.message();
        }else{
            controlMessage = new controllerMessegers(controlTurn);
            controlMessage.winner();
            screenGame.setVisible(false);
        }
    }
}
