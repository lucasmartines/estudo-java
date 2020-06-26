/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class Compra {
    String cliente ;
    ArrayList<Item> items = new ArrayList<>();
    
     void adicionarItem( Item item ){
        item.compra = this;
        items.add( item );
    }
     
    void adicionarItem( String nome , int quantidade , double preco){
        this.adicionarItem( new Item( nome, quantidade,preco));
    }
   
    

    double getValorTotal(){
        double total = 0;
        for( Item item : items){
            total += item.preco;
        }
        
        return total;
    }
}
