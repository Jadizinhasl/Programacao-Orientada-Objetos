import java.util.*;

public class Main {
  
  private static final Scanner SCAN = new Scanner(System.in);
  private static final int NUMEROS = 10;
  
  public static void main(String[] args) {
    int[] numero = new int[NUMEROS];
    preencherVetor(numero);
    verificarVetor(numero);
  }
  
  public static void preencherVetor(int[] numero){
    for(int i = 0; i < numero.length; i++){
      numero[i] = Integer.parseInt(SCAN.nextLine());
    }
  }
  
  public static void verificarVetor(int[] numero){
    int numeroPesquisado = Integer.parseInt(SCAN.nextLine());
    boolean temNumero = false;
    for(int i = 0; i < numero.length; i++){
      if(numero[i] == numeroPesquisado){
        temNumero = true;
      }
    }
    if(temNumero){
        System.out.println("ACHEI");
      }else {
        System.out.println("NAO ACHEI");
      }
  }
}