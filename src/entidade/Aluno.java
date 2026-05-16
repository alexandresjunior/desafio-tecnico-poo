package entidade;

import interfaces.Login;

public class Aluno extends Pessoa implements Login{
    private String matricula;

    
    
    public Aluno(String nome, String email, String rua, String cidade, String cep, String matricula) {
        super(nome, email, rua, cidade, cep);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public void ExibirDetalhes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Matricula: " + matricula);
    }

    public boolean realizarLogin(){
        System.out.println("Aluno logado com sucesso");
        return true;
    }
}
