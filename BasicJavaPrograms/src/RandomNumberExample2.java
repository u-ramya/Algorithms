/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
public class RandomNumberExample2 {
    public static void main(String[] args){
        
        int min = 200;
        int max = 400;
        //Generate random double value from 200 to 400
        
        System.out.println("Random value of type double between " + min + " to " + max + ":");
        
        double a = Math.random() * (max-min+1) + min;
        System.out.println(a);
        
        //Generate random int value from 200 to 400
        
        int b = (int)(Math.random() * (max-min+1) + min);
        System.out.println(b);
    }
}
