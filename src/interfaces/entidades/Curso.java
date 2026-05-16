package interfaces.entidades;

import java.util.ArrayList;
import java.util.List;

import interfaces.enums.Modalidade;

public class Curso {
    private String nome;
    private Modalidade modalidade;
    private Professor professorResponsavel;
    private List<Aluno> alunos;

    public Curso(String nome, Modalidade modalidade, Professor professorResponsavel) {
        this.nome = nome;
        this.modalidade = modalidade;
        this.professorResponsavel = professorResponsavel;
        this.alunos = new ArrayList<>();
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Modalidade getModalidade() { return modalidade; }
    public void setModalidade(Modalidade modalidade) { this.modalidade = modalidade; }

    public Professor getProfessorResponsavel() { return professorResponsavel; }
    public void setProfessorResponsavel(Professor professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
        System.out.println("Aluno " + aluno.getNome() + " matriculado no curso " + nome + ".");
    }

    public void listarAlunos() {
        System.out.println("=== Alunos do Curso: " + nome + " ===");
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno matriculado.");
        } else {
            for (Aluno a : alunos) {
                System.out.println("- " + a.getNome() + " (Matrícula: " + a.getMatricula() + ")");
            }
        }
    }

    public List<Aluno> getAlunos() { return alunos; }

    @Override
    public String toString() {
        return "Curso: " + nome + " | Modalidade: " + modalidade
                + " | Professor: " + professorResponsavel.getNome();
    }
}