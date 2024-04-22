import java.util.Scanner;

public class Main {
  
  private static final Scanner SCAN = new Scanner(System.in);
  
    public static void main(String[] args) {
      int idade = Integer.parseInt(SCAN.nextLine());
      System.out.println(classificarNadador(idade));
  }
  
  private static String classificarNadador(int idadeNadador){
    if(idadeNadador < 12){
      return "Infantil";
    } else if(idadeNadador <= 14){
      return "Juvenil A";
    } else if(idadeNadador <= 17){
      return "Juvenil B";
    } else{
      return "Adulto";
    }
  }
}