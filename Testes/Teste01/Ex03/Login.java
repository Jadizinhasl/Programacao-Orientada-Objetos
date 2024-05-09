package Ex03;

import java.util.*;

public class Login {

    public static void main(String[] args) {
        Scanner SCAN = new Scanner(System.in);

        System.out.println("Digite seu nome de usúario:");
        String nome = SCAN.nextLine();

        System.out.println("Digite a senha do seu login:");
        String senha = SCAN.nextLine();

        verificacaoLogin(nome, senha);
    }

    public static void verificacaoLogin(String nome, String senha) {
        if (nome.equals("admin") && senha.equals("senha123")) {
            System.out.println("\nLogin realizado com sucesso!");
        } else {
            System.out.println("\nNome de usuário ou senha incorretos. Falha no login.");
        }
    }
}
