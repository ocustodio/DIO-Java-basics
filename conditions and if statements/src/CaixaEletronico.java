public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 17.5;

        if (saldo > valorSolicitado) {
            saldo = saldo - valorSolicitado;
        }

        System.out.println(saldo);
    }
}
