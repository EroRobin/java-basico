//Colocando abstract na classe ServicoMensagemInstantanea faz com que os métodos abstratos que serão herdados por outras
//classes sejam obrigatórios, e cada um pode ter sua particularidade, contanto que os métodos enviarMensagem() e receberMensagem() sejam chamados.

public abstract  class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();
}