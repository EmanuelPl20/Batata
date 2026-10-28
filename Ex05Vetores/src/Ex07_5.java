import java.util.Scanner;

public class Ex07_5 {
    public static void main(String[] args) {
        int[] poltronas = new int[21];
        String[] nomePassageiros = new String[21]; // Corrigido para array String[]
        Scanner Batata = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Poltronas livres: ");
            for (int i = 1; i <= 20; i++) { // Removido o ";" que travava o for
                if (poltronas[i] == 0) {
                    System.out.print(i + " "); // Ajustado para print comum (na mesma linha)
                }
            }
            System.out.println();

            System.out.print("Informe o número da poltrona (0 para sair): ");
            numero = Batata.nextInt();
            Batata.nextLine();

            if (numero == 0) {
                break;
            }

            if (numero < 1 || numero > 20) {
                System.out.println("Poltrona inválida\n");
            } else if (poltronas[numero] == 1) {
                System.out.println("A poltrona " + numero + " já está ocupada\n");
            } else {
                System.out.print("Informe o nome do passageiro: ");
                String nome = Batata.nextLine();
                poltronas[numero] = 1;
                nomePassageiros[numero] = nome;
                System.out.println("Venda confirmada, poltrona " + numero + " reservada!\n");
            }
        } while (numero != 0);

        System.out.println("\n--- RELATÓRIO DE OCUPAÇÃO ---");
        for (int i = 1; i <= 20; i++) {
            if (poltronas[i] == 1) {
                System.out.println("Poltrona " + i + ": " + nomePassageiros[i]); // Corrigido nome da variável
            }
        }

        Batata.close();
    }
}
