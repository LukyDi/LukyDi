/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package JavaPriklady4;

import java.util.Scanner;
/**
 *
 * @author Luky
 */
public class NovaKalkulacka {
   
    public static double sum_operation(double num1,double num2){
        return num1 + num2;
    }
    public static double sub_operation(double num1,double num2){
        return num1 - num2;
    }
    public static double division_operation(double num1,double num2){
        return num1 / num2;
    }
    public static double multiplication_operation(double num1,double num2){
        return num1 * num2;
    }
    public static double mod_operation(double num1,double num2){
        return num1 % num2;
    }
    
    public static double calculate(double num1, double num2, String operator) {
        double result = 0;
        
        switch (operator) {
            case "+":result = sum_operation(num1,num2);
            break;
            
            case "-":result = sub_operation(num1, num2);
            break;
            
            case "*":result = multiplication_operation(num1,num2);
            break;
            
            case "/":if (num2 != 0) {
                result = division_operation(num1,num2);
            } else {
                System.out.println("Division by zero");
            }
            break;
            
            case "%":if (num2 != 0) {
                result = mod_operation(num1, num2);
            } else {
                System.out.println("Division by zero");
            }
            break;
            default:System.out.println("Invalid operator.");
        }return result;
    }
    public static void main(String[] args) {
    
         Scanner con_in = new Scanner(System.in);
         double num1 = con_in.nextDouble();String operator = con_in.next();
         double num2 = con_in.nextDouble();
         System.out.printf("Result: %.2f %s %.2f = %.2f", num1,operator,num2,calculate(num1,num2,operator));
         con_in.close();
        
    }
}
