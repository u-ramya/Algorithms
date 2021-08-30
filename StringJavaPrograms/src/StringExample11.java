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
public class StringExample11 {
    public static String reverseString(String str){
        int len = str.length();
        char st[] = str.toCharArray();
        for(int i = 0; i < len; i++){
            st[i] = str.charAt(len-i-1);
        }
        return(String.valueOf(st));
    }
    
    
    
    public static void main(String[] args){
        System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String rev = reverseString(string);
        
        System.out.println(rev);
        int freq[] = new int[string.length()];
        //Printing duplicate characters
        char st[] = string.toCharArray();
        System.out.println("Duplicate characters are: ");
        for(int i = 0; i < string.length(); i++){
             freq[i] = 1;
            for(int j = i+1; j < string.length(); j++){
                if(st[i] == st[j] && 
                        st[i] != ' ' &&
                        st[i] != '0'){
                    freq[i]++;
                    st[j]= '0';
                }
            }
        }
        for(int i = 0; i < freq.length; i++){
            if(freq[i] > 1 && freq[i] != '0'){
                System.out.println(st[i]);
                
            }
        }
        System.out.println("Frequency of characters:");
        for(int i = 0; i < freq.length; i++){
            if(st[i] != ' '  && st[i] != '0'){
                System.out.println(st[i] + "---"+freq [i] );
                
            }
        }
        
    }
}
