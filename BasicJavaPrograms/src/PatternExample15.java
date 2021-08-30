/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
import java.util.Scanner;
public class PatternExample15 {
    public static void main(String[] args){
        System.out.print("Enter the number of rows to print: ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        
        for(int i = 0; i < row; i++){
            if(i%2 == 0){
                int k = 0;
            for(int j = 0; j < row; j++){   
                System.out.print(k + " ");
                k = (k == 0) ? 1 : 0;
                }
            }
                else{
                    int k = 1;
                for(int j = 0; j < row; j++){
                System.out.print(k + " ");
                k = (k == 1) ? 0 : 1;
                }
                
            }
            
            System.out.println();
        }
        
    }
}
