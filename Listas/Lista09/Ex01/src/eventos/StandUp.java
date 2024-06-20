package eventos;

public class StandUp extends Evento{
    private String comediante;

    public StandUp(String nome, String data, String local, String comediante){
        super(nome, local, data);
        this.comediante = comediante;
    }

    public void setComediante(String comediante){
        this.comediante = comediante;
    }
    public String getComediante(){
        return comediante;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("O " + comediante + " irá se apresentar agora!");
    }
    @Override
    public void comecarEvento() {
        System.out.println("\nO show de piadas inéditas vai começar");
    }

    public void comecarEvento(String piada) {
        System.out.println(piada);
    }
}
