/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake.and.ladders;

import factory.FactoryBox;
import factory.Ibox;
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
        Ibox b = f.criaBox("casa");
        Ibox e = f.criaBox("escada");
    }
    
}
