/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Lucas
 */
public class ConjuntoBaguncado2 {
    public static void main(String[] args) {
        Set items = new HashSet();
        items.add("Lucas");
        items.add("Vinicius");
        items.add("Thamires");
        
        items.remove("Lucas");
        //items.clear();
        System.out.printf("%s", items);
        
    }
}
