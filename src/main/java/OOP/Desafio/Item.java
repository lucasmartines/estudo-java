package OOP.Desafio;

import java.util.ArrayList;


public class Item {
    
    Compra compra;
    int quantidade;
    
    ArrayList<Produto> produtos ;
    
    
    Item( Produto produto ){
        if( produtos == null){
             produtos = new ArrayList<>();
        }
        
        produtos.add(produto);
    }
    
    void inserirProduto( Produto produto ){
        produtos.add(produto);
    }
    double precoTotal(){
        double total = 0;
        
        for( Produto prod : produtos){
            total += prod.preco;
        }
        
        return total;
    }
    
}
