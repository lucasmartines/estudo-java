/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lucas.dev.exercicios.controlStructures;

import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class IfElse {
    public static void main(String[] args) 
    {
        
        String valor = JOptionPane.showInputDialog("Informe um numero para saber se é par ou impar");
        
        int numero = Integer.parseInt(valor);
        if( numero % 2 == 0){
            JOptionPane.showMessageDialog(null, "É um numero par");
        }        
        else{
            JOptionPane.showMessageDialog(null, "É um numero impar");
        }
    }
}
