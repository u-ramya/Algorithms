/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
public class PrimeExample {
    
    public static void prime(int n){
        int m = n / 2;
        int flag = 0;
        if(n == 0 || n == 1 ){
            System.out.println(n + " is not a prime number");
        } else {
            for (int i = 2 ; i <= m ; i++){
                if(n%i == 0){
                    System.out.println(n + " is not a prime number");
                    flag = 1;
                    break;
                }
                
            }
            if(flag==0) {System.out.println(n + " is a prime number");}
                
        }
    }
    public static void main(String[] args){
        prime(243);
    }
}
