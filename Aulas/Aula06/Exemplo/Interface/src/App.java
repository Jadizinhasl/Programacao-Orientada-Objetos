import java.util.ArrayList;

import Jogo.Movel.Movel;
import Jogo.Movel.PedraMovel;
import Jogo.Movel.Vaso;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Movel> moveis = new ArrayList<>();

        moveis.add(new PedraMovel());
        moveis.add(new Vaso());

    }
}
