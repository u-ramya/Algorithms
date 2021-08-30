/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
public class SpiralPatternExample {
    public static void main(String[] args){
        int arr[][] = new int[10][10];
        
        //initialize array with zero
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = 0;
            }
        }
        
        //print the array
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
               System.out.print(arr[i][j] + " "); 
            }
            System.out.println();
        }
        System.out.println();
        // Spiral pattern
        
        int num = 1;
        int length = arr.length;
        
        for(int i = 0; i < length; i++){
            for(int j = i; j < length - i; j++){
                arr[i][j] = num;
                num++;
                
            }//first loop ends
            
            for(int k = i + 1; k < length - i - 1; k++){
                arr[k][length - i - 1] = num;
                num++;
            }//second loop ends
            
           for(int l = length - i - 1; l >= i; l--){
                arr[length-i-1][l] = num;
                num++;
            }//third loop ends
            
            for(int m = length - i - 2; m >= i+1; m--){
                arr[m][i] = num;
                num++;
            }//fourth loop ends
        }
        
        //printing the result
      for(int p = 0; p < length; p++){
            for(int q = 0; q < length; q++){
               System.out.print(arr[p][q] + " "); 
            }
            System.out.println();
        }

    }
}
