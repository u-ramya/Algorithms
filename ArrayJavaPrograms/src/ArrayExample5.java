/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
public class ArrayExample5 {
    public static int removeDuplicateElements(int arr[],int n){
        if(n == 0 || n ==1){
            return n;
        }
        
        int temp[] = new int[n];
        int j = 0;
        
        for(int i = 0; i < n-1; i++){
            if(arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n-1];
        
        //Changinng the original array
        for(int i = 0; i < j; i++){
            arr[i] = temp[i];
        }
        return j;
    }
    
    public static void main(String[] args){
        int arr[] = {10,20,30,40,40,50,50,60,80};
        int length = arr.length;
        length = removeDuplicateElements(arr, length);
        //priting array elements
        for(int i = 0; i < length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
