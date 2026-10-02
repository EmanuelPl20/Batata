import java.util.Scanner;

public class Ex04_01 {
    public static void main(String[] args) {
        /*
    - leia a idade e se a pessoa é estudante (s/n)
    - repita até o usuário informar que não deseja cadastrar outra pessoa
    - ao final, calcule e mostre a média de idade dos estudantes
      e a média de idade dos não estudantes

    PERGUNTAS:
    - que variáveis você precisa para calcular a média de idade dos estudantes?
    - que variáveis você precisa para calcular a média de idade dos não estudantes?
    - como você vai saber quando parar de ler os dados das pessoas?

    ATENÇÃO:
    - idade, soma e quantidade são valores inteiros
    - para obter uma média com casas decimais, converta um dos inteiros
      para double antes da divisão: (double) soma / quantidade
*/
        Scanner batata = new Scanner(System.in);
        char cadastro;
        int idade = 0;
        char ehEstudante;
        int estudantes = 0;
        int idadeEstudantes = 0;
        int naoEstudantes = 0;
        int idadeNaoEstudantes = 0;
        System.out.println("Deseja iniciar o cadastro?");
        cadastro = batata.nextLine().toLowerCase().trim().charAt(0);
        if (cadastro == 's') {
            do {
                boolean idadeValida = false;
                while (!idadeValida) {
                    try {
                        System.out.print("Digite a idade da pessoa: ");
                        idade = Integer.parseInt(batata.nextLine().trim());
                        idadeValida = true;
                    } catch (NumberFormatException erro) {
                        System.out.println("[ERRO] Ei, você digitou letras ou um número grande demais!");
                    }
                }
                System.out.println("A pessoa é estudante? (s/n)");
                ehEstudante = batata.nextLine().toLowerCase().trim().charAt(0);
                if (ehEstudante == 's') {
                    estudantes++;
                    idadeEstudantes += idade;
                } else {
                    naoEstudantes++;
                    idadeNaoEstudantes += idade;
                }
                System.out.println("Deseja cadastrar outra pessoa? (s/n)");
                cadastro = batata.nextLine().toLowerCase().trim().charAt(0);
            } while (cadastro == 's');
            System.out.println("-----=========RESULTADOS FINAIS=========-----");
            if (estudantes > 0) {
                System.out.println("A média da idade dos estudantes foi de: " + (double) idadeEstudantes / estudantes + " anos");
            } else {
                System.out.println("Nenhum estudante cadastrado");
            }
            if (naoEstudantes > 0) {
                System.out.println("A média da idade dos não estudantes foi de: " + (double) idadeNaoEstudantes / naoEstudantes + " anos");
            } else {
                System.out.println("Nenhum não estudante cadastrado");
            }

        } else {
            System.out.println("Fechando cadastro..");
        }
    }
}