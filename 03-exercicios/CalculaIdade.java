import java.util.Scanner;

public class CalculaIdade {
    public static void main(String[] args) {
        System.out.println("Digite o ano do seu nascimento: ");
        Scanner scanner = new Scanner(System.in);
        int anoNascimento = scanner.nextInt();
        System.out.println("Olá, você tem " + (2026 - anoNascimento) + " anos.");
        scanner.close();
    }
}
