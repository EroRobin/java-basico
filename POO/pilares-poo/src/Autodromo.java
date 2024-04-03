public class Autodromo {
    public static void main(String[] args) {

        Carro jeep = new Carro();
        System.out.println("Encapsulamento: ");
        //executando ligar para visualizar o encapsulamento
        jeep.ligar();

        Moto z400 = new Moto();
        System.out.println("Herança: ");
        //executando o Set para visualizar a herança
        jeep.setChassi("726376");
        z400.setChassi("786328");
        System.out.println("Chassi do carro " + jeep.getChassi());
        System.out.println("Chassi da moto "+ z400.getChassi());

        //executando o exemplo de abstração
        System.out.println("Abstração: ");
        z400.ligar();

        //executando o exemplo de Polimorfismo
        System.out.println("Polimorfismo: ");
        Veiculo x = jeep;
        x.ligar();
    }
}