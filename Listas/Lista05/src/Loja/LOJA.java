package Loja;

import java.util.ArrayList;

public class LOJA {
    private String nome;
    private int avaliacao;
    private ArrayList<PRODUTO> produtos = new ArrayList<>();

    public LOJA(String nome, int avaliacao){
        this.nome = nome;
        this.avaliacao = avaliacao;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setAvaliacao(int avaliacao){
        this.avaliacao = avaliacao;
    }
    public int getAvaliacao(){
        return avaliacao;
    }

    public void setProdutos(ArrayList<PRODUTO> produtos){
        this.produtos = produtos;
    }
    public ArrayList<PRODUTO> getProdutos(){
        return produtos;
    }

    public void adicionarProdutos(String nome, double preco, String marca){
        produtos.add(new PRODUTO(nome, preco, marca));
    }

    public void visualizacaoLista(){
        for(int i = 0; i < produtos.size(); i++){
            System.out.println(String.format(
            """
             %s° PRODUTO: %s
             Preço: R$ %s
             Marca: %s       
            """, (i+1), produtos.get(i).getNome(), produtos.get(i).getPreco(), produtos.get(i).getMarca()
            ));
        }
    }
}
