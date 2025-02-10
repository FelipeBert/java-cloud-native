package ExerciciosAula4.Exercicio3;

public class RelogioAmericano extends Relogio {

    public RelogioAmericano(int hora, int minuto, int segundo) {
        super(hora, minuto, segundo);
    }

    public String mostrarHoraComAmPm() {
        String periodo = (this.hora >= 12) ? "PM" : "AM";
        int hora12 = (this.hora % 12 == 0) ? 12 : this.getHora() % 12;
        return String.format("%02d:%02d:%02d %s", hora12, this.minuto, this.segundo, periodo);
    }

    @Override
    public void setHora(int hora) {
        if (hora >= 1 && hora <= 12) {
            this.hora = hora;
        } else {
            System.out.println("Hora inválida para relógio americano");
        }
    }

    @Override
    public void definirRelogio(Relogio outroRelogio) {
        this.setHora(outroRelogio.getHora() % 12 == 0 ? 12 : outroRelogio.getHora() % 12);
        this.setMinuto(outroRelogio.getMinuto());
        this.setSegundo(outroRelogio.getSegundo());
    }
}
