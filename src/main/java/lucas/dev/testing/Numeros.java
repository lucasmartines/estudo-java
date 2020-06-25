/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lucas.dev.testing;

/**
 *
 * @author Lucas
 */
public class Numeros 
{
    Boolean numeroPar(int n ){
        return n % 2 == 0;
    }
    int areaQuadrado( int lado ){
        return lado * lado;
    }
    Boolean numeroDivisivel( int dividendo , int divisor ){
        return dividendo % divisor == 0;
    }
}
