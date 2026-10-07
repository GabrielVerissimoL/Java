import java.util.Scanner;

public class DiferencaIdades {
    public static void main(String[] args) {
        System.out.println("Digite a idade das duas pessoas para calcularmos a diferença: ");
        Scanner scanner = new Scanner(System.in);
        var idade1 = scanner.nextInt();
        var idade2 = scanner.nextInt();
        System.out.printf("A diferença de idade é de %d anos%n", Math.abs(idade1 - idade2));
    }
}
