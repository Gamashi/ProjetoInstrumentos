
public class SistemaTeste {

    public static void main(String[] args) {
        

        Produto produto = new Produto();
        produto.PreçoFinal();
        

        Produto produto1 = new Produto();
        produto1.PreçoFinal();

        Produto produto2 = new Produto();
        produto2.PreçoFinal();
        
        System.out.println();
        System.out.println("Total de Produtos Cadastratros: " + Produto.getTotal());

    }
    
}