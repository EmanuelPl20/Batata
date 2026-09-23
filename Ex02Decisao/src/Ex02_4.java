/*-------------------------------------------------------------------
  Ex 2.4: Entrada de cinema
  - perguntar a idade da pessoa
  - perguntar se a pessoa e estudante
  - calcular o valor da entrada

  TAREFA:
  - peça para o usuário informar a idade como um número inteiro
  - peça para o usuário informar se é estudante usando um char (S/N)
  - considere que o valor normal da entrada é R$ 30,00
  - menores de 18 anos, com idade de 1 a 17, pagam meia entrada
  - estudantes também pagam meia entrada
  - ao final, imprima o valor que a pessoa deve pagar

  DICA:
  - a pessoa paga meia entrada se for menor de idade OU estudante
  - use uma decisão para verificar as duas possibilidades
  - meia entrada corresponde à metade de R$ 30,00
  - lembre-se que a pessoa pode digitar 's' ou 'S' para sim, 
    e 'n' ou 'N' para não

  DESAFIO:
    - crie uma variável booleana chamada eEstudante que seja true 
      se a pessoa for estudante e false caso contrário
    - depois de terminar, conceda desconto de 10% para pessoas 
      com mais de 60 anos (mas não acumula se for estudante)
-------------------------------------------------------------------*/

import java.util.Scanner;

public class Ex02_4 {
    public static void main(String[] args) {
        Scanner batata = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        int idade = batata.nextInt();

        System.out.println("Você é estudante? (S/N): ");
        char estudanteChar = batata.next().charAt(0);

        boolean eEstudante = (estudanteChar == 'S' || estudanteChar == 's');
        double valorEntrada = 30.00;

        if (idade < 18 || eEstudante) {
            valorEntrada = 15.00;
        } else if (idade > 60) {
            valorEntrada = 30.00 * 0.90;
        }

        System.out.printf("O valor da entrada é: R$ %.2f%n", valorEntrada);

        batata.close();
    }
}


