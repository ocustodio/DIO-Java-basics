package Messengers;

public class Computador {
    public static void main(String[] args) {
        MSNMessenger msn = new MSNMessenger();
        Telegram telegram = new Telegram();
        FacebookMessenger fMessenger = new FacebookMessenger();
        msn.enviarMensagens();
        msn.receberMensagens();
        fMessenger.enviarMensagens();
        telegram.enviarMensagens();
    }
}
