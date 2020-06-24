/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lucas.dev.exercicios.operadores;

/**
 *
 * @author Lucas
 */
public class LogicChalenge {
 
    public static void main(String[] args) {
        // trabalho a confirmar na terça v ou f
        // trabalho a confirmar na quinta v ou f
        
        // se for confirmado os dois trabalhos comprar tv 50
        // se for confirmado apenas um dos trabalhos tv 30
        
        // se eu comprar a tv de 50 ou de 30 tomar sorvete
        
        // sem nenhum trabalho então não comer sovete nem comprar tv
        
        boolean trabalho1 = false;
        boolean trabalho2 = false;
        
        boolean comprarTv50 = trabalho1 && trabalho2;
        boolean comprarTv32 = trabalho1 ^ trabalho2;
        boolean comprarSorvete = comprarTv50 || comprarTv32;
        
        System.out.println("Comprar tv de 50 polegadas? " + comprarTv50 );
        System.out.println("Comprar tv de 30 polegadas? " + comprarTv32 );
        System.out.println("Comprar Sorvete? " + comprarSorvete );
        System.out.println("Ficar Mais Saudável? " + !comprarSorvete );
        System.out.println("Ficar com fome? " + !comprarSorvete );

        
        
    }
}
