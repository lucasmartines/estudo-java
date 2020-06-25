/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Objects;

/**
 *
 * @author Lucas
 */
public class Usuario {
    String nome;
    String email;
    
    public boolean equals(Object objeto){
        if( objeto instanceof Usuario){
            
            Usuario outro = (Usuario) objeto;
            
            boolean nomeEhIgual = outro.nome.equals( this.nome );
            boolean emailEhIgual = outro.email.equals( this.email );
            
            return nomeEhIgual && emailEhIgual;
        }
        return false;
        
       
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.nome);
        hash = 23 * hash + Objects.hashCode(this.email);
        return hash;
    }
    
}
