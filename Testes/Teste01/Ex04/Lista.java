package Ex04;

import java.util.*;

public class Lista {
    private static final Scanner SCAN = new Scanner(System.in);
    private static final int CONVIDADOS = 10;
    private static final String[] lista = new String[CONVIDADOS];

    public static void main(String[] args) {
        System.out.println("Escreva o nome de todos os participantes:");
        preencherLista();

        System.out.println("\nDigite o nome para buscar na lista:");
        String requisitante = SCAN.nextLine();
        taNaLista(requisitante);
    }

    public static void preencherLista() {
        for(int i = 0; i < CONVIDADOS; i++) {
            lista[i] = SCAN.nextLine();
        }
    }

    public static void taNaLista(String requisitante) {
        boolean naLista = false;
        for(int i = 0; i < CONVIDADOS; i++) {
            if(requisitante.equals(lista[i])) {
                naLista = true;
            }
        }

        if(naLista) {
            System.out.println("\nRequisitante esta na lista. Seja bem vindo!");
            
        } else {
            System.out.println("\nRequisitante não esta na lista. Não pode entrar na festa");
        }
    }
}
