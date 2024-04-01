public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    //Método construtor, onde o nome deve ser igual ao nome da classe
    public Pessoa(String cpf, String nome){
        /* this é para distinguir o parâmetro recebido pelo método do atributo da própria instância.
        * this.cpf se refere ao atributo cpf da instância da classe, enquanto cpf se refere ao parâmetro
        * recebido pelo construtor*/
        this.cpf = cpf;
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
