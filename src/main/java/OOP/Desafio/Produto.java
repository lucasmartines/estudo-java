/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.Desafio;

/**
 *
 * @author Lucas
 */
public class Produto {
    double preco;
    String nome;
    Produto( String nome , double preco){
        this.nome = nome;
        this.preco = preco;
    }
    public String toString(){;;
        return " nome: "+nome + " , preço: "+preco+" ; ";
    }
}
