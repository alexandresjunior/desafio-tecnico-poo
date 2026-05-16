public class Professor extends Pessoa {
    private String especialidade;
    private Double salario;

    public Professor() {
    }

    public Professor(String especialidade, Double salario) {
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void ExibirDetalhes() {

    }
}
