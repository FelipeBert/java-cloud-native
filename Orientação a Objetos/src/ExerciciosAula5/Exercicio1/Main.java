package ExerciciosAula5.Exercicio1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Servico servico = new Servico(Arrays.asList(
                new Email(),
                new SMS(),
                new RedesSociais(),
                new WhatsApp() ) );

        servico.enviarMensagem("10% De Desconto em todos os Produtos");
    }
}
