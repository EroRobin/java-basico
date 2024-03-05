public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int numero = 1; numero < 5; numero ++){
            if (numero == 3)
                break;
            /* Caso coloque o continue no lugar do break, ele não irá imprimir o número 3.
            Ele não para o for completamente, apenas muda o fluxo da iteração.
             */
            System.out.println(numero);
        }
    }
}
