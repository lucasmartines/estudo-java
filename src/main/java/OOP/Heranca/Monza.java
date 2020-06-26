package OOP.Heranca;


public class Monza extends Carro
{
    Monza(){
        super(135);
    }
    Monza(int velMax){
        super(velMax);
    }
    public void acelerar(){
        
        velocidade += 12;
    }
    public void frear(){
        
        if( velocidade > 0){
            velocidade -= 4;    
        }
    }
}
