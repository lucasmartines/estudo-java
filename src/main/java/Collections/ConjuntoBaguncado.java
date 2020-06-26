/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Lucas
 */
class Pessoa{
    String nome;
    
    Pessoa( String nome ){
        this.nome = nome;
    }
    @Override
    public boolean equals( Object person ){
        
        Pessoa p = (Pessoa) person;
        
        if( this.nome == p.nome )
            return true;
        else
            return false;
    }
}
public class ConjuntoBaguncado {
    public static void main(String[] args) {
        Set conjunto = new HashSet();
        
        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("True Teste");
        conjunto.add(1);
        
        System.out.printf("qtd: %d\n", conjunto.size() );
        System.out.println( conjunto.remove( "True Teste" ) );
        System.out.printf("qtd: %d\n", conjunto.size() );
        
        System.out.println( conjunto.contains(true) );
        
        System.out.printf("As pessoas :\n");
        
        
        HashSet outroConjunto = new HashSet();
        var lucasOriginal = new Pessoa("Lucas");
        var lucasClone = new Pessoa("Lucas");

        outroConjunto.add( lucasOriginal );        

        outroConjunto.add( new Pessoa("Vinicius") );
        outroConjunto.add( new Pessoa("Thamires") );
        
        
        for( Object op : outroConjunto.toArray() ){
            Pessoa p = (Pessoa) op;
            System.out.println("Nome: "+ p.nome);
        }
        
        System.out.printf("quantas pessoas: %d\n" , outroConjunto.size() );
        
        
        
//        if ( outroConjunto.remove( lucasOriginal ) ){
//            System.out.printf("Removido um usuario\n");
//        }
        
        System.out.printf("quantas pessoas: %d" , outroConjunto.size() );

        System.out.printf("\nConter: %b" , outroConjunto.contains( lucasClone  ));
        
        outroConjunto.addAll( conjunto );
 
        
        System.out.printf("\n%s\n",outroConjunto);
        
        
        Set conjunto2 = new HashSet();
        
        conjunto2.add( 1 );
        conjunto2.add( 2 );
        conjunto2.add( 3 );
        
        conjunto2.addAll( conjunto );
        
        System.out.println( "O conjunto2:" + conjunto2.toString() );
        //conjunto.retainAll(conjunto2 );
        conjunto.add("Batata");
        conjunto.removeAll ( conjunto  );
        System.out.println( "O conjunto1 retains:" + conjunto );

    }
}
