/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.Desafio;

/**
 *
 * @author Lucas
 */
public class Pessoa {
    String nome;
    double peso;
    
    Pessoa(){
        this("Sem Nome",0);
    }
    Pessoa(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }
    void comer(Comida comida){
        if( comida != null){
            peso += comida.peso;
        }
    }
    
}
