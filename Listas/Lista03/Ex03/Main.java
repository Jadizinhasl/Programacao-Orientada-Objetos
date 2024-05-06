package Ex03;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner SCAN = new Scanner(System.in);

        String palavra1 = SCAN.nextLine();
        String palavra2 = SCAN.nextLine();
        compararPalvras(palavra1, palavra2);
    }

    public static void compararPalvras(String p1, String p2) {
        if(p1.equals(p2)) {
            System.out.println("As palavras são idénticas");
        } else if(p1.equalsIgnoreCase(p2)) {
            System.out.println("As palavras são iguais, se ignorar minúsculo e maiscúlo");
        } else {
            System.out.println("As palavras são diferentes");
        }
    }
}
