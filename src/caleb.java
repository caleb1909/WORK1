/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Caleb
 */
public class caleb {

    public static void main(String[] args) {
        int num1;
        int num2;
        try {
            // Try block to handle code that may cause exception
            num1 = 0;
            num2 = 62 / num1;
            System.out.println("Try block message");
        } catch (ArithmeticException e) {
            // This block is to catch divide-by-zero error
            System.out.println("Error: Don't divide a number by zero");
        }
        System.out.println("I'm out of try-catch block in Java.");
    }
    
}
