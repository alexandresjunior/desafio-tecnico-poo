package abstratas;

import entidades.Endereco;

public abstract class Pessoa {

  private String nome;
  private String email;
  private Endereco endereco;

  // Construtores
  public Pessoa(){


  }
  
  public Pessoa(String nome, String email, Endereco endereco) {
    this.nome = nome;
    this.email = email;
    this.endereco = endereco;
  }

  // Métodos getters e setters
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Endereco getEndereco() {
    return endereco;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

  // Métodos da classe
  public abstract void exibirDetalhes();

}
