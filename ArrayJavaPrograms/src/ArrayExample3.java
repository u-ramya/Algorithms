/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
//program to rotate left
import java.util.Scanner;
public class ArrayExample3 {
    public static void main(String[] args){
        //Initiaze array
        int [] arr = {1,2,3,4,5};
        System.out.print("Enter the number of times an array need to be rotated: ");
        //n determiner the number of times an array should be rotated
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        //Displays the original array
        System.out.println("The original array is:");
        for(int i = 0; i < arr.length; i++){
        System.out.print(arr[i] + " ");
                }
        
        //Rotate the given array n times towards left
        
        for (int i = 0; i < n; i++){
            int j,first;
            first = arr[0]; 
            
//Stores the value of first element
            for( j = 0; j < arr.length - 1; j++){
                //Shift element of array by one
                arr[j] = arr[j+1];
            }
            arr[j] = first;
        }
        System.out.println();
       //Displays the resulting array after rotation
       System.out.println(" Array after rotation:");
       for(int i = 0; i < arr.length; i++){
           System.out.print(arr[i] + " ");
       }
       System.out.println();
    }
}
