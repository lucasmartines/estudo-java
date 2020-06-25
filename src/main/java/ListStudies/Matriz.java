/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListStudies;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Lucas
 */
public class Matriz {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Quantos aluno[a]s você quer avaliar?");
        int qtdAlunos = Integer.parseInt( scan.nextLine() );
        
        System.out.println("Quantas notas você quer?");
        int qtdNotas = Integer.parseInt( scan.nextLine() ); 
        

        double [][] notasDaTurma  = new double [qtdAlunos][qtdNotas];
        
        double total = 0;
        for( int a = 0 ; a < notasDaTurma.length ; a++){
            for( int n = 0 ; n < notasDaTurma[a].length ; n++){
                System.out.printf("Informe a nota %d do aluno %d: ",n + 1,a + 1);
                System.out.println();
                notasDaTurma[a][n] = Double.parseDouble( scan.nextLine() );
                total += notasDaTurma[a][n];
            }    
        }
        
        
        double media = total / ( qtdAlunos * qtdNotas );
        
        for( double []notas: notasDaTurma){
            System.out.println( Arrays.toString( notas ) ) ;
        }
        System.out.println("A média da turma: "+media);
        scan.close();
    }
}
