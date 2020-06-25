/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListStudies;

/**
 *
 * @author Lucas
 */
public class ForEach {
    public static void main(String[] args) {
        double [ ] notas = { 6,8,9,4,7 };
        int [ ] gamas = { 9 , 8 , 7 , 6 , 5 };
        for ( double nota: notas){
            System.out.printf( "%f", nota );
        }
        for( int actual: gamas){
            System.out.println(actual);
        }
        
    }
}
