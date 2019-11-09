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
public abstract class AbstractBox {
    private int num;
    private int eixoX, eixoY;
    
    public AbstractBox(int num, int eixoX, int eixoY){
        this.num = num;
        this.eixoX = eixoX;
        this.eixoY = eixoY;
    }
}
