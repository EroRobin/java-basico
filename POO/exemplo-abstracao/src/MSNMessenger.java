//Para que MSNMessenger possa herdar ServicoMensagemInstantanea, necessariamente ele precisa implementar
//os métodos abstratos enviarMensagem() e receberMensagem()
public class MSNMessenger extends ServicoMensagemInstantanea{

    //Chamando os métodos abstratos e colocando suas particularidades
    public void enviarMensagem(){
        System.out.println("Enviando mensagem pelo MSN Messenger");
    }
    public void receberMensagem(){
        System.out.println("recebendo mensagem pelo MSN Messenger");
    }
}