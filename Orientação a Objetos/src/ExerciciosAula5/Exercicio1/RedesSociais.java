package ExerciciosAula5.Exercicio1;

public class RedesSociais implements Mensageria{
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem nas Redes Sociais: " + mensagem);
    }
}
