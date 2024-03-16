package Messengers;

public class FacebookMessenger extends Messenger{
    public void enviarMensagens(){
        validarConexao();
        System.out.println("Enviando mensagem pelo facebook");
        salvarHistoricoMensagem();
    }

    public void receberMensagens() {
        System.out.println("Recebendo mensagem pelo facebook");
    }

    
    protected void salvarHistoricoMensagem() {
        System.out.println("Salvando historico");
    }
}
