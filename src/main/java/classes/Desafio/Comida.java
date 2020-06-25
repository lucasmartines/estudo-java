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
public class Comida {
    String nome;
    double peso;
    
    Comida()
    {
        this("Sem Nome",0);
    }
    Comida(String nome,double peso)
    {
        this.nome = nome;
        this.peso = peso;
    }
    
}
