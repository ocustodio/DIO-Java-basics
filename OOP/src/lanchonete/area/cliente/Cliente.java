package lanchonete.area.cliente;

public class Cliente {
    public void escolherLanche() {
        System.out.println("ESCOLHENDO O LANCHE");
    }

    public void fazerPedido() {
        System.out.println("FAZENDO O PEIDO");
        escolherLanche();
    }

    public void pagaConta() {
        System.out.println("PAGANDO CONTA");
        consultarSaldoAplicativo();
    }

    private void consultarSaldoAplicativo() {
        System.out.println("CONSULTANDO SALDO NO APLICATIVO");
    }
}
