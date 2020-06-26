package OOP.Heranca;


public class Opala extends Carro{

    Opala(){
        super(160);
    }
    public void acelerar(){
        
        velocidade += 10;
    }
    public void frear(){
        
        if( velocidade > 0){
            velocidade -= 10;    
        }
    }
}
