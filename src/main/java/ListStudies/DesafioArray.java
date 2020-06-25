/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListStudies;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class DesafioArray {
    public static void main(String[] args) {
        /*some dependencies*/
            Scanner scan = new Scanner(System.in);
        
        int qtdNotasParaAvaliar = 0;
        double media = 0;
        
        System.out.printf("Quantas Notas você quer avaliar \n");
        qtdNotasParaAvaliar = Integer.parseInt( scan.nextLine() );
        
        /*the house of our 'notas'*/
            double [] notas = new double[qtdNotasParaAvaliar];
        
        /*get all the 'notas'*/
        for( int i = 0; i < qtdNotasParaAvaliar ; i ++ ){
            System.out.printf("Informe a nota [%d] \n" , i + 1);

            notas[i] = 
                Double.parseDouble( scan.nextLine().replace(",", ".") );
        }
        
        /* do soma */
        double somaNotas = 0;
        for( double nota: notas ){
            somaNotas += nota;
        }
        media = somaNotas / qtdNotasParaAvaliar;
        System.out.printf("A média: %.2f",media);
        
    }
}
