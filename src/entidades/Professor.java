package entidades;

import interfaces.Autenticavel;

public class Professor implements Autenticavel {

  private String especialidade;
  private double salario;

  // Construtor
  public Professor(){

  }
  
  public Professor(String especialidade, double salario) {
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
  public void exibirDetalhes() {

  }

  @Override
  public boolean realizarLogin() {
    throw new UnsupportedOperationException("Unimplemented method 'realizarLogin'");
  }
}