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
import model.Dice;
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
    
    public void setPlayers(int quantidade){
        controlPlayer = new controllerPlayer(quantidade);
    }

    public ArrayList<Player> playerList(){
        return controlPlayer.getPlayers();
    }
    
    public void jogada(){
        Dice dice = new Dice();
        int temp = dice.rollDice();
        Player p = controlPlayer.nextPlayer();

        controlTurn = new controllerTurn(p, temp);
            
        if(controlTurn.jogada() == 2){
            controlMessage = new controllerMessegers(controlTurn);
            controlMessage.message(controlPlayer.sizePlayers());
        }else if(controlTurn.jogada() == 3){
            controlMessage = new controllerMessegers(controlTurn);
            controlMessage.message();
        }else{
            screenGame.setVisible(false);
        }
    }
}
