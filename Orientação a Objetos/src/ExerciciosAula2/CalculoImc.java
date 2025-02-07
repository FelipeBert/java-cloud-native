package ExerciciosAula2;

import java.util.Scanner;

public class CalculoImc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float altura, peso, imc;

        System.out.println("Digite sua altura: ");
        altura = scanner.nextFloat();

        System.out.println("Digite seu peso: ");
        peso = scanner.nextFloat();

        imc = peso / (altura * altura);

        if(imc <= 18.5F){
            System.out.println("Abaixo do peso");
        }
        else if(imc <= 24.9F){
            System.out.println("Peso Ideal");
        }
        else if(imc <= 29.9F){
            System.out.println("Levemente acima do peso");
        }
        else if(imc <= 34.9F){
            System.out.println("Obesidade grau I");
        }
        else if(imc <= 39.9F){
            System.out.println("Obesidade grau II (Severa)");
        }
        else {
            System.out.println("Obesidade grau III (Mórbida)");
        }
    }
}
