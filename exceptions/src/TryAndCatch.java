import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryAndCatch {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            String nome;
            int idade;

            System.out.println("Entre com o seu nome: ");
            nome = scanner.next();

            System.out.println("Entre com sua idade: ");
            idade = scanner.nextInt();
            
            scanner.close();

            System.out.println(nome);       
            System.out.println(idade);

        } catch (InputMismatchException e) {

            System.out.println("O campo idade precisa ser numerico!");
        }
    
    }
}
