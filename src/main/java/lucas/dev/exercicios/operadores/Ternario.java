/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lucas.dev.exercicios.operadores;

/**
 *
 * @author Lucas
 */
public class Ternario {
    public static void main(String[] args) {
        double media = 4;
        
        String resultado = media > 6.0 ? "aprovado" : media > 5 ? "recuperacao" : "reprovado";
        
        System.out.println(resultado);
        
    }
}
