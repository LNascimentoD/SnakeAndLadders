/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package board;

import box.AbstractBox;
import factory.BoxEnum;
import factory.FactoryBox;
import factory.IfactoryBox;
import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class renderBoard implements IRenderBoard{
    ArrayList<Integer> cobra;
    ArrayList<Integer> cauda;
    ArrayList<Integer> escada;
    ArrayList<Integer> topo;
    ArrayList<AbstractBox> boxes;
    ArrayList<Integer> bonus;
    
    public renderBoard(){
        this.cobra = new ArrayList();
        this.escada = new ArrayList();
        this.boxes = new ArrayList();
        this.cauda = new ArrayList();
        this.topo = new ArrayList();
        this.bonus = new ArrayList();
        
        cobra.add(27);
        cobra.add(40);
        cobra.add(43);
        cobra.add(54);
        cobra.add(66);
        cobra.add(76);
        cobra.add(89);
        cobra.add(99);
        
        cauda.add(5);
        cauda.add(3);
        cauda.add(18);
        cauda.add(31);
        cauda.add(45);
        cauda.add(58);
        cauda.add(53);
        cauda.add(41);
        
        escada.add(4);
        escada.add(13);
        escada.add(33);
        escada.add(42);
        escada.add(50);
        escada.add(62);
        escada.add(74);
        
        topo.add(25);
        topo.add(46);
        topo.add(49);
        topo.add(63);
        topo.add(69);
        topo.add(81);
        topo.add(92);
        
        bonus.add(9);
        bonus.add(21);
        bonus.add(17);
        bonus.add(58);
        bonus.add(70);
        bonus.add(85);
        
    }
    
    public ArrayList<AbstractBox> renderBoxes(){  
        IfactoryBox f = new FactoryBox();
        int i = 1;
        boxes.add(f.createBox(BoxEnum.box, 0, 0, 0, 0));
        int caudaCont = 0;
        int topoCont = 0;
        
        for(int y = 570; y >= 30; y -= 60){
            if((y/60)%2 == 0){
                for(int x = 780; x >= 240; x -= 60){
                    if(cobra.contains(i)){
                        boxes.add(f.createBox(BoxEnum.snake_box, i, x, y, cauda.get(caudaCont)));
                        caudaCont++;
                    }else if(escada.contains(i)){
                        boxes.add(f.createBox(BoxEnum.ladder_box, i, x, y, topo.get(topoCont)));
                        topoCont++;
                    }else if(bonus.contains(i)){
                        boxes.add(f.createBox(BoxEnum.bonus_box, i, x, y, i));
                    }else{
                        boxes.add(f.createBox(BoxEnum.box, i, x, y, i));
                    }
                    i++;
                }
            }else{   
                for(int x = 240; x <= 780; x += 60){
                    if(cobra.contains(i)){
                        boxes.add(f.createBox(BoxEnum.snake_box, i, x, y, cauda.get(caudaCont)));
                        caudaCont++;
                    }else if(escada.contains(i)){
                        boxes.add(f.createBox(BoxEnum.ladder_box, i, x, y, topo.get(topoCont)));
                        topoCont++;
                    }else if(bonus.contains(i)){
                        boxes.add(f.createBox(BoxEnum.bonus_box, i, x, y, i));
                    }else{
                        boxes.add(f.createBox(BoxEnum.box, i, x, y, i));
                    }
                    i++;
                }
            }             
        }
        return boxes;
    }
}
