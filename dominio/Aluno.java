package dominio;

public class Aluno extends Pessoa{

    private String matricula;
    
    public Aluno(String nome, String email, String matricula) {
        super(nome, email);
        this.matricula = matricula;
    }

    public void exibirDetalhes(){
        System.out.println("MATRICULA DO ALUNO: " + this.matricula);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
