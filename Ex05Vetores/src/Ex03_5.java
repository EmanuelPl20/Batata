import java.util.Scanner;

public class Ex03_5 {
    public static void main(String[] args) {
        String[] empresas = {
                "Dr. Silva, Dentista",
                "Contabilidade Silva",
                "Dr. Silva, Cardiologista",
                "Silvana Silva, Manicure",
                "Silva & Silva Advogados Associados"
        };

        // Mudança aqui: trocamos 'var' pelo tipo explícito 'Scanner'
        Scanner Batata = new Scanner(System.in);

        System.out.print("Digite o número do escritório (101 a 105): ");
        int numero = Batata.nextInt();

        int indice = numero - 101;

        if (indice >= 0 && indice < empresas.length) {
            System.out.println("Empresa na sala " + numero + ": " + empresas[indice]);
        } else {
            System.out.println("Erro: Esse número de escritório não existe.");
        }

        Batata.close();
    }
}
