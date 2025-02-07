package ExerciciosAula2;

import java.util.Objects;
import java.util.Scanner;

public class IntervaloEntreValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        String opcao;

        System.out.println("Digite o primeiro valor: ");
        num1 = scanner.nextInt();

        System.out.println("Digite o segundo valor: ");
        num2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Entre uma opção entre par ou impar");
        opcao = scanner.nextLine();

        for(int i = num1 + 1; i < num2 - 1; i++){
            if(Objects.equals(opcao, "par") && i % 2 == 0){
                System.out.println(i);
            }
            else if(Objects.equals(opcao, "impar") && i % 2 == 1){
                System.out.println(i);
            }
        }
    }
}
