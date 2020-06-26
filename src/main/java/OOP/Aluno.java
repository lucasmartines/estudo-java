/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;
import java.util.ArrayList;
/**
 *
 * @author Lucas
 */
public class Aluno {
    final String nome;
    final ArrayList<Curso> cursos = new ArrayList<>();
    
    Aluno( String nome ){
        this.nome = nome;
    }
    void adicionarCurso(Curso curso){
        cursos.add(curso);
        curso.alunos.add(this);
    }
    public String toString(){
        return nome;
    }
    public Curso obterCursoPorNome(String nome){
        
        for( Curso curso : cursos){
            if( curso.nome.equalsIgnoreCase(nome) ){
                return curso;
            }
        }
        
        return null;
    }
    
}
