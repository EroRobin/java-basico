package multifuncional;

/*Interface (Conceito de abstração) é a capacidade de um mesmo objeto ter propriedades e papeis diferentes em uma
aplicação.Por java não permitir heranças múltiplas, iremos usar interface para que a classe multifuncional.
EquipamentoMultifuncional tenha carcteristicas que representam outras classes */

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
