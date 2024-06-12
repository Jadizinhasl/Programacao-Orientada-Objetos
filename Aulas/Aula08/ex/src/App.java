import java.util.Scanner;

import exceptions.IdadeInvalidaException;
import exceptions.NomeInvalidoException;

public class App {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            // Tratando a exceção:
            try {
                Pessoa usuario = new Pessoa(
                        scan.nextLine(),
                        Integer.parseInt(scan.nextLine()));

                System.out.println(usuario.getNome());
                System.out.println(usuario.getIdade());

                break;

            } catch (NomeInvalidoException | IdadeInvalidaException e) {
                System.out.println(e.getMessage()); // imprime a mensagem do erro na classe usuario.
            } catch (Exception e) {
                System.out.println("Ocorreu um erro, tente novamente!");
            }
        } while (true);

        System.out.println("FIM!");

    }

}