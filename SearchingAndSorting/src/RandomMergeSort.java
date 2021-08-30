
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
//Java program for sorting arrays using Merge Sort
public class RandomMergeSort {
    //Merges two subarrays of arr[]
    // First subarray is arr[p ... q]
    // Second subarray is arr[q+1 ... r]
   
    static int merge(int arr[], int p, int q,int r){
        //Set a counter to calculate the actual count
       int count = 0;
       
        //Find sizes of two subarrays to be merged
        int n1 = q - p + 1;
        int n2 = r - q;
        
        //Create temp arrays 
        int L[] = new int[n1];
        int R[] = new int[n2];
       
        //copy data to L[] and R[] temporary arrays
        for (int i = 0; i < n1; i++){
            count++;
            L[i] = arr[p + i];
            count++;
        }
        for (int j = 0; j < n2; j++){
            count++;
            R[j] = arr[q + 1 + j];
            count++;
        }
        
        // Initial index of merged subarray
        int i = 0, j = 0;
        int k = p;
      
       while ( i < n1 && j < n2){
          count++;
            if (L[i] <= R [j]){
                count++;
                arr[k] = L[i];
                count++;
                i++;  
            }
            else{
                count++;
                arr[k] = R[j];
                count++;
                j++; 
            }
            k++;   
        }
        
        //Copy remaining elements if any
        while(i < n1){
            count++;
            arr[k] = L[i];
            count++;
            i++;
            k++;
        }
        while(j < n2){
            count++;
            arr[k] = R[j];
            count++;
            j++;
            k++;
        }
       return count;
    }
    
    //merge_sort()
    static int merge_sort(int arr[], int p, int r){
        int count = 0;
       
        if( p < r){
            //Find the middle point
            int q = (p+r) / 2;
            
            //Sort first and second halves
            merge_sort(arr,p,q);
            count++;
            merge_sort(arr,q+1,r);
            count++;
            
            //Merge the sorted arrays
           count = merge(arr,p,q,r);
            count++; 
        }
        return count;
    }
    
    //displaying the array
     static void display(int arr[]){
        System.out.print("[ ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
        System.out.println();
    }
     
    //generating a random array with random size 
    static int[] randomArray(){
       
        //Generates random array size 
       int n = (int)(Math.random() * (100 - 10 + 1) + 10);
       
       int arr[] = new int[n];
       
       //Generating randomized array
       for(int i = 0; i < n; i++){
           arr[i] = (int)(Math.random() * (100 - 10 + 1) + 1);;
       }
       return arr;
    }
    
    //Main method
    public static void main(String[] args){ 
      int num = 20; // Number of Arrays
      System.out.println("Sorting " + num + " Arrays Using Merge Sort");
       
      for(int i = 0; i < num; i++){
        int[] A1 = randomArray();
        int n = A1.length;
        
        //Printing array results separation
        for(int j = 0; j < 85; j++){
        System.out.print("-");
        }
        
        System.out.println("\nArray " + (i+1) + " with size:  "+ n);

        System.out.print("Unsorted Array " + (i+1) + ": ");
        display(A1);
        
        //Sorting array in ascending order using Merge Sort
        int cost = merge_sort(A1,0,n-1);
        System.out.print("Sorted Array " + (i+1) + ":   ");
        display(A1);
        
        //Display the actual count of the merge sort algorithm
        System.out.println("Actual Count:  " + cost);
        
        //Theoretical value of worst case = nlogn
        int worst_case = (n * ((int) (Math.log(n) / Math.log(2)))) + n;
        System.out.println("Worst Case:  " + worst_case);
        
      }  
    }
}
