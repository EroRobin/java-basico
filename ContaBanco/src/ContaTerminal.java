import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
    //TODO: Exibir as mensagens para o nosso usuario
        // Obter pela scanner os valores digitados no terminal
        //Exibir a mensagem conta criada

        Scanner sc = new Scanner(System.in);
        ContaCliente contaCliente = new ContaCliente();

        System.out.println("----Olá, seja bem-vindo(a)----." +
                "\n Coloque suas informações abaixo");

        System.out.println("Informe seu numero: ");
        contaCliente.numero = Integer.parseInt(sc.nextLine());

        System.out.println("Informe o número da sua Agência: ");
        contaCliente.agencia = sc.nextLine();

        System.out.println("Informe seu nome: ");
        contaCliente.nomecliente = sc.nextLine();

        System.out.println("Informe o seu saldo: ");
        contaCliente.saldo = sc.nextDouble();



        System.out.println("Olá " + contaCliente.nomecliente +
                ", obrigado por criar uma conta em nosso banco, sua agência é "
                + contaCliente.agencia + ", conta " + contaCliente.numero +
                " e seu saldo " +contaCliente.saldo+ " ja está disponível para saque");

        sc.close();

    }
}