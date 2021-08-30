/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
public class PatternExample7 {
    public static void main(String[] args){
        int rows = 6;
        int num = 1;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < rows - i; j++){
                System.out.print(" ");
            }
            
            for(int j = 0; j <= i; j++){
                
                if(j == 0 || j == i){
                    num = 1;
                    System.out.print(num + " ");
                }
                else{
                    num = num * (i-j+1)/j;
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }
    }
}
