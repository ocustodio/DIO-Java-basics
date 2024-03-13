package lanchonete.atendimento.cozinha;

public class Almoxarife {
    private void controlarEntrega() {
        System.out.println("CONTROLANDO ENTRADA DOS ITENS");
    }

    private void controlarSaida() {
        System.out.println("CONTROLANDO SAIDA DOS ITENS");
    }

    void entregarIngredientes() {
        System.out.println("ENTREGANDO INGREDIENTES");
        controlarSaida();
    }

    void trocarGas() {
        System.out.println("ALMOXARIFE TROCANDO O GAS");
    }
}
