/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.HashSet;
import java.util.TreeSet;
 
/**
 *
 * @author Lucas
 */
public class ConjuntoComportado {
    public static void main(String[] args) {
        
        TreeSet<String> lista = new TreeSet<String>();
        
        
        lista.add("Comprar Carne");
        lista.add("Comprar Frango");
        lista.add("Comprar doce");        
        lista.add("Comprar doce");

        
        for( String item : lista){
            System.out.printf("%s\n",item);
        }
      

    }
}
