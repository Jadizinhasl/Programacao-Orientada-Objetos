import VEICULOS.Carro;
import VEICULOS.Bicicleta;

public class App {
    public static void main(String[] args) throws Exception {
        Carro veloz = new Carro(2.0, "gasolina");
        Bicicleta braba = new Bicicleta("Trek", 128.0);

        veloz.acelerar();
        veloz.frear();

        braba.acelerar();
        braba.frear();
    }
}
