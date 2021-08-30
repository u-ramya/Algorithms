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
public class PatternExample16 {
    public static void main(String[] args){
        System.out.print("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int k = 1;
        
        for(int i = 1; i <= row; i++){
            int num = i;
        for(int j = 1; j <= i; j++ ){
            System.out.print(num + " ");
            num = num + row - j;
        }
        System.out.println();
        }
    }
}
