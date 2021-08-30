/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */

public class StringExample10 {
    public static void main(String[] args){
        String str = "Grass is greener on the other side.";
        str = str.toLowerCase(); // converting to lowercase for easy comparison
        
        //Initialize minchar maxchar
        char char_str[] = str.toCharArray(); //converting to charater array
        char minChar = str.charAt(0), maxChar = str.charAt(0);

        System.out.println(str);
        System.out.println(char_str);
        
        
        int freq[] = new int[str.length()];
        int min, max;
        for(int i = 0; i < str.length(); i++){
             freq[i] = 1;
            
            for(int j = i+1; j < str.length(); j++){
                if( char_str[i] == char_str[j] && 
                        char_str[i] != ' ' &&
                        char_str[i] != '0') {
                freq[i]++;
                char_str[j] = '0'; //set visited character to 0
            }
                
            }
        }
        
        
        //Determine minimum and maximum occurring characters 
        
        min = max = freq[0];
        for(int i = 0; i < freq.length; i++){
            if(min > freq[i] && freq[i] != '0'){
                min = freq[i];
                minChar = char_str[i];
            }
            
            if( max < freq[i] && freq[i] != '0'){
                max = freq[i];
                maxChar = char_str[i];
            }
        }
        
        System.out.println("Minimum occuring character: "+ minChar);
        System.out.println("Maximum occuring character: "+ maxChar);
      
    }
    
}
