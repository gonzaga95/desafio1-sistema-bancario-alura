import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {

        String nomeCliente = "Gato Felix";
        double saldo = 200.00;

        System.out.println("####################################");
        System.out.println("Bem-vinde ao Banco Interativo Java");
        System.out.println("\nCliente: "+nomeCliente);
        System.out.println("Saldo atual: "+saldo);
        System.out.println("####################################");

        int opcaoSelecionada = 0;
        Scanner Scanner = new Scanner(System.in);

        while (opcaoSelecionada != 9) {
            System.out.println("""
                    Selecione uma opção:
                    
                    [1] Consultar saldo
                    [2] Depositar valor
                    [3] Retirar valor
                    [9] Sair
                    """);
            opcaoSelecionada = Scanner.nextInt();
            switch (opcaoSelecionada) {
                case 1:
                    System.out.println("Seu saldo é de: R$ " + saldo);
                    break;
                case 2:
                    System.out.println("Insira o valor a depositar: ");
                    double valorDeposito = Scanner.nextDouble();
                    saldo += valorDeposito;
                    break;
                case 3:
                    System.out.println("Insira o valor a retirar: ");
                    double valorRetirada = Scanner.nextDouble();
                    if (valorRetirada > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo -= valorRetirada;
                    }
                    break;
                case 9:
                    continue;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
