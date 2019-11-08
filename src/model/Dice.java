/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Random;

/**
 *
 * @author lucas
 */
public class Dice {
    public int rollDice(){
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }
}
