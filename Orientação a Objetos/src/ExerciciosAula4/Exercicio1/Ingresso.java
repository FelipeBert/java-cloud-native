package ExerciciosAula4.Exercicio1;

public sealed abstract class Ingresso permits IngressoFamilia, MeiaEntrada {

    private double valor;
    private String nome;
    private String tipo;

    public abstract double valorIngresso();

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
