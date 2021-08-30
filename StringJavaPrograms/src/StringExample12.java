/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
public class StringExample12 {
    public static void main(String[] args){
    String str = "Hardships often prepare ordinary people for an extraordinary destiny";
    String word = "", small = "", large = "";
    String words[] = new String[100];
    
    int length = 0;
    str = str + " ";
  for(int i = 0; i < str.length(); i++){
    //Split the string into words
    if(str.charAt(i) !=' '){
      word = word + str.charAt(i);
  }
    else{
        //add word to array words
        words[length] = word;
        length++; // increment length
        word = ""; //make word an empty string
    }
    
}
  
   //initialise small and large with first word in the string
   small = large = words[0];
   
   //Determine the smallest and largest word
   for(int k = 0; k < length; k++){
       //smallest word
       if( small.length() > words[k].length()){
           small = words[k];
       }
       
       //largest word
       if(large.length() < words[k].length()){
           large = words[k];
       }
           
      
   }
   System.out.println(str);
   System.out.println("Smallest word: " + small);
   
   System.out.println("Largest word: " + large);
   System.out.println("Number of words in the string: " + length);
    } 
}
