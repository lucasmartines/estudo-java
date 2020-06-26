package Exceptions.personalizada;

import java.util.Scanner;


public class Finnaly {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        try{
             System.out.println("mostrar: ");
             System.out.println( 7 / entrada.nextInt() );
             
        }catch( OutOfMemoryError e){
            System.out.println(e.getMessage());
        }
        finally{
            entrada.close();
            System.out.println("FIm pelo finally");
        }
        
        System.out.printf("FIM");
        
        
    }
}
