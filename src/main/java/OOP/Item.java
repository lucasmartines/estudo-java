/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 *
 * @author Lucas
 */
public class Item {
    String nome;
    int quantidade;
    double preco;
    Compra compra;
    Item( String nome , int qtd , double preco){
        this.nome = nome;
        quantidade = qtd;
        this.preco = preco;
    }
}
