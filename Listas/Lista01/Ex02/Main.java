import java.util.*;

public class Main {
  
  private static final Scanner SCAN = new Scanner(System.in);
  private static final int MATRIZ = 4;
  
  public static void main(String[] args) {
    boolean[][] matriz = new boolean[MATRIZ][MATRIZ];
    preencherMatriz(matriz);
    receberCoordenadas(matriz);
    imprimirMatriz(matriz);

  }
  
  public static void preencherMatriz(boolean[][] matriz){
    for(int i = 0; i < matriz.length; i++){
      for(int j = 0; j < matriz.length; j++){
        matriz[i][j] = false;
      }
    }
  }

  public static void receberCoordenadas(boolean[][] matriz){
    int numero1 = Integer.parseInt(SCAN.nextLine());
    int numero2 = Integer.parseInt(SCAN.nextLine());
    for(int i = 0; i < matriz.length; i++){
        for(int j = 0; j < matriz.length; j++){
            if(i == numero1 && j == numero2){
                matriz[i][j] = true;
            }
        }
    }
  }

  public static void imprimirMatriz(boolean[][] matriz){
    for(int i = 0; i < matriz.length; i++){
        for(int j = 0; j < matriz.length; j++){
            if(matriz[i][j] == true){
                System.out.print("|O");
            }else{
                System.out.print("|X");
            }
        }
        for(int j = 0; j < 1; j++){
            System.out.print("|");
        }
        System.out.println();
    }
  }
}