
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */

public class MaximumSumSubarray {
   //displaying the array
     static void display(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        } 
        System.out.println();
    }

     //generating a random array 
    static int[] randomArray(int n){
       int arr[] = new int[n];
       //Generating array with random 
       for(int i = 0; i < n; i++){
           arr[i] = (int)(Math.random() * (50 - (-50) + 1) + (-50));;
       }
       return arr;
    }
    
    //Main method
    public static void main(String[] args){
        MaxSubArray mx = new MaxSubArray(); 
        BruteForce bf = new BruteForce();
        int n = 15;
        int array_number = 1;
        
        while(n <= 50){  
        //Printing array separation
        for(int j = 0; j < 85; j++){
        System.out.print("-");
        }
        System.out.println();
        // a random array
        int[] A1 = randomArray(n);
        System.out.println("Original Array: "+array_number+" with size: "+n);
        display(A1);
        
        //Calling Maximum Sum Subarray Algorithm using Divide and Conquer
        int[] maxSum = mx.findMaxSubarray(A1,0,A1.length-1);
        System.out.println("Maximum Sum Subarray: ");
        for(int i = maxSum[0]; i <= maxSum[1]; i++){
            System.out.print(A1[i] + " ");
        }
        System.out.println();
        
        //Beginning and ending interval of subarray
        System.out.println("\nInterval: " + maxSum[0] + " " + maxSum[1]);
        //Displaying maximum sum
        System.out.println("Maximum Sum: " + maxSum[2]);
        //Actual time complexity
        System.out.println("Actual Cost: " + maxSum[3]);
        //theoretical time complexity = nlgn
        int theoretical_cost = (n * ((int) (Math.log(n) / Math.log(2))));
        System.out.println("Theoretical cost: " + theoretical_cost);
        
        //Calling Brute Force Algorithm
        int[] maxBrute = bf.bruteForce(A1);
        System.out.println("\nBrute Force Algorithm - Maximum Sum Subarray: ");
        for(int i = maxBrute[0]; i <= maxBrute[1]; i++){
            System.out.print(A1[i] + " ");
        }
        System.out.println();
        
        System.out.println("\nInterval: " + maxBrute[0] + " " + maxBrute[1]);
        System.out.println("Maximum Sum: " + maxBrute[2]);
        System.out.println("Actual Cost: " + maxBrute[3]);
        
        int theoretical_brute_cost = (n * n);
        System.out.println("Theoretical cost: " + theoretical_brute_cost);
        
        n += 5;
        array_number++;
        }
    }
}

    

