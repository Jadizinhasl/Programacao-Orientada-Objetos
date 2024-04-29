import java.util.*;

public class Main {
  private static final Scanner scan = new Scanner(System.in);
  public static final String DISCURSO = """ 
  Voce nao vai acreditar. Mas voce cabia aqui. 
  Eu segurava voce e dizia "Esse menino vai ser o melhor menino do mundo. 
  Esse menino vai ser melhor do que qualquer um que conhecemos.". 
  E voce cresceu bom, maravilhoso.

  Ai chegou a hora de voce ser adulto e conquistar o mundo. E conquistou.
  Mas em algum ponto desse percurso, voce mudou. Voce deixou de ser voce.

  Agora deixa as pessoas botarem o dedo na sua cara e dizer que voce nao e bom.
  Eu vou te dizer uma coisa que voce ja sabe: O mundo nao e um grande arco-iris.
  E um lugar sujo, e um lugar cruel. Que nao quer saber o quanto voce e duro.
  Vai botar voce de joelhos e voce vai ficar de joelhos para sempre se voce deixar.

  Voce, eu, ninguem vai bater tao duro como a vida. Mas nao se trata de bater duro.
  Se trata de quanto voce aguenta apanhar e seguir em frente.
  O quanto voce e capaz de aguentar e continuar tentando.
  E assim que se consegue vencer.

  Agora se voce sabe o seu valor, entao va atras do que voce merece.
  Mas tem que ter disposicao para apanhar.
  E nada de apontar dedos, dizer que voce nao consegue por causa dele,
  dela ou de quem seja. So covardes fazem isso e voce nao e covarde.
  Voce e melhor do que isso!
  """;
  public static void main(String[] args) {
    
    String palavra = scan.nextLine();
    if(!validarPalavra(palavra)){
      System.out.println("A palavra deve ter mais de 3 letras e não pode ter espaços entre as letras");
      return;
    }
    
    if(!pesquisarPalavra(palavra)){
      System.out.println(String.format("A palavra '"+palavra.toUpperCase()+"' nao esta presente no discurso"));
      return;
    }
    System.out.println(String.format("A palavra '"+ palavra.toUpperCase()+"' esta presente no discurso"));
    
  }

  public static boolean validarPalavra(String palavra){
    palavra = palavra.trim();
    
    if(palavra.contains(" ")){
      return false;
    }
    
    if(palavra.length() <= 3){
      return false;
    }
    return true;
  }
  
  public static boolean pesquisarPalavra(String palavra){
    return DISCURSO.contains(palavra);
  }
  
}