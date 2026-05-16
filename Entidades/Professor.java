package entidades;

import interfaces.Autenticavel;

public class Professor extends Pessoa implements Autenticavel {

    private String especialidade;
    private double salario;

    // construtor
    public Professor(String nome, String email, Endereco endereco,
            String especialidade, double salario) {
        super(nome, email, endereco); // chama o construtor de Pessoa
        this.especialidade = especialidade;
        this.salario = salario;
    }

    @Override
    public boolean realizarLogin() {
        return true;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Professor: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Rua: " + getEndereco().getRua());
        System.out.println("Cidade: " + getEndereco().getCidade());
        System.out.println("CEP: " + getEndereco().getCep());
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

}
