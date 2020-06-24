
import java.util.Scanner;


 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas
 */
public class Console {
    public static void main(String[] args) {
        System.out.print("Bom");
        System.out.print(" Dia!!!");
        
        System.out.printf("\nmegasena: %d %d %d %d %d %d", 1 , 2 , 3 ,4 , 5 ,6);
        System.out.printf("\nMoney: {%.2f}",496.999);
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\nPor favor coloque o seu nome");
        String nome = entrada.nextLine();
        
        System.out.println("\nPor favor coloque a sua idade");
        int idade = entrada.nextInt();
        
        System.out.println("\n Você é de maior ou não? Responda true ou false");
        boolean ehGay = entrada.nextBoolean();
        
        System.out.printf("\nSeu nome: {%s} , idade {%d} , eh Maior: {%b}", nome , idade , ehGay );
        entrada.close();
    }
}
