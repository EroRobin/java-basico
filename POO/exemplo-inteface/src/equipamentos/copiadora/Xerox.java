package equipamentos.copiadora;
//A classe Xerox irá herdar de Copiadora. Implements será usado, pois copiadora é interface
public class Xerox implements Copiadora{
    public void copiar() {
        System.out.println("Copiando");
    }
}
