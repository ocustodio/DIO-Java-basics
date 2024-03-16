package Messengers;

public abstract class Messenger {
    public abstract void enviarMensagens();
    public abstract void receberMensagens();

    protected abstract void salvarHistoricoMensagem();

    protected void validarConexao() {
        System.out.println("Validando conexao com a internet");
    }
}
