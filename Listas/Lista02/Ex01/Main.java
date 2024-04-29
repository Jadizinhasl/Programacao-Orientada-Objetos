import java.util.*;

public class Main {
    private static final int TOTAL_PERGUNTAS = 4;
    private static final String[] REPOSTAS = new String[TOTAL_PERGUNTAS];
    private static final String[] GABARITO = new String[TOTAL_PERGUNTAS];
    private static final Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args) {
        String nome = nomeParticipante();
        boasVindas(nome);
        primeiraPergunta(nome);
        segundaPergunta(nome);
        terceiraPergunta(nome);
        quartaPergunta(nome);
        resultado(nome);
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
        REPOSTAS[0] = resposta;
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
        REPOSTAS[1] = resposta;
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
        REPOSTAS[2] = resposta;
    }

    public static void quartaPergunta(String nome) {
        String resposta = "";

        do {
            System.out.println(
                    """
                    4 - Como Nobara conhece Yuuji Itadori e Megumi Fushiguro?

                    A) - No primeiro dia na escola
                    B) - Durante uma briga na escola
                    C) - Durante a primeira missão oficial como Xamã
                    """
                );
            resposta = SCAN.nextLine();

        } while (!respostaCerta(resposta));

        GABARITO[3] = "C";
        REPOSTAS[3] = resposta;
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

    public static void resultado(String nome){
        System.out.println(String.format(
            """
            %s, Vamos ver do que você foi capaz de fazer!!.
            """,
            nome
        ));

        for(int i = 0; i < TOTAL_PERGUNTAS; i++){
            System.out.println(String.format(
                "%s - %s",
                (i + 1),
                REPOSTAS[i].equalsIgnoreCase(GABARITO[i]) ? "ACERTOU"  :  "ERROU"
            ));  
        }
    }
}