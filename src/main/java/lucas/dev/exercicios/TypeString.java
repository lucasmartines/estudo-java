/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lucas.dev.exercicios;

/**
 *
 * @author Lucas
 */
public class TypeString {
    public static void main(String[] args) {
        String myString = "Olá pessoal";
        
        System.out.println( myString.charAt(2));
        System.out.println( myString.length());
        System.out.println( myString.toLowerCase());
        System.out.println( myString.contains("pefssoal"));        
        System.out.println( myString.equals("Olá pessoal"));        
        
        var name = "Lucas";
        var lastName = "Martines";
        var age = 22;
        var salary = 4500.50F;
        System.out.printf("O(a) %s %s tem %d anos(s) e ganha $%.2f", name , lastName, age, salary);
        
        System.out.printf("\nO problema é que isso{%s} e isso{%d} não é pratico", "bogo" , 15 );
        
        System.out.printf("\nIt is funn to use split {%s}", "Lucas Martines".split(" ")[0] , "Lucas Martines".split(" ")[1] );
        
        System.out.printf("\n it is time to use strip {%s}", "       Lucas Martin        ".strip());
        
        System.out.printf("\n it will be easy to learn this language {%s}", "  Lucas MMA      ".trim());
    }
}
