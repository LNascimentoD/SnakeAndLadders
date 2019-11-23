package board;

import box.AbstractBox;
import java.util.ArrayList;

public class Board {
    private static Board board;
    private ArrayList<AbstractBox> boxes;
    
    private Board(){
        boxes = new ArrayList();
    }
    
    public static Board getInstance(){
        if(board == null){
            board = new Board();
        }
        
        return board;
    }

    public void setBoxes(ArrayList<AbstractBox> boxes) {
        this.boxes = boxes;
    }
    
    public AbstractBox getBox(int i){
        return this.boxes.get(i);
    }
}
