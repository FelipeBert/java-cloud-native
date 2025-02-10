package ExerciciosAula4.Exercicio3;

public abstract class Relogio {

    protected int hora;
    protected int minuto;
    protected int segundo;

    public Relogio(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public abstract void definirRelogio(Relogio Relogio);

    public String mostrarHora() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if(hora >= 0 && hora <= 24){
            this.hora = hora;
        }
        else {
            System.out.println("Hora Invalido!");
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if(minuto >= 0 && minuto <= 60){
            this.minuto = minuto;
        }
        else {
            System.out.println("Minutos Invalido!");
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if(segundo >= 0 && segundo <= 60){
            this.segundo = segundo;
        }
        else {
            System.out.println("Segundos Invalido!");
        }
    }
}
