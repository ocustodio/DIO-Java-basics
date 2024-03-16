package Messengers;

public class MSNMessenger extends Messenger {
    public void enviarMensagens() {
        validarConexao();
        System.out.println("Enviando mensagem pelo msn");
        salvarHistoricoMensagem();
    }

    public void receberMensagens(){
        System.out.println("Recebendo mensagem pelo msn");
    }

    protected void salvarHistoricoMensagem() {
        System.out.println("Salvando historico");
    }
}
