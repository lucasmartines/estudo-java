package OOP.Heranca;


public class Carro {
    public double velocidade;
    public int delta = 5;
    final int VELOCIDADE_MAXIMA;
    
    public Carro( int vel_maxima){
     VELOCIDADE_MAXIMA = vel_maxima;   
    }
    
    public void acelerar(){
        if( velocidade + delta > VELOCIDADE_MAXIMA ){
            velocidade += VELOCIDADE_MAXIMA;
        }
        velocidade += delta;
    }
    public void frear(){
        
        if( velocidade > 0){
            velocidade -= 5;    
        }else{
            velocidade = 0;
        }
    }
    public String toString(){
        return "Velocidade: "+velocidade;
    }
}
