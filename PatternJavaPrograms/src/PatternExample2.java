/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
public class PatternExample2 {
    public static void main(String[] args){
         
        int rows = 4;
        int columns = 9;
        int mid = (columns/2) ;
        
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(j == mid || j == (columns-i-1) || j == i){
                    System.out.print("* ");
                }
                
                else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
