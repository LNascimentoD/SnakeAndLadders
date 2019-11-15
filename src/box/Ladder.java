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
public class Ladder extends SpecialBox{ 
    private int topX;
    private int topY;
    private int numTop = 100;
    
    public Ladder(int num, int eixoX, int eixoY, int topX, int topY, int numTop) {
        super(num, eixoX, eixoY);
        this.topX = topX;
        this.topY = topY;
        this.numTop = numTop;
    }

    public int getTopX() {
        return topX;
    }

    public void setTopX(int topX) {
        this.topX = topX;
    }

    public int getTopY() {
        return topY;
    }

    public void setTopY(int topY) {
        this.topY = topY;
    }

    public int getNumTop() {
        return numTop;
    }
}
