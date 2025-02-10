package ExerciciosAula5.Exercicio2;

public class Vestuario implements Produtos{
    private final String tipo = "Vestuario";

    @Override
    public double retornaValorDoImposto() {
        return 2.5;
    }

    public String getTipo() {
        return tipo;
    }
}
