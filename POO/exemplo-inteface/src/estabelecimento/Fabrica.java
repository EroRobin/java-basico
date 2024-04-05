package estabelecimento;
/*Interface (Conceito de abstração) é a capacidade de um mesmo objeto ter propriedades e papeis diferentes em uma
aplicação.Por java não permitir heranças múltiplas, iremos usar interface para que a classe multifuncional.
EquipamentoMultifuncional tenha carcteristicas que representam outras classes */

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        // Criando um objeto 'em' que implementa várias interfaces.
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        // utilizando o polimorfismo para permitir que 'em', que é um objeto do tipo EquipamentoMultifuncional, seja
        // referenciado por diferentes tipos de interfaces.
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        // Executando as funções específicas de cada interface.
        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();

    }
}
