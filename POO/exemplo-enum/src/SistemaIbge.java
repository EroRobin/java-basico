

public class SistemaIbge {
    public static void main(String[] args) {
        //Imprimindo todas as opções do enum
        //e recebe os valores do estdado brasileiro
        for(EstadoBrasileiro e : EstadoBrasileiro.values()){
            System.out.println(e.getSigla() + " - " + e.getNome());
        }
        System.out.println();
        //selecionando um estado brasileiro de forma especifica
        EstadoBrasileiro eb = EstadoBrasileiro.PIAUI;
        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.getNomeMaiusculo());
        System.out.println(eb.getIbge());
    }
}
