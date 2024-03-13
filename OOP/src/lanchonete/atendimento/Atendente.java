package lanchonete.atendimento;

public class Atendente {
    public void servindoMesa() {
        System.out.println("SERVINDO MESA");
        pegarLancheNaCozinha();
        pegarPedidoBalcao();
    }

    private void pegarLancheNaCozinha() {
        System.out.println("PEGANDO LANCHE NA COZINHA");
    }

    public void receberPagamento() {
        System.out.println("RECEBENDO PAGAMENTO");
    }

    void trocarGas() {
        System.out.println("ATENDENTE TROCANDO O GAS");
    }

    private void pegarPedidoBalcao() {
        System.out.println("PEGANDO O PEDIDO NO BALCAO");
    }
}
