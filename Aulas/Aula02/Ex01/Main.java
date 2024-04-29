package Ex01;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner SCAN = new Scanner(System.in);
    
    String frase = SCAN.nextLine();
    String[] palavras = frase.split(" ");
    
    for(int i = 0; i < palavras.length; i++){
      if(i != palavras.length - 1){
        System.out.println(palavras[i]);
      }else{
        fraseSeparada(palavras[i]);
      }
    }
  }
  
  public static void fraseSeparada(String frase){
    char[] characteres = frase.toCharArray();
    
    for(char character : characteres){
      System.out.println(character);
    }
  }
}
