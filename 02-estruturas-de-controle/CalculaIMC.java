import java.util.Scanner;

public class CalculaIMC {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite o peso (kg) e a altura (m)\n");
        var peso = scanner.nextDouble();
        var altura = scanner.nextDouble();

        var imc = peso / (altura * altura);

        if (imc <= 18.5)
            System.out.println("Abaixo do peso");
        else if (imc >= 18.6 && imc <= 24.9)
            System.out.println("Peso ideal");
        else if (imc >= 25.0 && imc <= 34.9)
            System.out.println("Levemente acima do peso");
        else
            System.out.println("Obesidade");
    }
}
