/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
public class PalindromeExample {
    public static void printPalindrome(int num){
        
        System.out.println("Is the number " + num + " a Palindrome?");
        
        int temp = num;
        int sum = 0;
        while(num>0) {
            
            int remainder = num % 10; //getting the remainder
            sum = (sum * 10) + remainder;
            num = num / 10;
        }
        
        if(temp == sum)
            System.out.println("Palindrome number.");
        else
            System.out.println("Not a Palindrome number.");
    }
    
    public static void main(String[] args){
        printPalindrome(54345);
    }
}
