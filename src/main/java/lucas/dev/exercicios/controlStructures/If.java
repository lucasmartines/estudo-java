/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lucas.dev.exercicios.controlStructures;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class If {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("informe a média: ");
        double nota = entrada.nextDouble();
        
        if( nota > 6){
            System.out.println("Você Passou");
        }
        else{
            System.out.println("Você reprovou, Faggit");
        }
        
        entrada.close();
    }
}
