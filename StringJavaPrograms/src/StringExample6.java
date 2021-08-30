/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
import java.util.*;

public class StringExample6 {
     public static void main(String[] args){
         System.out.println("Enter the string: ");
         Scanner sc = new Scanner(System.in);
         String str = sc.nextLine();
         
         int n = str.length();
         System.out.println("All the permutations of the string are: ");
         generatePermutation(str,0,n);
     }


//function for generating different permutations of the string
public static void generatePermutation(String str, int start, int end){
//Print the permutations

PermuteString string = new PermuteString();

if (start == end-1)
System.out.println(str);

else {
   for(int i = start; i < end; i++){
       //Swapping the string by fixing a character
       str = string.swapString(str, start, i);
       //Recursively calling function generatePermutation() for rest of the characters
       generatePermutation(str, start+1,end);
       //Backtracking and swapping the characters again
       str = string.swapString(str,start,i);
   }
}
}
}
