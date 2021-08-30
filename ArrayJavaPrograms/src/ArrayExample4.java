/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
import java.util.Arrays;
import java.util.Collections;
public class ArrayExample4 {
    public static void main(String[] args){
        //intialize an array
        
        int [] arr = new int[]{25,11,7,75,56};
        int largest_number = arr[0];
        int min = arr[0];
        
        //print original array
        System.out.println("Original array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //print largest number
        for (int i = 0; i < arr.length; i++){
            
            if(arr[i] > largest_number){
                largest_number = arr[i];
            
            }
        }
        System.out.println("Largest element is: "+largest_number);
         
        //smallest element
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Smallest element is: "+ min);
        
        // Print number of elements in an array
        System.out.println("The number of elements in the given array is: " + (arr.length));

        //Sum of all elements in the array
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        
        System.out.println("The sum of elements is: " + sum);
        
        
        
        //copy element the original array to another array
        int arr2[] = new int[arr.length];
        for(int i = 0; i <arr.length; i++){
            arr2[i] = arr[i];
        }
        
        // right rotate the elements by 2;
        int n = 2;
        
        for(int i = 0; i < n ; i++){
            int last = arr2[arr2.length-1];
            int j;
            for(j = arr2.length-1; j > 0; j--){
                arr2[j] = arr2[j-1];
            }
            arr2[j] = last;
        }
        
        //print the right rotation array
        System.out.println("Array after rotattion: ");
        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        
        //Sorting original array in ascending order
        int arr3[] = new int[arr.length];
         for(int i = 0; i <arr.length; i++){
            arr3[i] = arr[i];
        }
         int temp = 0;
         
         for(int i = 0; i < arr3.length; i++){
             for(int j = i+1; j < arr3.length; j++){
                 //if (arr3[i] > arr3[j]) {    //for ascending order
                     if(arr3[i] < arr3[j]) {  //for descending order
                     temp = arr3[i];
                     arr3[i] = arr3[j];
                     arr3[j] = temp;
                 }
             }
         }
         
         //Displaying elements in ascending order
         System.out.println("Elements after sorting: ");
         for(int i = 0; i <arr3.length; i++){
            System.out.print(arr3[i] + " ");
        }
         System.out.println();
         
         //Using Sort method ascending order
        Arrays.sort(arr);
         System.out.println("Elements in ascending order: ");
         for(int i = 0; i <arr.length; i++){
            System.out.print(arr[i] + " ");
        }
         System.out.println();
         
         Integer array[] = {23, -9, 78, 102, 4, 0, -1, 11, 6, 110, 205};
         Arrays.sort(array, Collections.reverseOrder());
         System.out.println("Elements in descending order: ");
         for(int i = 0; i <array.length; i++){
            System.out.print(array[i] + " ");
        }
         System.out.println();
    }
}
