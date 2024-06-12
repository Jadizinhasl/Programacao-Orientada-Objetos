package exceptions;

public class IdadeInvalidaException extends Exception {

  // Constructor puxando informações da classe mãe (Exception)
  public IdadeInvalidaException() {
    super("Idade deve ser maior ou igual a 0.");
  }
}