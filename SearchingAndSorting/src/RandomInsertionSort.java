/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
// Java Program For Insertion Sort Algorithm
public class RandomInsertionSort {
    // sorting an array in ascending order using Insertion Sort
    static int insertionSort(int[] arr){
        
        int len = arr.length; //length of the array
        
        //Set a counter to calculate the actual count
        int count = 1;
        
        for(int j = 1; j < len; j++){
            count++;
            int key = arr[j];
            count++;
            int i = j-1;
            count++;
            while( i > -1 && arr[i] >= key){
                count++;
                arr[i+1] = arr[i];
                count++;
                i--;
                count++;
            }
            count++;
            arr[i+1] = key;
            count++;
        }
        return count;
    }
    
    // sorting the array in descending order to determine the worst case
    static void reverseInsertionSort(int[] arr){
        int len = arr.length;
        for(int j = 1; j < len; j++){
            int key = arr[j];
            int i = j-1;
            
            while((i>-1) && (arr[i] < key)){
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1] = key;
        }
    }
    
    //displaying the elements of an array
    static void display(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    //generating a random array with random size 
    static int[] randomArray(){
        
        //Generates random array size
       int n = (int)(Math.random() * (100 - 10 + 1) + 10);
       int arr[] = new int[n];
       
       for(int i = 0; i < n; i++){
           arr[i] = (int)(Math.random() * (100 - 10 + 1) + 1);
       }
       
       return arr;
    }
    
    //Main method
    public static void main(String[] args){
            
      int num = 15; // Number of Arrays
      
System.out.println("Output For Sorting " + num + " Arrays Using Insertion Sort");
      
      for(int i = 0; i < num; i++){
        int[] A1 = randomArray();
        int n = A1.length;
        
        //Printing array separation
        for(int j = 0; j < 85; j++){
        System.out.print("-");
        }

        System.out.println("\nArray " + (i+1) + " with size:  "+ n);
        
        System.out.print("Unsorted Array " + (i+1) + ": ");
        display(A1);
        
        //Sorting the array using insertion sort
        int cost = insertionSort(A1);
        System.out.print("Sorted Array " + (i+1) + ":   ");
        display(A1);
        
        System.out.println("Actual Count: " + cost);
        
        //sorting array in descending order to for worst case
        reverseInsertionSort(A1);
        System.out.print("Reverse Sorted Array " + (i+1) + ": ");
        display(A1);
        
        //Again sorting 
        int worst_case = insertionSort(A1);
        
        System.out.println("Worst Case: " + worst_case);
        
        //Theoretical worst case count 
        //(c5+c6+c7)/2 )(n^2) + (c1+c2+c4 + (c5-c6-c7)/2 + c8)n - (c2+c4+c5+c8)
        // taking ci = 1               = 1.5 n^2 + 3.5n - 4
        double wc = (1.5 * n * n) + (3.5 * n) - 4;
        System.out.println("Theoretical Worst Case: " + (int)wc);
      }  
    }
}
