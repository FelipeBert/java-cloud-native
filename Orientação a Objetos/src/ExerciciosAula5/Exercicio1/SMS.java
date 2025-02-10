package ExerciciosAula5.Exercicio1;

public class SMS implements Mensageria{
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem via SMS: " + mensagem);
    }
}
