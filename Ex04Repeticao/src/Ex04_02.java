
import java.util.Scanner;

public class Ex04_02 {
            /*
O elevador pode levar no máximo 5 pessoas ou 300 kg.
Pergunte o peso de cada pessoa e informe quantas pessoas e quantos quilos já estão no elevador.
Se a pessoa ultrapassar o limite de peso, ela não pode entrar. Repita enquanto houver lugar e pessoas na fila.
Ao final, imprima "subindo com N pessoas e X kg".

    SUGESTÃO:
crie constantes para o limite de pessoas e peso

    PERGUNTAS:
    - que variáveis você precisa para controlar
      o número de pessoas e o peso no elevador?
    - como você vai saber quando parar de ler os pesos das pessoas?
    - como você vai saber se a pessoa pode ou não entrar no elevador?
         */
    public static void main(String[] args) {
        Scanner batata = new Scanner(System.in);
        final int PESO_MAX = 300;
        final int PESSOAS_MAX = 5;
        int quantPessoas = 0;
        int peso = 0;
        char maisGente;
        boolean entrando = true;

        do {
            int pesoPessoa = 0;

            try {
                System.out.println("Qual o peso da pessoa? ");
                pesoPessoa = Integer.parseInt(batata.nextLine().trim());
            } catch (NumberFormatException erro) {
                System.out.println("[ERRO] Ei, você digitou letras ou um número grande demais!");
            }

            if (peso + pesoPessoa <= PESO_MAX) {
                peso += pesoPessoa;
                quantPessoas++;
                System.out.printf("Pessoa entrou! No elevador agora: %d pessoas e %d kg.%n", quantPessoas, peso);

                if (quantPessoas == PESSOAS_MAX) {
                    System.out.println("Limite de pessoas atingido!");
                    entrando = false;
                } else if (peso == PESO_MAX) {
                    System.out.println("Limite de peso atingido!");
                    entrando = false;
                } else {
                    System.out.println("Vai entrar mais alguém? (s/n)");
                    maisGente = batata.nextLine().toLowerCase().trim().charAt(0);
                    if (maisGente == 's') {
                        entrando = true;
                    } else {
                        entrando = false;
                    }
                }
            } else {
                System.out.println("Esta pessoa não pode entrar! O limite de peso foi excedido.");
                System.out.println("Vai tentar colocar outra pessoa mais leve? (s/n)");
                maisGente = batata.nextLine().toLowerCase().trim().charAt(0);
                if (maisGente != 's') {
                    entrando = false;
                }
            }

        } while (quantPessoas < PESSOAS_MAX && peso < PESO_MAX && entrando);
        System.out.printf("subindo com %d pessoas e %d kg", quantPessoas, peso);
    }
}