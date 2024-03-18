package banco.conta;

public class Cliente {
    private String primeiroNome;
    private String segundoNome;
    private String emailCliente;
    private int idade;

    public Cliente(String primeiroNome, String segundoNome, int idade){
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
        this.idade = idade;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public String getSegundoNome() {
        return segundoNome;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public int getIdade() {
        return idade;
    }
}
