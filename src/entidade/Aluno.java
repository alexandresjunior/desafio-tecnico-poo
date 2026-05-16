package entidade; 
public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String matricula) {    
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public void ExibirDetalhes(){
        System.out.println("Matricula: " + matricula);
        
    }
}
