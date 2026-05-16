
public class Professor implements Autenticavel{

  private String especialidade;
  private double salario;

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