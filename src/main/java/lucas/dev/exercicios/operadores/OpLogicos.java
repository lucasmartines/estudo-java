package lucas.dev.exercicios.operadores;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas
 */
public class OpLogicos {

    public static void main(String[] args) {
        
        boolean condicional1 = true;
        boolean condicional2 = 3 > 7; // false
        
        System.out.println( condicional1 && condicional2);
        System.out.println( condicional1 || condicional2);
        System.out.println( condicional1 ^ condicional2);
        System.out.println( !condicional1 );
        System.out.println( !condicional2 );
        
        System.out.println("Tabela verdade E");
        System.out.println( true && true);
        System.out.println( true && false);
        System.out.println( false && true );
        System.out.println( false && false);
        
        System.out.println("Tabela verdade OU");
        System.out.println( true || true);
        System.out.println( true || false);
        System.out.println( false || true );
        System.out.println( false || false);
        
        System.out.println("Tabela verdade OU Exclusivo xor ");
        System.out.println( true ^ true);
        System.out.println( true ^ false);
        System.out.println( false ^ true );
        System.out.println( false ^ false);

        
        System.out.println("Tabela verdade not");
        System.out.println( !true );
        System.out.println( !false );

        
    }
}
