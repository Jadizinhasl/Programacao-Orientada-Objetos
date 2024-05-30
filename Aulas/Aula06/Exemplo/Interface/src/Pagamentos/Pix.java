package Pagamentos;

import java.time.LocalDate;

public class Pix implements FormaPagamento{
    private String chave;
    private double valor;
    private String data = LocalDate.now().toString();
    
    @Override
    public double receberPagamento(String chave, double valor){
        this.chave = chave;
        this.valor = valor;
        System.out.println("Recebido R$" + this.valor + " de " + this.chave);
        return this.valor;
    }

    @Override
    public double reembolsar(double valor){
        System.out.println("Enviando para a chave: " + this.chave);
        return valor;
    }

    @Override
    public String emitirComprovante(){
        return String.format("Valor: %s%nData: %s", this.valor, this.data);
    }

}
