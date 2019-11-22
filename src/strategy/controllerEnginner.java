/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import Players.Player;
import box.AbstractBox;
import box.Box;
import box.Ladder;
import box.Snake;

/**
 *
 * @author lucas
 */
public class controllerEnginner {
    private MoveEnginner enginner = new MoveEnginner(new MoveBox());
    
    public void move(AbstractBox box, Player p){
        if(box instanceof Snake){
            enginner.setMove(new MoveSnake());
            enginner.move(box, p);
        }else if(box instanceof Ladder){
            enginner.setMove(new MoveLadder());
            enginner.move(box, p);
        }else if(box instanceof Box){
            enginner.setMove(new MoveBox());
            enginner.move(box, p);
        }else{            
            enginner.setMove(new MoveBonus());
            enginner.move(box, p);
        }
    }
}
