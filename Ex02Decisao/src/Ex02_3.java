import java.util.Random;
import java.util.Scanner;

public class Ex02_3 {
    public static void main(String[] args) {
        Scanner batata = new Scanner(System.in);

        Random random = new Random();
        int numeroSorteado = random.nextInt(3) + 1;

        int chute;
        System.out.println("Qual o seu chute (entre 1 e 3)?");
        chute = batata.nextInt();

        if (chute < 1 || chute > 3) {
            System.out.println("Chute inválido! Você deve digitar um número entre 1 e 3");
        }
        else if (chute == numeroSorteado) {
            System.out.println("Você acertou! O número era " + numeroSorteado);
        }
        else {
            System.out.println("Você errou! O número sorteado era " + numeroSorteado);
        }
    }
}
