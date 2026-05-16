package dominio;

public class Professor extends Pessoa{
    private String nome;
    private double salario;
    
    public Professor(String nome, String email, String nome2, double salario) {
        super(nome, email);
        nome = nome2;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void exibirDetalhes(){
        System.out.println("NOME DO PROFESSOR: " + this.nome);
        System.out.println("SALÁRIO DO PROFESSOR: " + this.salario);
    }
}
