package ExerciciosAula4.Exercicio3;

public class Teste {
    public static void main(String[] args) {
        RelogioBrasileiro brasil = new RelogioBrasileiro(14, 30, 0);
        RelogioAmericano usa = new RelogioAmericano(16, 30, 0);

        System.out.println("Hora no Brasil: " + brasil.mostrarHora());
        System.out.println("Hora nos EUA: " + usa.mostrarHoraComAmPm());
    }
}
