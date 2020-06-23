/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lucas.dev.math;

/**
 * I an the javadock the power of documentation
 * @author Lucas
 */
public class FinancialMath {
    
    /**
     * It calculate the profit using two values, first you pass the first value or the
     * start value then you pass the end value or last, it will calculate the profit 
     * and will return a float multiplied by 100% 
     * or will return the in %
     * @param first
     * @param last
     * @return 
     */
    public static float Profit( float first , float last){
        
        return ( ( last / first ) - 1 ) * 100;
    }
}
