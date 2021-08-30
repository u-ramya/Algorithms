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
public class StringExample7 {
    public static void main(String[] args){
        System.out.println("Enter the sentence: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
       
        //Removing white spaces from the string
        System.out.println("Modified string without spaces: ");

        for (int i = 0; i < str.length(); i++){  
            if(str.charAt(i) != ' '){
                System.out.print(str.charAt(i));  
            }      
        }
        
            System.out.println();
            
            //Alternate method
            str = str.replaceAll("\\s+", "");
            System.out.println("Modified string without spaces: " + str);

    }
}
