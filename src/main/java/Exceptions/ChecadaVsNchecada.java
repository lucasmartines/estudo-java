package Exceptions;


public class ChecadaVsNchecada {
    public static void main(String[] args) {
        
        try{
            gerarErro1();
        }
        catch( Exception e){
            System.out.printf(e.getMessage());
        }
        
       
        try{
            gerarErro2();   
        }
        catch( Exception e ){
            
        }
        
        
    }
    static void gerarErro1(){
        throw new RuntimeException("ocorreu um erro 1");
    }
    static void gerarErro2() throws Exception{
        throw new Exception("ocorreu um erro 2");
    }
}
