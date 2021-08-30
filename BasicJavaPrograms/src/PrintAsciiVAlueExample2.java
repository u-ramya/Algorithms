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
public class PrintAsciiVAlueExample2 {
    public static void main(String[] args){
        System.out.print("Enter a character: ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int asciiValue = ch;
        
        System.out.println("ASCII value of " + ch + " is: " + asciiValue);
    }
}
