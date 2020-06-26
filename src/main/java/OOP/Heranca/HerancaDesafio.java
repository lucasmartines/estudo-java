package OOP.Heranca;


public class HerancaDesafio {
    
    public static void main(String[] args) {
        
        Carro monza = new Monza(190);
        Carro opala = new Opala();
        Carro chevette = new Chevette();
        
        monza.acelerar();
        opala.acelerar();
        chevette.acelerar();
        
        System.out.printf("monza %s km/h \n ", monza );
        System.out.printf("opala %s km/h \n", opala );
        System.out.printf("chevete %s km/h \n", chevette );
    }
}
