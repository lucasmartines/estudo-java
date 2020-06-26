package OOP.Polomorfismo;


public class Polimorfismo {
    public static void main(String[] args) {
        Pessoa convidado = new Pessoa(60);
        
        Comida ingrediente1 = new Arroz(0.250);
        Comida ingrediente2 = new Feijao(0.200);
        
        System.out.printf("Peso: %.2f",convidado.getPeso());
        
        convidado.Comer(ingrediente1);
        convidado.Comer(ingrediente2);
        
        System.out.printf("Peso: %.2f",convidado.getPeso());
        Comida ingrediente3 = new Sorvete(0.150);
        convidado.Comer(ingrediente3);
        
        System.out.printf("Peso: %.2f ",convidado.getPeso());
    }
}
