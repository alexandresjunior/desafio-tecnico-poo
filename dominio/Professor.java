package dominio;

public class Professor {
    private String nome;
    private double salario;

    public void exibirDetalhes(){
        System.out.println("NOME DO PROFESSOR: " + this.nome);
        System.out.println("SALÁRIO DO PROFESSOR: " + this.salario);
    }
}
