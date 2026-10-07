import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Quanto é 2 + 2?");
        var resultado = scanner.nextInt();
        System.out.printf("O resultado é 4, você acertou? (%s)%n", resultado == 4);

        System.out.println("Quantos anos você tem?");
        var idade = scanner.nextInt();
        System.out.println("Você é emancipado?");
        var emancipado = scanner.nextBoolean();
        System.out.printf("Você pode dirigir? (%s)%n", idade > 17 || (emancipado && idade >= 16));
    }
}
