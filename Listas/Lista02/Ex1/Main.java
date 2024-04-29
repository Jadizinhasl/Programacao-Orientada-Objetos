package Ex1;

import java.util.*;

public class Main {
    private static final int TOTAL_PERGUNTAS = 4;
    private static final String[] RESPOSTAS = new String[TOTAL_PERGUNTAS];
    private static final String[] GABARITO = new String[TOTAL_PERGUNTAS];
    private static final Scanner SCAN = new Scanner(System.in);
    private static final int CERTAS = 0;

    public static void main(String[] args) {
        String nome = nomeParticipante();
        boasVindas(nome);
        primeiraPergunta(nome);
        segundaPergunta(nome);
        terceiraPergunta(nome);
        resultado(nome);
        agradecimento(nome);
    }

    public static String nomeParticipante() {
        System.out.println("""
                Será que você é um VERDADEIRO fã do anime Jujutsu Kaisen?
                Vamos descobrir com esse teste!

                Primeiro digite seu nome ou apelido que goste!!
                """);
        return formatarNome(SCAN.nextLine());
    }

    public static String formatarNome(String nome) {
        if (nome.isBlank()) {
            return "NPC";
        }

        nome = nome.trim();
        String[] nomeCompleto = nome.split(" ");
        String primeiroNome = nomeCompleto[0];
        String primeiraLetradoNome = String.valueOf(primeiroNome.charAt(0));
        String nomeSemLetraInicial = nome.substring(1);
        String nomeFormatado = primeiraLetradoNome.toUpperCase() + nomeSemLetraInicial.toLowerCase();
        return nomeFormatado;
    }

    public static void boasVindas(String nome) {
        System.out.println(String.format(
                """
                Olá, %s!
                LETS GOOO :)

                Algumas informações antes de iniciar:
                Se a letra digitada for diferente das alternativas a questão será considerada como errada.

                Clique em "Enter" para iniciar o QUIZ...
                """,
                nome
            ));
        SCAN.nextLine();
    }

    public static void primeiraPergunta(String nome) {
        String resposta = "";

        do {
            System.out.println(
                    """
                    1 - Quantos dedos de Sukuna a Escola Jujutsu já havia coletado antes que Yuji se tornasse o anfitrião?

                    A) - 5 dedos
                    B) - 6 dedos
                    C) - 4 dedos
                    D) - 7 dedos
                    """
                );
            resposta = SCAN.nextLine();

        } while (!respostaCerta(resposta));

        GABARITO[0] = "B";
        RESPOSTAS[0] = resposta;
    }

    public static void segundaPergunta(String nome) {
        String resposta = "";

        do {
            System.out.println(
                    """
                    2 - Quantos dedos do Sukuna foram espalhados pelo Japão?

                    A) - 20
                    B) - 15
                    C) - 32
                    D) - 12
                    """
                );
            resposta = SCAN.nextLine();

        } while (!respostaCerta(resposta));

        GABARITO[1] = "A";
        RESPOSTAS[1] = resposta;
    }

    public static void terceiraPergunta(String nome) {
        String resposta = "";

        do {
            System.out.println(
                    """
                    3 - Qual desses não é um dos domínios de Satoru Gojo?

                    A) - Seis Olhos
                    B) - Sem Limite
                    C) - Vazio Infinito
                    D) - Uzumaki Máximo
                    """
                );
            resposta = SCAN.nextLine();

        } while (!respostaCerta(resposta));

        GABARITO[2] = "D";
        RESPOSTAS[2] = resposta;
    }

    public static boolean respostaCerta(String resposta) {
        if (resposta.isBlank()) {
            System.out.println(
                    """
                    Sua resposta não pode ficar vazia.
                    Não desista por favor :(
                    Tente novamente!
                    """
                );
            return false;
        }
        return true;
    }

    public static void resultado(String nome) {
        System.out.println(String.format(
                """
                 %s, Vamos ver todo o seu potencial.
                """,
                nome
            ));

        if (RESPOSTAS[0].equalsIgnoreCase(GABARITO[0]) && RESPOSTAS[1].equalsIgnoreCase(GABARITO[1]) && RESPOSTAS[2].equalsIgnoreCase(GABARITO[2])){
            System.out.println(String.format(
                    """
                    Parabéns %s, você acertou todas!
                    Você é um verdadeiro otaku.
                    """, 
                    nome));
        }else if (RESPOSTAS[0].equalsIgnoreCase(GABARITO[0]) && RESPOSTAS[1].equalsIgnoreCase(GABARITO[1]) || RESPOSTAS[2].equalsIgnoreCase(GABARITO[2]) && RESPOSTAS[1].equalsIgnoreCase(GABARITO[1]) || RESPOSTAS[0].equalsIgnoreCase(GABARITO[0]) && RESPOSTAS[2].equalsIgnoreCase(GABARITO[2])) {
            System.out.println(String.format(
                    """
                    Parabéns %s, você acertou duas!
                    Você é até que animeiro(a) hein.
                    """, 
                    nome
                    ));
        }else if (RESPOSTAS[0].equalsIgnoreCase(GABARITO[0]) == false && RESPOSTAS[1].equalsIgnoreCase(GABARITO[1]) == false && RESPOSTAS[2].equalsIgnoreCase(GABARITO[2]) == false) {
            System.out.println(String.format(
                    """
                    %s, infelizmente você errou todas.
                    Você tem zero conhecimento do anime!
                    """, 
                    nome
                ));
        }else{
            System.out.println(String.format(
                    """
                    Parabéns %s, você acertou uma!
                    Você não sabe quase nada rs.
                    """, 
                    nome
                ));
        }
    }

    public static void agradecimento(String nome) {
        System.out.println(String.format(
                """
                Obrigada(o) %s por participar deste quiz, espero que tenha curtido bastante!
                """, 
                nome
            ));
    }
}