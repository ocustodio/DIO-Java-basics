public class ForStatement {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    
    // For with Arrays

        String alunos[] = {"Victor", "Jorge", "Lucas", "Mateus"};

        for (int i = 0; i < alunos.length; i++) { // For
            System.out.println(i + " " + alunos[i]);
        }

        for(String aluno : alunos) {  // For Each
            System.out.println(aluno);
        }
    
    }

    
}
