import java.util.Scanner;

public class ParesEImpares {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.printf("Digite o valor inicial:%n");
        int inicio = scanner.nextInt();
        System.out.printf("Digite o valor final:%n");
        int fim = scanner.nextInt();

        System.out.printf("Digite se você quer pares (true) ou ímpares (false):%n");
        boolean par = scanner.nextBoolean();

        if (par && inicio % 2 == 0) {
            for (int i = inicio; i <= fim; i += 2) {
                System.out.printf("%d%n", i);
            }
        } else if (par) {
            inicio++;
            for (int i = inicio; i <= fim; i += 2) {
                System.out.printf("%d%n", i);
            }
        } else if (!par && inicio % 2 != 0) {
            for (int i = inicio; i <= fim; i += 2) {
                System.out.printf("%d%n", i);
            }
        } else {
            inicio++;
            for (int i = inicio; i <= fim; i += 2) {
                System.out.printf("%d%n", i);
            }
        }

        scanner.close();
    }
}
