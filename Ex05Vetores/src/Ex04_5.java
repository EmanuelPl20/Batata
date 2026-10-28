import java.util.Scanner;

public class Ex04_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas notas deseja digitar? ");
        int quantidade = scanner.nextInt();

        double[] notas = new double[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        System.out.println("\nNotas digitadas:");
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
            soma += notas[i];
        }

        double media = soma / quantidade;
        System.out.printf("Média final: %.2f%n", media);

        scanner.close();
    }
}
