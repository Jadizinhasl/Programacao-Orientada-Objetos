public class Garrafa<T extends Liquido> {
    //E generico
    private T conteudo;

    public Garrafa(T conteudo) {
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return this.conteudo;
    }

    public void exibirInfo() {
        //Cast:
        //garantindo q conteudo é suco
        if (conteudo instanceof Suco) {
            Suco suco = (Suco) conteudo;
            System.out.println(suco.isEhNatural());
            System.out.println(suco.getSabor());
            return;
        }

        if (conteudo instanceof Refrigerante) {
            System.out.println(((Refrigerante) conteudo).getSabor());
            System.out.println(((Refrigerante) conteudo).EstaComGas());
        }
    }
}