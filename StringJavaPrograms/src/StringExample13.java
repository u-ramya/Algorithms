/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
//swaping two strings
import java.util.Scanner;
public class StringExample13 {
    public static void main(String[] args){
        System.out.println("Enter string 1:");
        Scanner sc1 = new Scanner(System.in);
        String str1 = sc1.nextLine();
        
        System.out.println("Enter string 2:");
        Scanner sc2 = new Scanner(System.in);
        String str2 = sc2.nextLine();
        
        str1 = str1 + str2;
        
        str2 = str1.substring(0,str1.length()-str2.length());
        
        str1 = str1.substring(str2.length(), str1.length());
        
        System.out.println(" After swapping: ");
        System.out.println("String 1 : " + str1);
        System.out.println("String 2 : " + str2);
        
    }
}
