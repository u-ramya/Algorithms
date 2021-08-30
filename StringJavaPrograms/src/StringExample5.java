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

public class StringExample5 {
    public static String lcp(String s,String t){
        int n = Math.min(s.length(), t.length());
        
        for(int i = 0; i < n ; i++){
            if(s.charAt(i) != t.charAt(i)){
                return s.substring(0,i);
            }
        }
        return s.substring(0,n);
    }
    public static void main(String[] args){
        System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        str = str.toLowerCase();
        String lrs = "";  //Longest repeating sequence
        
        int n = str.length();
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                //checks for the largest common factor
                String x = lcp(str.substring(i,n), str.substring(j,n));
                /*if the current prefix is greater than the previous one
                then it takes the current one as the longest repeating sequence*/
                if(x.length() > lrs.length()) 
                    lrs = x;
            }
        }
        
        System.out.println("Longest repeating sequence: " + lrs);
    }
}
