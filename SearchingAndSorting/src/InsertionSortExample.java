/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
public class InsertionSortExample {
    public static void insertionSort(int arr[]){
        int len = arr.length;
        for(int j = 1; j < len; j++){
            int key = arr[j];
            int i = j-1;
            
            while((i>-1) && (arr[i] > key)){
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1] = key;
        }
    }
    
    public static void reverseInsertionSort(int[] arr){
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
    
    public static void main(String a[]){    
        int[] arr1 = {9,14,3,2,43,11,58,22};    
        System.out.println("Before Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
        System.out.println();    
            
        insertionSort(arr1);//sorting array using insertion sort    
           
        System.out.println("After Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }   
        System.out.println();
        reverseInsertionSort(arr1);
        
        System.out.println("After reverse Insertion Sort");
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
    }    
}
