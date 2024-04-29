package Ex02;

import java.util.*;

public class Main {
  private static final String USUARIO = "MeuNomeNaoEhZelda";
  private static final String SENHA = "meuNomeEHL1nk";
  private static final Scanner scan = new Scanner(System.in);
  
    public static void main(String[] args) {
      boolean usuarioCerto;
      
      do{
        String usuario = scan.nextLine();
        String senha = scan.nextLine();
        
        usuarioCerto = receberDados(usuario, senha);
        
        if(!usuarioCerto){
          System.out.println("Usuario e/ou senha invalido!");
        }else{
          System.out.println(String.format("Seja bem vindo %s!", USUARIO));
        }
        
      }while(!usuarioCerto);
    }
    
    public static boolean receberDados(String usuario, String senha){
      if(!usuario.equalsIgnoreCase(USUARIO)){
        return false;
      }
      if(!senha.equals(SENHA)){
        return false;
      }
      return true;
    }
}