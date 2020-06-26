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
public class Carro {
//    Motor motor = new Motor(this);
    public final Motor motor;
    public Carro(){
        motor = new Motor(this);
    }
    public void acelerar()
    {
        if( motor.fatorInjecao < 2.5 ){
            motor.fatorInjecao += 0.4;    
        }
    }
    public void frear()
    {
        if(motor.fatorInjecao > 0.5 ){
            motor.fatorInjecao -= 0.4;
        }
        
    }
    public void ligar()
    {
        motor.ligado = true;
    }
    public void desligar()
    {
        motor.ligado = false;
    }
    public boolean estaLigado()
    {
        return motor.ligado;
    }
}
