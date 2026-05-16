package entidades;
public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String matricula, String nome, String email, Endereco endereco) {
        super(nome, email, endereco);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    } public void exibirDetalhes() {
        System.out.println("Aluno de matrícula: " + matricula);
    }
}
