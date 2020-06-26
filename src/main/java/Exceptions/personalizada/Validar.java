package Exceptions.personalizada;


public class Validar {
    
    public static void validar(Aluno aluno)
    {
        if( aluno == null){
            throw new IllegalArgumentException("O aluno está nulo");
        }
        if( aluno.nome == null || aluno.nome.trim().isEmpty() ){
            throw new StringVaziaException( "nome ");
        }
        if( aluno.nota < 0 || aluno.nota > 10){
            throw new NumeroForaIntervalo("nota");
        }
    }
}
