public class Conversa {
    String adotante;
    int duracaoEmMinutos;
    String descricao;
    String adotado;


    public void comecarConversa() {
        System.out.println(String.format("\n%s começou a conversar com sua mãe assim que chegou em casa", adotante));
    }

    public void mostrarAnimal() {
        System.out.println(String.format("%s então mostrou o %s a sua mãe!", adotante, adotado));
    }

    public void falarTudo() {
        System.out.println(String.format(
        """
        
        Eu acho que fiquei mais ou menos uns %s minutos lá, ai comecei a falar né:
              
        Falei que eu me chamava %s, minha idade e essas coisas, ai fui adotar o %s. Não sei nem explicar o que senti,
        mas foi %s.
        """, duracaoEmMinutos, adotante, adotado, descricao
        ));
    }
}
