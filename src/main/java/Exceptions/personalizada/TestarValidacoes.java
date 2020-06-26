package Exceptions.personalizada;

import javax.swing.JOptionPane;


public class TestarValidacoes {
    
    public static void main(String[] args) {
        
        
        Aluno a = new Aluno();
        a.nome = "mario";
        a.nota = 5;
        
        try {
            Validar.validar(a);
            Validar.validar(null);
        } catch ( StringVaziaException e) {
            System.out.printf(e.getMessage());
        } catch( NumeroForaIntervalo e){
            System.out.printf(e.getMessage() );
        } catch( IllegalArgumentException e){
            JOptionPane.showConfirmDialog(null, e);
            
        }
        
    }
}
