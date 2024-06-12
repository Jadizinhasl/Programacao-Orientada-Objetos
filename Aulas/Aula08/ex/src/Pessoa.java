import exceptions.IdadeInvalidaException;
import exceptions.NomeInvalidoException;

public class Pessoa {
  private String nome;
  private int idade;

  // Constructor: Nesse caso, o construtor não pode ser vazio
  // porque eu exijo que exista um nome.
  public Pessoa(String nome, int idade) throws NomeInvalidoException, IdadeInvalidaException {
    setNome(nome);
    setIdade(idade);
  }

  public String getNome() {
    return this.nome;
  }

  // Lanço o erro:
  public void setNome(String nome) throws NomeInvalidoException {
    if (!nome.isBlank()) {
      this.nome = nome;
    } else {
      throw new NomeInvalidoException();
    }
  }

  public int getIdade() {
    return this.idade;
  }

  // Lanço o erro:
  public void setIdade(int idade) throws IdadeInvalidaException {
    if (idade >= 0) {
      this.idade = idade;
    } else {
      throw new IdadeInvalidaException();
    }
  }

}