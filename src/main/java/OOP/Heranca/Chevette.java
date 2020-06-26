package OOP.Heranca;

import Interfaces.Esportivo;


public class Chevette extends Carro implements Esportivo
{
    Chevette(){
        super(140);
    }
    @Override
    public void acelerar(){
        
        velocidade += 7;
    }
    
    @Override
    public void frear(){
        
        if( velocidade > 0){
            velocidade -= 4;    
        }
    }

    @Override
    public void ligarTurbo() {
        delta = 25;
    }

    @Override
    public void desligarTurbo() {
        delta = 5;
    }
}
