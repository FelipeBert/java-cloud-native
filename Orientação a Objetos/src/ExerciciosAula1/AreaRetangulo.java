package ExerciciosAula1;

import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int base, altura;

        System.out.println("Digite o valor da base do retangulo: ");
        base = scanner.nextInt();

        System.out.println("Digite o valor da altura do retangulo: ");
        altura = scanner.nextInt();

        System.out.println("O retangulo possui " + (base * altura) + " de area");
    }
}
