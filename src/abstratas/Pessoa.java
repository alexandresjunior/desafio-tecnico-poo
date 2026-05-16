package abstratas;

import entidades.Endereco;

public abstract class Pessoa extends Endereco {
    
    private String nome;
    private String email;
    private Endereco endereço;
    
    public Pessoa(String rua, String cidade, String cep, String nome, String email, Endereco endereço) {
        super(rua, cidade, cep);
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

    public void exibirDetalhesPessoa() {
        System.out.println("-----DADOS DA PESSOA-----");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Rua: " + endereço.getRua());
        System.out.println("Cidade: " + endereço.getCidade());
        System.out.println("CEP: " + endereço.getCep());
    }
    
}