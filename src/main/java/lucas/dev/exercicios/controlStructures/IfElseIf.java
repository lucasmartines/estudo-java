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
public class IfElseIf {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        
        double nota = Double.parseDouble( JOptionPane.showInputDialog("Digite a nota").replace(',','.') );
        
        if( nota > 10 || nota < 0){
            JOptionPane.showMessageDialog(null, "Ehhh, nota invalida");
            
        }else if( nota >= 8.1){
            JOptionPane.showMessageDialog(null, "Nota A");
            
        }else if( nota > 6.1){
            JOptionPane.showMessageDialog(null, "Nota B");

        }else if( nota > 4.1){
            JOptionPane.showMessageDialog(null, "Nota C");

        }else if( nota > 2.1){
            JOptionPane.showMessageDialog(null, "Nota D");

        }else if( nota > 1.1){
            JOptionPane.showMessageDialog(null, "Nota E");

        }else if( nota >= 0.1 ){
            JOptionPane.showMessageDialog(null, "Nota F");

        }else if( nota == 0 ){
            JOptionPane.showMessageDialog(null, "Nota \'Fenomenal..........\'");

        }
            
            
        
        
        entrada.close();
    }
}
