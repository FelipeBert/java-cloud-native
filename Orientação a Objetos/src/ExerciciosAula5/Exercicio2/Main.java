package ExerciciosAula5.Exercicio2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Servico servico = new Servico(Arrays.asList(
                new Alimentacao(),
                new Saude(),
                new Vestuario(),
                new Cultura() ));

        servico.consultarImposto();
    }
}
