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
public class WhileInderteminado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String valor = "";
        
        while( !valor.equalsIgnoreCase("sair") && !valor.equalsIgnoreCase("exit") ){
            System.out.println("Você diz: ");
            valor = entrada.nextLine();
        }
        entrada.close();
    }
}
