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
public class CompraTeste {
    public static void main(String[] args) {
        Compra compra1 = new Compra();
        compra1.cliente = "Lucas Martines";
        compra1.adicionarItem( new Item("Notebook",1,1500));
        compra1.adicionarItem( new Item("Ipad",1,2500));
        compra1.adicionarItem( new Item("Caneta Ipad",1,500));
        
        System.out.printf("Valor Total: %.2f",compra1.getValorTotal());
        
    }
}
