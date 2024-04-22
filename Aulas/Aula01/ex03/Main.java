import java.util.*;

public class Main {
  
  private static final Scanner SCAN = new Scanner(System.in);
  private static final int QT_VAGOES = 12;
  private static final int MX_PESO = 50;
  
  public static void main(String[] args) {
    int[] trem = new int[QT_VAGOES];
    carregarVagao(trem);
    verificarPeso(trem);
  }
    
  public static void carregarVagao(int[] trem){
    for(int i = 0; i < trem.length; i++){
      trem[i] = Integer.parseInt(SCAN.nextLine());
    }
  }
    
  public static void verificarPeso(int[] trem){
    for(int i = 0; i < trem.length; i++){
      if(trem[i] > MX_PESO){
        System.out.println((i + 1) + "° vagao ultrapassou o limite de peso");
      }
    }
  }
}