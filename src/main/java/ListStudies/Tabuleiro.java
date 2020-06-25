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
public class Tabuleiro {
    public static void main(String[] args) {
        int [][] tabuleiro = new int[8][8];
        
        for( int l = 0 ; l < tabuleiro.length ; l++){
            for( int c = 0 ; c < tabuleiro[l].length ; c++){
                tabuleiro[l][c] = 1;
            }
        }
        tabuleiro[0][0] = 50;
        
        for( int [] linha: tabuleiro ){
            System.out.println( Arrays.toString( linha ) ) ;
        }
        
        int [][] teste = { {1,2,3} , {1,2,3} };
        
        for( int [] testeItem: teste){
            System.out.println( Arrays.toString(testeItem));
        }
    }
}
