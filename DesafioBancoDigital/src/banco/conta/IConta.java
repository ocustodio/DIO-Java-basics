package banco.conta;

public interface IConta {

    abstract void sacar(double valor);
    abstract void depositar(double valor);
    abstract void transferir(double valor, Conta contaDestino);
    abstract void extrato();
    
}
