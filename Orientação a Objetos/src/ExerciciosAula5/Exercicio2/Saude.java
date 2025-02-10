package ExerciciosAula5.Exercicio2;

public class Saude implements Produtos{
    private final String tipo = "Saude e Bem Estar";

    @Override
    public double retornaValorDoImposto() {
        return 1.5;
    }

    public String getTipo() {
        return tipo;
    }
}
