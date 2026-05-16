package entidades;

import abstratas.Pessoa;
import interfaces.Autenticavel;

public class Professor extends Pessoa implements Autenticavel {

  private String especialidade;
  private double salario;

  // Construtor
  // Se quiser deixar o contrutor vazio
  public Professor() {
    super(null, null, null);
  }

  public Professor(String nome, String email, Endereco endereco, String especialidade, double salario) {
    super(nome, email, endereco); // chama o construtor da superclasse
    this.especialidade = especialidade;
    this.salario = salario;
  }

  // Métodos getters e setters
  public String getEspecialidade() {
    return especialidade;
  }

  public void setEspecialidade(String especialidade) {
    this.especialidade = especialidade;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  // Métodos da classe
  @Override
  public void exibirDetalhes() {
    System.out.println("Nome: " + getNome());
    System.out.println("Email: " + getEmail());
    System.out.println("Endereço: " + getEndereco());
    System.out.println("Especialidade: " + especialidade);
    System.out.println("Salário: " + salario);
  }

  @Override
  public boolean realizarLogin() {
    return true;
  }

}