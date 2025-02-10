package ExerciciosAula5.Exercicio3;

public class Retangulo implements AreaFigura{
    private final double base;
    private final double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calculaArea() {
        return base * altura;
    }
}
