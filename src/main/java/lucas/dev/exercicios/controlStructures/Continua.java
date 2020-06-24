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
public class Continua {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            
            /*show only impar*/
            if( i % 2 == 0) continue;
                
            System.out.printf("valor: %d \n",i);
            
        }
    }
}
