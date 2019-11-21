/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package board;

/**
 *
 * @author lucas
 */
public class controllerBoard {
    public controllerBoard(){
        renderBoard r = new renderBoard();
        Board.getInstance().setBoxes(r.criaCasasTabuleiro());
    }
}
