package carta;

public abstract class Carta {
    private String nome;
    private boolean revelada;

    public abstract void realizarAcao();

    public void revelarCarta(){
        if(revelada){
            return;
        }

        revelada = true;
        System.out.println("Nome: " + nome);
    }

    public void exibirInformacoes(){
        System.out.println(String.format(
            """
            Nome: %s
            Revelada: %s
            """,
            nome, revelada
        ));
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public boolean isRevelada(){
        return revelada;
    }

    public void setRevelada(boolean revelada){
        this.revelada = revelada;
    }
}