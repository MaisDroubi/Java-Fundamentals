/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingdojo;

/**
 *
 * @author pccorner
 */
public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(1));
    }
    
        public static String fizzBuzz(int number) {
            if(number%3==0 && number%5==0){
                return "FizzBuzz";
                
            }
            else if(number%3==0){
                return "Fizz";
                
            }
            else if(number%5==0){
                return "Buzz";
                
            }
            else{
                return number+"";
                
            }
        
    
    }
    
}
