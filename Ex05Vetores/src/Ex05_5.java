import java.util.Scanner;

public class Ex05_5 {
    public static void main(String[] args) {
        String[] arcoIris = {"vermelho", "laranja", "amarelo", "verde", "azul", "anil", "violeta"};
        int acertos = 0;
        int erros = 0;
        Scanner Batata = new Scanner(System.in);

        System.out.println("Adivinhe as cores do arco-íris! (Ou digite 'desisto')");

        while (acertos < 7) {
            System.out.print("Informe uma cor: ");
            String entrada = Batata.nextLine().trim().toLowerCase();

            if (entrada.equals("desisto")) {
                System.out.println("Você desistiu.");
                break;
            }

            boolean encontrou = false;
            for (int i = 0; i < arcoIris.length; i++) {
                if (arcoIris[i].equals(entrada)) {
                    encontrou = true;
                    break;
                }
            }

            if (encontrou) {
                acertos++;
                System.out.println("Acertou uma cor!");
            } else {
                erros++;
                System.out.println("Essa cor não está no arco-íris.");
            }

            System.out.println("Acertos: " + acertos + " | Erros: " + erros + "\n");
        }

        System.out.println("Fim do programa. Acertos: " + acertos + ", Erros: " + erros);
        Batata.close();
    }
}
