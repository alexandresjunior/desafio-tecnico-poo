package Modelo;

//import Autenticacao.autenticacao;

public class Professor extends Pessoa {
    
    private String especialidade;
    private Double salario;
    public void exibirdetalhes(){
        System.out.println("Especialidade:"+especialidade);
        System.out.println("Salario:"+salario);
    }
}
