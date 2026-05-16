package dominio;

import java.util.List;

import enums.Modalidade;

public class Curso {
    private String nome;
    private Professor professorResponsavel;
    private List<Aluno> alunos;
    private Modalidade modalidade;

    public Curso(String nome, Professor professorResponsavel, List<Aluno> alunos, Modalidade modalidade) {
        this.nome = nome;
        this.professorResponsavel = professorResponsavel;
        this.alunos = alunos;
        this.modalidade = modalidade;
    }

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

    public Modalidade getModalidade() {
        return modalidade;
    }

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }
}
