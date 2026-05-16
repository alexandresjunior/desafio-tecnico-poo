package entidades;

import abstratas.Pessoa;
import interfaces.Autenticavel;

public class Aluno extends Pessoa implements Autenticavel {
    
    private String matricula;

    public Aluno(String nome, String email, Endereco endereço, String marticula) {
        super(nome, email, endereço);
        this.matricula = marticula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Detalhes do Aluno: ");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Matricula: " + matricula);
    }

    @Override
    public boolean realizarLogin() {
        System.out.println("Login realizado com sucesso!");
        return true;
    }

}