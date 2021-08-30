/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
public class PatternExample3 {
    public static void main(String[] args){
        
        for(int i = 1; i < 11; i++){
            for(int j = 1; j <= i; j++){
                
                System.out.print((i*j) + " ");
            }
            System.out.println();
        }
    }
}
