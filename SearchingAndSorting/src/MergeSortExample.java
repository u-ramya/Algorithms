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
public class MergeSortExample {
    
    //Merges two subarrays of arr[]
        // First subarray is arr[p ... q]
        // Second subarray is arr[q+1 ... r]
    
    static void merge(int arr[], int p, int q,int r){
        
        //Find sizes of two subarrays to be merged
        int n1 = q - p + 1;
        int n2 = r - q;
        
        //Create temp arrays 
        int L[] = new int[n1];
        int R[] = new int[n2];
        
        //copy data to L[] and R[] temporary arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[p + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[q + 1 + j];
        
        // Initial index of merged subarray
        int i = 0, j = 0;
        int k = p;
        while ( i < n1 && j < n2){
            if (L[i] <= R [j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        
        //Copy remaining elements if any
        while(i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    
    //merge()
    
    static void merge_sort(int arr[], int p, int r){
        if( p < r){
            //Find the middle point
            int q = (p+r) / 2;
            
            //Sort first and second halves
            merge_sort(arr,p,q);
            merge_sort(arr,q+1,r);
            
            //Merger the sorted arrays
            merge(arr,p,q,r);
        }
    }
    
    //displaying the array
     static void printArray(int arr[]){
        
        int n = arr.length;
        
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        
        System.out.println(); 
    }
    
    //main function
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter the elements to be sorted: ");
        for(int i = 0; i < n; i++){
            //System.out.print(sc.nextInt() + " ");
            arr[i] = sc.nextInt();
        }
        
        System.out.println();
        
        //display the original array
        System.out.println("Original Array: ");
        printArray(arr);
        
        merge_sort(arr,0,arr.length-1);
        
        //Merge sort output
        System.out.println("\nSorted Array using merge sort: ");
        printArray(arr);
    }
}
