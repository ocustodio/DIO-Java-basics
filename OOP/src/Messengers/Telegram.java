package Messengers;

public class Telegram extends Messenger {
    public void enviarMensagens(){
        validarConexao();
        System.out.println("Enviando mensagem pelo telegram");
        salvarHistoricoMensagem();
    }

    public void receberMensagens(){
        System.out.println("Recebendo mensagem pelo telegram");
    }

    protected void salvarHistoricoMensagem() {
        System.out.println("Salvando historico");
    }
}
