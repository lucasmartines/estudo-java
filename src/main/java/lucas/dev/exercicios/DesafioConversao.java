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
public class DesafioConversao {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        
        System.out.printf ("Seu primeiro salario\n");

        String salario1 = scan.nextLine ();
        
        System.out.printf ("Seu segundo salario\n");
        String salario2 = scan.nextLine();
        
        System.out.printf ("Seu terceiro salario\n");
        String salario3 = scan.nextLine();
        
        double media = ( 
            Double.parseDouble( salario1.replace(",", ".") )  + 
            Double.parseDouble( salario2.replace(",", ".") )  + 
            Double.parseDouble( salario3.replace(",", ".") ) 
        ) / 3.0 ;
        
        System.out.printf("A média do salario é %.2f",media);
        
        scan.close();
    }
}
