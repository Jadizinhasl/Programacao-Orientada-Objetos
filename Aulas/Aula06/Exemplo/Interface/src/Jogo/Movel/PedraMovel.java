package Jogo.Movel;

public class PedraMovel implements Movel {
    private String localizacao;
    private int x;
    private int y;

    @Override
    public void mover(String direcao) {
        if (direcao.equals("para baixo")) {
            y--;
        }else {
            System.out.println("Impossível mover!!");
        }
    }
}
