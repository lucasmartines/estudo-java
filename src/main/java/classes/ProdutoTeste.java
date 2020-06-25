package classes;

public class ProdutoTeste {
    public static void main(String[] args) 
    {
    
        Produto.desconto = 0.50;
        
        Produto p1 = new Produto( "Notebook" , 1600 );
         
        Produto p2 = new Produto("Caneta Verde");
        p2.preco= 1.50;
        
        System.out.printf( "Valor descontado: %f\n",  p1.precoDoDesconto( ));        
        System.out.printf( "Valor descontado: %f\n",  p2.precoDoDesconto( ));

        System.out.println(p1.nome);
        System.out.println(p2.nome);
    }
}
