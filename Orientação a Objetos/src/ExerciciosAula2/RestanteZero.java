package ExerciciosAula2;

import java.util.Scanner;

public class RestanteZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int valor;
        int divisor = 1;

        System.out.println("Digite um numero: ");
        num = scanner.nextInt();

        do {
            System.out.println("Digite um numero para ser dividido: ");
            valor = scanner.nextInt();

            if(valor > num && valor % num == 0){
                divisor = 0;
            }

        }while (divisor != 0);

        System.out.println(num + " e um divisor de " + valor);
    }
}
