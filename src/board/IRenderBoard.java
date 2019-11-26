/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package board;

import box.AbstractBox;
import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public interface IRenderBoard {
    public ArrayList<AbstractBox> renderBoxes();
}
