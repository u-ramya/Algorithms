/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
public class PrintAsciiValueExample1 {
    public static void main(String args[]){
        //character whose ASCII value to be found
        char ch1 = 'a';
        char ch2 = 'b';
        //variable that stores the integer value of the character
        int ascii1 = ch1;
        int ascii2 = ch2;
        
        //another way to store the integer value of ASCII value
        int ch3 = 'a';
        int ch4 = 'b';
        
        System.out.println("The ASCII value of " + ch1 + " is: " + ascii1);
        System.out.println("The ASCII value of " + ch2 + " is: " + ascii2);
        System.out.println("The ASCII value of a is: " + ch3);
        System.out.println("The ASCII value of b is:  " + ch4);

    }
}
