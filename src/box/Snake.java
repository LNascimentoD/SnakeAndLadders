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
public class Snake extends SpecialBox{
    private int tailX;
    private int tailY;
    private int numTail;
    
    public Snake(int num, int eixoX, int eixoY, int tailX, int tailY, int numTail) {
        super(num, eixoX, eixoY);
        this.tailX = tailX;
        this.tailY = tailY;
        this.numTail = numTail;
    }

    public int getTailX() {
        return tailX;
    }

    public void setTailX(int tailX) {
        this.tailX = tailX;
    }

    public int getTailY() {
        return tailY;
    }

    public void setTailY(int tailY) {
        this.tailY = tailY;
    }
    
    
}
