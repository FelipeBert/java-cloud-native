package ExerciciosAula3.Exercicio1;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de saldo da conta: ");
        double saldo = scanner.nextDouble();

        Conta conta = new Conta(saldo);

        int opcao = 0;

        do {
            imprimirMenu();
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Você possui " + conta.getSaldo() + " de saldo");
                    break;
                case 2:
                    System.out.println("Você possui " + conta.getChequeEspecial() + " de cheque especial");
                    break;
                case 3:
                    System.out.println("Digite o valor a ser depositado: ");
                    double valor = scanner.nextDouble();
                    conta.depositarDinheiro(valor);
                    break;
                case 4:
                    System.out.println("Digite o valor que deseja sacar: ");
                    double saque = scanner.nextDouble();
                    conta.sacarDinheiro(saque);
                    break;
                case 5:
                    System.out.println("Digite o valor do boleto: ");
                    double boleto = scanner.nextDouble();
                    conta.pagarBoleto(boleto);
                    break;
                case 6:
                    conta.verificarCheque();
                    break;
                default:
                    System.out.println("Opção Invalida");
            }
        }while (opcao != 7);

    }

    private static void imprimirMenu() {
        System.out.println("""
                1 - Consultar saldo
                2 - Consultar cheque especial
                3 - Depositar dinheiro;
                4 - Sacar dinheiro;
                5 - Pagar um boleto.
                6 - Verificar se a conta está usando cheque especial.
                7 - Sair
                """);
    }
}
