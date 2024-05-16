public class Adotado {
    String raca;
    String nome;
    int peso;
    int idade;
    String adotante;

    public void comecarAdotar() {
        System.out.println("\nO " + adotante +" começou a escolher o animal pra adotar");
    }

    public void escolhido() {
        System.out.println("Eu fiquei amei esse " + raca + ", irei levar comigo!!");
    }

    public void informacoesEscolhido() {
        System.out.println(String.format(
        """
                
        Muito bem!

        Esse %s se chama %s, faz pouco tempo que está com a gente. Pegamos numa situação muito triste,
        iremos ver como está a situção durante duas semanas, caso esteja de forma irregular, pegamos de volta!

        Aqui está as informações:
        Raça: %s
        Nome: %s
        Peso: %s kg
        Idade: %s meses

        Assine aqui embaixo: 
        Nome adotante: %s
        """, raca, nome, raca, nome, peso, idade, adotante
        ));
    }
}
