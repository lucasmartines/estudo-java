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
public class Curso {
    final String nome;
    final ArrayList<Aluno> alunos = new ArrayList<>();
    
    Curso( String nome ){
        this.nome = nome;
    }
    void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
        aluno.cursos.add(this);
    }    
}
