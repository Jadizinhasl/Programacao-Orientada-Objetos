package Exercicio;

import java.util.List;

public class Caixa<T> {
    private List<T> conteudo;

    public Caixa(List<T> conteudo) {
        this.conteudo = conteudo;
    }

    public List<T> getConteudo() {
        return this.conteudo;
    }

    public void setConteudo(List<T> conteudo) {
        this.conteudo = conteudo;
    }
}