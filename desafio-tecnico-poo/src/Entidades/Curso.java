package Entidades;

import java.util.ArrayList;
import java.util.List;

import Enums.Modalidade;

public class Curso {
    private String nome;
    private Modalidade modalidade;
    private Professor professorResponsavel;

    public Curso() {
    }

    public Curso(String nome, Modalidade modalidade, Professor professorResponsavel, List<Aluno> alunos) {
        this.nome = nome;
        this.modalidade = modalidade;
        this.professorResponsavel = professorResponsavel;
        this.alunos = alunos;
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

    private List<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void ListarAlunos() {
        for (Aluno aluno : alunos) {
            aluno.exibirdetalhes();
        }

    }

}
