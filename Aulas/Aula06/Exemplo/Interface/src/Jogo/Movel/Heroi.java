package Jogo.Movel;

import java.util.ArrayList;

public class Heroi {
    private int vidaAtual;
    private int vidaMaxima;
    private int forca;
    private int level;
    private String nome;
    private ArrayList<String> inventario = new ArrayList<>();

    public ArrayList<String> getInventario(){
        return this.inventario;
    }

    public String getNome(){
        return this.nome;
    }
}