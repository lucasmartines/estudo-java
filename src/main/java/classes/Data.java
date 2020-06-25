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
public class Data {
    int Dia;
    int Mes;
    int Ano;
    
    Data()
    {
        this(1,1,1970);    
    }
    Data( int Dia  , int Mes, int Ano){
        this.Dia = Dia;
        this.Mes = Mes;
        this.Ano = Ano;
    }
    
    String obterData(){
        return String.format("%d/%d/%d",Dia,Mes,Ano) ;
    }
}
