/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import Menssegers.controllerMenssegers;
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
    private controllerPlayer cp;
    private controllerBoard cb = new controllerBoard();
    private controllerTurn ct;
    private static controllerGame game;
    private controllerMenssegers cm = new controllerMenssegers(ct);
    
    private controllerGame(){
    }
    
    public static controllerGame getInstance(){
        if(game == null){
            game = new controllerGame();
        }
        
        return game;
    }
    
    public void setPlayers(int quantidade){
        cp = new controllerPlayer(quantidade);
    }

    public ArrayList<Player> playerList(){
        return cp.getPlayers();
    }
    
    public void jogada(){
        Dice d = new Dice();
        int temp = d.rollDice();
        Player p = cp.nextPlayer();

        if(temp + p.getPosicao() <= 100){
            ct = new controllerTurn(p, temp);
            ct.jogada();
        }        
    }
    
    public String menssage(){
        String resultado;
        resultado = "O jogador "+ ct.getPlayer() +" tirou: " + String.valueOf(ct.getDado());
        return resultado;
    }
}
