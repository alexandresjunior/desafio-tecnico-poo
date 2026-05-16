package Entidades;

//import Interfaces.autenticacao;

public class Aluno extends Pessoa {
    private String matricula;

   // @Override
    //public void realizarLogin() {
      //  System.out.println("Aluno Logado com Sucesso!");
       // return true;
    //}

    public Aluno(String matricula) {
        this.matricula = matricula;
    }

    public Aluno(String nome, String email, Endereco endereco, String matricula) {
        super(nome, email, endereco);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
        }
        
        @Override
        public void exibirDetalhes() {
            System.out.println("Aluno:" + getNome());
            System.out.println("Email:" + getEmail());
            System.out.println("Matricula" + getMatricula());
    }
}