/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author lucas
 */
public enum BoxEnum {
    snake_box(1),
    ladder_box(2),
    box(3),
    bonus_box(4);
    
    private int type;
    
    BoxEnum(int type){
        this.type = type;
    }
}
