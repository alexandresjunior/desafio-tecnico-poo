package entidades;

import abstratas.Pessoa;
import interfaces.Autenticavel;

public class Professor extends Pessoa implements Autenticavel {

    private String especialidade;
    private double salario;

    public Professor(String nome, String email, String rua, String cidade, String cep, String especialidade, double salario) {
        super(nome, email, rua, cidade, cep);
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

    @Override
    public void exibirDetalhes() {
        System.out.println("Detalhes do professor: ");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Especialidade: " + especialidade);
    }

    public boolean realizarLogin() {
        System.out.println("Login realizado com sucesso!");
        return true;
    }

}