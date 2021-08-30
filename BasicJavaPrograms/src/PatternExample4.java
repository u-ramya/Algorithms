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
public class PatternExample4 {
    public static void main(String[] args){
        System.out.print("Enter the number of row to print: ");
        Scanner sc = new Scanner(System.in); 
        
        int row = sc.nextInt();
        //Downward Triangle Pattern
        for(int i = row - 1; i>=0; i--){
            for(int j = i; j >= 0; j--){
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}
