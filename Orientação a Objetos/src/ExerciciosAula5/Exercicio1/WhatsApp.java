package ExerciciosAula5.Exercicio1;

public class WhatsApp implements Mensageria{
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem via WhatsApp: " + mensagem);
    }
}
