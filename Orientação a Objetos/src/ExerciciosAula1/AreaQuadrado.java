package ExerciciosAula1;

import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lado;

        System.out.println("Digite o valor do lado do quadrado: ");
        lado = scanner.nextInt();

    System.out.println("O Quadrado possui " + (lado * lado) + " de area");
    }
}
