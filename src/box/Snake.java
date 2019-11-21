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
    private int numTail;
    
    public Snake(int num, int eixoX, int eixoY, int numTail) {
        super(num, eixoX, eixoY);
        this.numTail = numTail;
    }
    
    public int getNumTail(){
        return numTail;
    }
}
