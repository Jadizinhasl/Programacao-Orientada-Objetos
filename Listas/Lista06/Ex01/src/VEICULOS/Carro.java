package VEICULOS;

public class Carro implements Veiculo{
    private double motorizacao;
    private String combustivel;

    public Carro(double motorizacao, String combustivel){
        this.motorizacao = motorizacao;
        this.combustivel = combustivel;
    }

    public void setMotor(double motorizacao){
        this.motorizacao = motorizacao;
    }
    public double getMotor(){
        return motorizacao;
    }

    public void setCombustivel(String combustivel){
        this.combustivel = combustivel;
    }
    public String getCombustivel(){
        return combustivel;
    }

    @Override
    public void acelerar(){
        System.out.println("\nCarro muito agressivo acelerando: *VRUUUUMMMMMMM!*");
    }

    @Override
    public void frear(){
        System.out.println("Carro freiando agressivamente: *SKRRR*");
    }
}
