/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package box;
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

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getEixoX() {
        return eixoX;
    }

    public void setEixoX(int eixoX) {
        this.eixoX = eixoX;
    }

    public int getEixoY() {
        return eixoY;
    }

    public void setEixoY(int eixoY) {
        this.eixoY = eixoY;
    }
}
