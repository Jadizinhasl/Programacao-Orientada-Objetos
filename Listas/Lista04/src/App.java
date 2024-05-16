public class App {
    public static void main(String[] args) throws Exception {
        Adotante adotante = new Adotante();
        adotante.nome = "Felipe Lima";
        adotante.idade = 19;
        adotante.genero = "Masculino";

        Adotado adotado = new Adotado();
        adotado.raca = "gato";
        adotado.nome = "Rodolfo";
        adotado.peso = 3;
        adotado.idade = 4;
        adotado.adotante = "Felipe Lima";

        Conversa conversa = new Conversa();
        conversa.adotante = "Felipe Lima";
        conversa.duracaoEmMinutos = 13;
        conversa.descricao = "a melhor coisa que já fiz, em toda minha vida";
        conversa.adotado = "Rodolfo";

        System.out.println("\nNO LOCAL DE ADOÇÃO:");
        adotante.chegada();
        adotante.assinarInformacoes();
        adotado.comecarAdotar();
        adotado.informacoesEscolhido();

        System.out.println("CHEGANDO EM CASA:");
        conversa.comecarConversa();
        conversa.falarTudo();
    }
}
