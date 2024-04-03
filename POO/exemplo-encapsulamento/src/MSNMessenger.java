public class MSNMessenger {

    //encapsulando os métodos validarConectadoInternet() e salvarHistoricoMensagem()
    //Encapsulando oculta os detalhes internos de uma classe e expõe apenas as funcionalidades essenciais
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem");
    }
    //dois métodos que o usuário não precisa visualizar
    private void validarConectadoInternet(){
        System.out.println("Validando se está conectado a internet");
    }
    private void salvarHistoricoMensagem(){
        System.out.println("Salvando o histórico da mensagem");
    }
}
