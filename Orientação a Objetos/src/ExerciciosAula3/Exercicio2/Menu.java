package ExerciciosAula3.Exercicio2;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        Carro carro = new Carro();

        do {
            imprimirMenu();
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    carro.ligar();
                    break;
                case 2:
                    carro.desligar();
                    break;
                case 3:
                    carro.acelerar();
                    break;
                case 4:
                    carro.desacelerar();
                    break;
                case 5:
                    System.out.println("Insira a direção que deseja virar: ");
                    String direcao = scanner.nextLine();
                    carro.virar(direcao);
                    break;
                case 6:
                    carro.verificarVelocidade();
                    break;
                case 7:
                    System.out.println("Insira a marcha que deseja trocar: ");
                    int marcha = scanner.nextInt();
                    carro.trocarMarcha(marcha);
                    break;
                default:
                    System.out.println("Opção Invalida");
            }
        }while (opcao != 8);
    }


    private static void imprimirMenu() {
        System.out.println("""
                1 - Ligar o carro
                2 - Desligar o carro
                3 - Acelerar
                4 - diminuir velocidade
                5 - virar para esquerda/direita
                6 - verificar velocidade
                7 - Trocar a marcha
                8 - Sair do Carro
                """);
    }
}
