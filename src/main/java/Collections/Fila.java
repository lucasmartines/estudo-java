/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;
import java.util.Queue;
import java.util.LinkedList;
/**
 *
 * @author Lucas
 */
public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<String>();
        fila.add("Igor");
        fila.add("Ata");
        fila.add("Rafaela");
        fila.offer("Rafael");
        
        fila.remove();
        System.out.printf("%s\n", fila.poll());
        System.out.printf(":%s",fila);
        System.out.printf("\n:%s\n",fila.peek());
        System.out.printf("\n:%s\n",fila.element());

    }
}
