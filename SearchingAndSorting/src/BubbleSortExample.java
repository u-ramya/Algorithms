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
public class BubbleSortExample {
    static void bubbleSort(int arr[]){
        int n = arr.length;
        int temp = 0;
        for(int i = 0; i < n; i++){
            for(int j = 1; j < (n-i); j++){
                if(arr[j-1] > arr [j]){
                    //Swap elements 
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        
        System.out.println("Enter " + n + " elements:");
        int arr[] = new int[n];
        
        for(int i = 0; i < n; i++) 
            arr[i] = sc.nextInt();
        
        //Bubble sort
        bubbleSort(arr);
        
        System.out.println("Array after bubble sort:");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
