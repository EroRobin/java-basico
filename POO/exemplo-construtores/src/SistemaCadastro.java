public class SistemaCadastro {
    public static void main(String[] args) {
        //criando uma pessoa no  sistema
        //Pessoa se refere a classe, enquanto marcos é o objeto da classe

        /*A finalidade do construtor é garantir que na inicialização do objeto
        *seja informado dados ou atributos que são extramemente relevantes para criação do objeto*/
        Pessoa marcos = new Pessoa("111.111-11","Marcos");

        //Definindo o endereço da pessoa fora do construtor pois não tem tanta relevância quanto nome e cpf
        marcos.setEndereco("Rua das marias");

    }

}
