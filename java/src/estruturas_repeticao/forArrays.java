package estruturas_repeticao;

public class forArrays {
    public static void main(String[] args) {
        
        String alunos[] = {"Vinicio", "Gustavo", "Thiago"};

        for (int x = 0; x < alunos.length; x ++){
            
            System.out.println("O aluno no indice x = " + x + " é " + alunos [ x ]);
        }
    }
}
