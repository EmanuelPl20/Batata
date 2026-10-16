import java.util.Scanner;

public class Ex01_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // pergunta qual a linha de produto (1,2 ou 3)
        // pergunta a quantidade do produto
        // no fim diz quanto de cada linha vendeu
        int produto;
        int quant;

        int[] vendas = new int[3];
        vendas[0] = 0; // vendas produto 1
        vendas[1] = 0; // vendas produto 2
        vendas[2] = 0; // vendas produto 3

        String continua;

        // repete até dizer que não quer mais
        do {
            System.out.print("Produto: ");
            produto = entrada.nextInt();
            System.out.print("Quantidade: ");
            quant = entrada.nextInt();

            // soma o total daquele produto
            // vendas.length = tamanho do vendas
            if (produto >= 1 && produto <= vendas.length) {
                vendas[produto - 1] += quant;
            } else {
                System.out.println("Digite apenas de 1 a 3 no produto!");
            }

            System.out.println("Quer continuar (S/N):");
            continua = entrada.next();

        } while (continua.equalsIgnoreCase("S"));

        for (int i = 0; i < vendas.length; i++) {
            System.out.println("Total produto " + (i + 1) + ": " + vendas[i]);
        }
    }
}
