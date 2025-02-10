package ExerciciosAula5.Exercicio3;

public class Circulo implements AreaFigura{
    private static final double PI = 3.14159;
    private final double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return PI * (raio * raio);
    }
}
