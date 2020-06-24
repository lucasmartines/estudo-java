/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lucas.dev.exercicios;

/**
 *
 * @author Lucas
 */
public class PrimitivoVsObjeto {
    public static void main(String[] args) {
        
        String s = "texto";
        s.toUpperCase();
        s = String.format("I have %d years old" , 14);
        
        System.out.println(s);
    }
}
