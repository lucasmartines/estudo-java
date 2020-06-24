/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lucas.dev.exercicios;

import java.math.BigDecimal;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class ConvertStringToNumber {
    public static void main(String[] args) {
        
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro numero:");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo numero:");
        
        JOptionPane.showMessageDialog
        (
            null, 
            Float.parseFloat( valor1  ) + Float.parseFloat(valor2) 
        );
        
        // for people who need precision
        //BigDecimal.valueOf(  )
    }
}
