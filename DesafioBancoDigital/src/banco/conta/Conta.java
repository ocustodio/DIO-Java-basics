package banco.conta;

public abstract class Conta implements IConta{
    protected static int SEQUENCIAL = 1;
    protected static String AGENCIA_PADRAO = "0001";

    protected String agencia;
    protected int numero;
    protected double saldo = 0;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    protected boolean checarSaldoPositivo(double valor) {
         return valor > saldo;
    }

    protected double retirarSaldo(double valor) {
        return this.saldo -= valor;
    }

    protected double adicionarSaldo(double saldo) {
        return this.saldo += saldo;
    }
    
    protected void imprimirAtributos() {
        System.out.println("Propietario da conta: " + cliente.getPrimeiroNome() + " " + cliente.getSegundoNome());
        System.out.println("AGENCIA: " + getAgencia());
        System.out.println("NUM: " + getNumero());
    }

    public String getAgencia() {
        return agencia;
    };
    public int getNumero() {
        return numero;
    };
    public double getSaldo() {
        return saldo;
    };
}
