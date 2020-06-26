/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;
import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        
        Usuario lucas = new Usuario("Lucas");
        
        usuarios.add( lucas );
        usuarios.add( new Usuario("Vinicius"));
        usuarios.add( new Usuario("Thamires"));
        usuarios.add( new Usuario("Leia San"));
        
        System.out.printf("%s \n", usuarios.get(2) );
        
        for( Usuario u : usuarios){
            System.out.printf("%s\n", u  );
        }
        
        usuarios.remove( new Usuario("Leia San") );
        if( usuarios.contains( new Usuario("Vinicius"))){
            System.out.printf("Usuario encontrado\n");
        }
        
        System.out.printf("%s\n", usuarios);
    }
}
