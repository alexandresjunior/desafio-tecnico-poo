package dominio;

import interfaces.Autenticavel;

public class Professor extends Pessoa implements Autenticavel {
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
        System.out.println("NOME DO PROFESSOR: " + this.getNome());
        System.out.println("EMAIL DO PROFESSOR: " + this.getEmail());
        System.out.println(" *** ENDEREÇO *** ");
        System.out.println("CEP: " + this.getEndereco().getCep());
        System.out.println("CIDADE: " + this.getEndereco().getCidade());
        System.out.println("RUA: " + this.getEndereco().getRua());
        System.out.println("ESPECIALIDADE DO PROFESSOR: " + this.especialidade);
        System.out.println("SALÁRIO DO PROFESSOR: " + this.salario);
        System.out.println("LOGIN CONCLUIDO COM SUCESSO!");
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
