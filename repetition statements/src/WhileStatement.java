public class WhileStatement {
    public static void main(String[] args) {
        double mesada = 50.0;
        int numDoces = 0;

        while(mesada > 0) {
            double valorDoce = ValorAleatorio();
            double oldMesada;

            if (valorDoce > mesada) valorDoce = mesada;

            oldMesada = mesada;
            mesada -= valorDoce;
            numDoces++;

            System.out.println(oldMesada + " - " + valorDoce + " = " + mesada);
        }

        System.out.println("Numero de doces comprados: " + numDoces);
    }

    public static double ValorAleatorio() {
        return Math.round(Math.random() * 10);
    }
}
