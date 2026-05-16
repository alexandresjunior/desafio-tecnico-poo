 package Class; 
 public abstract class Pessoa {
    private String nome;
    private String email;
    Endereco Endereco;

    public Pessoa() {
    }

    public Pessoa(String nome, String email, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        Endereco = endereco;
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

    }

}
