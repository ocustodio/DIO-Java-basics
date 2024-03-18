package banco;

import java.util.ArrayList;

import banco.bancoInfo.BancoInfo;
import banco.conta.Cliente;
import banco.conta.Conta;
import banco.conta.ContaCorrente;
import banco.conta.ContaPoupanca;

public class Banco {
    public static void main(String[] args) {
        Cliente victorCustodio = new Cliente("Victor", "Custodio", 25);
        Cliente camilleVitoria = new Cliente("Camille", "Vitoria", 21);
        Conta contaCorrente = new ContaCorrente(victorCustodio);
        Conta contaPoupanca = new ContaPoupanca(camilleVitoria);

        contaPoupanca.depositar(4500);
        contaPoupanca.extrato();
        
        contaPoupanca.sacar(1000);
        contaPoupanca.extrato();

        contaPoupanca.transferir(1000, contaCorrente);
        contaPoupanca.extrato();
        contaCorrente.extrato();

        System.out.println(contaPoupanca.getAgencia());
        System.out.println(contaPoupanca.getNumero());

        ArrayList<Conta> contas = new ArrayList<Conta>();
        contas.add(contaCorrente);
        contas.add(contaPoupanca);

        BancoInfo novoBanco = new BancoInfo("Santander", contas);

        System.out.println(novoBanco.getNomeBanco());
        System.out.println(novoBanco.getContas());
    }
}
