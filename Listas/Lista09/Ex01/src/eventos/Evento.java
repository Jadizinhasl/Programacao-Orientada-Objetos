package eventos;

public abstract class Evento {
    private String nome;
    private String local;
    private String data;

    public Evento(String nome, String local, String data){
        this.nome = nome;
        this.data = data;
        this.local = local;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setData(String data){
        this.data = data;
    }
    public String getData(){
        return data;
    }

    public void setLocal(String local){
        this.local = local;
    }
    public String getLocal(){
        return local;
    }

    public void exibirInformacoes(){
        System.out.println(String.format(
            """
                O EVENTO %s MAIS ESPERADO DO ANO ESTÁ DE VOLTA!

                DATA: %s
                LOCAL: %s
            """, getNome(), getData(), getLocal()));
    }

    public abstract void comecarEvento();
}
