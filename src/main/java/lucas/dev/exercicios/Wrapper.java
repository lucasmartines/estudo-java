/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lucas.dev.exercicios;

/**
 *
 * @author Lucas
 */
public class Wrapper {
    public static void main(String[] args) {
        Byte b = 100;
        Short s = 1000;
        Integer i = 1000;
        Long l = 1000L;
        Boolean bo = Boolean.parseBoolean("true");
        Double d = 1588.499;
        Float f = 4198.00f;
        
        
        System.out.printf("this is converted to String => %s \n", l.toString() );
        
        System.out.printf("%d", Integer.parseInt( "46" ));
        System.out.printf("%.4f", Float.parseFloat("44.5596698"));
        
        System.out.printf("%b\n", Boolean.parseBoolean( "true" ));        
        System.out.printf("%b\n", Boolean.parseBoolean( "false    " ));

        System.out.println( Boolean.toString(bo).toUpperCase() );
        
        
    }
   
}
