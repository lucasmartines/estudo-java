package OOP;


public class Jogo {
    public static void main(String[] args) {
        Jogador monstro = new Jogador();
        monstro.x = 0;
        monstro.y = 0;
        
        Jogador heroi = new Heroi();
        monstro.x = 1;
        monstro.y = 0;
        
        
        System.out.printf("monstro tem vida %d\n", monstro.vida );
        System.out.printf("heroi vida %d\n", heroi.vida );
        
        monstro.atacar(heroi);
        heroi.atacar(monstro);
        
        System.out.printf("monstro tem vida %d\n", monstro.vida );
        System.out.printf("heroi vida %d\n", heroi.vida );
       
        
        
        
//        monstro.andar( Direcao.NORTE );
//        monstro.andar( Direcao.NORTE );
//        monstro.andar( Direcao.LESTE );
        

        System.out.printf("x %d y %d", monstro.x , monstro.y );
    }
}
