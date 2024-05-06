package Ex02;

import java.util.*;

public class Main {
    private static final int NOTAS = 3;
    private static final int[] CRITICAS = new int[NOTAS];
    private static final Scanner SCAN = new Scanner(System.in);
    
    public static void main(String[] args) {
        receberNota();
        mediaNota();
    }

    public static void receberNota() {
        for(int i = 0; i < NOTAS; i++) {
            System.out.println(String.format("Digite a nota da %s° critíca", i+1));
            CRITICAS[i] = Integer.parseInt(SCAN.nextLine());
        }
    }

    public static void mediaNota() {
        double somatorio = 0;
        for(int i = 0; i < NOTAS; i++) {
            somatorio = somatorio + CRITICAS[i];
        }
        double media = somatorio / NOTAS;

        System.out.println(String.format("Média = %s", Math.round(media)));
    }
}