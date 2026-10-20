import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Ex05_5 {
    public static void main(String[] args) {
        var arcoIris = List.of("vermelho", "laranja", "amarelo", "verde", "azul", "anil", "violeta");
        var coresAcertadas = new HashSet<String>();

        int acertos = 0;
        int erros = 0;
        var scanner = new Scanner(System.in);

        System.out.println("Tente adivinhar as 7 cores do arco-íris! (Ou digite 'desisto' para sair)");

        while (coresAcertadas.size() < 7) {
            System.out.print("Informe uma cor: ");
            String entrada = scanner.nextLine().trim().toLowerCase();

            if (entrada.equals("desisto")) {
                System.out.println("Você desistiu do jogo.");
                break;
            }

            if (arcoIris.contains(entrada)) {
                if (coresAcertadas.contains(entrada)) {
                    System.out.println("Você já acertou essa cor antes!");
                } else {
                    coresAcertadas.add(entrada);
                    acertos++;
                    System.out.println("Acertou! Faltam " + (7 - coresAcertadas.size()) + " cores.");
                }
            } else {
                erros++;
                System.out.println("Essa cor não está no arco-íris.");
            }

            System.out.println("Placar atual -> Acertos: " + acertos + " | Erros: " + erros + "\n");
        }

        if (coresAcertadas.size() == 7) {
            System.out.println("Parabéns! Você acertou todas as 7 cores do arco-íris!");
        }

        System.out.println("Fim do programa. Total de acertos: " + acertos + ", Erros: " + erros);
        scanner.close();
    }
}
