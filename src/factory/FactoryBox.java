/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import box.AbstractBox;
import box.Bonus;
import box.Box;
import box.Ladder;
import box.Snake;

/**
 *
 * @author lucas
 */
public class FactoryBox implements IfactoryBox{
    public AbstractBox createBox(BoxEnum tipo, int num, int eixoX, int eixoY, int specialNum){
        switch(tipo){
            case snake_box:
                return new Snake(num, eixoX, eixoY, specialNum);
            case ladder_box:
                return new Ladder(num, eixoX, eixoY, specialNum);
            case bonus_box:
                return new Bonus(num, eixoX, eixoY);
            default: return new Box(num, eixoX, eixoY);
        }
    }
}
