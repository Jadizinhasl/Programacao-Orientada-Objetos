package Locadora;

public class Jogo implements AudioVisual{
    private String titulo;
    private String plataforma;

    public Jogo(String titulo, String plataforma){
        this.titulo = titulo;
        this.plataforma = plataforma;
    }

    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getPlataforma(){
        return this.plataforma;
    }
    public void setPlataforma(String plataforma){
        this.plataforma = plataforma;
    }

    @Override
    public void exibirInfo(){
        System.out.println("\nTitulo do jogo: " + titulo);
        System.out.println("Plataforma: " + plataforma);
    }
}
