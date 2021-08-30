/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
public class CharPattern {
    public static void main(String[] args){
        int alphabet = 65; //ASCII value of capital A is 65
        //inner loop for rows
        for(int i = 0; i <= 8; i++){
            //outer loop for columns
            for(int j = 0; j <= i ; j++){
                //adds the value of j in the ASCII value of A and prints the corresponding alphabet
                System.out.print((char)(alphabet+j) + " ");
            }
            System.out.println();
        }
    }
}
