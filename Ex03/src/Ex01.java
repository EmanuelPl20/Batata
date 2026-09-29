import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner Batata = new Scanner(System.in);

        String texto;
        int voltas = 0;
        do{
            System.out.print("Digite qualquer palavra: ");
            texto = Batata.next();
            voltas++;
        }while( (voltas < 3) && (!texto.equalsIgnoreCase("Banana")) );
        System.out.print("Você tentou "+voltas+" vezes\n");
    }
}
