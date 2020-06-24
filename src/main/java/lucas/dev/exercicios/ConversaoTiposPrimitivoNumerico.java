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
public class ConversaoTiposPrimitivoNumerico {
    public static void main(String[] args) {
        
        double a = 1;
        float f = (float) 1.5;
        int x = (int) 1.4f;
        int t = (int)466_899D;
        
        byte gama = (byte) 5;
        
        Double z = 11.4D;
        
        
        System.out.printf("Return Smallest %f " , Math.ceil(z)  );       
        
        System.out.println(a);        
        System.out.println(f);
        
        System.out.println(x);
        System.out.println(gama);

    }
}
