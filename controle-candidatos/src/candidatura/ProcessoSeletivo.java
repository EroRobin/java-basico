package candidatura;

import java.util.Scanner;

public class ProcessoSeletivo {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Processo seletivo");

        System.out.println("Qual a sua pretenção de salário? ");
        double salarioPretendido = sc.nextDouble();
        analisarCandidato(salarioPretendido);
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
