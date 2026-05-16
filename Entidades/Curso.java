package entidades;
import java.util.ArrayList;
import java.util.List;
import enums.Modalidade;

public class Curso {
    private String nome;
    private Modalidade modalidade;
    private Professor professor;
    private List<Aluno> alunos;
    
    public Curso() {}

    public Curso(String nome, Modalidade modalidade, Professor professor) {
        this.nome = nome;
        this.modalidade = modalidade;
        this.professor = professor;
        this.alunos = new ArrayList<>();
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

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void adicionarAluno(Aluno aluno) {
    this.alunos.add(aluno);
}

public void listarAlunos() {
    if (alunos != null) {
        for (Aluno aluno : alunos) {
            aluno.exibirDetalhes();
        }
    } else {
        System.out.println("Nenhum aluno matriculado.");
    }
}
    
}
