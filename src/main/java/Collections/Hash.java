/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;
import java.util.HashSet;

/**
 *
 * @author Lucas
 */
public class Hash {
    public static void main(String[] args) {
        HashSet<Usuario> usuarios = new HashSet<>();
        
        usuarios.add( new Usuario("Lucas") );
        usuarios.add( new Usuario("Thamires") );
        usuarios.add( new Usuario("Vinicius") );
        
        boolean encontrado = usuarios.contains( new Usuario("Lucas"));
        
    }
}
