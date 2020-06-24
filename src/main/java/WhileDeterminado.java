/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas
 */
public class WhileDeterminado {
    public static void main(String[] args) 
    {
        int contador = 1;
        while( contador <= 10 ){
            System.out.printf("Contador: %d\n",contador);
            contador += 2 ;
        }
    }
}
