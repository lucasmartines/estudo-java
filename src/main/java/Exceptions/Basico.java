package Exceptions;

class Aluno{
    public String nome;
}

public class Basico {
    
    public static void main(String[] args) {
        
        Aluno a = null;
        
        try{
            mostrarAluno(a);    
        }
        catch(Exception e){
            System.out.println( "Ocorreu um erro ao imprimir o nome do usuario");
            System.out.println( e.fillInStackTrace());
        }
        try {
            System.out.println(7/0);
        } catch (Exception e) {
            System.out.println( "Erro ao realizar a divisão");

        }
        
        
        
    }
    
    public static void mostrarAluno(Aluno a){
        System.out.println("Aluno"+ a.nome);
    }
}
