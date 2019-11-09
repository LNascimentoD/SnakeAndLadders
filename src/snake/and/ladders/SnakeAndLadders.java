/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake.and.ladders;

import factory.BoxEnum;
import factory.FactoryBox;
import factory.AbstractBox;
import factory.IfactoryBox;


/**
 *
 * @author lucas
 */
public class SnakeAndLadders {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IfactoryBox f = new FactoryBox();
        AbstractBox b = f.createBox(BoxEnum.box, 1, 1, 1);
        AbstractBox e = f.createBox(BoxEnum.snake_box, 3, 1, 1);
    }
    
}
