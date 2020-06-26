/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.Heranca;

import OOP.Carro;

/**
 *
 * @author Lucas
 */
public class CarroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.printf("O carro está ligado: %b\n",carro.estaLigado());
        carro.ligar();
        System.out.printf("O carro está ligado: %b\n",carro.estaLigado());
        
        System.out.println("RPM :" + carro.motor.giros());
        
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        
        //carro.frear();
        
        System.out.println("RPM :" + carro.motor.giros());
        
        
        
    }
}
