/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lucas.dev.exercicios.controlStructures;

/**
 *
 * @author Lucas
 */
public class DesafioFor {
    public static void main(String[] args) {

        
     

        System.out.printf("resposta do desafio\n");
        for( String v = "#"; !v.equals("######") ; v+="#"){
            System.out.println(v);
        }
        
        
        String valor = "#";
        String total = valor;
        /* meu jeito mas estava muito cansado*/
        System.out.printf("meu jeito\n");

        System.out.println(total);

        for( ; !total.equals("#####") ;){
            total += "#";
            System.out.println(total);
        }
        /// hahaha sou foda
        // não usar o valor numerico para controlar o laço
    }
}
