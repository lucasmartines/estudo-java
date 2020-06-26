/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 *
 * @author Lucas
 */
public class CursoTeste {
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno("Lucas");
        Aluno aluno2 = new Aluno("Vinicius");
        Aluno aluno3 = new Aluno("Thamires");
        
        Curso c1 = new Curso("Java");
        Curso c2 = new Curso("react");
        Curso c3 = new Curso("web 3.0");
        
        c1.adicionarAluno(aluno1);
        c1.adicionarAluno(aluno2);
        c1.adicionarAluno(aluno3);
        
        c2.adicionarAluno( aluno1 );
        c3.adicionarAluno( aluno3);
        
        aluno3.adicionarCurso( c2 );
        
        for( Aluno aluno: c1.alunos){
            System.out.printf("Estou matriculado no curso %s \n" ,  c1.nome );
            System.out.printf("E o meu nome é "+ aluno.nome +"\n" );
        }
        
        System.out.println( aluno1.cursos.get(0).alunos );
        
        Curso cursoEncontrado = aluno1.obterCursoPorNome("Java");
        if( cursoEncontrado != null){
            
            System.out.println("Curso encontrado: "+cursoEncontrado.nome);

            System.out.println(cursoEncontrado.alunos);
        }
        
    }
}
