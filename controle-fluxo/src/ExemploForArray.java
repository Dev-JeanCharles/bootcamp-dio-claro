import java.util.Arrays;

public class ExemploForArray {
    public static void main(String[] args) {
        String[] alunos = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for(String aluno : alunos) {
            System.out.println(Arrays.toString(alunos));
        }
    }
}
