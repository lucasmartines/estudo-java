/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.Desafio;

/**
 *
 * @author Lucas
 */
public class Jantar {
    public static void main(String[] args) {
        /*criar uma pessoa*/
        Pessoa lucas = new Pessoa("Lucas",75);
        
        /*instanciar duas comidas*/
        
        Comida feijao = new Comida("Feijao",0.15);
        Comida arroz = new Comida("Feijao",0.15);
        Comida salaminho = new Comida("Salaminho",0.05);
        
        System.out.printf("seu peso antes de comer: %.2f kg\n", lucas.peso );
        
        lucas.comer( feijao );
        lucas.comer( arroz );        
        lucas.comer( salaminho );

        
        System.out.printf("seu peso depois de comer: %.2f kg\n", lucas.peso );
    }
}
