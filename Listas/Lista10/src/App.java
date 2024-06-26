import Locadora.AudioVisual;
import Locadora.Filme;
import Locadora.Jogo;
import Locadora.Locadora;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Filme filme = new Filme("Divertida Mente", "Naosei", Arrays.asList("Dani Calabresa", "Tata Wernerck"));
        Filme filmebom = new Filme("Operação Big Hero", "Don Hall", Arrays.asList("Ryan Potter", "Daniel Henney"));

        Jogo joguinho = new Jogo("God of War Ragnarok", "PlayStation 5");
        Jogo jogaco = new Jogo("Red Dead Redemption", "Xbox One/Series S e X");

        Locadora<AudioVisual> locadora = new Locadora<>();
        locadora.adicionarItem(filme);
        locadora.adicionarItem(filmebom);
        locadora.adicionarItem(joguinho);
        locadora.adicionarItem(jogaco);

        System.out.println("Jogos e filmes disponíveis para alugar:");
        locadora.listarItens();

        System.out.println("\nBuscando item pelo título 'Divertida Mente':");
        AudioVisual item = locadora.buscarItem("Divertida Mente");
        if (item != null) {
            item.exibirInfo();
        } else {
            System.out.println("Item não encontrado. Disponíveis apenas da lista acima.");
        }
    }
}
