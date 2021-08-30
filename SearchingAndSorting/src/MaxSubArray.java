/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
// Java code for maximum contiguous subarray algorithm
public class MaxSubArray {
    public static int cost = 0;
    // finding maximum sum of subarray crossing the midpoint
    static int[] findMaxCrossingSubarray(int[] A, int low, int mid, int high)
    {
        cost++;
        //Initial value of left sum is -infinite
        int left_sum = Integer.MIN_VALUE;
        int sum = 0;
        int max_left = 0,max_right = 0;
        // finding maximum sum of left subarray including middle element also
        for(int i = mid; i >= low; i--){
            sum = sum + A[i];
            if(sum > left_sum){
                left_sum = sum;
                max_left = i; 
            }
        }
        //Initial value of right sum is -infinite
        int right_sum = Integer.MIN_VALUE;
        sum = 0;
       // finding maximum sum of right subarray including middle element also
        for(int j = mid+1; j <= high; j++){
            sum = sum + A[j];
            if(sum > right_sum){
                right_sum = sum;
                max_right = j; 
            }
        }
        int[] result = new int[4];
        result[0] = max_left;
        result[1] = max_right;
        result[2] = left_sum + right_sum;
        result[3] = cost;
        
        return result;
    }
    
    //finding maximum subarray sum
    static int[] findMaxSubarray(int[] A, int low, int high)
    {
        int[] result = new int[4];
        int[] left_result = new int[4];
        int[] right_result = new int[4];
        int[] cross_result = new int[4];
        int mid = 0;
        // when there is only one element
        if (high == low){
            result[0] = low;
            result[1] = high;
            result[2] = A[low];
            result[3] = cost;
            return result;
        }
        // when n > 1
        else{
            //Middle element of the array
            mid = (low + high) / 2;
            cost++;
            //Maximum sum in left subarray
            left_result = findMaxSubarray(A,low,mid);
            //Maximum sum in right subarray
            right_result = findMaxSubarray(A,mid+1,high);
            //Maximum sum in subaaray crossing the midpoint
            cross_result = findMaxCrossingSubarray(A,low,mid,high);
            //Return maximum of three results
            if( left_result[2] >= right_result[2] 
                && left_result[2] >= cross_result[2])
                return left_result;
                
            else if( right_result[2] >= left_result[2] 
                && right_result[2] >= cross_result[2])
                return right_result;
                
            else return cross_result;
            
        }
    }
}
    
   
    
    