package multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

/*Copiadora, Digitalizadora e Impressora sendo interfaces, minha classe EquipamentoMultifuncional pode herdar de todas
 elas  usando implements */
public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

    public void copiar() {
        System.out.println("Copiando via equipamento multifuncional");
    }

    public void digitalizar() {
        System.out.println("Digitalizando via equipamento multifuncional");
    }

    public void imprimir() {
        System.out.println("Imprimindo via equipamento multifuncional");
    }
}
