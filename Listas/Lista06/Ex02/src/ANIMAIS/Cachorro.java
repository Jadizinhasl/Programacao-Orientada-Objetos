package ANIMAIS;

public class Cachorro implements Animal{
    private String nome;
    private String raca;

    public Cachorro(String nome, String raca){
        this.nome = nome;
        this.raca = raca;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }
    public String getRaca(){
        return raca;
    }

    @Override
    public void comer(){
        System.out.println("\nCachorrão comendo: *GULPP*");
    }

    @Override
    public void emitirSom(){
        System.out.println("Cachorrão latindo: *AUUU AUUUUZAO*");
    }
}
