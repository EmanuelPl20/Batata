import java.util.Scanner;

public class Ex06_5 {
    public static void main(String[] args) {
        int[] limitesMinimos = {0, 55, 65, 75, 85, 100};
        String[] categorias = {"pena", "leve", "médio", "meio-pesado", "pesado", "super-pesado"};

        Scanner Batata = new Scanner(System.in);
        System.out.print("Digite o peso do atleta (em kg): ");
        double peso = Batata.nextDouble();

        String categoriaEncontrada = "Inválida";

        for (int i = limitesMinimos.length - 1; i >= 0; i--) {
            if (peso >= limitesMinimos[i]) {
                categoriaEncontrada = categorias[i];
                break;
            }
        }

        System.out.println("O peso de " + peso + "kg se enquadra na categoria: " + categoriaEncontrada);
        Batata.close();
    }
}
