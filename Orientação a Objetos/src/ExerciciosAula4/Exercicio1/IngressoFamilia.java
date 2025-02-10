package ExerciciosAula4.Exercicio1;

public non-sealed class IngressoFamilia extends Ingresso{
    private int qtdPessoas;

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }

    @Override
    public double valorIngresso() {
        if(qtdPessoas > 3){
            double valor = (this.getValor() * this.getQtdPessoas());
            return ( valor - (valor * 0.05));
        }
        return (this.getValor() * this.getQtdPessoas());
    }
}
