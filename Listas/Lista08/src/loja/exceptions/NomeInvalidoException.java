package loja.exceptions;

public class NomeInvalidoException extends Exception{
    public NomeInvalidoException(){
        super("\nÉ necessário que o nome tenha 3 ou mais caracteres..");
    }
}