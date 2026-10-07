import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe um número para calcularmos a tabuada\n");
        var entrada = scanner.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.printf("%d x %d = %d%n", entrada, i, entrada * i);
        }
    }
}
