/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lucas.dev.exercicios.controlStructures;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class DesafioDiaSemana {
    public static void main(String[] args) {
        
        String diaSemana =  JOptionPane.showInputDialog(args);
        
        if( diaSemana.equalsIgnoreCase("segunda") ){
            JOptionPane.showConfirmDialog(null, 2 );
        }if( diaSemana.equalsIgnoreCase ( "terça" ) ){
            JOptionPane.showConfirmDialog(null, 3 );
        }if( diaSemana.equalsIgnoreCase( "quarta" )){
            JOptionPane.showConfirmDialog(null, 4 );
        }if( diaSemana.equalsIgnoreCase( "quinta" )){
            JOptionPane.showConfirmDialog(null, 5 );
        }if( diaSemana.equalsIgnoreCase("sexta")){
            JOptionPane.showConfirmDialog(null, 6 );
        }if( diaSemana.equalsIgnoreCase( "sabado" ) || diaSemana.equalsIgnoreCase( "sábado" ) ){
            JOptionPane.showConfirmDialog(null, 7 );
        }if( diaSemana.equalsIgnoreCase( "domingo" )){
            JOptionPane.showConfirmDialog(null, 1 );
        }
    }
}
