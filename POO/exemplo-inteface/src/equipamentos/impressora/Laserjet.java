package equipamentos.impressora;
//A classe Laserjet irá herdar de Impressora. Implements será usado, pois Impressora é interface
public class Laserjet implements Impressora{
    public void imprimir() {
        System.out.println("Imprimindo pela Laserjet");
    }
}
