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
public class StringExample9 {
    public static void main(String[] args){
        System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        int len = str1.length();
        boolean flag = true;
        //Program to check palindrome
        str1 = str1.toLowerCase();
        
        for(int i = 0; i < len; i++){
        if(str1.charAt(i) != str1.charAt(len-i-1)){
             flag = false;
            break;
        }
        }
        
        if(flag){
            System.out.println("Palindrome");
    }
        else{
          System.out.println("Not Palindrome");
        }
        
        // reversing a string
        
        
        
        char st1[] = str1.toCharArray();
        char st2[] = new char[len];
        for(int i = 0; i < len ; i++){
            st2[i] = st1[len-i-1];
        }
System.out.println(st2);
        if(st1 == st1)
        {
            System.out.println("Palindrome");
        }
        else{
                System.out.println("Not Palindrome");
       
        }

}
}
