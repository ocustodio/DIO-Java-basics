public class ResultadoEscolar {
    public static void main(String[] args) {
        double nota = 8.5;
        String resultado;

        if (nota >= 7) { // if
            System.out.println("Aprovado!");
        } else if (nota >= 5 && nota < 7) { // Else if
            System.out.println("Recuperacao!");
        } else { // Else
            System.out.println("Reprovado!");
        }

        resultado = nota >= 7 ? "Aprovado!!!" : "Reprovado!!!"; // Ternary
        System.out.println(resultado);
    }
}
