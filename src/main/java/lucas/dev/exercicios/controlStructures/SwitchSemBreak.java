/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lucas.dev.exercicios.controlStructures;

/**
 *
 * @author Lucas
 */
public class SwitchSemBreak {
    public static void main(String[] args) {
        
        String faixa = "verde";
        
        switch( faixa.toLowerCase() ){
            
            case "branca":
                System.out.println("Sei o Bassai-Dai");
            case "marrom":
                System.out.println("Sei o Tekki Shodan");
            case "roxa":
                System.out.println("Sei o Heian Godan");
            case "verde":
                System.out.println("Sei o Heian Yodan");
            case "laranja":
                System.out.println("Sei o Heian Sandan");
            case "vermelha":
                System.out.println("Sei o Heian Nidan");
            case "amarela":
                System.out.println("Sei o Heian Shodan");
//                break;;;
//            default:
//                System.out.println("Não sei nada");
//                break;
        }
        String nivel = "bufado";
        System.out.println("/*********************************************************************/");
        switch(nivel){
            case "chad":
                System.out.println("Sabe toda a parafernalha + TI + infra + IDE e prefere  programar usando o bloco de notas");
            case "bufado":
                System.out.println("Sabe banco de dados");
            case "avançado":
                System.out.println("Sabe Treads e IO e Conexão ");
            case "intermediario":
                System.out.println("Sabe Orientação a Objetos");
            case "basico":
                System.out.println("Sabe o java puro");
                break;
            case "virgin":
                System.out.println("Acha que sabe programar mas não consegue fazer um for loop");
        }
    }
}
