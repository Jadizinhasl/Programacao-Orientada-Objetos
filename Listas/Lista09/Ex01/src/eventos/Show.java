package eventos;

import java.util.List;

public class Show extends Evento{
    private List<String> artistas;

    public Show(String nome, String data, String local, List<String> artistas){
        super(nome, local, data);
        this.artistas = artistas;
    }

    public void setArtista(List<String> artistas){
        this.artistas = artistas;
    }
    public List<String> getArtista(){
        return artistas;
    }

    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Aqui temos a lista de artistas que irão se apresentar:\n " + getArtista());

    }
    @Override
    public void comecarEvento() {
        System.out.println("\nSe preparem que está começando!");
    }

    public void comecarEvento(boolean comAplausos) {
        if (comAplausos == true) {
            System.out.println("Isso ae, aplausos pro nosso grande artista pessoal");
        } else {
            System.out.println("\nO show tá fraquinho fraquinho, zero aplausos");
        }
    }
}
