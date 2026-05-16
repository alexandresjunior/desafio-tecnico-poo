package abstratas;

import entidades.Endereco;

public abstract class Pessoa {
    
    private String nome;
    private String email;
    private Endereco endereço;
    
    public Pessoa(String nome, String email, Endereco endereço) {
        this.nome = nome;
        this.email = email;
        this.endereço = endereço;
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

    public Endereco getEndereço() {
        return endereço;
    }

    public void setEndereço(Endereco endereço) {
        this.endereço = endereço;
    }

    public void exibirDetalhes() {
        
    }
}