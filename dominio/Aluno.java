package dominio;

public class Aluno extends Pessoa {

    private String matricula;

    public Aluno(String nome, String email, Endereco endereco, String matricula) {
        super(nome, email, endereco);
        this.matricula = matricula;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("NOME: " + this.getNome());
        System.out.println("MATRICULA: " + this.matricula);
        System.out.println("EMAIL: " + this.getEmail());
        System.out.println("*** ENDEREÇO ***");
        System.out.println("CEP: " + this.getEndereco().getCep());
        System.out.println("CIDADE: " + this.getEndereco().getCidade());
        System.out.println("RUA: " + this.getEndereco().getRua());
        System.out.println("==============");
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
