package entidade;

import interfaces.Login;

public class Professor extends Pessoa implements Login {
    private String especialidade;
    private Double salario;

    public Professor() {
    }

    
    public Professor(String nome, String email, String rua, String cidade, String cep, String especialidade, double salario) {
        super(nome, email, rua, cidade, cep);
        this.especialidade = especialidade;
        this.salario = salario;
    }


    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public void ExibirDetalhes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("especialização" + especialidade );
        System.out.println("Salario R$:" + salario);
    
    }
    @Override
    public boolean realizarLogin(){
            System.out.println("Professor logado com sucesso");
            return true;
    }

}
