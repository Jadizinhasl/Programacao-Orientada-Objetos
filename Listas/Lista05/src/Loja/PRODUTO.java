package Loja;

public class PRODUTO {
    private String nome;
    private double preco;
    private String marca;

    public PRODUTO(String nome, double preco, String marca){
        this.nome = nome;
        this.preco = preco;
        this.marca = marca;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }
    public double getPreco(){
        return preco;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return marca;
    }

    public void exibirDadosProdutos(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Marca: " + marca);
    }
}
