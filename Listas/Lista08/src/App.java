import loja.Produto;
import loja.exceptions.NomeInvalidoException;
import loja.exceptions.PrecoInvalidoException;

public class App {
    public static void main(String[] args) throws Exception {
        Produto prata = new Produto("Corrente", 120);
        System.out.println(String.format("""
                PRODUTO CRIADO!!

                Nome: %s
                Preço: R$ %s
                """, prata.getNome(), prata.getPreco()
            ));

        System.out.println("\nPRODUTO COM NOME ERRADO");
        try {
            Produto nomeInvalido = new Produto("pi", 4);
        } catch (NomeInvalidoException e) {
            System.out.println("Ocorreu uma inconsistência: " + e.getMessage());
        }

        System.out.println("\nPRODUTO COM PREÇO ERRADO");
        try {
            Produto precoInvalido = new Produto("paz", 0);
        } catch (PrecoInvalidoException e) {
            System.out.println("Ocorreu uma inconsistência: " + e.getMessage());
        }
    }
}
