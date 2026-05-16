package entidades;

import abstratas.Pessoa;

public class Aluno extends Pessoa {
    
    private String matricula;

    public Aluno(String rua, String cidade, String cep, String nome, String email, Endereco endereço, String marticula) {
        super(rua, cidade, cep, nome, email, endereço);
        this.matricula = marticula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void exibirDetalhesAluno() {
        super.exibirDetalhesPessoa();
        System.out.println("-----DADOS DO ALUNO-----");
        System.out.println("Matrícula: " + matricula);
    }
}