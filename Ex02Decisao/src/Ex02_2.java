/*-------------------------------------------------------------------
  Ex 2.2: Confirmacao de senha
  - informar uma senha
  - confirmar a senha
  - reclamar quando as senhas forem diferentes

  TAREFA:
  - peça para o usuário informar uma senha
  - peça para o usuário confirmar a senha
  - compare as duas senhas
  - se as senhas não conferirem, imprima uma mensagem reclamando
  - se as senhas conferirem, imprima uma mensagem confirmando o cadastro
  - não é necessário repetir a digitação: é só pra exercitar um IF

  ATENÇÃO:
  - para verificar se duas Strings são iguais, use o método .equals()
  - exemplo: senha.equals(confirmacao)
  - não use o operador == para comparar duas strings
  -------------------------------------------------------------------*/

import java.util.Scanner;

public class Ex02_2 {
    public static void main(String[] args) {
        Boolean senha = false;
        Scanner batata = new Scanner(System.in);
        String senha1;
        String senha2;
        while (!senha) {
            System.out.println("Informe sua senha:");
            senha1 = batata.next();
            System.out.println("Confirme sua senha");
            senha2 = batata.next();
            if (senha1.equals(senha2)) {
                System.out.println("Cadastro autorizado");
                senha = true;
            } else {
                System.out.println("As senhas não coincidem, deseja tentar novamente? 1 para Sim, 2 para Não");
                int tentarNovamente;
                tentarNovamente = batata.nextInt();
                switch (tentarNovamente) {
                    case 1:
                        senha = false;
                        break;
                    case 2:
                        System.out.println("Cadastro comprometido");
                        break;
                }
            }
        }
    }
}
