/*-------------------------------------------------------------------
  Ex 1.4: Ovos das galinhas
  - calcular quantas caixas de ovos cheias podem ser levadas ao mercado
  - calcular quantos ovos sobram

  TAREFA:
  - peça para o usuário informar quantos ovos suas galinhas botaram no dia
  - considere que cada caixa comporta 12 ovos
  - calcule e imprima quantas caixas cheias ele poderá levar ao mercado
  - calcule e imprima quantos ovos sobram
  - use a operação de divisão inteira (/) e resto da divisão (%)
-------------------------------------------------------------------*/
import java.util.Scanner;
public class Ex01_4 {
    public static void main(String[] args) {
        Scanner batata = new Scanner(System.in);
        System.out.println("Quantos ovos as galinhas botaram hoje?");
        int ovos = batata.nextInt();
        System.out.println("Certo, o total de ovos é de " + ovos);
        int caixas = ovos / 12;
        int sobra = ovos % 12;
        System.out.printf("Você consegue lotar %d caixas de ovos, sobram: %d",caixas, sobra);

    }
}
