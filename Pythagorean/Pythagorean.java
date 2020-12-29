/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingdojo;
import java.lang.Math;

/**
 *
 * @author pccorner
 */
public class Pythagorean {
    public static void main(String[] args) {
        System.out.print(calculateHypotenuse(3,4));
        
    }
    public static double calculateHypotenuse(int legA, int legB) {
         return Math.sqrt((legA * legA ) + (legB * legB));
    }
}
