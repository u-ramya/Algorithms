
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
import java.util.Arrays;
public class StringExample2 {
    public static void main(String[] args){
        String str1 = "Brag";
        String str2 = "Grab";
        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        char string1[] = str1.toCharArray();
        char string2[] = str2.toCharArray();
        
        Arrays.sort(string1);
        
        Arrays.sort(string2);
       
        if(str1.length() != str2.length()){
            System.out.println("Not Amagram");
        }
        
        else{
            if(Arrays.equals(string1, string2) == true){
                System.out.println("Both strings are anagram");
            }
            else{
                System.out.println("Not anagram");
            }
        }
        }
}
