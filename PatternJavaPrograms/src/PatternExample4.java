/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
public class PatternExample4 {
    public static void main(String[] args){
       
        int row = 4;
        int column = 8;
        for(int i = 1; i <= row; i++){
            for(int j = 1; j < column; j++){
                if((j==i )|| (j==(column-i))){
                    System.out.print(" "+ i);
                    
                }
                else
                    System.out.print("  ");
                
            }
            System.out.println();
        }
        
        for(int i = row - 1; i >= 1  ; i--){
            for(int j = 1 ; j < column; j++){
                if( (j==i || j==column-i)){
                    System.out.print(" " + i);
                    
                }
                else
                    System.out.print("  ");
                
            }
            System.out.println();
        }
    }
}
