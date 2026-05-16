package test;

import java.util.ArrayList;
import java.util.List;

import dominio.Aluno;
import dominio.Curso;
import dominio.Endereco;
import dominio.Professor;
import enums.Modalidade;

public class TestDesafio01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Aurora", "Recife", "12234");
        Endereco endereco2 = new Endereco("Caetes", "Abreu e Lima", "5644");

        Professor professor = new Professor("Rodrigo", "Teste00998@gmail.com", endereco, "Matematica", 1500);
        Aluno aluno1 = new Aluno("Roberto", "test02@gmail.com", endereco, "156718");
        Aluno aluno2 = new Aluno("Maria", "test03@gmail.com", endereco2, "1682713");

        List<Aluno> listaDeAlunos = new ArrayList<>();
        Curso curso = new Curso("adm", professor, listaDeAlunos, Modalidade.PRESENCIAL);

        curso.adicionarAluno(aluno1);
        curso.adicionarAluno(aluno2);
        curso.listarAluno();
        professor.exibirDetalhes();

    }

}
