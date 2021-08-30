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
public class PatternExample14 {
    public static void main(String[] args){
        System.out.print("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        
        for(int i = 0; i < row ; i++){
            for(int j = 0; j < row - i; j++ ){
                System.out.print(" ");
            }
            int k = (i/2) + 1;
            for(int j = 0; j <= i; j++){
                if (j < i/2){
                System.out.print(" " + k);
                k--;
                }
                else{
                    System.out.print(" " + k);
                    k++;
                        }
            }
            
            System.out.println(" ");
            i++;
        }
        
        for(int i = row; i >= 0 ; i--){
            for(int j = 0; j < row - i; j++ ){
                System.out.print(" ");
            }
            int k = (i/2) + 1;
            for(int j = 0; j <= i; j++){
                if (j < i/2){
                System.out.print(" " + k);
                k--;
                }
                else{
                    System.out.print(" " + k);
                    k++;
                        }
            }
            
            System.out.println(" ");
            i--;
        }
    }
}
