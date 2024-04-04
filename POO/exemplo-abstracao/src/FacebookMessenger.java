//Para que FacebookMessenger possa herdar ServicoMensagemInstantanea, necessariamente ele precisa implementar
//os métodos abstratos enviarMensagem() e receberMensagem()
public class FacebookMessenger extends ServicoMensagemInstantanea{

    //Chamando os métodos abstratos e colocando suas particularidades
    public void enviarMensagem(){
            System.out.println("Enviando mensagem pelo Facebook");
        }
    public void receberMensagem(){
        System.out.println("recebendo mensagem pelo Facebook");
    }
}