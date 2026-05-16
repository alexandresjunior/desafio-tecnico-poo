package entidades;
import java.util.List;

public class Curso {
    private String nome;
    private modalidade modalidade;
    private Professor professor;
    private List<Aluno> alunos;
    
    public Curso() {}

    public Curso(String nome, modalidade modalidade, Professor professor, List<Aluno> alunos) {
        this.nome = nome;
        this.modalidade = modalidade;
        this.professor = professor;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public modalidade getModalidade() {
        return modalidade;
    }

    public void setModalidade(modalidade modalidade) {
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

    
}
