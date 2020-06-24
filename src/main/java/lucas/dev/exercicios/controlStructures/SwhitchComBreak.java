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
public class SwhitchComBreak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String conceito = "";
        System.out.printf("informe sua nota\n");

        int nota = scan.nextInt();
        
        switch(nota){
            case 10: case 9:
                conceito="A";
                break;
            case 8: case 7:
                conceito="B";
                break;
            case 6: case 5:
                conceito="C";
                break;
            case 4: case 3:
                conceito="D";
                break;
            case 2: case 1:
                conceito="E";
                break;
            case 0:
                conceito="F";
                break;
            default:
                conceito="Não informado";
                break;
        }
        
        System.out.printf("Sua nota é %s",conceito);
        
        scan.close();
    }
}
