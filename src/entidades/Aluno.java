package entidades;
import abistratas.Pessoa;
public class Aluno extends Pessoa{

    private String matricula;

    public Aluno() {

    }

    public Aluno(String matricula) {
        this.matricula = matricula;
    }

    public Aluno(String nome, String email, Endereco endereco, String matricula) {
        super(nome, email, endereco);
        this.matricula = matricula;
    }
@Override
public void exibirDetalhes(){
    System.out.println("Detalher do aluno.");
    System.out.println("nome ." + this.getNome());
    System.out.println("Email: " + this.getEmail());
    System.out.println("Matricula:" + matricula);
@Override


   
    }
