package Jogo.Movel;

import Jogo.Interativo.Interativo;
import Jogo.Movel.Movel;

public class Vaso implements Movel, Interativo{
    private String localizacao;
    private int x;
    private int y;
    private String item;

    @Override
    public void mover(String direcao){
        if (direcao.equals("para baixo")) {
            y--;
        } else if (direcao.equals("para cima")){
            y++;
        } else if (direcao.equals("para direita")){
            x++;
        }else{
            x--;
        }
    }

    @Override
    public void interagir(Heroi heroi){
        System.out.println("Quebrou!!");
        heroi.getInventario().add(item);
    }
}
