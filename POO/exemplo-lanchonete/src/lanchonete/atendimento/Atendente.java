package lanchonete.atendimento;

public class Atendente {
    public void servindoMesa(){
        System.out.println("Servindo a mesa");
        pegarLancheCozinha();
    }
    private void pegarLancheCozinha(){
        System.out.println("Pegando o lanche na cozinha");
    }
    public void receberPagamento(){
        System.out.println("Recebendo pagamento");
    }
     void trocarGas(){
        System.out.println("Atendente trocando o gas");
    }
    private void pegarPedidoBalcao(){
        System.out.println("Pegando o pedido no balcao");
    }
}
