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
public class ValorNulo {
    public static void main(String[] args) {
        String s1 = "";
        System.out.printf( s1.concat("!!!!"));
        
        String s2 = null;
        s2 = "";
        System.out.printf( s2 .concat("!!!!"));
    }
}
