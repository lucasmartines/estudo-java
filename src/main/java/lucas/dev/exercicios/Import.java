/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lucas.dev.exercicios;

import java.util.Date;
 
/**
 *
 * @author Lucas
 */
public class Import {
    
    public static void main(String[] args) 
    {
        Date data = new Date();
        var myTime = data.getTime();
        
        
        System.out.println(myTime);
    }
}
