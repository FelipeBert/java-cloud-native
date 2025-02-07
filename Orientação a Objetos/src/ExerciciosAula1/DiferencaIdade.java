package ExerciciosAula1;

import java.util.Scanner;

public class DiferencaIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade1, idade2;

        System.out.println("Digite a idade da primeira pessoa: ");
        idade1 = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite a idade da segunda pessoa: ");
        idade2 = scanner.nextInt();

        System.out.println("A Diferenca de idade entre as duas pessoas é de " + (idade1 - idade2) + " anos");
    }
}
