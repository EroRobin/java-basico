public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        String concatenacao;
        //A operação determina que enquanto o proximo valor for numerico ele ainda ta
        //funcionando como operador de atribuição soma. Após ele perceber que é um texto
        // ele começou a concatenar
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        //Primeiro ele realiza a soma das evidencias, pegou o resultado e viu que era
        //um carctere e entao realizou a concatenação
        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        //Atribuição
        //Aritméticos
        //Unários
        //Ternário
        //Relacionais
        //Lógicos

    }
}
