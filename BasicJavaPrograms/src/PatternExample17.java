
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
import java.util.Scanner;
public class PatternExample17 {
    public static void main(String[] args){
        System.out.print("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        
        for(int i = 1; i <= row; i++){
            int num = i;
        for(int j = i; j <= row; j++ ){
            System.out.print(j + " ");
            num = num;
        }
        
        for(int k = 1; k < i; k++ ){
            System.out.print(k + " ");
            num = num;
        }
        System.out.println();
        }
    }
}


