/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import box.AbstractBox;
import box.Box;
import box.Ladder;
import box.Snake;

/**
 *
 * @author lucas
 */
public class FactoryBox implements IfactoryBox{
    public AbstractBox createBox(BoxEnum tipo, int num, int eixoX, int eixoY, int specialX, int specialY){
        switch(tipo){
            case snake_box:
                return new Snake(num, eixoX, eixoY, specialX, specialY, 100);
            case ladder_box:
                //100 é constante de teste
                return new Ladder(num, eixoX, eixoY, specialX, specialY, 100);
            default: return new Box(num, eixoX, eixoY);
        }
    }
}
