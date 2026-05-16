package entidades;
public abstract class Pessoa {
    String nome;
    String email;
    Endereco endereco;
    public Pessoa(String nome, String email, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
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
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Endereço: " + endereco.getRua() + ", " + endereco.getCidade() + ", " + endereco.getCep());
    }
    
}
