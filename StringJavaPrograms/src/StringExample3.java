/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
//Program to divide a string in N equal parts
import java.util.*;
public class StringExample3 {
    public static void main(String[] args){
        System.out.print("Enter the string: ");
        Scanner sc_str = new Scanner(System.in);
        String str = sc_str.nextLine();
        
        System.out.print("number of parts the string: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int temp = 0;
         int part = str.length() / n;
         String str1[] = new String[n];
         if(str.length() % n != 0){
            System.out.println("The given string cannot be divided into " + n + " parts");
        }
        
        else{
            for (int i = 0; i < str.length(); i = i + part){
            String equal = str.substring(i,i+part);
            str1[temp] = equal;
            temp++;
                    }
            System.out.println(n + " equal parts of given string are ");
            for(int i = 0; i < str1.length; i++){
                System.out.println(str1[i]);
            }
        }
        
    }
}
