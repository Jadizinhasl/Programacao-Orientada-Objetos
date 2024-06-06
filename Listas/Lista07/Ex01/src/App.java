import Escola.Aluno;
import Escola.Professor;

public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno = new Aluno("Hermione Granger", "Hermi23@hogwats.com", "3122");
        Professor professor = new Professor("Severus Snape", "Severus32@hogwats.com", "Feitiços");

        aluno.exibirInfo();
        System.out.println("\nInformações corretas: ");
        aluno.exibirInfo(true, true, false);

        professor.exibirInfo();
        System.out.println("\nInformações corretas: ");
        professor.exibirInfo(false, true, false);
    }
}
