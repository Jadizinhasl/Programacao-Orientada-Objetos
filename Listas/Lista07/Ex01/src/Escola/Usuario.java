package Escola;

public abstract class Usuario {
    private String nome;
    private String email;

    public Usuario(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public void exibirInfo(){
        System.out.println("\nUsúario: " + nome);
        System.out.println("E-mail: " + email);
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return email;
    }
    public void getEmail(String email){
        this.email = email;
    }
}
