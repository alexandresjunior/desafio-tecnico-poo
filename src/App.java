import interfaces.entidades.Aluno;
import interfaces.entidades.Curso;
import interfaces.entidades.Endereco;
import interfaces.entidades.Professor;
import interfaces.enums.Modalidade;

public class App {
    public static void main(String[] args) {

        Endereco endProf = new Endereco("Rua das Flores, 100", "Recife", "50000-000");
        Endereco endAluno1 = new Endereco("Av. Boa Viagem, 200", "Recife", "51020-000");
        Endereco endAluno2 = new Endereco("Rua do Sol, 45", "Olinda", "53000-000");
        Endereco endAluno3 = new Endereco("Rua Nova, 12", "Caruaru", "55000-000");

        Professor professor = new Professor(
                "Carlos Mendes", "carlos@escola.com", endProf,
                "Programação Orientada a Objetos", 7500.00
        );

        Aluno aluno1 = new Aluno("Ana Souza", "ana@email.com", endAluno1, "2024001");
        Aluno aluno2 = new Aluno("Bruno Lima", "bruno@email.com", endAluno2, "2024002");
        Aluno aluno3 = new Aluno("Carla Dias", "carla@email.com", endAluno3, "2024003");

        Curso curso = new Curso("Desenvolvimento de Software", Modalidade.HIBRIDO, professor);

        curso.adicionarAluno(aluno1);
        curso.adicionarAluno(aluno2);
        curso.adicionarAluno(aluno3);

        System.out.println();

        professor.exibirDetalhes();
        System.out.println();

        aluno1.exibirDetalhes();
        System.out.println();

        aluno2.exibirDetalhes();
        System.out.println();

        curso.listarAlunos();
        System.out.println();

        professor.realizarLogin();
        System.out.println();

        System.out.println(curso);
    }
}