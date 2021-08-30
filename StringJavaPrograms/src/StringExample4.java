/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
public class StringExample4 {
    
    public static String rotateLeft(String str){
        char ch[] = str.toCharArray();
        int i = 0;
        char b[] = new char[str.length()];
        for(int j = 0; j < str.length()-1; j++){
            b[i] = ch[j+1];
            i++;
        }
        b[i] = ch[0];
        return String.valueOf(b);
    } 
    public static void main(String[] args){
        String str1 = "abcde";
        String str2 = "deabc";
        //String str = rotateLeft(str1);
        //System.out.println(str);
        int len1 = str1.length();
        int len2 = str2.length();
        String st = str1;
        for(int i = 0; i < len1; i++ ){
            st = rotateLeft(st);
            //str1 = st;
            //System.out.println(st);
            if(st.equals(str2)){
            System.out.println("String 2 is rotation of string 1");
            }
        }
        
        
           
    }
    
}
