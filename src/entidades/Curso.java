package entidades;

import java.util.List;
import java.util.ArrayList;
import enums.Modalidade;

public class Curso {
    private String nome;
    private Modalidade modalidade;
    private Professor professorResponsavel;
    private List<Aluno> alunos;

    public Curso() {
        alunos = new ArrayList<>();
    }

    public Curso(String nome, Modalidade modalidade, Professor professorResponsavel) {
        this.nome = nome;
        this.modalidade = modalidade;
        this.professorResponsavel = professorResponsavel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Modalidade getModalidade() {
        return modalidade;
    }

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
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

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);

    }
}
