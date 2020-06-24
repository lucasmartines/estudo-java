/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lucas.dev.exercicios;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class DesafioCalculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o primeiro numero:");
        double num1 = Double.parseDouble( scan.nextLine() );
        
        System.out.println("Entre com o operador");
        String operation = scan.nextLine();
        
        System.out.println("Entre com o segundo numero:");
        double num2 = Double.parseDouble( scan.nextLine() );
        
        String result = "";
        
       
        
        result = operation.equals("+") ?  
                String.format(" %.2f %s %.2f = %.2f", num1,operation , num2, num1 + num2) : "";
        
        result = operation.equals("-") ?  
                String.format(" %.2f %s %.2f = %.2f", num1,operation , num2, num1 - num2) : result;
        
        result = operation.equals("*") ?  
                String.format(" %.2f %s %.2f = %.2f", num1,operation , num2, num1 * num2) : result;
        
        result = operation.equals("/") ?  
                String.format(" %.2f %s %.2f = %.2f", num1,operation , num2, num1 / num2) : result;
        
        
        System.out.printf( result );
        scan.close();
    }
}
