package dominio;

import java.util.List;

public class Curso {
    private String nome;
    private Professor professorResponsavel;
    private List<Aluno> alunos;

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessorResponsavel() {
        return professorResponsavel;
    }

    public void setProfessorResponsavel(Professor professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void adicionarAluno(Aluno aluno){
        
    }

    public void listarAluno(){
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
