/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Lucas
 */
public class ValorVsReferencia {
    public static void main(String[] args) {
        double a=2;
        double b=a;
        a++;
        b--;
        System.out.printf("%f %f\n",a,b);
        
        Data d1 = new Data();
        Data d2 = d1;
        
        d2.Dia = 20;        
        d2.Mes = 12;

        System.out.printf("%s\n",d1.obterData());
        System.out.printf("%s\n",d2.obterData());
        
        voltarDataParaValorPadrao(d2);
        
        System.out.printf("%s\n",d1.obterData());
        System.out.printf("%s\n",d2.obterData());
            
        int x = 0;
        alterarPrimitivo(x);
        System.out.printf("\n\n %d",x);
    }   
    
    static void voltarDataParaValorPadrao(Data d){
        d.Dia = 1;
        d.Mes = 1;
        d.Ano = 1970;
        
    }
    static void alterarPrimitivo(int a){
        a++;
    }
}
