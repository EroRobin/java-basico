public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = {"José", "Julia", "Jorge", "Joaquina"};

        //em arrays o índice inicia em ZERO
        //enquanto o índice 'x' for menor que o tamanho 'length' de alunos, ele continua a execução
        for (int x = 0; x < alunos.length; x++){
            System.out.println("O aluno no índice x = " + x + " é " + alunos[x]);
        }

        //exemplo de For Each (fortemente relacionado onde contém array ou coleção
        //a cada iteração de alunos, o aluno atual vai obter um novo valor
        for (String aluno: alunos){
            System.out.println("Nome do aluno é: "+ aluno);
        }
    }
}
