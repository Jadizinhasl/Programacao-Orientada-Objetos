package Locadora;

import java.util.List;

public class Filme implements AudioVisual{
    private String titulo;
    private String diretor;
    private List<String> atores;

    public Filme(String titulo, String diretor, List<String> atores){
        this.titulo = titulo;
        this.diretor = diretor;
        this.atores = atores;
    }

    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getDiretor(){
        return this.diretor;
    }
    public void setDiretor(String diretor){
        this.diretor = diretor;
    }

    public List<String> getAtores(){
        return this.atores;
    }
    public void setAtores(List<String> atores){
        this.atores = atores;
    }

    @Override
    public void exibirInfo(){
        System.out.println("\nTitulo do filme: " + titulo);
        System.out.println("Filme dirigido por: " + diretor);
        System.out.println("Atores do filme: " + atores);
    }
}

