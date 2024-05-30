import ANIMAIS.Gato;
import ANIMAIS.Cachorro;

public class App {
    public static void main(String[] args) throws Exception {
        Gato gatinho = new Gato("Frajola", "Seila rs");
        Cachorro atentada = new Cachorro("Katarina", "Viralatona");

        gatinho.comer();
        gatinho.emitirSom();

        atentada.comer();
        atentada.emitirSom();
    }
}
