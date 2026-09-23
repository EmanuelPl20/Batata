/*-------------------------------------------------------------------
    Ex 2.1: Subtotal e raspadinhas
    - informar o valor da compra
    - dar raspadinhas de brinde para compras acima de R$ 100

    TAREFA:
    - peça para o usuário informar o valor em reais da compra
    - se o valor for maior que R$ 100, calcule quantas raspadinhas o
      cliente deve receber: uma raspadinha para cada R$ 100
    - imprima a quantidade de raspadinhas recebidas

    ATENÇÃO:
    - não pode existir uma quantidade fracionária de raspadinhas
    - use a função Math.round() para arredondar a quantidade calculada
    - uma forma de calcular é: Math.round(valor / 100.0)
-------------------------------------------------------------------*/

import java.util.Scanner;

public class Ex02_1 {
    public static void main(String[] args) {
        Scanner batata = new Scanner(System.in);
        double valor;
        System.out.println("Informe o valor da compra: ");
        valor = batata.nextDouble();
        if (valor >= 100) {
            System.out.println("A quantidade de raspasdinhas recebida será: " + Math.round(valor / 100));
        }
        System.out.println("Compra finalizada");


    }
}
