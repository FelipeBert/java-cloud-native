package ExerciciosAula4.Exercicio3;

public class RelogioBrasileiro extends Relogio{
    public RelogioBrasileiro(int hora, int minuto, int segundo) {
        super(hora, minuto, segundo);
    }

    @Override
    public void definirRelogio(Relogio outroRelogio) {
        this.setHora(outroRelogio.getHora());
        this.setMinuto(outroRelogio.getMinuto());
        this.setSegundo(outroRelogio.getSegundo());
        System.out.println("Horário ajustado no formato Brasileiro: " + this.mostrarHora());
    }
}
