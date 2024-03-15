package carro;

public class Carro extends Veiculo {
    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("Ligando carro!");
    }

    private void confereCombustivel() {
        System.out.println("Conferindo combustivel");
    }

    private void confereCambio() {
        System.out.println("Conferindo posicao do cambio");
    }
}
