package entidades;

import java.util.List;

import enums.Modalidade;

public class Curso {
    String nome;
    Modalidade modalidade;
    Professor professorResponsavel;
    List<Aluno> alunos;
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
    } void AdicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    } void listarAlunos() {
        System.out.println("Alunos matriculados no curso " + nome + ":");
        for (Aluno aluno : alunos) {
            System.out.println("- " + aluno.getNome());
        }
    }
    
}
