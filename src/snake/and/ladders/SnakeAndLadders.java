package snake.and.ladders;

import Game.controllerGame;
import board.Board;
import factory.BoxEnum;
import factory.FactoryBox;
import box.AbstractBox;
import box.Ladder;
import factory.IfactoryBox;
import java.util.ArrayList;
import model.Player;
import strategy.MoveBox;
import strategy.MoveEnginner;
import strategy.MoveLadder;
import view.screenGame;


/**
 *
 * @author lucas
 */
public class SnakeAndLadders {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        screenGame s = new screenGame();
        s.setVisible(true);
    }
    
}
