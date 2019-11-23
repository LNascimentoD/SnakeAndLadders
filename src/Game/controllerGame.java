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
import view.screenGame;

/**
 *
 * @author lucas
 */
public class controllerGame {   
    private controllerPlayer cp;
    private controllerBoard cb = new controllerBoard();
    private controllerTurn ct;
    private static controllerGame game;
    private controllerMenssegers cm;
    private String mensagem = "";
    private screenGame s;
    
    private controllerGame(){
    }
    
    public void startGame(){
        s = new screenGame();
        s.setVisible(true);
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
            cm = new controllerMenssegers(ct);
            cm.menssage();
        }  
        
    }
    
    public void setMenssage(){
        System.out.println(this.mensagem);
        this.mensagem = "O jogador "+ ct.getPlayer() +" tirou: " + String.valueOf(ct.getDado());
    }
    
    public String getMenssage(){
        s.setJLabel(this.mensagem);
        return this.mensagem;
    }
}
