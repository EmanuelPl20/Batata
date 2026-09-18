import java.util.Scanner;

public class Ex01_5 {
    public static void main(String[] args) {
        Scanner batata = new Scanner(System.in);

        System.out.println("Digite um valor em reais (use vírgula, ex: 138,68):");
        double valorDouble = batata.nextDouble();

        int totalCentavos = (int) Math.round(valorDouble * 100);
        int resto;

        // Cédulas
        int notas50 = totalCentavos / 5000;
        resto = totalCentavos % 5000;

        int notas10 = resto / 1000;
        resto = resto % 1000;

        int notas5 = resto / 500;
        resto = resto % 500;

        int notas2 = resto / 200;
        resto = resto % 200;

        // Moedas
        int moedas1 = resto / 100;
        resto = resto % 100;

        int moedas50c = resto / 50;
        resto = resto % 50;

        int moedas25c = resto / 25;
        resto = resto % 25;

        int moedas10c = resto / 10;
        resto = resto % 10;

        int moedas5c = resto / 5;
        int moedas1c = resto % 5;

        System.out.println("\n--- CÉDULAS ---");
        System.out.printf("R$50: %d | R$10: %d | R$5: %d | R$2: %d\n", notas50, notas10, notas5, notas2);

        System.out.println("\n--- MOEDAS ---");
        System.out.printf("R$1: %d | 50¢: %d | 25¢: %d | 10¢: %d | 5¢: %d | 1¢: %d\n",
                moedas1, moedas50c, moedas25c, moedas10c, moedas5c, moedas1c);

        batata.close();
    }
}
