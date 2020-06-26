/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Lucas
 */
public class Mapa {
    public static void main(String[] args) {
        Map < Integer,String > usuarios = new HashMap<>();
        usuarios.put( 1 , "Lucas");
        usuarios.put( 2 , "Vinicius");
        usuarios.put( 3 , "Thamires");
        usuarios.put( 4 , "Leia");
        usuarios.put( 54 , "Leia San");
        
        System.out.printf("%s\n", usuarios);
        System.out.printf("tamanho: %d\n", usuarios.size());
        System.out.printf("%b vasio: b\n", usuarios.isEmpty());
        
//        System.out.printf( "%d", usuarios.keySet());
        System.out.println(  usuarios.values());
        System.out.println(  usuarios.keySet());
        
        for( Map.Entry < Integer,String > registro : usuarios.entrySet()){
            
        }
        
    }
}
