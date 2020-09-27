import java.util.HashMap;
import java.util.Map;

public class TestMapaAluno extends Aluno{

    public TestMapaAluno(String nome, String curso, int ra, int matricula) {
        super(nome, curso, ra, matricula);
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Map <String, Aluno> mapadeAlunos = new HashMap<>();
        mapadeAlunos.put("Pedro", aluno1);
    }


    
}
