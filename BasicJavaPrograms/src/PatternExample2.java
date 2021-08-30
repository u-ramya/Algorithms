/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
public class PatternExample2 {
    public static void main(String[] args){
        int row = 8;
        
        for(int i = 0; i <= row; i++){
            
            //for (int j = 2*(row - i); j >= 0; j-- ){ //Left Triangle Pattern
            for (int j = (row - i); j >= 0; j-- ){   // Pyramid Pattern 
                System.out.print(" ");
            }
            
            int number = 1;
            for (int j = 0; j <= i; j++){
            //System.out.print(" *");
            System.out.printf("%4d", number);  
number = number * (i - j) / (j + 1); 
            }
            System.out.println();
            
        }
    }
}
