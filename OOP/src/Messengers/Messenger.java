package Messengers;

public class Messenger {
    public void enviarMensagens() {
        validandoConexao();
        System.out.println("Enviando mensagem");
        salvarHistorico();
    }

    public void receberMensagem() {
        validandoConexao();
        System.out.println("Recebendo mensagem");
        salvarHistorico();
    }

    private void validandoConexao() {
        System.out.println("Validando se esta conectado a internet");
    }

    private void salvarHistorico() {
        System.out.println("Salvando historico de mensagens");
    }
}
