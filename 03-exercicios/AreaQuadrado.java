import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        System.out.println("Digite o lado do quadrado para calcularmos a área: ");
        Scanner scanner = new Scanner(System.in);
        var lado = scanner.nextInt();
        System.out.printf("O quadrado de lado %d tem área de %d%n", lado, lado * lado);
    }
}
