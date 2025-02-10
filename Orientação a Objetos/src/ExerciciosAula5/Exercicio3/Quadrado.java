package ExerciciosAula5.Exercicio3;

public class Quadrado implements AreaFigura{
    private final double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calculaArea() {
        return lado * lado;
    }
}
