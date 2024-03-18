package banco.conta;

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void sacar(double valor) {
        if (checarSaldoPositivo(valor)) {
            System.out.println("Voce nao possui saldo suficiente para sacar");
        } else {
            retirarSaldo(valor);
            System.out.println("Sacando R$" + valor + " da conta corrente, Sr(a) " + super.cliente.getPrimeiroNome());
        }
    }
    
    public void depositar(double valor) {
        adicionarSaldo(valor);
        System.out.println("Depositando R$" + valor + " na conta corrente, Sr(a)" + super.cliente.getPrimeiroNome());
    }

    public void transferir(double valor, Conta contaDestino) {
        sacar(valor);
        contaDestino.depositar(valor);
    }

    public void extrato() {
        System.out.println("Voce possui R$" + getSaldo() + " em sua conta corrente");
        imprimirAtributos();
    }
}
