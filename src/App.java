import entidades.Endereco;
import entidades.Professor;

public class App {
    public static void main(String[] args) throws Exception {

        // Criando o endereço do professor
        Endereco endereco = new Endereco("Rua das Flores", "Paulista", "53401-000");

        // Instanciando o professor com todos os parâmetros
        Professor professorTreina = new Professor(
                "Carlos Silva", // nome
                "carlos@universidade.com", // email
                endereco, // endereço
                "Professor de Lógica", // especialidade
                5000.00 // salário
        );

        // Chamando o método exibirDetalhes()
        professorTreina.exibirDetalhes();
    }
}
