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
public class StringExample8 {
    public static void main(String[] args){
        System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuffer newStr = new StringBuffer(str);
        System.out.println("String Buffer: " + newStr);
        //converting lowercase characters to upper case and vice versa
        
        for(int i = 0; i < str.length(); i++){
            if (Character.isLowerCase(str.charAt(i))){
                //convert to upper case
                newStr.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            }
            else if(Character.isUpperCase(str.charAt(i))){

                newStr.setCharAt(i, Character.toLowerCase(str.charAt(i)));
            }
        }
        System.out.println("String after conversion:");
        System.out.println(newStr);
        
        char ch = '_';
        str = str.replace(' ', ch);
        System.out.println("String after replacing spaces:");
        System.out.println(str);
    }
}
