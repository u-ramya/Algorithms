/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
public class PatternExample5 {
    public static void main(String[] args){
        
        int row = 10;
        int column = 0;
        int num = 0;
        
        for(int i = 0; i < row; i++){
             num = row - i;
            for(int j = 0; j <= column; j++){
                if(j == i){
                    System.out.print(" " + 0);
                }
                
                else if(j<i){
                   
                    System.out.print(" " + (num) );
                    num++;
                }
                
                else{
                    num--;
                    System.out.print(" " + num);
                    
                }
                    
            }
            column += 2;
            System.out.println();
        }
    }
    
    
}
