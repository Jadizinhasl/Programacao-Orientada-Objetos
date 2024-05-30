package Jogo.Interativo;

import java.util.*;

import Jogo.Movel.Heroi;

public class NPC implements Interativo{
    private ArrayList<String> falas;
    private String localizacao;

    @Override
    public void interagir(Heroi heroi){
        Random random = new Random();
        int indiceFalas = random.nextInt(falas.size());
        System.out.println("Ola " + heroi.getNome());
        System.out.println(falas.get(indiceFalas));
    }
}