import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        System.out.println("Digite a base e, depois, a altura de um triângulo para calcularmos a área: ");
        Scanner scanner = new Scanner(System.in);
        var base = scanner.nextFloat();
        var altura = scanner.nextFloat();
        System.out.printf("A área do triângulo de base %.2f e altura %.2f é de %.2f%n", base, altura, (base * altura) / 2);
        scanner.close();
    }
}
