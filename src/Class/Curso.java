package Class;

public class Curso {
    private String nome;
    Modalidade modalidade;
    Professor professorResponsavel;
    list<Aluno> alunos;

    
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

    public list<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(list<Aluno> alunos) {
        this.alunos = alunos;
    }

}
