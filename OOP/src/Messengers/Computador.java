package Messengers;

public class Computador {
    public static void main(String[] args) {
       Messenger servicoMensagem = null;

       String appEscolhido = "msn";

       if(appEscolhido.equals("msn")) {
        servicoMensagem = new MSNMessenger();
       }

       if(appEscolhido.equals("facebook")) {
        servicoMensagem = new FacebookMessenger();
       }

       if(appEscolhido.equals("telegram")) {
        servicoMensagem = new Telegram();
       }

       servicoMensagem.enviarMensagens();
       servicoMensagem.receberMensagens();
    }
}
