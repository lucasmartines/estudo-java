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
public class DataTeste {
    public static void main(String[] args) {
        
        
        Data d1 = new Data();
        d1.Ano = 2020;
        d1.Dia = 14;
        d1.Mes = 06;
        
        Data d2 = new Data();
        Data d3 = new Data( 22 , 11 , 1997 );
        
        System.out.println( d1.obterData() );
        System.out.println( d2.obterData() );
        System.out.println( d3.obterData() );
        
    }
    
}
