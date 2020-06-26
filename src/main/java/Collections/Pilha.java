/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author Lucas
 */
public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new  ArrayDeque<>();
        
        livros.add("O pequeno principe");
        livros.add("1984");
        livros.add("O sisney negro");
        
        //livros.poll();
//        livros.pop();
        System.out.printf("%s\n",livros);
        System.out.printf("%s\n",livros.peek());
        System.out.printf("%s\n",livros.element());
        
        
        
    }
}
