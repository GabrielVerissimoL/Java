import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Conta conta = new Conta(1000, 1);

        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Pagar boleto");
            System.out.println("6 - Verificar uso do cheque especial");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1 -> System.out.printf("Saldo: R$ %.2f%n", conta.getSaldo());

                case 2 -> System.out.printf(
                        "Cheque especial disponível: R$ %.2f%n",
                        conta.getChequeEspecial());

                case 3 -> {
                    System.out.print("Valor do depósito: ");
                    double deposito = scanner.nextDouble();
                    conta.depositar(deposito);
                }

                case 4 -> {
                    System.out.print("Valor do saque: ");
                    double saque = scanner.nextDouble();
                    conta.sacar(saque);
                }

                case 5 -> {
                    System.out.print("Valor do boleto: ");
                    double boleto = scanner.nextDouble();
                    conta.pagarBoleto(boleto);
                }

                case 6 -> conta.verificarChequeEspecial();

                case 0 -> System.out.println("Programa encerrado.");

                default -> System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
