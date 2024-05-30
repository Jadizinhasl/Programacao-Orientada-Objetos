package ANIMAIS;

public class Gato implements Animal{
    private String nome;
    private String raca;

    public Gato(String nome, String raca){
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
        System.out.println("\nO gatinho comendo: *gulp gulp*");
    }

    @Override
    public void emitirSom(){
        System.out.println("O gatinho querendo chamar atenção com seu miado: *miau miau *");
    }
}
