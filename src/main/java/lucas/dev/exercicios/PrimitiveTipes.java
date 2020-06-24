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
public class PrimitiveTipes {
    public static void main(String[] args) {
        byte anosDeEmpresa = 25;
        short numeroDeVoos = 32767;
        int id = 489998;
        long pontosAcumulados = 5_234_845_999L;
        float salario = 2500_000.99F;
        double vendasAcumuladas = 2_995_848_488.01;
        boolean isAnAdult = true;
        
        float number = 270_480_553.449F;
        
        String nome = "Lucas"
                .concat(" Martines")
                .concat(" Alcantarilla");
        
        nome = nome.replace('s', 'X');
        nome = nome.toUpperCase();
        nome = nome.concat("!!!!");
        System.out.println(nome);
                
    }
}
