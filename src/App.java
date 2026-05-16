import entidades.*;

public class App {
    public static void main(String[] args) throws Exception {

        // Criando um endereço
        Endereco endereco = new Endereco(null, null, null);
        endereco.setRua("Rua das Flores");
        endereco.setCidade("Recife");
        endereco.setCep("12345-678");

        // Criando um aluno
        Aluno aluno = new Aluno(null, null, null, endereco);
        aluno.setNome("Davi Félix");
        aluno.setMatricula("2025001");
        aluno.setEndereco(endereco);

        // Exibindo informações
        System.out.println("===== DADOS DO ALUNO =====");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Cidade: " + aluno.getEndereco().getCidade());
        System.out.println("CEP: " + aluno.getEndereco().getCep());
    }
}