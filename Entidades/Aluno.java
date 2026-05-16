package Entidades;
public class Aluno {
    private String matricula;
   
    public Aluno() {}
    
    public Aluno(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void exibirDetalhes() {
        System.out.println("Matrícula: " + matricula);
    }
}
