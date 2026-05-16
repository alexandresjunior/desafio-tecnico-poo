import entidade.Aluno;
import entidade.Professor;

public class App {
    public static void main(String[] args) throws Exception {
        Professor professor1 = new Professor("OTO", "oto@gmail.com", "Paulo afonso", "Recife", "398336-346", "Algebra", 5000);
        Aluno aluno1= new Aluno("Paulo", "Paulo@hotmail.com", "Jorge matheus", "Olinda", "843443-13", "2987349");
    
    professor1.ExibirDetalhes();
    professor1.realizarLogin();
    aluno1.ExibirDetalhes();
    aluno1.realizarLogin();
    }
}
