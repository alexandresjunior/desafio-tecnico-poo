package entidades;
public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, String email, Endereco endereco, String matricula) {
        super(nome, email, endereco);
        this.matricula = matricula;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Aluno: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Matrícula: " + matricula);
        System.out.println("Rua: " + getEndereco().getRua());
        System.out.println("Cidade: " + getEndereco().getCidade());
        System.out.println("CEP: " + getEndereco().getCep());
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    
}
