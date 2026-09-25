import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner Batata = new Scanner(System.in);

        String texto;
        int voltas = 0;
        do{
            System.out.print("Digite qualquer palavra: ");
            texto = Batata.next();
            voltas++; // soma mais 1 em voltas
        }while(!texto.equalsIgnoreCase("Otorrinolaringologista"));
        System.out.print("Você tentou "+voltas+" vezes\n");
    }
}
