/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;
import box.AbstractBox;

/**
 *
 * @author lucas
 */
public interface IfactoryBox {
    AbstractBox createBox(BoxEnum tipo, int num, int eixoX, int eixoY, int specialNum);
}
