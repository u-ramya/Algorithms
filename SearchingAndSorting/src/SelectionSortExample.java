/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
public class SelectionSortExample {
    public static void selectionSort(int arr[]){
        int len = arr.length;
        
        for(int i = 0; i < len-1; i++){
            int index = i;
            for(int j = i+1; j < len; j++){
                if(arr[j] < arr [index]){
                    index = j; // searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }
        
        public static void main(String[] args){
            int arr[] = {5,23,64,85,78,8,38,56,90,61};
            System.out.println("Before sorting:");
            for(int i:arr){
                System.out.print(i+" ");
            }
            
            System.out.println();
            
            selectionSort(arr);
            
            System.out.println("After selection sort:");
            for(int i:arr){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    

