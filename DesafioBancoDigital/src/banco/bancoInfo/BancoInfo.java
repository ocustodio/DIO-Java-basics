package banco.bancoInfo;

import java.util.ArrayList;
import banco.conta.Conta;

public class BancoInfo {
    private String nomeBanco;
    private ArrayList<Conta> contas;

    public BancoInfo(String nomeBanco, ArrayList<Conta> contas) {
        this.nomeBanco = nomeBanco;
        this.contas = contas;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }
}
