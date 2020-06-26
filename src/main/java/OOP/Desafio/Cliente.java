/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.Desafio;


import java.util.ArrayList;

public class Cliente {
    String nome;
    ArrayList<Compra> compra;
    
    Cliente(String nome){
        this.nome = nome;
        compra = new ArrayList<>();
        
    }
    double getTotalGasto(){
        double total = 0;
        
        for( Compra c : compra){
            total += c.precoTotal();
        }  
        
        return total;
    }
    
    void inserirCompra( Compra c ){
        
        compra.add( c );
    }
}
