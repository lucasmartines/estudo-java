/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lucas.dev.math;

/**
 *
 * @author Lucas
 */
public class Temperatura {
    
    public static double FarenhaitToCelcius( double farenhait ){
        final double numberAconst = 32;
        final double numberBconst = 5.0 / 9.0 ;
        
        System.out.println(" try : " + numberBconst);
        return ( farenhait - numberAconst ) * numberBconst;
    }
}
