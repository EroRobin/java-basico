//Extends fará com que Carro seja uma subclasse que poderá herdar os campos e métodos da superclasse Veiculo.
//A subclasse herda todos os membros públicos e protegidos da superclasse, mas não pode herdar membros privados.
public class Carro extends Veiculo{
    //Fazendo o encapsulamento dos métodos confereCombustivel e confereCambio
    public void ligar(){
        confereCambio();
        confereCombustivel();
        System.out.println("Carro está ligado!");

    }
    private void confereCombustivel(){
        System.out.println("Conferindo combustivel");
    }
    private void confereCambio(){
        System.out.println("Conferindo cambio em P");
    }

}