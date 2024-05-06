package Ex01;

import java.util.*;

public class Main {
    private static final int anoAtual = 2024;

    public static void main(String[] args) {
        Scanner SCAN = new Scanner(System.in);

        System.out.println("Digite o ano em que você nasceu:");
        int anoNascimento = Integer.parseInt(SCAN.nextLine());

        System.out.println(String.format("Até o final de 2024 você terá %s anos", idadeFinalDeAno(anoNascimento)));
    }

    public static int idadeFinalDeAno(int ano) {
        return anoAtual - ano;
    }
}