 package entidade; 
 public abstract class Pessoa  {
    private String nome;
    private String email;
    private Endereco Endereco;

    public Pessoa() {
    }

    public Pessoa(String nome, String email ,String rua, String cidade, String cep) {
        this.nome = nome;
        this.email = email;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return Endereco;
    }

    public void setEndereco(Endereco endereco) {
        Endereco = endereco;
    }

    public void ExibirDetalhes() {
        System.out.println("----------DADOS--------");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Rua: " + Endereco.getRua() );
        System.out.println("Cidade: " + Endereco.getCidade());
        System.out.println("Cep: " + Endereco.getCep());
    }

}
