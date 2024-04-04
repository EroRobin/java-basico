package comp;

import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.TelegramMessenger;

public class ComputadorUsuario {
    public static void main(String[] args) {
        //smi  não referencia nenhum objeto
        ServicoMensagemInstantanea smi = null;
    //Não se qual vai escolher, mas qualquer um deverá enviar e receber mensagem

        //pode escolher qualquer um dos 3: "msn", "fbm" ou "tlg"
        String appEscolhido = "msn";

        if(appEscolhido.equals("msn"))
            //atribuindo um objeto na variavel
            smi = new MSNMessenger();
        else if (appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
        else if (appEscolhido.equals("tlg"))
            smi = new TelegramMessenger();

        smi.enviarMensagem();
        smi.receberMensagem();

    }
}