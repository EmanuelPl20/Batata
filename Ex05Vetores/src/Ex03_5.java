import java.util.List;
import java.util.Scanner;

public class Ex03_5 {
    public static void main(String[] args) {
        var empresas = List.of(
                "Dr. Silva, Dentista",
                "Contabilidade Silva",
                "Dr. Silva, Cardiologista",
                "Silvana Silva, Manicure",
                "Silva & Silva Advogados Associados"
        );

        var scanner = new Scanner(System.in);
        System.out.print("Digite o número do escritório (101 a 105): ");
        int numero = scanner.nextInt();

        int indice = numero - 101;

        if (indice >= 0 && indice < empresas.size()) {
            System.out.println("Empresa na sala " + numero + ": " + empresas.get(indice));
        } else {
            System.out.println("Erro: Esse número de escritório não existe.");
        }
        scanner.close();
    }
}
