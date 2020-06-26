package OOP.Desafio;

import java.util.ArrayList;

public class Compra
{
    ArrayList<Item> items ;
    
    Compra(){
        items = new ArrayList<>();
    }
    
    void inserirItem( Item item )
    {
        item.compra = this;
        items.add( item );
    }
    
    void inserirProduto( Produto produto){
        Item item = new Item( produto );
        inserirItem( item );
    }
    double precoTotal(){
        double total = 0;
        
        for( Item i : items){
            total += i.precoTotal();
        }  
        
        return total;
    }
}
