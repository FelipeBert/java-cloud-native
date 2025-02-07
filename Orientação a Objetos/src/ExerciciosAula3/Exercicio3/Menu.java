package ExerciciosAula3.Exercicio3;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        MaquinaDeBanho maquinaDeBanho = new MaquinaDeBanho();

        do {
            imprimirMenu();
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    maquinaDeBanho.darBanhoNoPet();
                    break;
                case 2:
                    maquinaDeBanho.abastecerComAgua();
                    break;
                case 3:
                    maquinaDeBanho.abastecerComShampoo();
                    break;
                case 4:
                    maquinaDeBanho.verificarAgua();
                    break;
                case 5:
                    maquinaDeBanho.verificarShampoo();
                    break;
                case 6:
                    maquinaDeBanho.verificarPet();
                    break;
                case 7:
                    maquinaDeBanho.colocarPetNaMaquina();
                    break;
                case 8:
                    maquinaDeBanho.retirarPetDaMaquina();
                    break;
                case 9:
                    maquinaDeBanho.limparMaquina();
                    break;
                default:
                    System.out.println("Opção Invalida");
            }
        }while (opcao != 0);
    }


    private static void imprimirMenu() {
        System.out.println("""
                1 - Dar banho no pet
                2 - Abastecer com água
                3 - Abastecer com Shampoo
                4 - Verificar nivel de água
                5 - Verificar nivel de shampoo
                6 - Verificar se tem pet na maquina
                7 - colocar pet na maquina
                8 - Retirar pet da maquina
                9 - limpar maquina
                0 - Sair
                """);
    }
}
