package ExerciciosAula1;

import java.util.Scanner;

public class ImprimiNomeEAno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int birthYear;
        String name;

        System.out.println("Digite seu Nome: ");
        name = scanner.nextLine();

        System.out.println("Digite seu Ano de nascimento: ");
        birthYear = scanner.nextInt();

        System.out.println("Olá " + name + " você tem " + (2025 - birthYear) + " anos");
    }
}
