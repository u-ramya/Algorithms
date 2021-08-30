/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
public class ArmstrongExample {
    public static void printArmstrong(int num){
        
        System.out.println("Is the number " + num + " armstrong number?");
        int temp = num;
        int sum = 0;
        
        while(num > 0){
        int i = num % 10;
        sum = sum + (i * i * i);
        num = num / 10;
    }
        if(temp == sum)
        System.out.println("Armstrong number");
        else
            System.out.println("Not an armstrong number");
    
    }
    
    public static void main(String[] args){
        printArmstrong(153);
    }
}
