public class Usuario {
    public static void main(String[] args) {

        SmartTV smartTV = new SmartTV();

        System.out.println("Canal atual: " + smartTV.canal);

        smartTV.mudarCanal(26);

        System.out.println("Volume atual: " + smartTV.volume);
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();
        System.out.println("Volume atual: " + smartTV.volume);

        System.out.println("TV ligada? " + smartTV.ligada);
        System.out.println("TV qual canal está: " + smartTV.canal);
        System.out.println("TV que volume está: " + smartTV.volume);

        smartTV.ligar();
        System.out.println("TV ligada? " + smartTV.ligada);

        smartTV.desligar();
        System.out.println("TV ligada? " + smartTV.ligada);
    }
}