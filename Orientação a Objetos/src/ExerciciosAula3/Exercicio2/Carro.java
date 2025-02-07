package ExerciciosAula3.Exercicio2;

public class Carro {
    private int velocidade;
    private int marcha;

    public Carro(){
        this.velocidade = 0;
        this.marcha = 0;
    }

    public void ligar() {
        this.marcha = 1;
    }

    public void desligar() {
        if(this.velocidade == 0 && this.marcha == 0){
            System.out.println("Carro Desligado");
        }
        else if(this.velocidade > 0){
            System.out.println("Não é possivel desligar o carro com ele em movimento");
        }
        else{
            System.out.println("Coloque o carro em ponto morto para ser desligado");
        }
    }

    public void acelerar() {
        if(this.marcha == 0){
            System.out.println("Não é possivel acelerar o carro sem marcha");
        }
        if(velocidadeDentroDoLimite(this.velocidade + 1)){
            this.velocidade += 1;
            System.out.println("Velocidade alterada para: " + this.velocidade + " km/h");
        }
        else {
            System.out.println("Velocidade inválida para a marcha " + this.marcha + "!");
        }
    }

    public void desacelerar() {
        this.velocidade -= 1;
    }

    public void virar(String direcao) {
        if(this.velocidade >= 1 && this.velocidade <= 40){
            System.out.println("Carro virou a " + direcao);
        }
        else{
            System.out.println("Não é possivel virar o carro nessa velocidade");
        }
    }

    public void verificarVelocidade() {
        System.out.println("Velocidade atual: " + this.velocidade + " km/h");
    }

    public void trocarMarcha(int marcha) {
        if(marcha < 1 || marcha > 6){
            System.out.println("Marcha Invalida");
        }
        if(this.marcha - marcha > 1 || this.marcha - marcha < -1){
            System.out.println("Não é possivel pular marcha");
        }
        else {
            this.marcha = marcha;
            System.out.println("Marcha trocada para: " + this.marcha);
        }
    }

    private boolean velocidadeDentroDoLimite(int velocidade) {
        return switch (this.marcha) {
            case 1 -> velocidade >= 0 && velocidade <= 20;
            case 2 -> velocidade >= 21 && velocidade <= 40;
            case 3 -> velocidade >= 41 && velocidade <= 60;
            case 4 -> velocidade >= 61 && velocidade <= 80;
            case 5 -> velocidade >= 81 && velocidade <= 100;
            case 6 -> velocidade >= 101 && velocidade <= 120;
            default -> false;
        };
    }
}