package Ex02;

import java.util.*;

public class EhPar {

    public static void main(String[] args) {
        Scanner SCAN = new Scanner(System.in);

        System.out.print("Digite um número para descobrir se ele é par: ");
        int numero = Integer.parseInt(SCAN.nextLine());

        if(ehPar(numero)){
            System.out.println(
                """

                Esse número é par.
                """
            );
        } else{
            System.out.println(
                """
                    
                Esse número não é par.   
                """
            );
        }
    }

    public static boolean ehPar(int numero){
        if(numero % 2 == 0){
            return true;
        }
        return false;
    }
}
