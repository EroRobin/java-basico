package equipamentos.digitalizadora;
//A classe Scanner irá herdar de Digitalizadora. Implements será usado, pois Digitalizadora é interface
public class Scanner implements Digitalizadora{

    public void digitalizar() {
        System.out.println("Digitalizando");
    }
}
