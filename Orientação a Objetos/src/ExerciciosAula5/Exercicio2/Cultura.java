package ExerciciosAula5.Exercicio2;

public class Cultura implements Produtos{
    private final String tipo = "Cultura";

    @Override
    public double retornaValorDoImposto() {
        return 4;
    }

    public String getTipo() {
        return tipo;
    }
}
