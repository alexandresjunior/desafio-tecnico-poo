package interfaces.entidades;

import abstrates.Pessoa;
import interfaces.Autenticavel;

public class Professor extends Pessoa implements Autenticavel {
    private String especialidade;
    private double salario;

    public Professor(String nome, String email, Endereco endereco,
                     String especialidade, double salario) {
        super(nome, email, endereco);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public String getEspecialidade() { return especialidade; }
    public void setEspecialidade(String especialidade) { this.especialidade = especialidade; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    @Override
    public void exibirDetalhes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Especialidade: " + especialidade);
        System.out.printf("Salário: R$ %.2f%n", salario);
    }

    @Override
    public boolean realizarLogin() {
        System.out.println("Professor " + getNome() + " realizou login.");
        return true;
    }
}