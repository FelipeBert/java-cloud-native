package ExerciciosAula5.Exercicio1;

public class Email implements Mensageria{
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando Email com mensagem: " + mensagem);
    }
}
