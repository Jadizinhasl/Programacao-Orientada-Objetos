package VEICULOS;

public class Bicicleta implements Veiculo {
    private String marca;
    private double pesoSuportado;

    public Bicicleta(String marca, double pesoSuportado){
        this.marca = marca;
        this.pesoSuportado = pesoSuportado;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return marca;
    }

    public void setPeso(double pesoSuportado){
        this.pesoSuportado = pesoSuportado;
    }
    public double getPeso(){
        return pesoSuportado;
    }

    @Override
    public void acelerar(){
        System.out.println("\nBicicletinha saindo do lugar: *vrom*");
    }

    @Override
    public void frear(){
        System.out.println("Bicicletinha dando uma freada: *skrr*");
    }
}
