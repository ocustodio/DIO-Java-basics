import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        String agencia, nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o numero da agencia!");
        numero = scanner.nextInt();

        System.out.println("Por favor, digite a agencia!");
        agencia = scanner.next();

        System.out.println("Por favor, digite o seu nome!");
        nomeCliente = scanner.next();

        System.out.println("Por favor, digite o seu saldo!");
        saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Ola " + nomeCliente + 
        ", obrigado por criar uma conta em nosso banco, sua agencia e " + agencia + 
        ", conta " + numero + " e seu saldo " + saldo + " ja esta disponivel para saque");
    }
}
