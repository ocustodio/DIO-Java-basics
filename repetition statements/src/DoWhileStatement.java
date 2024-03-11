import java.util.Random;

public class DoWhileStatement {
    public static void main(String[] args) {
        System.out.println("Discando...");
        
        do {

            System.out.println("Telefone tocando...");

        } while(Tocando());

        System.out.println("Alou!?");
    }

    public static boolean Tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;

        System.out.println("atendeu? " + atendeu);

        return !atendeu;
    }
}
