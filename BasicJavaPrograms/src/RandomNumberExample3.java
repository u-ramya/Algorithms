/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
import java.util.Random;
public class RandomNumberExample3 {
    public static void main(String[] args){
        // creating object of Random Class
        Random random = new Random();
        //Generates random integers 0 to 49
        
        int x = random.nextInt(50);
        //Generates random integers 0 tp 999
        int y = random.nextInt(1000);
        //Print random integers
        
        System.out.println("Randomly Generated Integers Values");
        System.out.println(x);
        System.out.println(y);
        
        //Generates random double values
        
        System.out.println("Randomly generated double values: ");
        double a = random.nextDouble();
        double b = random.nextDouble();
        System.out.println(a);
        System.out.println(b);
        
        //Generates random float values
        
        System.out.println("Randomly generated float values: ");
        float f = random.nextFloat();
        float i = random.nextFloat();
        System.out.println(f);
        System.out.println(i);
        
        //Generates random float values
        
        System.out.println("Randomly generated boolean values: ");
        boolean m = random.nextBoolean();
        boolean n = random.nextBoolean();
        System.out.println(m);
        System.out.println(n);
        
        //Generates random float values
        
        System.out.println("Randomly generated long values: ");
        long p = random.nextLong();
        long q = random.nextLong();
        System.out.println(p);
        System.out.println(q);
    }
}
