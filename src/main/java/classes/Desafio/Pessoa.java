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
    
    public Pessoa(){
        this("Sem Nome",0);
    }
    public Pessoa( int idade ){
        
        this.setIdade(idade);
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if( !nome.equalsIgnoreCase("")){
            this.nome = nome;    
        }
    }
    double peso;
    private int idade;
    
    
    public Pessoa(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        if( idade > 0){
            this.idade = idade;
        }
    }
    void comer(Comida comida){
        if( comida != null){
            peso += comida.peso;
        }
    }
    
}
