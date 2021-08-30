/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
public class FactorialExample {
    public static int printFactorial(int num){
        int prod = num;
        for(int i = num -1; i > 0; i--){
            prod = prod * i;
        }
        return (prod);
    }
    
    public static void main(String[] args){
        
        int n = 4;
        int number = printFactorial(n);
        System.out.println("The factorial value of " + n + " is: " + number );
    }
}
