/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
public class ObjectComparisonExample {
    public static void main(String[] args){
        
       Double x = new Double(123.45555);
        
        Long y = new Long(9887522);
        
        System.out.println("Objects are not equal, hence it returns " + x.equals(y));
        System.out.println("Objects are equal, hence it returns " + x.equals(x));

    }
    
}
