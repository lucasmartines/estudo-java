package OOP.Desafio;


public class DesafioOOp {
    public static void main(String[] args) {
        
        var lucas = new Cliente("Lucas");
        var maria = new Cliente("Maria"); 
        
        var produto1 = new Produto("Arroz",10);
        var produto2 = new Produto("Feijão",12);
        var produto3 = new Produto("carne moida acem",22);
        var produto4 = new Produto("Batata",5);
        
        lucas.inserirCompra( new Compra());
        lucas.compra.get(0).inserirProduto( produto1 );
        lucas.compra.get(0).inserirProduto( produto2 );
        
        lucas.compra.get(0).inserirItem( new Item( produto1 ) );
        lucas.compra.get(0).inserirItem( new Item( produto3 ) );

        lucas.compra.get(0).items.get(0).inserirProduto( produto2 );
        lucas.compra.get(0).items.get(0).inserirProduto( produto3 );
        lucas.compra.get(0).items.get(1).inserirProduto( produto3 );
        
        

        for( Item item : lucas.compra.get(0).items ){
            System.out.println( "Lista de Items: "+item.produtos );
        }
        
        System.out.printf( "gasto total: %f\n",lucas.getTotalGasto() );
        
    }
}
