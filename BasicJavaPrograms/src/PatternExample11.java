
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
// Down Triangle Pattern
import java.util.Scanner;
public class PatternExample11 {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        
        for(int i = row; i >= 0; i--){
            for(int j = 0; j < row - i; j++){
                System.out.print(" ");
            }
            
            for(int j = i; j >= 0; j--){
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
