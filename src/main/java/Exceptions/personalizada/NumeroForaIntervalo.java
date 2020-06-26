package Exceptions.personalizada;


public class NumeroForaIntervalo extends RuntimeException {

    private String msg;
    public NumeroForaIntervalo(String msg){
        this.msg = msg;
    }
    public String getMessage(){
        return "O campo " + msg +" está fora do padrão correto que é entre 0 e 10";
    }
}
