package candidatura;

import java.util.Scanner;

public class ProcessoSeletivo {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        imprimirSelecionados();

    }
    static void imprimirSelecionados(){
        String [] candidatos = {"Antonio", "Jose", "Marcia","Monica", "Pablo"};
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");

        for (int indice=0; indice < candidatos.length; indice++){
            System.out.println("O candidato de número " + (indice+1) + " é o " + candidatos[indice]);
        }
        System.out.println("Forma abreviada de iteração for each");
        for (String candidato: candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }
    static void selecaoCandidatos(){
        Scanner sc = new Scanner(System.in);

        //lista dos candidatos
        String [] candidatos = {"Antonio", "Jose", "Marcia","Monica", "Pablo", "Michele", "Savio","Daniela","Cleiton", "Gabriela"};

        //Quantida de candidatos selecionados até o momento
        int candidatosSelecionados = 0;
        //candidatosAtual será o índice do nosso array
        int candidatosAtual=0;
        double salarioBase = 2000;

        /*Serão selecionados apenas 5 candidatos, mas só será selecionado enquanto
         tiver pessoas para buscar na lista de candidatos */
        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){

            //verificação de cada candidato
            String candidato = candidatos[candidatosAtual];

            System.out.println("Qual a sua pretenção de salário? ");
            double salarioPretendido = sc.nextDouble();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);

            if (salarioBase>=salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                //Selecionando o candidato
                candidatosSelecionados++;
            }else{
                System.out.println("O candidato " + candidato + " não foi selecionado para a vaga");
            }
            //Pulando para o próximo candidato após a verificação
            candidatosAtual++;
        }
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase>salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if (salarioBase==salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }

}
