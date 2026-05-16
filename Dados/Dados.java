package Dados;

import entidades.Aluno;
import entidades.Professor;

public class Dados {
    
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Arthur", "arthurgoncalves.bandim@gmail.com", "17", "Paulista", "12345", "54321");
        Professor professor1 = new Professor("Augusto","augustogoncalves.bandim@gmail.com", "28", "REcife", "1234", "Poo", 3000);

        aluno1.exibirDetalhes();
        aluno1.realizarLogin();
        professor1.exibirDetalhes();
        professor1.realizarLogin();
    }
}