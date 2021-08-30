/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
public class StringExample1 {
    public static void main(String[] args){
        String str = "The best of both worlds";
        int count = 0;
        
        //Counts each character except the space
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' '){
            count++;
        }
        }
        System.out.println("The given string is: " + str);
        System.out.println("Actual length of the string: " + str.length());
        System.out.println("Total number of characters in a string: " + count);
        
        //Number of vowels and consonants in the string
        int vowel = 0;
        int consonant = 0;
        String str2 = str.toLowerCase();
        System.out.println("The given string to lower case: " + str2);

                
        for(int i = 0; i < str2.length(); i++){
            if(str.charAt(i) != ' ') {
                if((str2.charAt(i) == 'a' || 
                    str2.charAt(i) == 'e' ||
                    str2.charAt(i) == 'i' ||
                    str2.charAt(i) == 'o' ||
                    str2.charAt(i) == 'u' )){
                vowel++;
            }
                else{
                    consonant++;}
            }
            }
           System.out.println("The number of vowels : " + vowel + " and consonants: " + consonant);     
        
    }
}
