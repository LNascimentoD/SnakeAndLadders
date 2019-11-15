package snake.and.ladders;

import Iterator.PlayerIterator;
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


/**
 *
 * @author lucas
 */
public class SnakeAndLadders {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player p = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        Player p4 = new Player();
        
        ArrayList<Player> players = new ArrayList();
        
        players.add(p);
        players.add(p2);
        players.add(p3);
        players.add(p4);
        
        CriaCasasTabuleiro c = new CriaCasasTabuleiro();
        Board.getInstance().setBoxes(c.criaCasasTabuleiro());
        
        MoveEnginner enginner = new MoveEnginner(new MoveBox());
        enginner.move(Board.getInstance().getBox(5), p);
        enginner.setMove(new MoveLadder());
        enginner.move(Board.getInstance().getBox(12), p);
        
        System.out.print(p.getPosicao());
    }
    
}
