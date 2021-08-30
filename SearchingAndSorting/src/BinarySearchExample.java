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
import java.util.Scanner;
public class BinarySearchExample {
    public static void binarySearch(int arr[], int first, int last, int key){
        int mid = (first + last) / 2;
        
        while(first <= last){
            if(arr[mid] < key){
                first = mid+1;
            }
            
            else if(arr[mid] == key){
                System.out.println("Element is found at index: " + mid);
                break;
            }
            
            else{
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
               if( first > last){
                   System.out.println("Element is not found!");
               }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int m = sc.nextInt();
        int arr[] = new int[m];
        System.out.print("Enter the numbers: ");
        for(int i = 0; i < m; i++){
            arr[i] = sc.nextInt();
           
            System.out.print(" ");
        }
        System.out.println();
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
        System.out.println(arr[i]);
        }
        System.out.println(" Enter the key element to find:");
        int key = sc.nextInt();
        int last = arr.length-1;
        
        binarySearch(arr,0,last,key);
    }
}
