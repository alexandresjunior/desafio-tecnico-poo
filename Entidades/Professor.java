package Entidades;
public class Professor {
    private String name;
    private Double salario;

    public Professor() {}

    public Professor(String name, Double salario) {
        this.name = name;
        this.salario = salario;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + name);
        System.out.println("Salário: " + salario);
    }
}
