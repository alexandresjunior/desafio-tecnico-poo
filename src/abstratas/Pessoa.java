package abstratas;

import entidades.Endereco;

public abstract class Pessoa extends Endereco {
    
    private String nome;
    private String email;
    
    public Pessoa(String nome, String email, String rua, String cidade, String cep) {
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

    public void exibirDetalhes() {
        
    }
}