package OOP.PessoaTeste;

import classes.Desafio.Pessoa;


public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa( -100);
        
        p1.setIdade( 25 );
        System.out.printf("Idade %d",  p1.getIdade());
    }
    
}
