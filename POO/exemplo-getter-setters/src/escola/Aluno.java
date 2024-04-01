package escola;

public class Aluno {
   private String nome;
   private int idade;

   //o método Getter retorna o valor do atributo especificado
   // o método Setter define outro novo valor para o atributo especificado
   public String getNome(){
       return nome;
   }
   public void setNome(String newNome){
       nome = newNome;
   }
   public int getIdade(){
       return idade;
   }
   public void setIdade(int newIdade){
       this.idade = newIdade;
   }
}
