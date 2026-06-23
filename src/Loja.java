import Model.Produto;
public class Loja {
    public static void main(String[] args) {


        Produto produto1 = new Produto("Tênis Nike", 299.99, 20, "42");
        Produto produto2 = new Produto("Camisa do Brasil",750,15,"G");

        System.out.println("-".repeat(50));
        System.out.println("Estoque do Produto 1");
        produto1.mostrarEstoque();
        System.out.println("-".repeat(50));
        System.out.println("Estoque do Produto 2");
        produto2.mostrarEstoque();

        int retornoEstoque = produto1.adicionarAoEstoque(5);
        System.out.println("-".repeat(50));
        System.out.println("Retorno: " + retornoEstoque);
        System.out.println("-".repeat(50));
        System.out.println("Estoque do Produto 1 Atualizado!");
        produto1.mostrarEstoque();





    }
}
