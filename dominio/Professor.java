package dominio;

import interfaces.Autenticavel;

public class Professor extends Pessoa implements Autenticavel{
    private String especialidade;
    private double salario;

    public Professor(String nome, String email, Endereco endereco, String especialidade, double salario) {
        super(nome, email, endereco);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("ESPECIALIDADE: " + this.especialidade);
        System.out.println("SALÁRIO: " + this.salario);
    }

    @Override
    public boolean realizarLogin() {
        return true;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    
}
