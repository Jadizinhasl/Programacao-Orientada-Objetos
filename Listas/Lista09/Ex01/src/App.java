import java.util.Arrays;

import eventos.Show;
import eventos.StandUp;

public class App {
    public static void main(String[] args) throws Exception {
        Show show = new Show("RODEIO ITAQUA", "Park Shopping Itaqua", "25/06/2024", Arrays.asList("Calypso", "Léo Santana"));
        StandUp standUp = new StandUp("Noite de piadinhas", "Centro cultural", "26/06/2024", "Marquinhos");

        show.exibirInformacoes();
        show.comecarEvento();
        show.comecarEvento(false);

        System.out.println();

        standUp.exibirInformacoes();
        standUp.comecarEvento();
        standUp.comecarEvento("\nPor que os químicos são ótimos em resolver problemas? Porque eles têm todas as soluções!");
    }
}
