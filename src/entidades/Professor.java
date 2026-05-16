package entidades;
public class Professor extends Pessoa {
    private String especialidade;
    private double salario;
    public Professor(String especialidade, double salario, String nome, String email, Endereco endereco) {
        super(nome, email, endereco);
        this.especialidade = especialidade;
        this.salario = salario;
    }
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
    void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Endereço: " + endereco);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Salário: " + salario);
    
    }
}
