package lucas.dev.exercicios;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas
 */
public class ConvertNumberToString {
    public static void main(String[] args) {
        Integer num1 = 10000;
        System.out.println( num1.toString().length() );
        int num2 = 1000;
        System.out.println( Integer.toString( num2 ).length());
        
        System.out.println( Integer.parseInt("49") );
        
        System.out.println( num1.byteValue() );
    }
   
}
