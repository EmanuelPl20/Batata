import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner batata = new Scanner(System.in);
        double altura = 0;
        int mais;
        int voltas = 0;
        do {
            voltas++;
            System.out.println("Digite a altura");
            altura += batata.nextDouble();
            System.out.println("Tem mais? (1 para não, 2 para sim)");
            mais = batata.nextInt();
            if (mais != 1 && mais != 2) {
                System.out.println("Dígito inválido");
                break;
            }
        } while (mais == 2);
        System.out.println("Total de repetições: " + voltas);
        System.out.println("Média de alturas: "+ altura/voltas);
    }
}