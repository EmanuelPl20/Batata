import java.util.Scanner;

public class Ex08_5 {
    public static void main(String[] args) {
        Scanner Batata = new Scanner(System.in);
        int numero;
        boolean parar = false;
        char confirmar;
        int[] candidatos = new int[4];
        String[] nomes = {"VOTO NULO", "FLAMINGO FULEIRO", "JACARÉ JUVENAL", "MORCEGO MARCELO"};

        System.out.println("Candidatos:\n1-FLAMINGO FULEIRO\n2-JACARÉ JUVENAL\n3-MORCEGO MARCELO");
        do {
            System.out.println("Informe o número do candidato (999 para encerrar)");
            numero = Batata.nextInt();
            Batata.nextLine();
            if (numero >= 1 && numero <= 3) {
                System.out.println("Confirma o voto em " + nomes[numero] + "? (S+N)");
                confirmar = Batata.nextLine().charAt(0);
                if (confirmar == 's' || confirmar == 'S') {
                    candidatos[numero]++;
                }
            } else if (numero == 999) {
                parar = true;
            } else {
                System.out.println("Confirma o voto em VOTO NULO? (S+N)");
                confirmar = Batata.nextLine().charAt(0);
                if (confirmar == 's' || confirmar == 'S') {
                    candidatos[0]++;
                }
            }
        }
        while (!parar);
        System.out.println("-------RELATÓRIO DE VOTOS--------");
        System.out.println("Voto Nulo: " + candidatos[0]);
        System.out.println("Flamingo Fuleiro: " + candidatos[1]);
        System.out.println("Jacaré Juvenal: " + candidatos[2]);
        System.out.println("Morcego Marcelo: " + candidatos[3]);

        Batata.close();
    }
}
