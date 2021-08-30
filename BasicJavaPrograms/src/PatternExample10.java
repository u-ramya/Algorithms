/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
// Triangle Pattern
import java.util.Scanner;
public class PatternExample10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        
        for(int i = 0; i <= row; i++){
            for(int j = 0; j < row - i; j++){
                System.out.print(" ");
            }
            
            for(int j = 0; j <= i; j++){
                if( i!= row ){
              if((j == 0 || j == i))
                System.out.print(" *");
               else
                System.out.print("  ");
                }
                else
                 System.out.print(" *");   
            }
            
            System.out.println();
        }
    }
}
