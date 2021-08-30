/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
public class PatternExample1 {
    public static void main(String[] args){
        
        int k = 1;
        int row = 6; //number of rows to print
        //outer loop for rows
        for (int i = 1; i <= row; i++){
        //inner loop for columns  
        for (int j = 1; j <= i; j++){
            //System.out.print(" *"); // Star Pattern
            //System.out.print(" " + j); // Number Pattern
            System.out.print(" " + k++);
        }
        System.out.println();
        }
        
    }
}
