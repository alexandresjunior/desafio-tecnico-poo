package Entidades;

import Interfaces.Autenticavel;

public class Professor extends Pessoa implements Autenticavel{
 
    private String especialidade;
    private Double salario;

    public Professor(){}

    public Professor(String especialidade, Double salario) {
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public Professor(String nome, String email, Endereco endereco, String especialidade, Double salario) {
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

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    @Override
    public void exibirDetalhes(){
        System.out.println("Professor:"+getNome());
        System.out.println("Email:"+getEmail());
        System.out.println("Especialidade:"+getEspecialidade());
        System.out.println("Salario:"+getSalario());
    }
    @Override
    public boolean realizarLogin(){
        System.out.println("Professor Logado com Sucesso");
        return true;
    }

}
