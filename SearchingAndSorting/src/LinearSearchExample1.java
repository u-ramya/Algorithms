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
public class LinearSearchExample1 {
    public static int linearSearch(int arr[], int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        
        return -1;
    }
    
    public static void main(String[] args){
        int[] a1 = {10,20,30,40,50,60,70,80,90};
        int key = 50;
        System.out.println(key + " is found at index: " + linearSearch(a1,key));
        
        //User defined array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int array[] = new int[n] ;
        System.out.println("Enter those " + n + " elements: ");
        
        for(int i = 0; i < n; i++)
           array[i] = sc.nextInt(); 
        
        System.out.println("Enter the value to find: ");
        int search = sc.nextInt();
        
        int index = linearSearch(array,search);
        if(index != -1)
        System.out.println(search + " is found at index: " + index);
        else
            System.out.println("Not found");
    }
}
