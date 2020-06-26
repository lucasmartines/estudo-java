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
public class Motor {
    double fatorInjecao = 1;
    boolean ligado = false;
    final Carro carro;
    
    public Motor( Carro carro ){
        this.carro = carro;
    }
    
    public int giros(){
        
        if(!ligado){
            return 0;
        }    
        return (int) Math.round( fatorInjecao * 3000 );
    }
}
