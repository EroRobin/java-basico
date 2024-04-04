package apps;

public abstract  class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    //somente os filhos e classes do mesmo pacote conhecem este método
    protected void validarConectadoInternet(){
        System.out.println("Validando se está conectado a internet");
    }
}