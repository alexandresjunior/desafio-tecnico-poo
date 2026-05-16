package entidades;

import enums.Modalidade;
import java.util.ArrayList;
import java.util.List;

public class Curso {

  private String nome;
  private Modalidade modalidade;
  private Professor professorResponsavel;
  private List<Aluno> alunos;

  // Construtores
  public Curso() {
    alunos = new ArrayList<>();
  }

  public Curso(String nome, Modalidade modalidade,
      Professor professorResponsavel) {
    this.nome = nome;
    this.modalidade = modalidade;
    this.professorResponsavel = professorResponsavel;
    this.alunos = new ArrayList<>();
  }

  // Métodos da classe
  public void adicionarAluno(Aluno aluno) {

  }

  // Métodos getters e setters
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

  public void adcionarAluno(Aluno aluno) {

  }

  public void listarAlunos() {

  }
}