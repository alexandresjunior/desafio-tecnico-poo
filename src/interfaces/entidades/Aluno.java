package interfaces.entidades;

import abstrates.Pessoa;

public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, String email, Endereco endereco, String matricula) {
        super(nome, email, endereco);
        this.matricula = matricula;
    }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    @Override
    public void exibirDetalhes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Matrícula: " + matricula);
    }
}