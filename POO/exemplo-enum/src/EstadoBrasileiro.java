import java.util.Locale;

//Criação de enum é para apenas valores pré-estabelecidos e com a certeza
// de não haver tanta alteração de valores.
public enum EstadoBrasileiro {
    SAO_PAULO ("SP","São Paulo",1),
    RIO_JANEIRO ("RJ","Rio de Janeiro",2),
    PIAUI("PI","Piauí",3),
    MARANHAO("MA","São Paulo",4),
    CEARA("CE","Ceará",5);

    private String nome;
    private String sigla;
    private int Ibge;

    //Método para inicialização do enum
    private EstadoBrasileiro(String sigla, String nome, int Ibge){
        this.sigla = sigla;
        this.nome = nome;
        this.Ibge = Ibge;
    }

    public int getIbge() {
        return Ibge;
    }

    public String getSigla() {
        return sigla;
    }
    public String getNome() {
        return nome;
    }
    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }
}
