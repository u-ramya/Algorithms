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
public class PaternExample3 {
    public static void main(String[] args){
        System.out.print("Enter the number of rows you want to print: ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int row = 2*r;
        
        for(int i = 0; i < row; i++){
            
            for (int j = (row - i); j >= 0; j-- ){    
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++){
            System.out.print(" *");
            }
            System.out.println();
            i++;
        }
        
        for(int i = row; i >=0 ; i--){
            
            for (int j = (row - i) ; j >= 0; j-- ){   
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++){
            System.out.print(" *");
            }
            System.out.println();
            i--;
        }
        
    }
}
