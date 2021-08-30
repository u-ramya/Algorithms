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
public class PatternExample5 {
    public static void main(String[] args){
        System.out.print("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        
        for(int i = row; i>=0; i--){
            //for(int j= 2*(row-i); j>=0; j--){ //Reverse triangle Pattern
            for(int j= (row-i); j>=0; j--){  //Reverse Pyramid Pattern
                System.out.print(" ");
            }
            for(int j=i; j>=0; j--){
                System.out.print(" *");
            }
            System.out.println(" ");
        }
        
    }
}
