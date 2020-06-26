/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.HashSet;
import java.util.Objects;

/**
 *
 * @author Lucas
 */
class Person{
    String nome;
    Person(String nomeInicial){
        nome = nomeInicial;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
    
}
public class ConjuntoBaguncado3 {
    public static void main(String[] args) {
        HashSet<Person> listaPessoas = new HashSet<>();
        var lucas = new Person("Lucas");
        listaPessoas.add(lucas);
        listaPessoas.remove( new Person("Lucas"));
        
        System.out.printf("%s\n",listaPessoas);
    }
}
