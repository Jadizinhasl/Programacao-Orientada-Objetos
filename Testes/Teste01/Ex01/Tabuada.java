package Ex01;

import java.util.*;

public class Tabuada {

    public static void main(String[] args) {
        Scanner SCAN = new Scanner(System.in);

        System.out.print("Digite o número da tabuada que deseja ver: ");
        int tabuada = Integer.parseInt(SCAN.nextLine());

        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format("%s x %s = %s", tabuada, i, (i * tabuada)));
        }
    }

}
