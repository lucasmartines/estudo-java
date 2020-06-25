/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Lucas
 */
public class AreaCirc {
    double raio;
    static final double PI = 3.14;
    
    AreaCirc(){}
    AreaCirc(double raioInicial){
        raio = raioInicial;
    }
    double area()
    {
        return PI * Math.pow( raio , 2 );
    }
    
   
}
