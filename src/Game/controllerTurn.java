/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import Players.Player;
import board.Board;
import box.AbstractBox;
import model.Dice;
import strategy.controllerEnginner;

/**
 *
 * @author lucas
 */
public class controllerTurn {
    private Player player; // Jogador do turno
    private controllerEnginner enginner; // Motor de movimentação
    private int dice; // Valor do dado jogado nesse turno
    private AbstractBox box; // Casa para onde o jogador deve ir no final desse turno
    
    public controllerTurn(Player player){
        this.player = player;
        this.enginner = new controllerEnginner();
        
        Dice d = new Dice();
        this.dice = d.rollDice();
        
        if((player.getPosicao()+ dice) <= 100){
            this.box = Board.getInstance().getBox(player.getPosicao()+ dice);
        }
    }
    
    public int jogada(){
        if(dice + player.getPosicao() == 100){
            return 1;
        }else if(dice + player.getPosicao() <= 99){
            enginner.move(box, this.player);
            return 2;
        }else{
            return 3;
        }
    }
    
    public int getPlayer(){
        return this.player.getNumero();
    }
    
    public int getPositionPlayer(){
        return this.player.getPosicao();
    }
    
    public int getDado(){
        return this.dice;
    }
    
    public AbstractBox getBox(){
        return this.box;
    }
}
