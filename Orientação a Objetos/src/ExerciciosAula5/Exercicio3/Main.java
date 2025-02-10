package ExerciciosAula5.Exercicio3;

public class Main {
    public static void main(String[] args) {
        var quadrado = new Quadrado(5);
        var retangulo = new Retangulo(5, 2);
        var circulo = new Circulo(5);

        System.out.println(quadrado.calculaArea());
        System.out.println(retangulo.calculaArea());
        System.out.println(circulo.calculaArea());
    }

}
