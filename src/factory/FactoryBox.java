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
public class FactoryBox implements IfactoryBox{
    public Ibox criaBox(String tipo) {
        switch(tipo){
            case "casa":
                return new Box();
            case "cobra":
                return new Snake();
            case "escada":
                return new Ladder();
            default: return new Box();
        }
    }
}
