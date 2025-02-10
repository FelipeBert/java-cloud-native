package ExerciciosAula5.Exercicio2;

import java.util.List;

public class Servico {
    private List<Produtos> produtos;

    public Servico(List<Produtos> produtos) {
        this.produtos = produtos;
    }

    public void consultarImposto(){
        for (Produtos produto : produtos) {
            System.out.println("Imposto sobre produtos de "+ produto.getTipo() + ": " + produto.retornaValorDoImposto() + "%");
        }
    }
}
