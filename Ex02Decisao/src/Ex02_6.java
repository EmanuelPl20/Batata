/*-------------------------------------------------------------------
  Ex 2.6: Ordem dos numeros
  - informar tres numeros
  - descobrir qual e o maior, o do meio e o menor

  TAREFA:
  - peça para o usuário informar três números do tipo double
  - descubra qual dos três números é o maior
  - descubra qual dos três números fica no meio
  - descubra qual dos três números é o menor
  - imprima os três valores nesta ordem: maior, do meio e menor

  DICA:
  - use decisões para comparar os três números
  - os números podem ser informados em qualquer ordem
-------------------------------------------------------------------*/
import java.util.Scanner;

public class Ex02_6 {
    public static void main(String[] args) {
        Scanner batata = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        double n1 = batata.nextDouble();

        System.out.println("Informe o segundo número: ");
        double n2 = batata.nextDouble();

        System.out.println("Informe o terceiro número: ");
        double n3 = batata.nextDouble();

        double maior, meio, menor;

        if (n1 >= n2 && n1 >= n3) {
            maior = n1;
            if (n2 >= n3) {
                meio = n2;
                menor = n3;
            } else {
                meio = n3;
                menor = n2;
            }
        } else if (n2 >= n1 && n2 >= n3) {
            maior = n2;
            if (n1 >= n3) {
                meio = n1;
                menor = n3;
            } else {
                meio = n3;
                menor = n1;
            }
        } else {
            maior = n3;
            if (n1 >= n2) {
                meio = n1;
                menor = n2;
            } else {
                meio = n2;
                menor = n1;
            }
        }

        System.out.printf("Ordem decrescente: %.2f, %.2f, %.2f%n", maior, meio, menor);
    }
}
