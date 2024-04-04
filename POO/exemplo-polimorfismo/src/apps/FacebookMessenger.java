package apps;

public class FacebookMessenger extends ServicoMensagemInstantanea {

    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook");
    }
    public void receberMensagem(){
        System.out.println("recebendo mensagem pelo Facebook");
    }
}