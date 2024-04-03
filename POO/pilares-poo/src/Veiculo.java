//Abstract faz a classe Veiculo seja uma classe abstrata
public abstract class Veiculo {
    //Criando atributo chassi para exemplificar herança
    private String chassi;

    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    //Definir método abstrato ligar() faz com que toda classe que estender "Veiculo" será obrigada a implementar esse método.
    public abstract void ligar();
}
