package ExerciciosAula4.Exercicio2;

public class Atendente extends Funcionario{
    private double valorEmCaixa;

    public Atendente(String nome, String email, String password) {
        super(nome, email, password);
        this.setAdmin(false);
        this.valorEmCaixa = 0;
    }

    public void receberPagamento(double valor){
        this.valorEmCaixa += valor;
    }

    public void fecharCaixa(){
        System.out.println("Retirado " + this.valorEmCaixa + " reais do caixa.");
        this.valorEmCaixa = 0;
    }
}
