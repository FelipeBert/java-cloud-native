package ExerciciosAula5.Exercicio1;

import java.util.List;

public class Servico {
    private List<Mensageria> canais;

    public Servico(List<Mensageria> canais) {
        this.canais = canais;
    }

    public void enviarMensagem(String mensagem){
        for (Mensageria canal : canais) {
            canal.enviarMensagem(mensagem);
        }
    }
}
