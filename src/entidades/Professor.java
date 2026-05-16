package entidades;

import abstratas.Pessoa;

public class Professor extends Pessoa {
    
    private String especialidade;
    private double salario;

    public Professor(String rua, String cidade, String cep, String nome, String email, Endereco endereço, 
        String especialidade, double salario) {
        super(rua, cidade, cep, nome, email, endereço);
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
        System.out.println("Professor logado com sucesso!");
    }

}