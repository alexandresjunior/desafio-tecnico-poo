package teste;

import entidades.Endereco;
import entidades.Professor;

public class App {

    public static void main(String[] args) throws Exception {
        Endereco endereco = new Endereco(" conde da boa vista", "paulista", "54720-175");

        Professor professor1 = new Professor("Thiago", "thiago@gmail.com", endereco, "POO", 3000);

        professor1.exibirDetalhes();

    }
}