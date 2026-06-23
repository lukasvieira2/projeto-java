package Model;

public class Produto {
    //Atributos
    private String nome;
    private double preco;
    private int quantidadeEstoque;
    private String tamanho;

public Produto(String nome, double preco, int quantidadeEstoque, String tamanho){
    this.nome = nome;
    this.preco = preco;
    this.quantidadeEstoque = quantidadeEstoque;
    this.tamanho = tamanho;
}
    //Métodos

    public void mostrarEstoque(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Quantidade em Estoque: "+ this.quantidadeEstoque);
        System.out.println("Tamnho: "+ this.tamanho);
    }

    public int adicionarAoEstoque(int quantidade){
        this.quantidadeEstoque += quantidade; //Atualiza valor de estoque
        return this.quantidadeEstoque;//Retorna o valor de estoque atualizado
    }

}
