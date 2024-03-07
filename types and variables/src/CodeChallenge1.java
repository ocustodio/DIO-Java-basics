import java.util.Scanner;

public class CodeChallenge1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y, PROD, soma;
        double a, b, media;

        x = scanner.nextInt();
        y = scanner.nextInt();

        a = scanner.nextDouble();
        b = scanner.nextDouble();

        scanner.close();

        PROD = x * y;
        soma = x + y;
        media = (a * 3.5 + b * 7.5) / 11;

        System.out.println("PROD = " + PROD);
        System.out.println("SOMA = " + soma);
        System.out.printf("MEDIA = %.5f", media);

    }
}
