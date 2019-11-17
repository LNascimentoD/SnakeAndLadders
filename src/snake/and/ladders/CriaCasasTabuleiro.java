/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake.and.ladders;
import box.AbstractBox;
import factory.BoxEnum;
import factory.FactoryBox;
import factory.IfactoryBox;
import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class CriaCasasTabuleiro {
    ArrayList<Integer> cobra;
    ArrayList<Integer> escada;
    ArrayList<AbstractBox> boxes;
    
    public CriaCasasTabuleiro(){
        this.cobra = new ArrayList();
        this.escada = new ArrayList();
        this.boxes = new ArrayList();
        
        cobra.add(27);
        cobra.add(40);
        cobra.add(43);
        cobra.add(54);
        cobra.add(66);
        cobra.add(76);
        cobra.add(89);
        cobra.add(99);
        
        escada.add(4);
        escada.add(13);
        escada.add(33);
        escada.add(42);
        escada.add(50);
        escada.add(62);
        escada.add(74);
    }
    
    public ArrayList<AbstractBox> criaCasasTabuleiro(){  
        IfactoryBox f = new FactoryBox();
        int i = 1;
        boxes.add(f.createBox(BoxEnum.box, 0, 0, 0, 0, 0));
        
        for(int y = 570; y >= 30; y -= 60){
            if((y/60)%2 == 0){
                for(int x = 780; x >= 240; x -= 60){
                    if(cobra.contains(i)){
                        boxes.add(f.createBox(BoxEnum.snake_box, i, x, y, 100, 100));
                    }else if(escada.contains(i)){
                        boxes.add(f.createBox(BoxEnum.ladder_box, i, x, y, 100, 100));
                    }else{
                        boxes.add(f.createBox(BoxEnum.box, i, x, y, i, i));
                    }
                    i++;
                }
            }else{   
                for(int x = 240; x <= 780; x += 60){
                    if(cobra.contains(i)){
                        boxes.add(f.createBox(BoxEnum.snake_box, i, x, y, 100, 100));
                    }else if(escada.contains(i)){
                        boxes.add(f.createBox(BoxEnum.ladder_box, i, x, y, 100, 100));
                    }else{
                        boxes.add(f.createBox(BoxEnum.box, i, x, y, i, i));
                    }
                    i++;
                }
            }             
        }
        return boxes;
    }
}
