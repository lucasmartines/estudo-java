package lucas.dev.root;

import lucas.dev.exercicios.Exercicio;
import lucas.dev.math.FinancialMath;
import lucas.dev.math.Temperatura;

// the main i an a useful comment
public class Main {
    
    public static void main( String [] args ){
        
        Exercicio ex = new Exercicio();
        
        /* send to user what is this class hah???????*/
            System.out.println(ex.getClass());
        
        /* lets print some stuff*/
            ex.ShowMessage("i love to code, but it is a chalenge");
            System.out.println("have you soul, have you mind, be heapy");
        
        /*lets show some math dude, show me the math*/
            System.out.println( 
                FinancialMath.Profit(60, 75)
            );
            
        /*constants*/
            final double PI = 9.99;
            final String DB_NAME = "http:localhost/1999";
            
            System.out.println(DB_NAME);
            System.out.println(PI);
            System.out.println("CONVERT FARENHAIT TO CELCIUS");
            System.out.println( Temperatura.FarenhaitToCelcius( 45 ));
        /**/
    
//  
    }
}
