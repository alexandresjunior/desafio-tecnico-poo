import entidades.Aluno;
import entidades.Curso;      // ← faltava
import entidades.Endereco;   // ← faltava
import entidades.Pessoa;
import entidades.Professor;
import enums.Modalidade;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        Endereco end1 = new Endereco("Rua A", "Recife", "50000-000");
        Endereco end2 = new Endereco("Rua B", "Recife", "51000-000");
        Endereco end3 = new Endereco("Rua C", "Olinda", "53000-000");

        Professor prof = new Professor("João", "joao@email.com", end1, "Java", 5000.0);
        
        Aluno aluno1 = new Aluno("Maria", "maria@email.com", end2, "2024001");
        Aluno aluno2 = new Aluno("Pedro", "pedro@email.com", end3, "2024002");

        Curso curso = new Curso("POO com Java", Modalidade.EAD, prof);
        curso.adicionarAluno(aluno1);
        curso.adicionarAluno(aluno2);

        prof.exibirDetalhes();
        System.out.println("Login: " + prof.realizarLogin());
        
        aluno1.exibirDetalhes();
        
        curso.listarAlunos();
    }
}