package Jogo.Interativo;

import Jogo.Movel.Heroi;

public class Bau implements Interativo{
    private String item;
    private boolean estahTrancado;
    private int raridade;

    @Override
    public void interagir(Heroi heroi){
        if(!estahTrancado){
            System.out.println("Encontrou o item " + item);
            heroi.getInventario().add(this.item);
        } else {
            System.out.println("Procure uma chave!");
        }
    }
}