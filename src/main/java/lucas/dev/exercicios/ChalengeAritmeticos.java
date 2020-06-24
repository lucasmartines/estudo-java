/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lucas.dev.exercicios;

/**
 *
 * @author Lucas
 */
public class ChalengeAritmeticos {
    public static void main(String[] args) {
        
        double left =  Math.pow( ( 6 * ( 3 + 2) ) , 2 )  / ( 3.0 * 2.0 ) ;
        System.out.printf("\n left: %f",left);
        
        double right = Math.pow(  (( 1 - 5 ) * ( 2 - 7 ) ) /2 , 2) ;
        System.out.printf("\n right: %f",right);
        
        double center = Math.pow( left - right , 3 );
        double bottom = Math.pow( 10 , 3);
        System.out.printf("\n bottom: %f\n",bottom);

        double result = center / bottom;
        
        System.out.println( result );
    }
}
