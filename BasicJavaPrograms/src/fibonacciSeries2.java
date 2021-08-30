/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
public class fibonacciSeries2 {
    static int p1 = 0, p2 = 1, p3 = 0;
        
        public static void printFibonacci(int count){
            if(count>0){
                p3 = p1 + p2;
                p1 = p2;
                p2 = p3;
                System.out.print(" " + p3);
                printFibonacci(count-1);
            }
        }
        public static void main(String[] args){
        int count = 10;
        
        System.out.print(p1 + " " + p2);// printing 0 and 1
        printFibonacci(count-2); // because 2 numbers are already printed
     

    }
}

