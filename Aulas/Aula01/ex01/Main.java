import java.util.Scanner;

public class Main {
  
  private static final Scanner SCAN = new Scanner(System.in);
    
  public static void main(String[] args) {
    int numero = Integer.parseInt(SCAN.nextLine());
    contarRegressivamente(numero);
  }
  
  private static void contarRegressivamente(int numero){
    while(numero >= 0){
      System.out.println(numero--);
    }
  }
}