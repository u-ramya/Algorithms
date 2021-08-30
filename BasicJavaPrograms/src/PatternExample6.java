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
public class PatternExample6 {
    public static void main(String[] args){
        System.out.print("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        
        //Right Pascal's Triangle
        for(int i = 0; i < row; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(" *");
            }
            System.out.println(" ");
        }
        
        for(int i = row - 2; i >= 0; i--){
            for(int j = i; j >= 0 ; j--){
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }
    
}
