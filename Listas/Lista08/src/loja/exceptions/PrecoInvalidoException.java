package loja.exceptions;

public class PrecoInvalidoException extends Exception{
    public PrecoInvalidoException(){
        super("\nO preço deve ser positivo e maior que 0");
    }
}