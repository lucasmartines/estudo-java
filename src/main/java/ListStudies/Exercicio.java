/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListStudies;

import java.util.Arrays;

/**
 *
 * @author Lucas
 */

public class Exercicio {
    public static void main(String[] args) {
        double[] notas = new double[3];
        notas[0] = 9.9;
        notas[1] = 9.7;
        notas[2] = 8.8;
        
        System.out.println( Arrays.toString(notas) );
        
        var total = 0.0;
        for( int i = 0 ; i < notas.length ; i++){
            total += notas[i];
        }
        
        
        System.out.println(total / notas.length);
        
        double [] notasB = { 9 , 7 , 8 , 10 } ;
        total = 0.0;
        for( int i = 0; i < notasB.length ; i++ ){
            total+= notasB[i];
        }
        System.out.println( total/notasB.length );
    }
}
