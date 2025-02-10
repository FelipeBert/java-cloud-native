package ExerciciosAula5.Exercicio2;

public class Alimentacao implements Produtos{
    private final String tipo = "Alimentacao";

    @Override
    public double retornaValorDoImposto() {
        return 1;
    }

    public String getTipo() {
        return tipo;
    }
}
