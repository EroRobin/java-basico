package equipamentos.impressora;
//A classe Deskjet irá herdar de Impressora. Implements será usado, pois Impressora é interface
public class Deskjet implements Impressora {
    public void imprimir() {
        System.out.println("Imprimindo");
    }
}
