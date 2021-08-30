/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
 //Brute force algorithm to find the maximum sum subarray
public class BruteForce {
    static int[] bruteForce(int[] A){
        int maximum = 0;
        int max_left = 0;
        int max_right = 0;
        int cost = 0;
        for(int i=0; i < A.length; i++){
            cost++;
            int current = 0;
            for(int j=i; j < A.length; j++){
                cost++;
                current = current+A[j];
                if(current>maximum){
                    maximum = current;
                    max_left = i;
                    max_right = j;  
                }
            }
        }
        int[] result = new int[4];
        result[0] = max_left;
        result[1] = max_right;
        result[2] = maximum;
        result[3] = cost;
        return result;
    }
}
