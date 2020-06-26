package OOP;


public class Jogador {
    int x;
    int y;
    int vida = 100;
    
    boolean atacar( Jogador oponente ){
     
        int deltaX = Math.abs( x - oponente.x );
        int deltaY = Math.abs( y - oponente.y );
        
        if( deltaX == 0 && deltaY == 1 ){
            oponente.vida -= 10;
            return true;
        }
        else if( deltaX == 1 && deltaY == 0){
            oponente.vida -= 10;
            return true;
        }
        else{
            return false;
        }
        
        
    }
    boolean andar(  Direcao dir ){
        
        switch( dir ){
            case NORTE:
                y--;
                break;
            case SUL:
                y++;
                break;
            case OESTE:
                y--;
                break;
            case LESTE:
                x++;
                break;
        }
        
        return true;
    };
}
