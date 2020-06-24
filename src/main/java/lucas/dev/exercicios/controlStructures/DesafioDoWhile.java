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
public class DesafioDoWhile {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double nota = 0;
        
        double total = 0;
        int qtdNotasValidas = 0;
        
        do{
            System.out.printf("Escreva uma nota: \n");
            
            nota = Double.parseDouble( entrada.nextLine().replace(",", ".") );
            
            /*se a nota é valida*/
            if( (nota < 10 && nota > 0)  ) {
                total += nota;
                qtdNotasValidas++;
            }
            else{
                if( nota != -1){
                    System.out.printf("Nota invalida! ");    
                }
            }
        }while( nota != -1 );
        
        System.out.printf("A media é %.2f", total / qtdNotasValidas );
    }
}
