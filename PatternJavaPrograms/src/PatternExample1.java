/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
public class PatternExample1 {
    public static void main(String[] args){
        
        //intitialize array with zero
        int arr[][] = new int[5][5];
        int length = arr.length;
        
        
        for(int i = 0; i < length; i++ ){
            int num = 5;
            for(int j = 0; j < length; j++){
               if(j != length - i - 1){
                   arr[i][j] = num;
                System.out.print(arr[i][j] + " ");
                
               }
               else{
                   System.out.print("* ");
               }
               num--;
            }
            System.out.println();
        }
        
        /*for(int i = 0; i < length; i++ ){
           
            for(int j = 0; j < length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();*/
    }
}
