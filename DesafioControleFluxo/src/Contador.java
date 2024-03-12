import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber, secondNumber;
        
        System.out.println("Entre com o primeiro num: ");
        firstNumber = scanner.nextInt();

        System.out.println("Entre com o segundo num: ");
        secondNumber = scanner.nextInt();

        scanner.close();

        try {
            contar(firstNumber, secondNumber);

        } catch (ParametrosInvalidosException e) {
            System.out.println(e);
        }
    }

    static void contar(int firstNumber, int secondNumber) throws ParametrosInvalidosException {

        if (firstNumber > secondNumber) {
            throw new ParametrosInvalidosException("Primeiro parametro precisa ser maior que o segundo!");
        }

        int contagem = secondNumber - firstNumber;

        for (int i = 1; i <= contagem ; i++) {
            System.out.println("Imprimindo o numero " + i);
        }
    }
}
