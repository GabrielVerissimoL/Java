import java.util.Scanner;

public class EntradaDados {

    private final static String MENSAGEM_BOAS_VINDAS = "Olá, informe o seu nome";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(MENSAGEM_BOAS_VINDAS);
        var nome = scanner.next();
        System.out.println("Informe a sua idade");
        var idade = scanner.nextInt();
        System.out.printf("Olá, %s! Sua idade é: %d%n", nome, idade);
    }
}
